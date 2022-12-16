import java.util.Scanner

fun main(args: Array<String>) {
    while (true) {
        val z = promtString("Введите знак операции: ")
        val operation = operationFactory(z) ?: break
        operation.calculate()
    }
}

fun operationFactory(command: String): Operation? {
    return when (command) {
        "0" -> return null
        "+" -> Plus()
        "-" -> Minus()
        "*" -> Multiply()
        "/" -> Divide()
        else -> InvalidOperation()
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

open class Operation {
   open fun calculate() {

    }
}

class Plus(): Operation() {
   override fun calculate() {
        val a = promtDuoble("Введите число: ")
        val b = promtDuoble("Введите число: ")
        println("$a + $b = ${a + b}")
    }
}

class Minus(): Operation() {
    override fun calculate() {
        val a = promtDuoble("Введите число: ")
        val b = promtDuoble("Введите число: ")
        println("$a - $b = ${a - b}")
    }
}

class Multiply(): Operation() {
    override fun calculate() {
        val a = promtDuoble("Введите число: ")
        val b = promtDuoble("Введите число: ")
        println("$a * $b = ${a * b}")
    }
}

class Divide(): Operation() {
    override fun calculate() {
        val a = promtDuoble("Введите число: ")
        val b = promtDuoble("Введите число: ")

        if (b - 0 < 0.0001) {
            println("Делить на ноль нельзя!")
        } else {
            println("$a / $b = ${a / b}")
        }
    }
}
class InvalidOperation(): Operation() {
    override fun calculate() {
        println("Неверный знак операции, знак может быть +, -, *, /")
    }
}


