fun main() {
    try {
        var a = readln()!!.toInt()
        var b = readln()!!.toInt()
        var c = readln()!!.toInt()
        when {
            a > b && a > c && b>c-> println("$a,$b,$c")
            a > b && a > c && b<c->println("$a,$c,$b")
            a < b && b > c && a>c-> println("$b,$a,$c")
            a < b && b > c && a<c->println("$b,$c,$a")
        }
    } catch (e: Exception) {
        println("Error")
    }
}