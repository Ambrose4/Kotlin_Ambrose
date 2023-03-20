//functions - a block of statement doing some work
//functions help in dividing a large code into small related parts
// they are two types of functions
fun main(){
    hello()
     addition()
      convert()
        check()


}
// end main

fun hello(){   // you call your function from main
    println("This is a Hello Function")

}
// end hello

fun addition(){
    val num1: Int = 45
    val num2: Int = 56
    val num3: Int = 78
    val answer = num1 + num2 + num3
    println("Your addition is $answer")
}
// end addition

fun convert(){
    val usd: Double = 15.0
    if(usd < 1){
        println("You Entered $usd, Its Not Allowed")

    }
    else{
        val rate: Double = 117.85
        val answer = usd * rate
        println("you got $usd USD Equiv. to $answer KES")

    }

}
// end convert


// check at paste it web
fun check(){
    // age, price
    val age: Int = 4
    val price: Double = 30.0

    if(age > 65){
        val answer = 0.5 * price
        println("Your age is $age you pay $answer")
    }
    else if(age < 5){
        val answer = 0 * price
        println("Your age is $age you pay $answer")


    }
    else{
        println("Your age is $age you pay $price, no discount")
    }
    
       
    }
    // end check

    











