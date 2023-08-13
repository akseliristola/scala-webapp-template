package net.wiringbits

import com.olvind.mui.muiMaterial.components.ThemeProvider
import com.olvind.mui.muiMaterial.{components=>mui}
import net.wiringbits.components.AppSplash
import slinky.core.FunctionalComponent
import typings.reactRouterDom.{components => router}

object App {
  case class Props(ctx: AppContext)

  val component: FunctionalComponent[Props] = FunctionalComponent[Props] { props =>
    val appRouter = AppRouter.Props(props.ctx)

    ThemeProvider(AppTheme.value)(
      mui.ThemeProvider(AppTheme.value)(
        mui.CssBaseline(),
        router.BrowserRouter.basename("")(
          AppSplash.component(AppSplash.Props(props.ctx,AppRouter.component(appRouter)))
        )
      )
    )
  }
}
