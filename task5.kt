fun main(){
    val Tmarks =school(french = 40.0, german = 50.0, computer = 60.0)
    println("Total marks = $Tmarks")

}
// end main

fun school(french:Double, german:Double, computer:Double) :Double{
   
    val answer =  (french + german + computer)
    return answer

}
// end school