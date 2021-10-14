class Person(){

    var fullName:String=" "
    var age:Int= 0

    constructor (fullName:String,age:Int) : this() {
        this.fullName = fullName
        this.age = age
    }


    fun move(){
        println("Такой-то $fullName говорить")
    }

    fun talk(){
        println("Такой-то $fullName говорить")
    }

}

fun main (){

    val Person1 = Person("Sergey",16)
    Person1.move()
    Person1.talk()

    val Person2=Person()

    Person2.move()
    Person2.talk()


}