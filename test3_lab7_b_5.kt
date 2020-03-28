package test3_lab7
import java.util.ArrayList

/*
5.Разработайте класс матрица размерности 3x3 и реализуйте метод сложения элементов матрицы.
Матрицу хранить как непрерывный массив.
В классе реализовать инициализирующий конструктор.
При реализации методов предполагается, что методы нельзя вызвать, если числа матрицы отрицательные.
5.开发3x3矩阵类并实现添加矩阵元素的方法。
将矩阵存储为连续数组。
在类中实现初始化构造函数。
在实现方法时，假定如果矩阵数为负，则不能调用方法。

 */

class Matrix33{
    val arr33 :DoubleArray
    var p:Int
    var q:Int
    var j:Int
    var i:Int
    var ii:Int
    val matrix33:ArrayList<ArrayList<Double>>
    init {
        p = 0 //判断矩阵是不是有元素小于0(Determine if the matrix has elements less than 0)
        q = 0 //判断是不是9个数(Determine if it is 9 numbers)
        j = 0 //arr33
        i = 0 //matrix33
        ii = 0 //matrix33
        arr33 = DoubleArray(9)
        matrix33 = arrayListOf()
    }

    fun addElement(str:String) {
        //空格分开 Пробелы разделены
        var arr = str!!.split("\\s+".toRegex())

        //有元素小于0 p++（p 不等于0了） q++ [p=0 q=9才是正确的]
        for (a in arr){
            if (a.toDouble()<0){
                p+=1
            }
            q+=1
        }

        //都大于0时  Когда все больше 0
        if (p==0 && j<9 && q==9 ){
            for (a in arr){
                var x = a.toDouble()
                arr33[j] = x
                j+=1
            }
            //matrix33
            while (i<3 && ii<9){
                matrix33.add(i,element = arrayListOf(arr33[ii],arr33[ii+1],arr33[ii+2]))
                i+=1
                ii+=3
            }
            println("3*3矩阵：(matrix33:)")
            for (m33 in matrix33){
                println(m33)
            }
        }else{
            println("请重新输入！(please enter again)")
        }

    }
}
fun main(args:Array<String>) {
    var m33 = Matrix33()
    println("输入9个数(空格隔开)：[Enter 9 numbers (separated by spaces):]")
    var strEnter = readLine()
    if (strEnter == null || strEnter.length <= 0){
        println("请重新输入数字!(Please re-enter the number)")
    }else{
        m33.addElement(strEnter)
    }
}

