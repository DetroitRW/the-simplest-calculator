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
            val a = reader.nextDouble()

            print("Введите число: ")
            val b = reader.nextDouble()

            println("$a + $b = ${a + b}")
        } else if (z == "-") {
            print("Введите число: ")
            val a = reader.nextDouble()

            print("Введите число: ")
            val b = reader.nextDouble()

            println("$a - $b = ${a - b}")
        } else if (z == "*") {
            print("Введите число: ")
            val a = reader.nextDouble()

            print("Введите число: ")
            val b = reader.nextDouble()

            println("$a * $b = ${a * b}")
        } else if (z == "/") {
            print("Введите число: ")
            val a = reader.nextDouble()

            print("Введите число: ")
            val b = reader.nextDouble()

            if (b - 0 < 0.0001) {
                println("Делить на ноль нельзя!")
            } else {
                println("$a / $b = ${a / b}")
            }
        } else {
            println("Неверный знак операции, знак может быть +, -, *, /")
        }
    }
}
