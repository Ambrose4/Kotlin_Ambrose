// method 2
//when
fun main(){
    val temp: Double = 36.6


    when{
        temp < 34.0 -> {
            println("Temperature is $temp degrees")
            print("The Temp is Too Low")
        }
        temp < 34.0 && temp < 37.7 -> {
            println("Temperature is $temp degrees")
            print("The Temp is Normal")
        }
        temp < 37.7 && temp < 42.0 -> {
            println("Temperature is $temp degrees")
            print("The Temp is High")
        }
        else -> {
            println("The Temp is higher.It's critical")
        }


    } // end when

}
// end main