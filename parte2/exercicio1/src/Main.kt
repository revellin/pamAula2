//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    for (n in ordenar (38,3,456,8,51,88,73)){
        println("$n ")
    }
}

fun ordenar (vararg numeros: Int):IntArray {
    return numeros.sortedArray()
}