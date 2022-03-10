fun main() {
    var name = "codeHive"
    println(name[4].toString()+name[5]+name[6]+name[7])
    var x = numbers(55, 11)
    println(x)
    var b =parameters("Bakhita", 22)
    println(b)
    var z = car("Maserati")
    println(z)
}
fun numbers(num1: Int, num2: Int): Int {
    var divide = num1/num2
    return divide

}
fun parameters(name: String, age: Int): String {
    var statement = ("Hi, my name is ${name} and I am ${age} years old.")
    return statement

}
fun car(s: String): Int {
    var y = "Maserati"
    var len =  y.length
    return len

}