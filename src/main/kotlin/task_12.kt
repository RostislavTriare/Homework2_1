open class Goods(var name:String , var prise:Double , var rating:Double){
}
class Categories(name: String,var Goodss:Array<String>):Goods(name,prise=0.00,rating=0.00){
}
open class Basket (var login:String , var Password:String,var GoodssBuy:Array<String>){
fun vuvid(i:String){
    println("Куплений товар = $i")
}
}
class user(login:String ,Password:String,GoodssBuy: Array<String>):Basket(login,Password,GoodssBuy){

    fun vuvid(){
        println("Логин - $login  Пароль - $Password")
    }

}

fun main(){

    val fish = Categories("fish", arrayOf("белуга","Карп","Семга"))
    val meat = Categories("meat", arrayOf("голубятина","свинина","конина"))
    val fruits = Categories("fruits", arrayOf("яблоко","груша","кавун"))
    val Buy1 = Basket("Dan","123",arrayOf(" "," "," "))

    for (i in 0..2) {
        Buy1.GoodssBuy[i]= readLine().toString()
    }
    for (i in 0..2) {
    for (j in 0..2) {

        if (Buy1.GoodssBuy[i] == fish.Goodss[j]||Buy1.GoodssBuy[i] ==meat.Goodss[j]||Buy1.GoodssBuy[i] ==fruits.Goodss[j]){
            Buy1.vuvid(Buy1.GoodssBuy[i])
        }
    }}
    val user1=user(Buy1.login , Buy1.Password , Buy1.GoodssBuy)
    user1.vuvid()
}


