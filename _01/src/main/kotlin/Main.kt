import java.io.File

fun main(args: Array<String>) {
    val text = File("src/input.txt")
    val scores = mutableListOf<Pair<Char,Char>>()
    text.forEachLine { line ->
        val firstDigit = line.filter { it.isDigit() }.firstOrNull()
        val lastDigit = line.filter { it.isDigit() }.lastOrNull()
        if (firstDigit != null && lastDigit != null){
            scores.add(Pair(firstDigit,lastDigit))
        }
    }
    val suma = scores.sumOf { (pierwsza, ostatnia) ->
        (pierwsza - '0') * 10 + (ostatnia - '0')
    }
    println("Suma: $suma")
}