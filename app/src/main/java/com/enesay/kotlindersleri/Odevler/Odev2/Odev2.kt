package com.enesay.kotlindersleri.Odevler.Odev2


fun convertToMile(km: Double): Double{
    return km * 1.6
}

fun getTheArea(shortEdge: Int, longEdge: Int): Int{
    return shortEdge * longEdge
}

fun getFactorial(number: Int): Int{
    var result = 1
    for (i in number downTo 1){
        result *= i
    }
    return result
}

fun findTheELetter(str: String): Int {
    var count = 0
    for (i in str) {
        if (i == 'e' || i == 'E') {
            count++
        }
    }
    return count
}

fun getTheInternalAngle(edgeCount: Int): Double = (edgeCount - 2) * 180.0 / edgeCount

fun getSalary(hours: Int): Int{
    var salary = 0
    val hourlyRate = 40

    if (hours > 150){
        salary += ((hours - 150) * hourlyRate * 2) + (150 * hourlyRate)
    }
    else{
        salary += hours * hourlyRate
    }

    return  salary
}

fun calculateOtoparkCharge(hours: Int): Int{
    val hourlyRate = 50
    var charge = 0
    if (hours > 1){
        charge += hourlyRate + (10 * (hours - 1))
    }
    return charge
}