package com.stalbot

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Student)
class StudentSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void toString() {
        	
	when:"A Student has name, email and username"
	
	def Janet = new Student(
		name: 'Janet Taylor',		
		email: 'jt@email.com',
		username: 'jannyt')

	then:"the toString method will merge them."

	Janet.toString() == 'Janet Taylor,jt@email.com,jannyt'

    }
}
