package com.example.firstproject

//1. Lamda
//the anonymous function that can be used like variable
//1) can be a parameter in another function(c++ functor)
//2) can be as a return value
//def)
//val lamdaName : (input Type)-> output Type={argumentList-> codeBody}

val Square ={number :Int->number*number}
val nameAge = {name :String,age:Int->
    "my name is $name and $age years old"
}

//2.extension function

val pizzaIsGreat :String.()->String={
    this + "pizza is the best!"
}

fun extendString(name :String,age:Int) :String{
    val introduce :String.(Int)->String={"I am $this and $it years oid"}
    return name.introduce(age)
}

fun invokeLamda(lamda:(Double)->Boolean) : Boolean{
    return lamda(5.2343)
}

//2.DataClass



fun main(){
    println(Square(8))
    println(nameAge("eunho",10))
    val a= "hi "
    println(a.pizzaIsGreat())
    println(extendString("eunho",23))

    val lamda={number : Double->
        number == 5.2343
    }
    println(invokeLamda(lamda))
    println(invokeLamda{it>3.22})//same with upper one
}