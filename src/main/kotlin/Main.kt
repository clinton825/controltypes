
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

    // for loop
     forEachWithIndex()
     forEachStandard()
    forEachIndices()
    whileWithList()
    doWhileExample()
    workingWithStrings()
    workingWithTemplates()



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

    var result: String = when (obj) {
        1 -> "One"
        "Hello" -> "A Greeting"
        is Long -> " Long Var"
        !is String -> "Not a String"
        else -> "Unknow"
    }
    return result
}

fun forEachStandard(){
var items = listOf("apple","banana","kiwi")
    for (item in items){
        println("Item is :$item")
    }
}

fun forEachIndices(){
    val items = listOf("apple","banana","kiwi")
    for (index in items.indices){
        println("The item at "+ index + "is:"+ items[index])
    }

}
fun forEachWithIndex(){
    val items = listOf("apple","banana","kiwi")
    for ((index,value ) in items.withIndex()){
        println("The item at"+ index + "is:" + value)
    }

}
fun whileWithList() {
    val items = listOf("apple", "banana","kiwi")
    var index = 0
    while (index < items .size){
        println("Item at index:" + index + " is:" + items[index])
        index++
    }

}
fun doWhileExample(){
    var index = 0
    do {
        println("Do While Index is: " + index )
        index++
    } while (index < 5)
}
fun workingWithStrings(){
    val aString = "An escaped string!\n"
    print(aString)

    val einstein = """
        Learn from yesterday
        Live for today
        Hope for tomorrow
        The important thing
        is not to stop questioning.
        (Albert Einstein)
    """.trimIndent()
    println(einstein)

    val franklin = """
          |Tell me and I forget.
          |Teach me and I remember.
          |Involve me and I learn.
          |  (Benjamin Franklin)
    """.trimMargin()
    println(franklin)
}
fun workingWithTemplates(){
    var firstString = "This is a String"
    var secondString = "and this is another String"

    //using simple names
    println ("Simple names: $firstString $secondString")

    //using arbitrary expressions in {}
    println("Expressions (cases): ${firstString.uppercase()} ${secondString.lowercase()}")
    println("Expressions (string size): first string is ${firstString.length}")
    println("Expressions (substring): ${firstString.substring(0,2)}")
}


