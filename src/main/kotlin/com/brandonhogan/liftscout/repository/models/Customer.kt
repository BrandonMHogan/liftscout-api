package com.brandonhogan.liftscout.repository.models

import org.springframework.data.annotation.Id

/**
 * Created by bhogan on 2017-06-21.
 */

class Customer {

    @Id
    var id: String? = null
    var firstName: String = ""
    var lastName: String = ""


    override fun toString(): String {
        return String.format(
                "Customer[id=%s, firstName='%s', lastName='%s']",
                id, firstName, lastName)
    }
}