import kotlin.reflect.jvm.internal.impl.protobuf.ByteString

open class Gazeta  (var name:String, var nomer:Int, var date:String)
{
    fun Input (){
        try {
            println("введите название газеты")
            name= readLine()!!.toString()
            println("введите номер газеты")
            nomer= readLine()!!.toInt()
            println("введите дату выхода газеты")
            date= readLine()!!.toString()
            if (nomer<0)
            {
                println("номер газеты не может быть отрицательным")
            }
        }catch (e:Exception){ println("Некорректно введены данные")}
    }

    class Shop ( var year:Double, var kol:Int, var cena:Double , var skid:Double, epname:String,epnomer:Int,epdate:String) : Gazeta (epname,epnomer,epdate)
    {
        fun Input_()
        {
            println("введите цену газеты")
            cena= readLine()!!.toDouble()
            if (cena>0) {
                println("введите сколько лет вы закупаете у нас газеты? (в годах)")
                year = readLine()!!.toDouble()
            if (year>0){
                println("введите кол-во газет, которое вы хотели бы приобрести")
                kol= readLine()!!.toInt()
                if (kol>0)
                    else println("кол-во не может быть отрицательным")
            }else println("годы не могут быть отрицательными")
            }else println("цена не может быть отрицательной")
        }
        fun Cost()
        {
            when
            {
                    (year>5&&year<10)->println("Из за того, что вы выкупаете наши газеты более 5 лет- следующие ДВА года, газеты будут приходить вам бесплатно!!")
                (year>10)->println("Из за того, что вы выкупаете наши газеты более 10 лет- следующие ЧЕТЫРЕ года, газеты будут приходить вам бесплатно!!")
                (year<5)-> println("вы закупаете у нас газеты , на протяжении ${year}  годов ")

            }
        }
        fun Skidka(){
            skid=cena*kol
            if (kol>10)  skid=(skid-((skid*20)/100))
            else skid = skid
            println("если кол-во газет более 10- вы получаете скидку 20% ")

        }
            fun Output(gazeta: Shop)
            {
                println("\n Название газеты: ${gazeta.name} \n  Номер газеты: ${gazeta.nomer} \n Дата выхода газеты: ${gazeta.date}"+
                " \n кол-во газет , которое вы хотели приобрести ${gazeta.kol} \n ваша стоимость ${skid}")
            }

    }
}
