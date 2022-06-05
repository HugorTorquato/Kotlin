package tictactoe
import java.util.*

fun main() {
    print("Enter cells:")
    val scanner = readln().toCharArray()

    val a = scanner[0]
    val b = scanner[1]
    val c = scanner[2]
    val d = scanner[3]
    val e = scanner[4]
    val f = scanner[5]
    val g = scanner[6]
    val h = scanner[7]
    val i = scanner[8]

    println("---------")
    println("| $a $b $c |")
    println("| $d $e $f |")
    println("| $g $h $i |")
    println("---------")

}