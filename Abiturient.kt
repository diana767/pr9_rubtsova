
package abiturient
open class Abiturient (var naz: String, var name: String, var fam:String,var otch:String){
    open fun Info(){
        println("Факультет: $naz , Имя aбитуриента: $name, фамилия aбитуриента: $fam, отчество aбитуриента: $otch" )
    }

}