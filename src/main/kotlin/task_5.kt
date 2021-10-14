class number(){
    var A = 0
    var B = 0

    fun vuvid(){
        if (A<B){
            for (i in A..B){
                println(A)
                A+=1
            }
        }else{
            for (i in B..A){
                println(A)
                A-=1
            }
        }
    }
}
fun main(){
    val num1=number()
    num1.A=17
    num1.B=12
    num1.vuvid()


}