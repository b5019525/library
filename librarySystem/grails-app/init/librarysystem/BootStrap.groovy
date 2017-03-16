package com.stalbot

class BootStrap {

    def init = { servletContext ->

def library1= new Library (

	building:'library1',
	address:'33 street',
	openingHours:'9-12',
	location:'city',
	studySpaces:'200').save()


def course1= new Course (

	title:'ICT',
	code:'1234',
	leader:'Tom Jones',
	department:'Computers',
	description:'This is a course',
	studyMode:'Full-time').save()

def stud1= new Student (

	name:'Man Fred',
	email:'m.fred@uni.ac.uk',
	username:'mf97',
	password:'password',
	studentid:'1',
	course:course1,
	library:library1).save()

def book1= new Book (

title: 'Harry Potter',
subject: 'Children',
author: 'JK Rowling',
isbn: '123456789123456789',
dateBorrowed: new Date('08/08/2016'),
returnDate: new Date('22/08/2016'),
student: stud1,
overdue: true,
library: library1

).save()

def bookre1= new BookReview (

book: book1,
dateMade: new Date('23/08/2016'),
student: stud1,
review: 'This book was ok.'

).save()

def librarian1= new Librarian (

	name:'Jack Man',
	email:'j.man@uni.ac.uk',
	office:'office-1',
	username:'jm96',
	password:'password',
	telephone:'07247676198',
	library:library1).save()

    }
    def destroy = { 
    }
} 
