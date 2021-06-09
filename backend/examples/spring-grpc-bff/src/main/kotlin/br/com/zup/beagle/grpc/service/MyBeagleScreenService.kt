package br.com.zup.beagle.grpc.service

import br.com.zup.beagle.grpc.BeagleScreenService
import br.com.zup.beagle.grpc.interceptor.BeagleHeadersInterceptor
import br.com.zup.beagle.grpc.screen.HomeScreen
import br.com.zup.beagle.grpc.screen.SplashScreen
import br.com.zup.beagle.widget.layout.ScreenBuilder
import net.devh.boot.grpc.server.service.GrpcService

@GrpcService(interceptors = [BeagleHeadersInterceptor::class])
class MyBeagleAppService: BeagleScreenService() {
    override fun screens(): Map<String, (String) -> ScreenBuilder> {
        val requestHeaders = BeagleHeadersInterceptor.HEADERS_VALUE.get()

        return mapOf(
            "home" to { params -> HomeScreen(params) },
            "splash" to { SplashScreen(requestHeaders) },
        )
    }
}