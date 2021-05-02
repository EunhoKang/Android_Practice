package com.example.firstproject

open class Human (val name:String="default"){//dont need to be same with file name(but not recommended )
    //constructor
    //val name=name <- this can be skipped when constructor have val or var
    //open -> public
    var age=0
    constructor(name : String, age_param:Int) :this(name){
        //this is sub constructor
        age=age_param
    }
    init{
        println("${name} enter the Kotlin")
    }
    open fun eatingCake(){
        println("Yummy!")
    }
}

class Korean(name :String,val grade :Int) : Human(){ //need to write super class's vars
    override fun eatingCake(){
        super.eatingCake()
        println("oh")
    }
}

fun main(){
    var human=Korean("eunho",10) //dont need new
    human.eatingCake()
    println("this human's name is ${human.name}")
    val stranger=Human()
    println("this human's name is ${stranger.name}")
    val stranger2=Human("aaa",10)
    println("this human's name is ${stranger2.name} and ${stranger2.age} year")
}