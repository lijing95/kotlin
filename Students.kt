package test4

/*
Напишите класс Student, предоставляющий информацию об имени студента методом
getName() и о его курсе методом getCourse().

Напишите метод printStudents(List students, int course), который получает список студентов и номер курса и печатает в консоль имена тех студентов из списка, которые обучаются на данном курсе. Для обхода списка в этом методе используйте итератор.

Протестируйте ваш метод (для этого предварительно придется создать десяток объектов класса Student и поместить их в список)

Напишите методы union(Set set1, Set set2) и intersect(Set set1, Set set2),
реализующих операции объединения и пересечения двух множеств. Протестируйте работу этих методах на двух предварительно заполненных множествах. (Вам понадобится написать вспомогательный метод, выводящий все элементы множества в консоль).
练习

编写一个提供有关学生姓名信息的学生班级。
getName()及其使用getCourse()方法的过程。

编写printStudents(List students,int course)方法，该方法获取学生列表和课程编号，并将在此课程中学习的列表中的学生的姓名打印到控制台。
若要在此方法中对列表进行爬网，请使用迭代器。

测试你的方法（要做到这一点，你首先需要创建十几个学生类的对象，并把它们放在列表中)

写方法union(Set1,Set2)和intersect(Set1,Set2),
实现两组联和交集的操作。 在两个预填充集上测试这些方法。 （您需要编写一个辅助方法，将集合的所有元素输出到控制台）。

 */

class Students constructor(studentName:String, courses: Int){
    val studentName:String
    var courses:Int
    init {
        this.studentName = studentName
        this.courses = courses
    }
    public fun getName(student:List<Students>): MutableList<String> {
        val n = mutableListOf<String>()
        for (s in student){
            n.add(s.studentName)
        }
        return n
    }
    public fun getCourse(student:List<Students>): MutableList<Int> {
        val c  = mutableListOf<Int>()
        for (s in student){
            c.add(s.courses)
        }
        return c
    }
    //获取学生列表和课程编号,并将在 此课程中学习的列表中的学生的姓名打印到控制台
    public fun printStudents(student:List<Students>, course:Int): MutableList<String> {
        var i = 0
        val choseName = mutableListOf<String>()
        for (s in student){
            if (s.courses==course){
               choseName.add(s.studentName)
            }
        }
        return choseName
    }

    public fun union(set1:Set<Int>,set2:Set<Int>):Set<Int>{
        var set3 = set1.plus(set2)
        return set3
    }

    public fun intersect(set1:Set<Int>,set2:Set<Int>):Set<Int>{
        var set4 = set1.minus(set2)
        return set4
    }
}

fun main(args:Array<String>) {
    var s = Students("XXX", 5)
    val student = listOf(
        Students("AAA", 1),
        Students("BBB", 2),
        Students("CCC", 3),
        Students("DDD", 2),
        Students("EEE", 1),
        Students("FFF", 4),
        Students("GGG", 1),
        Students("HHH", 4),
        Students("III", 3),
        Students("JJJ", 1),
        Students("KKK", 3),
        Students("MMM", 2)
    )
    //s.getName(student)
    //s.getCourse(student)
    println(s.printStudents(student,3))

    //交集 并集
    val stu1 = listOf(
        Students("aaa", 1),
        Students("bbb", 2),
        Students("ccc", 3),
        Students("ddd", 2),
        Students("eee", 1)
    )
    val stu2 = listOf(
        Students("fff", 1),
        Students("ggg", 4),
        Students("hhh", 5),
        Students("iii", 2),
        Students("jjj", 1)
    )

    val s1:Set<Int> = s.getCourse(stu1).toSet()
    val s2:Set<Int> = s.getCourse(stu2).toSet()
    println(union(s1,s2))
    println(intersect(s1,s2))

}