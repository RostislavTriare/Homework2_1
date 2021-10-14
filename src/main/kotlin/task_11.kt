abstract class Shape(var Color: String){

    abstract fun draw()
    abstract fun equals()
}
class Circle(Color:String,var StartPoint:Int):Shape(Color){
    override fun draw(){
        println("рисуем круг  c точки $StartPoint цветом -$Color ")
    }
    override fun equals() {

    }
}
class Rectangle(Color:String,var StartPoint:Int):Shape(Color){
    override fun draw(){
        println("рисуем квадрат c точки $StartPoint цветом -$Color ")
    }
    override fun equals() {

    }
}
fun main(){

    val Circle1 = Circle("Blue",5)
    val Rectangle1 = Rectangle("Red",18)
    val Rectangle2 = Rectangle("Red",8)

    val Shapes: List<String> = listOf("Circle1-${Circle1.Color} ,${Circle1.StartPoint}","Rectangle1 -${Rectangle1.Color},${Rectangle1.StartPoint}","Rectangle2 - ${Rectangle2.Color},${Rectangle2.StartPoint}")
    for (i in 0..Shapes.size-1){
        println(Shapes[i])
    }
}

