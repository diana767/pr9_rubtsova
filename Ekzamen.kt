import kotlin.system.exitProcess

open class Ekzamen(var name:String, var predmet:String, var date:String, var ocenka:Int)
{
    fun Input (){
        try {
            println("введите имя студента")
            name= readLine()!!.toString()
            println("введите предмет, по которому пишется экзамен")
            predmet= readLine()!!.toString()
            println("введите дату экзамена")
            date= readLine()!!.toString()
            println("введите оценку за экзамен")
            ocenka= readLine()!!.toInt()
            if (ocenka<0)
            {
                println("оценка не может быть отрицательна")
            }
        }catch (e:Exception){ println("Некорректно введены данные")}
}
    class Ekz ( var a:Int, var oc:Int, var it:Int,var dop:Int, var oce: Int, ename:String,epredmet:String,edate:String, eocenka:Int) : Ekzamen (ename, epredmet,edate,eocenka)
    {
        fun Input_()
        {
            println("сколько дополнительных заданий вы посещали?")
            dop= readLine()!!.toInt()
            println("введите аудиторию в которой проводился экзамен")
            a= readLine()!!.toInt()
            if (a>0) {
                println("введите какую оценку изначально вы хотели получить")
                oc = readLine()!!.toInt()
                if (oc>0){
                    println("введите вашу годовую оценку")
                    it= readLine()!!.toInt()
                    if (it>0)
                    else println("оценка  не может быть отрицательной")
                }else println("оценка  не может быть отрицательной")
            }else println("номер аудитории не может быть отрицательным")
        }
        fun Costt()
        {
            when
            {
                (a>10&&a<100) -> println("вы попали в счастливую аудиторию")
                (oc==ocenka)-> println("вы добились желаемого результата, МОЛОДЕЦ! ")
                (oc>ocenka)-> println("вы не смогли добиться желаемого результата ")
                (it==ocenka)-> println("оценка за год соответсвует оценке за экзамен ")
                (it!=ocenka)-> println("оценка за год не соответсвует оценке за экзамен ")

            }
        }
        fun Occ(){
            println("если вы посещали более 5 доп занятий, оценка увеличивается на 1 балл")
           if ( dop>5)
           {
               if(ocenka<6)
                  oce=ocenka+1
           } else oce=ocenka


        }
        fun Output(ekzamen: Ekz)
        {
            println("\n имя студента: ${ekzamen.name} \n  предмет, по которому писался экзамен : ${ekzamen.predmet} \n  дата экзамена : ${ekzamen.date}\n оценка за экзамен: ${oce}" )
        }
}
}