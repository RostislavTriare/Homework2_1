class Phone  {
    //Властивості
    var number:String
    var model:String
    var weight:Double
    //Пустий конструктор
    constructor () {

        number="none"
        model="none"
        weight  = 0.00

    }
    //Конструктор з 2 властивостями
    constructor (number:String,model:String){

        this.number = number
        this.model = model
        weight  = 1.00

    }
    //Конструктор з 3 властивостями
    constructor (number:String,model:String,weight:Double){

        this.number = number
        this.model = model
        this.weight = weight

    }



    //Функція
    fun receiveCall(name:String){
        println("Вам звонит $name")
    }
    //Перегружена функція
    fun receiveCall(name:String , number: String){

        println("Вам звонит $name с номером $number")

    }
    //Функція
    fun getNumber(){
        println(number)
    }


}

fun main (){
    //Екземляр через конструктор з 3 змінними
    val iphone = Phone()
    iphone.model="9s"
    iphone.number="380939143459"
    iphone.weight=15.00
    //Екземляр через конструктор з 2 змінними
    val samsyng = Phone("380839142359","Galaxy 10A")
    //Екземляр через конструктор з 3 змінними
    val realme = Phone("380839142359","9s",13.00)
    //Екземляр через конструктор без змінних
    val newPhone = Phone()
    //Вивод
    println("Номер = ${iphone.number} Модель = ${iphone.model} Диагональ = ${iphone.weight}")
    println("Номер = ${samsyng.number} Модель = ${samsyng.model} Диагональ = ${samsyng.weight}")
    println("Номер = ${realme.number} Модель = ${realme.model} Диагональ = ${realme.weight}")
    println("Номер = ${newPhone.number} Модель = ${newPhone.model} Диагональ = ${newPhone.weight}")
    //Визов функцій
    iphone.receiveCall("Igor")
    iphone.getNumber()
    //Визов перегруженої функцій
    iphone.receiveCall("Igor", "380939143459")
    //Визов функцій
    samsyng.receiveCall("Kola")
    samsyng.getNumber()
    //Визов функцій
    realme.receiveCall("Sergey")
    realme.getNumber()


}