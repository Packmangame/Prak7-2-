fun main() {
    try {
        var year= readln()!!.toInt()

        when
        {
            (year % 2 == 0 && year % 100 != 0)->print("високосный")
            else-> print("не високосный")
        }
    }catch (e:Exception)
    {
        println("Error")
    }
}