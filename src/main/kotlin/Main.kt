import java.util.Scanner

fun main(args: Array<String>) {
    val reader = Scanner(System.`in`)

    while (true) {
        print("Введите знак операции: ")
        val z = reader.next()

        if (z == "0") {
            break
        } else if (z == "+") {
            print("Введите число: ")
            val a = reader.nextInt()

            print("Введите число: ")
            val b = reader.nextInt()

            println("$a + $b = ${a + b}")
        } else if (z == "-") {
            print("Введите число: ")
            val a = reader.nextInt()

            print("Введите число: ")
            val b = reader.nextInt()

            println("$a - $b = ${a - b}")
        } else if (z == "*") {
            print("Введите число: ")
            val a = reader.nextInt()

            print("Введите число: ")
            val b = reader.nextInt()

            println("$a * $b = ${a * b}")
        } else if (z == "/") {
            print("Введите число: ")
            val a = reader.nextInt()

            print("Введите число: ")
            val b = reader.nextInt()

            if (b == 0) {
                println("Делить на ноль нельзя!")
            } else {
                println("$a / $b = ${a / b}")
            }
        } else {
            println("Неверный знак операции, знак может быть +, -, *, /")
        }
    }
}
