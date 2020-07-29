import java.util.*

fun main() {
    /*val temperature = 10

    val isHot = temperature > 50

    print(isHot)

    val message = "You are ${if (isHot) "Fried" else "Safe"} fish"
    print(message)*/

    feedTheFish()
}

fun feedTheFish(){
    val day = randomDay()
    val food = fishFood(day)

    println("Today is $day the fish eats $food")
    if (shouldChangeWater(day)){
        println("Change the water today")
    }
}

fun randomDay(): String{
    val week = listOf ("Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday")
    return week[Random().nextInt(7)]
}

fun fishFood(day: String): String{
    return when(day){
        "Monday" -> "Flakes"
        "Tuesday" -> "Pellets"
        "Wednesday" ->"Redworms"
        "Thursday" -> "Granules"
        "Friday" -> "Mosquitoes"
        "Saturday" -> "plankton"
        else -> "fasting"
    }
}

fun shouldChangeWater(day:String, temperature:Int = 22,
                         dirty: Int = 20) : Boolean{
    return when{
        isTooHot(temperature) -> true
        isDirty(dirty) -> true
        isSunday(day) -> true
        else -> false
    }
}

fun isTooHot(temperature: Int) = temperature>30
fun isDirty(dirty: Int) = dirty>30
fun isSunday(day: String) = day=="Sunday"