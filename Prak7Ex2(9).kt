fun main() {
    try {
    var a= readln()!!.toInt()
    var b= readln()!!.toInt()
    var c= readln()!!.toInt()
    when
    {
        a in 1..3 -> println("принадлежит")
        a>3-> println("не принадлежит")
        a<1-> println("не принадлежит")
        b in 1..3 -> print("принадлежит")
        b>3-> println("не принадлежит")
        b<1-> println("не принадлежит")
        c in 1..3-> print("принадлежит")
        c>3-> println("не принадлежит")
        c<1-> println("не принадлежит")
    }
    }catch (e:Exception) {
        println("Error")
    }
}