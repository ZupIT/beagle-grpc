package br.com.zup.beagle.grpc

import io.micronaut.runtime.Micronaut.build

fun main(args: Array<String>) {
	build()
	    .args(*args)
		.packages("br.com.zup.beagle")
		.start()
}