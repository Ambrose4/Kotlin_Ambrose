// elecricty bill

fun main(){

    val units: Double  = 200.0

    when (units){
        in 0..50 ->{
            val bill = units * 0.50
            println("Electricity bill is $bill")
        }
        in 51..150 ->{
            val bill = 50 * 0.50 + (units -50)*1
            println("Electricity bill is $bill")
        }
        in 151..250 ->{
            val bill = 50*0.50 + (100*1.00) + (units-150)*1.20
            println("Electricity bill is $bill")
        }
        else ->{
            val bill = 50 * 0.50 + (100*1.00) + (100*1.20) + (units -250)*1.50
            println("Electricity bill is $bill")

        }

    }//end when







}