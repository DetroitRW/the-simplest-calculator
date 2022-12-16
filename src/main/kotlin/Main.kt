import java.util.Scanner

fun main(args: Array<String>) {

    while (true) {
        val z = promtString("Введите знак операции: ")
        val calculator = Calculator()

        when (z) {
            "0" -> break
            "+" -> calculator.plus()
            "-" -> calculator.minus()
            "*" -> calculator.multiply()
            "/" -> calculator.divide()
             else -> println("Неверный знак операции, знак может быть +, -, *, /")
        }
    }
}

fun promtString(text: String): String {
    val reader = Scanner(System.`in`)
    print(text)
    return reader.next()
}

fun promtDuoble(text: String): Double {
    val reader = Scanner(System.`in`)
    print(text)
    return reader.nextDouble()
}

class Calculator {
    fun plus() {
        val a = promtDuoble("Введите число: ")
        val b = promtDuoble("Введите число: ")
        println("$a + $b = ${a + b}")
    }

    fun minus() {
        val a = promtDuoble("Введите число: ")
        val b = promtDuoble("Введите число: ")
        println("$a - $b = ${a - b}")
    }

    fun multiply() {
        val a = promtDuoble("Введите число: ")
        val b = promtDuoble("Введите число: ")
        println("$a * $b = ${a * b}")
    }

    fun divide() {
        val a = promtDuoble("Введите число: ")
        val b = promtDuoble("Введите число: ")

        if (b - 0 < 0.0001) {
            println("Делить на ноль нельзя!")
        } else {
            println("$a / $b = ${a / b}")
        }
    }
}


