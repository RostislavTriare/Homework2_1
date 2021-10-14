

open class Animal(var food:String, var location:String){

    open fun makeNoise(){
        println("Такое-то животное спит")
    }
    open fun eat(){
    }
    open fun sleep(){
        println("Спит")
    }
}
class Dog(food:String,location:String,var gav:String) :Animal(food,location){
    override fun makeNoise(){
        println("dog - $gav")
    }
    override fun eat(){
        println("dog ест - $food")
    }
}
class Cat(food:String,location:String ,var may:String) :Animal(food,location){
    override fun makeNoise(){
        println("cat - $may")
    }
    override fun eat(){
        println("cat ест - $food")
    }
}
class Horse(food:String,location:String ,var run:String) :Animal(food,location){
    override fun makeNoise(){
        println("Horse - $run")
    }
    override fun eat(){
        println("Конь ест - $food")
    }

}

class Veterinarian(){

    fun treatAnimal(vuvid:String) {
       println ("Пришол - $vuvid")
    }

}
fun main(){

    val veterenar = Veterinarian()
    val cat1 = Cat("fish","Ukraine" , "Miay")
    val dog1 = Dog("fish","En" , "Gav-Gav")
    val horse1 = Horse("Apple","Ukraine" , "Running")
    val Animal: List<String> = listOf("Кот1-${cat1.food} ,${cat1.location}","Собака 1 -${dog1.food},${dog1.location}","Конь 1 - ${horse1.food},${horse1.location}")
    for (i in 0..2){

        veterenar.treatAnimal(vuvid = Animal[i])


    }
}