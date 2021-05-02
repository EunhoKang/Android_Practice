package com.example.firstproject

fun main(){
    helloWorld()
    println(add(4, 5)) //don't type a,b!!!

    //3.string template
    val name="eunho"
    println("my name is ${name+name}\$")

    forandwhile()

}
//1.function
fun helloWorld() : Unit{
    println("hello world!")
}

fun add(a : Int, b : Int) : Int{
    return  a+b
}

//2.val vs var
//val=value(const) , var=variance

fun hi(){
    val a: Int=10
    var b: Int=9
    //a=100 <-error
    b=100
    println(b)
    val c=100
    var d=100//don't need Int always. auto cast
    var name="eunho"
}

//4.condition

fun maxBy(a: Int,b:Int) : Int{
    if(a>b)return a //statement(return void)
    else return b
}
fun maxBy2(a:Int,b:Int): Int =if(a>b) a else b //expression(return var)

//when

fun checkNum(score:Int){
    when(score){
        0->println("this is 0")
        1->println("this is 1")
        2->println("this is 2")
    }
    var b =when(score){
        0->0
        1->1
        2->2
        else->-1 //must need else when using for expression
    }
    when(score){
        in 90..100-> println("good")
        in 10..80-> println("bad")
    }
}

//expression vs statement
//In Kotlin, all fun have a return->all fun can be used for expression and also statement

//5.array vs list vs arrayList

fun array(){
    var array = arrayOf(1,2,3)
    var list = listOf(1,2,3) //this cant be changed

    var array2 : Array<Any> = arrayOf(1,"df",2)
    var arraylist = arrayListOf<Int>() //cannot be reassigned
    arraylist.add(10)
    arraylist.add(20)
}

//6.loop
fun forandwhile(){
    val students= arrayListOf<String>("a","b","c","d")
    for(name in students){
        println(name)
    }
    var sum=0
    for(i in 1..10){
        sum+=i
    }
    println(sum)//55
    for(i in 1..10 step 2){
        sum+=i
    }
    println(sum)//55+25
    for(i in 10 downTo 1){ //need to use this for descent numbers
        sum+=i
    }
    println(sum)//55+25+55
    var idx=0
    while(idx<10){
        println(++idx)
    }

    for((index,name)in students.withIndex()){
        println("$index and $name")
    }

    //7.Nullable // NonNull
    fun nullcheck(){
        //NPE :NULL pointer Exception
        var name :String= "eunho"//NonNull
        var nullName : String?=null //Nullable
        var nameInUpperCase = name.toUpperCase()//can use fun cause name is NonNull
        var nullNameInUpperCase = nullName?.toUpperCase()//? refer to -> if it is NULL, return NULL
        val lastName : String? = null
        val fullName = name + (lastName ?:"__") //if want to give a default value or throw catch
        val fullName2 = name + (lastName ?: throw IllegalAccessException("No Last Name"))
    }

    fun ignoreNulls(str:String){
        val mNotNull : String=str!! //means that mNotNull is always not a NULL
        val upper=mNotNull.toUpperCase()

        val email :String? = "1999paul@naver.com"
        email?.let{ //lambda
            println("my email is $email")
        }
    }


}


