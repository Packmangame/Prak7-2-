fun main() {
    try {
        var x= readln()!!.toInt()
        var y= readln()!!.toInt()
        var z= readln()!!.toInt()
        print("Hole size")
        var a= readln()!!.toInt()
        var b= readln()!!.toInt()

        when
        {
            a==x && y==b->print("проходит")
            else->print(" не проходит")
        }
    }catch (e:Exception)
    {
        println("Error")
    }
}