import java.util.*

fun main() {
word("veroh","jane","sarah","sharon")
text()
    numbers()
    println(Arrays.toString(name("Kenya","uganda","Nakuru")))

}
fun word(a:String,b:String,c:String,d:String) {
    var arrayWord= arrayOf("$a,$b,$c,$d")
    println(Arrays.toString(arrayWord))

}
fun text() {
    var arrayCities=arrayOf("harare","mumbai","dodoma","jakata")
    arrayCities.forEach {text->
        println(text.capitalize())

    }
}
fun numbers() {
    var arrayNumbers=arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62)
    var number=arrayNumbers.get(1)
    var number5=arrayNumbers.get(4)
    println(number+number5)
    println(arrayNumbers.lastIndex-1)

    for (oneNumber in arrayNumbers.sorted()){
        println(oneNumber)
    }

}
fun name(name1:String,name2:String,name3: String):Array<String>{
    var ArrayNames=arrayOf("$name1,$name2,$name3")
    return ArrayNames

}

