import java.util.Scanner

fun main(args: Array<String>) {
    var name: String
    var score: Int

    val scanner = Scanner(System.`in`)

    print("Enter your name: ")
    name = scanner.nextLine()

    print("Enter your score: ")
    score = scanner.nextInt()

    println("Hello, $name! Your score is $score\n")


    /* Utilizing another function */


    print("Enter the first number to add: ")
    val firstNumber = scanner.nextInt()

    print("Enter the second number to add: ")
    val secondNumber = scanner.nextInt()

    val sum = add(firstNumber, secondNumber)

    println("The sum of $firstNumber and $secondNumber is $sum")

    scanner.close()


    /* Other arithmetic operators */


    println("Subtraction of $firstNumber - $secondNumber = ${firstNumber - secondNumber}")

    println("Multiplication of $firstNumber * $secondNumber = ${firstNumber * secondNumber}")

    println("Division of $firstNumber / $secondNumber = ${firstNumber / secondNumber}")
}

fun add(a: Int, b: Int): Int {
    return a + b
}