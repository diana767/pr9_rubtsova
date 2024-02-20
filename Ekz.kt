import abiturient.*
open class Ekz (var o1:Int,var o2:Int,var o3:Int) {
    open fun InfoE() {

        val sr=(o1+o2+o3)/3
       val srr=(o1+o2+o3)
        println("Средний балл за все экзамены абитуриента: $sr")
        when {
            (srr>250) -> println("абитуриент поступил")
            (srr<250)-> println("абитуриент не поступил")
        }
    }
}
