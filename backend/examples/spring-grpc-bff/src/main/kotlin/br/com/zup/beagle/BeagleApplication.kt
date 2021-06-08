package br.com.zup.beagle

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BeagleApplication

fun main(args: Array<String>) {
	runApplication<BeagleApplication>(*args)
}
