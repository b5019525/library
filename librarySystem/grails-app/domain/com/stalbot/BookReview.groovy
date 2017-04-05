package com.stalbot

class BookReview {

	Book book
	Date dateMade
	Student student
	String review	

	String toString(){
	return book}

    static constraints = {

	book blank:false, nullable:false
	dateMade blank:false, nullable:false
	student blank:false, nullable:false
	review blank:false, nullable:false, maxSize:5000, widget:'textarea' 
    }
}
