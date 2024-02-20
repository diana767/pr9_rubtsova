import  abiturient.Abiturient
fun main() {
    try {
        println("Абитуриент:")
        val ab1 = abiturient.Abiturient("", "", "", "")
        println("напишите название Факультета")
        ab1.naz= readLine()!!.toString()
        println("напишите Имя")
        ab1.name= readLine()!!.toString()
        println("напишите Фамилию")
        ab1.fam= readLine()!!.toString()
        println("напишите Отчество")
        ab1.otch= readLine()!!.toString()
        ab1.Info()
        println("Преподаватель:")
        println("напишите сколько баллов получил абитуриент за 1 экзамен")
        val o1: Int = readLine()!!.toInt()
        println("напишите сколько баллов получил абитуриент за 2 экзамен")
        val o2: Int = readLine()!!.toInt()
        println("напишите сколько баллов получил абитуриент за 3 экзамен")
        val o3: Int = readLine()!!.toInt()
        val prepodavatel1 = Prepodavatel( o1, o2, o3)
        println("Преподаватель:")
        prepodavatel1.GetInfo()
        val prepodavatel = Prepodavatel(o1,o2,o3)
        val ekz1=Ekz(o1,o2,o3)
        ekz1.InfoE()
    }
    catch(e:Exception){
        println("ошибка")
    }
}