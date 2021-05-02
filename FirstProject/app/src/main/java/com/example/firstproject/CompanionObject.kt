package com.example.firstproject

class Book private constructor(val id:Int,val name : String) {
    companion object{// static method(전역함수처럼 사용가능)
        fun create() : Book = Book(0,"animal farm")
    }
}

object Carfactory{// 싱글톤패턴. 해당 객체는 실행 초기에 딱 한번만 생성되며 어디서든 참조 가능
    val cars: MutableList<Car> = mutableListOf<Car>()
    fun makeCar(horsepower: Int) :Car{
        var car = Car(horsepower)
        return car
    }
}
data class Car(val horsepower:Int)