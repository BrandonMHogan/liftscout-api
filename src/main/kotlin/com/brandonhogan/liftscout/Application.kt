package com.brandonhogan.liftscout

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
open class Application {
    companion object {
        @JvmStatic fun main(args: Array<String>) {
            SpringApplication.run(Application::class.java, *args)
        }
    }
}


////Top level function way of setting up application
//@SpringBootApplication
//class Application
//
//fun main(args: Array<String>) {
//    SpringApplication.run(Application::class.java, *args)
//}
