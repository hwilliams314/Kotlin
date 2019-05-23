package demo

fun main(args : Array<String>) {

    /*
     * var types and gen info
     */
    println("\nBeginning Kotlin general info")
    println("\nHello world")

    val immutableName = "Holly"

    var mutableAge = 99


    var bigInt: Int = Int.MAX_VALUE
    var smallInt: Int = Int.MIN_VALUE

    println("Biggest Int : " + bigInt)
    println("Smallest Int : $smallInt")

    var dblNum1: Double = 1.1111111111111111
    var dblNum2: Double = 1.1111111111111111

    println("Sum : " +(dblNum1 + dblNum2))


    if(true is Boolean) {
        print("true is a boolean\n")
    }

    var letterGrade: Char = 'A'
    println("A is a Char : ${letterGrade is Char}\n")

    println("3.14 to Int: " + (3.14.toInt()))
    println("A to Int: " + ('A'.toInt()))
    println("65 to Char: " + (65.toChar()))

    val aName = "Derek"
    val longStr = """This ia a
              looooong string - multiple lines worth """
    var fName: String = "Bob"
    var lName: String = "Smith"
    fName = "Sally"
    var fullName = fName + " " + lName
    println("Full Name : $fullName\n")
    println("1 + 2 = ${1 + 2}")
    println("String length : ${longStr.length}")

    var str1 = "A random string"
    var str2 = "a random string"

    println("Strings Equal : ${str1.equals(str2)}")
    println("Compare A to B :  ${"A".compareTo("B")}\n")
    // next 2 lines are the sames
    println("Second index of str1 : ${str1.get(2)}")
    println("Second index of str1 : ${str1[2]}\n")

    println("Indexes 2 - 7 of str1 : ${str1.subSequence(2, 8)}")
    println("Contains random : ${str1.contains("random")}")

    /*
    * Arrays   time: 20:46
    * */
    println("\nBeginning Kotlin arrays")
    var myArray = arrayOf(1, 1.23, "Doug")
    println(myArray[2])
    println("Array length : ${myArray.size}")
    println("Array length : $myArray")
    println("Doug in myArray?  : ${myArray.contains("Doug")}")

    var partArray = myArray.copyOfRange(0, 1)
    println("First : ${str1.first()}") // gives first element
    println("Doug Index : ${myArray.indexOf("Doug")}")

    // Array(totNumOfElements, {for each x square it})
    var sqArray = Array(5, { x -> x * x})
    println(sqArray[3])

    // type specific arrays
    var arr2: Array<Int> = arrayOf(1,2,3)

    /*
    * Ranges
    * */


    //  25:56
}