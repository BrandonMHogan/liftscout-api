package com.brandonhogan.liftscout

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class LiftscoutApplication

fun main(args: Array<String>) {
    SpringApplication.run(LiftscoutApplication::class.java, *args)
}
