import java.lang.Integer.parseInt

fun main(args: Array<String>) {
    printValue(3)
    println("The Max number is: " + maxOf(4, 6));
    printExpressionResults(12, "12")
    printRange(30)
    printInferredType()
    printAnimal("Elephant")
    println(describe(1))
    println(describe("Hello"))
    println(describe(1000L))
    println(describe(2))
    println(describe("other"))
}

fun maxOf(a: Int, b: Int) = if (a > b) {
    print("a is  greater than b. ")
    a
} else {
    print("b is greater than a. ")
    b
}

// when construct

fun printValue(value: Int) {
    when (value) {

        1 -> println("This value is One")
        2 -> println("The value is Two")
        in 3..5 -> println("The value is between Three and Five")
        else -> {
            println("The value is: + value")

        }
    }
}

fun printRange(value: Int) {
    when (value) {
        in 1..10 -> println("Between 1..10")
        !in 1..20 -> println("Outside 10..20")

    }
}


fun printExpressionResults(numberValue: Int, stringValue: String) {
    when (numberValue) {
        parseInt(stringValue) -> println("stringValue holds the same number as numberValue")
        else -> {
            println("stringValue is not the same number as numberValue")
        }

    }

}


fun printInferredType() {
    when (3) {
        is Int -> println("My interred type is Int")
    }
}


fun printAnimal(aString: String) = when {
    aString.equals("Dog") -> println("A dog")
    aString.equals("Cat") -> println("A cat")
    aString.contains("pig") -> println("A pig of some sort")
    aString.length == 0 -> println("Empty String..no Animal")
    else -> {
        println("No identifiable animal")

    }

}
fun describe(obj: Any): String {

    var result : String = when (obj){
        1 -> "One"
        "Hello" -> "A Greeting"
        is Long -> " Long Var"
        !is String -> "Not a String"
        else -> "Unknow"
    }
    return  result
}