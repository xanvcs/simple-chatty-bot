package bot

const val failMessage = "Please, try again"

fun main() {
    greet("Aid", "2022") // change it as you need
    remindName()
    guessAge()
    count()
    test()
}

fun greet(assistantName: String, birthYear: String) {
    println("Hello! My name is ${assistantName}.")
    println("I was created in ${birthYear}.")
    println("Please, remind me your name.")
}

fun remindName() {
    val name = readln()
    println("What a great name you have, ${name}!")
}

fun guessAge() {
    println("Let me guess your age.")
    println("Enter remainders of dividing your age by 3, 5 and 7.")
    val rem3 = readln().toInt()
    val rem5 = readln().toInt()
    val rem7 = readln().toInt()
    val age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105
    println("Your age is ${age}; that's a good time to start programming!")
}

fun count() {
    println("Now I will prove to you that I can count to any number you want.")
    val num = readln().toInt()
    for (i in 0..num) {
        print(i)
        println("!")
    }
}

fun test() {
    println("Let's test your programming knowledge.")
    // write your code here
    println("Why do we use methods?")
    println("1. To repeat a statement multiple times.")
    println("2. To decompose a program into several small subroutines.")
    println("3. To determine the execution time of a program.")
    println("4. To interrupt the execution of a program.")

    when (readln().toInt()) {
        1 -> failMessage
        3 -> failMessage
        4 -> failMessage
        2 -> return end()
    }
}

fun end() {
    println("Congratulations, have a nice day!") // Do not change this text
}
