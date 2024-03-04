//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
inline fun transacao(funcao: () -> Unit) {
    println("abrindo transação...")
    try {
        funcao()
    }finally {
        println("fechando transação")
    }
}
fun main(array: Array<String>) {
   transacao {
       println("Executando SQL 1...")
       println("Executando SQL 2...")
       println("Executando SQL 3...")
   }
}