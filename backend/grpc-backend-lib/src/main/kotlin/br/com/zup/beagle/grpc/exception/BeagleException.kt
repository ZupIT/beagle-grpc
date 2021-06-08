package br.com.zup.beagle.grpc.exception

import java.lang.RuntimeException

class BeagleException(message: String): RuntimeException(message)