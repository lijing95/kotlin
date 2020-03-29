package test3_lab7

/*
5.  Разработать класс рациональное число и реализовать метод печати числа.
В классе реализовать инициализирующий конструктор.
При реализации методов предполагается, что методы нельзя вызвать, если число не инициализировалось.
5. 开发有理数类并实现打印数字的方法。
在类中实现初始化构造函数。
在实现方法时，假定如果未初始化数字，则无法调用方法。

 */
class Rationalnumber {
    //lateinit var a : String
    var b : Double
    var c : Double
    var d : Double
    init {
        b = 11.3
        c = 3.3
        d = 12.6
    }
    //!this::x.isInitialized
    fun toPrintNumber(x:Double){

        if (x==b||x==c||x==d) {
            println("a:${x} is a rational number") //a是有理数
        }else{
            println("This number is not initialized") //这个数没有初始化过
        }
    }
}

fun main(args:Array<String>) {
    //使用构造函数创建类实例
    var ranum = Rationalnumber()
    println("输入数字:")
    var x = readLine()!!.toDouble()
    ranum.toPrintNumber(x)
}