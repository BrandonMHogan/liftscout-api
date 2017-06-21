package com.brandonhogan.liftscout

import com.brandonhogan.liftscout.repository.CustomerRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import com.brandonhogan.liftscout.repository.models.Customer



@SpringBootApplication
open class Application : CommandLineRunner {
    companion object {
        @JvmStatic fun main(args: Array<String>) {
            SpringApplication.run(Application::class.java, *args)
        }
    }

    @Autowired
    lateinit var customerRepo: CustomerRepository


    @Throws(Exception::class)
    override fun run(vararg args: String) {

        customerRepo.deleteAll()

        // save a couple of customers
        customerRepo.save(Customer(firstName = "Alice", lastName = "Smith"))
        customerRepo.save(Customer(firstName = "Bob", lastName = "Smith"))

        // fetch all customers
        println("Customers found with findAll():")
        println("-------------------------------")
        for (customer in customerRepo.findAll()) {
            println(customer)
        }
        println()

        // fetch an individual customer
        println("Customer found with findByFirstName('Alice'):")
        println("--------------------------------")
        System.out.println(customerRepo.findByFirstName("Alice"))

        println("Customers found with findByLastName('Smith'):")
        println("--------------------------------")
        for (customer in customerRepo.findByLastName("Smith")) {
            println(customer)
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
