import java.util.*

class Matrix() {
    var mass:Array<IntArray> = Array(4) {
        IntArray(4) {0} }
    var height: Int = mass.size
    var width: Int=mass[0].size

    fun vvid(){

        for (i in 0..height-1) {
            for (j in 0..width-1) {
                mass[i][j]=(0..10).random()
            }
        }
    }
    fun mnog(){
        for (i in 0..height-1) {
            for (j in 0..width-1) {
                mass[i][j]*=8
            }
        }
    }

    fun vuvid(){

        for (i in 0..height-1) {
            for (j in 0..width-1) {
                print("${mass[i][j] }  ")
            }
            println()
        }
        println()
    }
    fun mnogmass(){
        val mas:Array<IntArray> = Array(4) {
            IntArray(4) {0} }
        for (i in 0..height-1) {
            for (j in 0..width-1) {
                mas[i][j]=(0..10).random()
                mass[i][j]+=mas[i][j]
            }
        }
    }

}
fun main(){
    val Matrix1=Matrix()
    val mnogmatrix=true


    Matrix1.vvid()
    Matrix1.vuvid()
    Matrix1.mnog()
    Matrix1.vuvid()


    if (mnogmatrix==true){
        Matrix1.mnogmass()
        Matrix1.vuvid()
    }






}