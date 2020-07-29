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

    print("Today is $day the fish eats $food")
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