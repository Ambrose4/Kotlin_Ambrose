// do bmi, check what that bmi mean

fun main(){
    val weight: Double = 60.0
    val height: Double = 1.5

    val BMI = weight/(height*height)
    println("Your BMI is $BMI")

    if(BMI < 18.5){
        println("You are under weight")
    }
    else if(BMI >= 18.5 && BMI < 22.9){
        println("You are Normal")
    }
    else if(BMI >= 23 && BMI < 24.9){
        println("You are Over weight")
    }
    else if(BMI >= 25 && BMI < 29.9){
        println("You are Pre.Obess")
    }
    else if(BMI >= 30.0 && BMI < 34.9){
        println("You are Obess Class 1")
    }
    else if(BMI >= 35.0 && BMI < 39.9){
        println("You are Obess Class 2")
    }
    else {
        print("you are Obess Class 3")

    } // End else
    
    
    


}
// end main