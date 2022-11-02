fun main(args: Array<String>) {
    val scoreOne = 92
    val scoreTwo = 84

    var bestTeacher = if(scoreOne > scoreTwo) {
        scoreOne
    } else {
        scoreTwo
    }

    println("The overall best teacher score is $bestTeacher")

    val a = 10
    val b = 9
    val c = -1

    val result: Boolean

    result = (a > b) && (a > c) // result = (a > b) and (a > c)
    println("The result is $result")
}