package br.com.zup.beagle.grpc.interceptor

import io.grpc.*
import io.micronaut.core.order.Ordered
import javax.inject.Singleton

@Singleton
class BeagleHeadersInterceptor: ServerInterceptor, Ordered {
    companion object {
        private const val HEADERS_KEY = "beagle-headers"
        val HEADERS_VALUE: Context.Key<Map<String, String>> = Context.key(HEADERS_KEY)
    }

    @Override
    override fun getOrder() = 1

    override fun <ReqT : Any?, RespT : Any?> interceptCall(
        call: ServerCall<ReqT, RespT>?,
        headers: Metadata?,
        next: ServerCallHandler<ReqT, RespT>?
    ): ServerCall.Listener<ReqT> {
        var ctx = Context.current()
        ctx = ctx.withValue(HEADERS_VALUE, extractHeaders(headers))
        return Contexts.interceptCall(ctx, call, headers, next)
    }

    private fun extractHeaders(headers: Metadata?) = headers?.keys()!!.associateWith {
        headers.get(Metadata.Key.of(it, Metadata.ASCII_STRING_MARSHALLER)) as String
    }
}