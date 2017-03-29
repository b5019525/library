package com.stalbot

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Book)
class BookSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void Test() {
        when:"Book is created with Title and Author"
		def newBook = new Book(title:'',author:'George')

		then:"Validation should be correct"

		!newBook.validate()
           
    }
}
