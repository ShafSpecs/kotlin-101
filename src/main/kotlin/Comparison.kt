fun main(args: Array<String>) {
    val scoreOne = 92
    val scoreTwo = 84

    var bestTeacher = if(scoreOne > scoreTwo) {
        scoreOne
    } else {
        scoreTwo
    }

    println("The overall best teacher score is $bestTeacher")
}