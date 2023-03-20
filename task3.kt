// write a program to print the amount to be paid based on distance traveled
// 0 to 100 -> 5
// > 100 =< 500
// > 500 =< 1000
// > 1000 0r more

fun main(){
    val distance: Double = 400.0

    when(distance){
        in 0.0 .. 100.0 -> {
            println("You covered $distance km")
            print("you earned 5.0 shillings")

        }
        in 100.0 .. 500.0 -> {
            println("You covered $distance km")
            print("you earned 8.0 shillings")

        }
        in 500.0 .. 1000.0 -> {
            println("You covered $distance km")
            print("you earned 10.0 shillings")

        }
        else -> {
            println("you earned 12.0 shillings")
        }
        







    }// end when



}
// end main