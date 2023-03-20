// if statements
fun main(){
    // decision making
    val maths: Int = 100
    val eng: Int = 100
    val kisw: Int = 100
    val sci: Int = 100
    val history: Int = 100

    // finf total
    val marks = maths + eng + kisw + sci + history
    println("You scored $marks")

    // lets make decision on marks
    if(marks < 150){
        println("You got below average")
    }
    else if(marks >= 150 && marks < 250){
        println("You got average")
    }
    else if(marks >= 250 && marks < 350){
        println("You got above average")
    }
    else if(marks >= 350 && marks < 450){
        println("You passed")
    }
    else {
        print("Exellent")

    } // End else
    
    

}
// end main