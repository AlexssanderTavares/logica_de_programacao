fun main() {
    val num1: Int = 5; //val is for constants declaration
    var num2: Int = 2; //var is for non-constants declaration

    //types

    //numbers
    var data1: Byte = 127; //byte for value <= 127 (8 bits)
    var data2: Short = 32767; //short for value <= 32767 (16 bits)
    var data3: Int = 2147483647; //int for value <= 2147483647 (32 bits)
    var data4: Long = 9223372036854775807; //long for value <= 9223372036854775807 (64 bits)

    //unsigned integers
    var data5: UByte; //8bit integer 0..255
    var data6: UShort; //16bit integer 0..65535
    var data7: UInt; //32bit integer 0..2^32-1
    var data8: ULong; //64bit integer 0..2^64-1

    //booleans
    var data9: Boolean = true; //true or false
    var data10: Boolean = false; //true or false
    var data11: Boolean? = null; //true, false or null

    /*
        || > Or
        && > and
        ! > not

     */

    //character
    var data12: Char = 'a';
    var data13: Char = '\uFF00';

    /* ESCAPES
        \t - tab
        \b - backspace
        \n - new line
        \r - Carriage Return - Moves cursor to the beginning of the line without advancing to the next line
        \' - adds single quotation on the sentence string like - 'hello there'
        \" - adds double quotation on the sentence string like - "hello there"
        \\ backslash - adds \ to the sentence string like - \hello there
        \$ dollar sign - adds dollar on the sentence string like - $hello there
     */

    //Strings
    var data14: String = "abcd 1234";
    //multiline Strings
    var data15: String = """
        ||TEXT LINE 1
        ||TEXT LINE 2
        ||TEXT LINE3
    """.trimMargin("*");

    var data16: Int = 1;
    println("I = $data16");
    println("I =  ${data15.length}");

    //Arrays
    var data17: Array<Int> = arrayOf(1,2,3);
    var data18: Array<String> = arrayOf("Alex","Lindiane","Antonio","Andrea");
    var data19: Array<Double>; //declaration of a array without any value. Can be filled later with variables
    var data20: IntArray = intArrayOf(1,2,3); //sintax exclusive for primitive type arrays declarations
    var arr = IntArray(5); //defines an array of integers with size 5

}