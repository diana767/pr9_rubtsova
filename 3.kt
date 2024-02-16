import Gazeta.*
fun main(){
    var gazeta=Gazeta("",0,"")
    var gazetaInfo: Shop= Shop(0.0, 0,0.0, 0.0,"",0,"")
    gazetaInfo.Input()
    gazetaInfo.Input_()
    gazetaInfo.Cost()
    gazetaInfo.Skidka()
    gazetaInfo.Output(gazetaInfo)
}