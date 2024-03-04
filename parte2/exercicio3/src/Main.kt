//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
 fun<E> filtar (lista: List<E> , filtro: (E) -> Boolean): List<E>{
     val  listFiltrada = ArrayList<E>()
    for (e in lista){
        if (filtro(e)){
            listFiltrada.add(e)
        }
    }
    return listFiltrada
 }
 fun comTresLetras(nome: String): Boolean{
     return nome.length ==3
 }

fun main(array: Array<String>) {
    val nomes = listOf("Ana" , "Pedro" , "Bia" , "Gui" , "Rebeca")
    println(filtar(nomes,::comTresLetras))
}