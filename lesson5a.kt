// functions - parameters, returns
// parameters are passed inside the function ()
// calculation are done on the the function but values are passed where the function is trigged/called
fun main(){
    val answer1 = interest(principle = 30000.0, rate = 1.3, time = 4.0)
    val answer2 = interest(principle = 30000.0, rate = 1.3, time = 4.0)
    val answer3 = interest(principle = 50000.0, rate = 5.5, time = 3.0)
    val answer4 = check(marks = 30.0)
    //print answer here
    println("Answer 1 = $answer1")
    println("Answer 2 = $answer2")
    println("Answer 3 = $answer3")
    println("Answer 4 = $answer4")

    
    

}
// end main
// principle,rate,time are passed and removed from the function calculation
// function helps in android to manage time limit more code- best app is written upto 50 page

fun interest(principle:Double, rate:Double, time:Double) : Double {
    //val principle: Double = 3000.0
    //val rate: Double = 1.3
    //val time: Double = 4.0
    val answer = (principle * rate * time)/100
    //println("The SI is $answer")
    return answer



}
// end interest


fun  check(marks: Double): Boolean{
    if (marks > 85){
        return true
    }
    else{
         return false

    }
        


}
// end check







