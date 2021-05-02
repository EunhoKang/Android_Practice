package com.example.firstproject

data class Ticket(val companyName:String, val name : String, var date :String, var seat:Int)
//ToString,HashCode, equals, copy가 자동으로 생성됨

fun main(){
    var ticketA =Ticket("koreanair","EunhoKang","2020-02-10",14)

}