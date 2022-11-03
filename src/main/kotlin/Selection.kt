import java.util.Scanner

fun main() {
//    val number = -10

//    val res = if (number > 0) "Positive" else "Negative"



//    val scanner = Scanner(System.`in`)
//
//    print("")
//    val n1 = scanner.nextInt()
//    val n2 = scanner.nextInt()
//    val n3 = scanner.nextInt()
//
//    val max = if (n1 > n2) {
//        if (n1 > n3) {
//            n1
//        } else {
//            n3
//        }
//    } else {
//        if (n2 > n3)
//            n2
//        else
//            n3
//
//    }
//
//    println("$max")




    var ch = 'A'

    when(ch) {
        'A', 'E', 'I', 'O', 'U' -> println("$ch is a vowel letter")
        else -> println("$ch is a cosnstant")
    }

    val a = 100

    when(a) {
        in 1..10 -> println("+ve number less than 11")
        in 10..100 -> println("+ve number between 10 and 100 (inclusive)")
    }
}