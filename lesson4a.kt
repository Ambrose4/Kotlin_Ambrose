// arrays-  you store many values in a single variable
// when you want list like types of cars,hair style,braids 
fun main(){
    val cars = arrayOf("mazda", "Toyota", "Nissan", "Volvo")
    println(cars[1])  //use index from 0 to access array elements

    // for loop
    for(car in cars){
        println(car)
        if(car == "Nissan"){
            println("My Favourite Car")
            break; // they are to type 1.break- stop, 2. continue -no a must coz the code can still continue

        } // end if

    } // end for




}
// end main