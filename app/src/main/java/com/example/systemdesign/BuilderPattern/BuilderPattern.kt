package com.example.systemdesign.BuilderPattern

class User private constructor (
    val name:String,
    val id:Int,
    val phone:String,
    val address:String

){
    class Builder(val name:String,val id:Int){
        private var phone:String? = null
        private var address:String? = null

        fun getPhone():Builder{
            return apply {
                this.phone = phone
            }
        }

        fun getAddress():Builder{
            return apply {
                this.address = address
            }
        }

        fun build():User{

        return  User(name,id, phone.toString(), address.toString())
        }
    }
}

fun main() {
    val user = User.Builder("user1",1).getPhone().getAddress().build()
    println("${user.name}")
    println("${user.id}")
    println("${user.phone}")
    println("${user.address}")
}