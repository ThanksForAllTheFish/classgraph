package org.t4atf.classgraph

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ClassgraphApplication

fun main(args: Array<String>) {
	runApplication<ClassgraphApplication>(*args)
}
