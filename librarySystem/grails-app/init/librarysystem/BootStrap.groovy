package com.stalbot

class BootStrap {

    def init = { servletContext ->

def library1= new Library (

	building:'library1',
	address:'33 street',
	openingHours:'9-12',
	location:'city',
	studySpaces:'200').save()

def library2= new Library (

	building:'library2',
	address:'44 street',
	openingHours:'9-12',
	location:'colleigate',
	studySpaces:'250').save()

def course1= new Course (

	title:'ICT',
	code:'1234',
	leader:'Tom Jones',
	department:'Computers',
	description:'This is a course',
	studyMode:'Full-time',
	tuitionFees:9000
).save()

def course2= new Course (

	title:'Art',
	code:'12345',
	leader:'Jon Bones',
	department:'Arts',
	description:'This is a course',
	studyMode:'Full-time',
	tuitionFees:9000
).save()

def stud1= new Student (

	name:'Man Fred',
	email:'m.fred@uni.ac.uk',
	userName:'mf97',
	password:'password',
	studentid:'1',
	course:course1,
	library:library1).save()

def stud2= new Student (

	name:'Jay Man',
	email:'j.man@uni.ac.uk',
	userName:'jm96',
	password:'password',
	studentid:'2',
	course:course1,
	library:library2).save()

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

def book2= new Book (

title: 'Jungle Book',
subject: 'Children',
author: 'Disney',
isbn: '123456789123456789',
dateBorrowed: new Date('10/08/2016'),
returnDate: new Date('29/08/2016'),
student: stud2,
overdue: false,
library: library2

).save()

def bookre1= new BookReview (

book: book1,
dateMade: new Date('23/08/2016'),
student: stud1,
review: 'This book was ok.'

).save()

def bookre2= new BookReview (

book: book2,
dateMade: new Date('23/08/2016'),
student: stud2,
review: 'This book was good.'

).save()

def librarian1= new Librarian (

	name:'Jack Man',
	email:'j.man@uni.ac.uk',
	office:'office-1',
	userName:'jm96',
	password:'password',
	telephone:'07247676198',
	library:library1).save()

    

def librarian2= new Librarian (

	name:'Harry Guy',
	email:'h.guy@uni.ac.uk',
	office:'office-2',
	userName:'hg90',
	password:'password',
	telephone:'07247676190',
	library:library2).save()

    }

    def destroy = { 
    }
} 
