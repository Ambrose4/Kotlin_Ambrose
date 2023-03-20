// when
fun main(){
    //when is alternative to if statements
    // -> means to point the output
    val temp: Double = 35.2

    when(temp){
        in 0.0 .. 34.0 -> {
            println("Your Temp is $temp degrees")
            print("That is low Temp")

        }
        in 34.0 .. 37.8 -> {
            println("Your Temp is $temp degrees")
            print("That is Normal Temp")

        }
        in 37.7 .. 43.0 -> {
            println("Your Temp is $temp degrees")
            print("That is High Temp")

        }
        else ->{
            print("That is High Temp.It's critical")
        }




    }// end when

}
// end main