// payroll program

fun main(){
    val basic: Double = 40000.0
    val house_allowance: Double = 3500.0
    val health_allowance: Double = 3000.0
    val tax: Double = 0.03 * basic


    val employee_name: String = "Eric"
    val leave: Boolean = false

    //find gross and netpay
    val gross = basic+house_allowance+health_allowance
    println("Your gross salary is KES $gross")

    val netpay = gross - tax
    //if leave is true dont show the netpay
    if(leave == false){
        println("Your name was $employee_name and Net pay is KES $netpay")

    }
    else {
        println("No Net pay")
    } // end
    









}
// end main