package net.wiringbits



import com.olvind.mui.muiMaterial.stylesCreateThemeMod.ThemeOptions
import com.olvind.mui.muiMaterial.stylesCreateThemeMod.Theme
import com.olvind.mui.muiMaterial.stylesCreatePaletteMod.SimplePaletteColorOptions
import com.olvind.mui.muiMaterial.stylesCreatePaletteMod.PaletteOptions
import com.olvind.mui.muiMaterial.stylesCreateTypographyMod.TypographyOptions
import com.olvind.mui.muiMaterial.stylesMod.{createMuiTheme, createTheme}
import com.olvind.mui.muiMaterial.colorsMod as Colors
import com.olvind.mui.muiMaterial.stylesPropsMod.ComponentsProps
import com.olvind.mui.muiMaterial.components as mui
import com.olvind.mui.react.mod.CSSProperties
import com.olvind.mui.muiMaterial.mod.PropTypes.Color
import com.olvind.mui.muiIconsMaterial.components as muiIcons
import com.olvind.mui.csstype.mod.Property.{BoxSizing, FlexDirection, Position}
import com.olvind.mui.muiSystem.createThemeShapeMod.ShapeOptions


//import com.alexitc.materialui.facade.materialUiCore.anon.{PartialPaperProps, PartialStyleRulesPaperCla}
import com.olvind.mui.muiMaterial.overridableComponentMod

//import com.alexitc.materialui.facade.materialUiCore.overridesMod.Overrides



object AppTheme {
  val primaryColor = Colors.teal.`500`
  val secondaryColor = Colors.amber
  val typography = TypographyOptions()
  val borderRadius = 8

  val value: Theme = createTheme(
    ThemeOptions()
      .setPalette(
        PaletteOptions()
          .setPrimary(SimplePaletteColorOptions(primaryColor))
      )
      .setTypography(typography)
      .setShape(ShapeOptions().setBorderRadius(borderRadius))
      
      
//      .setProps(
//        ComponentsProps()
//          .setMuiPaper(
//            PartialPaperProps()
//              .setElevation(1)
//          )
//      )
//      .setOverrides(
//        Overrides()
//          .setMuiPaper(
//            PartialStyleRulesPaperCla()
//              .setRoot(
//                CSSProperties()
//                  .setPosition(PositionProperty.relative)
//                  .setDisplay("flex")
//                  .setFlexDirection(FlexDirectionProperty.column)
//                  .setBoxSizing(BoxSizingProperty.`border-box`)
//                  .setOverflow("hidden")
//              )
//              .setRounded(CSSProperties().setBorderRadius(borderRadius))
//          )
//      )
  )
}
