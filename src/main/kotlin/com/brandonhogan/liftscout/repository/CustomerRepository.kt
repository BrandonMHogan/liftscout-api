package com.brandonhogan.liftscout.repository

import com.brandonhogan.liftscout.repository.models.Customer
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.data.repository.query.Param
import org.springframework.data.rest.core.annotation.RepositoryRestResource


@RepositoryRestResource(collectionResourceRel = "customer", path = "customer")
interface CustomerRepository : MongoRepository<Customer, String> {

    fun findByFirstName(@Param("name") name: String): Customer
    fun findByLastName(@Param("name") name: String): List<Customer>

}