package com.brandonhogan.liftscout.repository

import com.brandonhogan.liftscout.repository.models.Customer
import org.springframework.data.mongodb.repository.MongoRepository



interface CustomerRepository : MongoRepository<Customer, String> {

    fun findByFirstName(firstName: String): Customer
    fun findByLastName(lastName: String): List<Customer>

}