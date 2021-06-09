package br.com.zup.beagle.grpc.screen

import br.com.zup.beagle.core.CornerRadius
import br.com.zup.beagle.ext.setStyle
import br.com.zup.beagle.widget.action.Navigate
import br.com.zup.beagle.widget.action.Route
import br.com.zup.beagle.widget.core.EdgeValue
import br.com.zup.beagle.widget.core.UnitValue
import br.com.zup.beagle.widget.layout.Container
import br.com.zup.beagle.widget.layout.Screen
import br.com.zup.beagle.widget.layout.ScreenBuilder
import br.com.zup.beagle.widget.ui.Button

class SplashScreen(private val headers: Map<String, String>) : ScreenBuilder {
    override fun build() = Screen(
        child = Container(
            children = listOf(
                Button(
                    text = "Button with Style and content type: ${this.headers["content-type"]}",
                    onPress = listOf(Navigate.PushView(Route.Remote("text", true)))
                ).setStyle { margin = EdgeValue(UnitValue(15.0)) },
                Button(
                    text = "Button with Appearance and Style",
                    onPress = listOf(Navigate.PushView(Route.Remote("text", true)))
                ).setStyle {
                    backgroundColor = "#0000FF"
                    cornerRadius = CornerRadius(radius = 16.0)
                    margin = EdgeValue(
                        left = UnitValue(25.0),
                        right = UnitValue(25.0),
                        top = UnitValue(15.0)
                    )
                }
            )
        )
    )
}
