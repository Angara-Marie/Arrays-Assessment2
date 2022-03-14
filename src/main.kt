fun main(){
    var x = multiply(arrayOf(12, 3, 4, 8))
    println(x)
    var y = addition(arrayOf("Tessa",3.3, 1.2F, 22, 4.5, 3.3F,"Tut"))
    println(y)
    var z = letters(arrayOf('b','d', 'a','c', 'e','i', 'w', 'o', 't','u'))
    println(z)


}
fun multiply(numbers:Array<Int>):Int{
    var product = 1
    numbers.forEach { el->
        product*=el
    }
    return product
}
fun addition(medly:Array<Any>):Double{
    var sum = 0.0
    medly.forEach { element ->
        if(element is Int || element is Double|| element is Float)  {
            sum+=element.toString().toDouble()
        }
    }
    return sum

}
fun letters(vowels:Array<Char>):Int {
    var num = 0
    vowels.forEach { tessa ->
        if (tessa == 'a' || tessa == 'e' || tessa == 'i' || tessa == 'o' || tessa == 'u') {
            num++

        }
    }
    return num
}