import Ekzamen.*
fun main() {
    var ekzamen = Ekzamen("", "", "", 0)
    var ekzamenInfo: Ekz = Ekz(0, 0, 0, 0, 0,"" ,"", "", 0)
    ekzamenInfo.Input()
    ekzamenInfo.Input_()
    ekzamenInfo.Costt()
    ekzamenInfo.Occ()
    ekzamenInfo.Output(ekzamenInfo)

}