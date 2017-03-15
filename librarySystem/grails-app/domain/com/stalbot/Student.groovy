package com.stalbot

class Student {

	String name
	String email
	String username
	String password
	String studentid
	String course

    static constraints = {

	name blank:false, nullable:false
	email blank:false, nullable:false, email:true
	username blank:false, nullable:false, unique:true
	password blank:false, nullable:false, password:true
	studentid blank:false, nullable:false
	course blank:false, nullable:false

    }

	
}
