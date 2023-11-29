import java.util.*

fun main(){
    // Definir Scanner
    val scan: Scanner = Scanner(System.`in`)

    // Presentar programa
    println("Aquest programa, a partir d'un mes i un any, et diu el numero de dies que te aquell mes")

    // Llegir les entrades
    var mes: Int = 0
    do{
        println("")
        mes = comprobarEnter(scan)
        if (mes>12 && mes<1){
            println("ERROR: El més no és coorecte")
            mes = comprobarEnter(scan)
        }
    }while (mes>12 && mes<1)
    val any: Int = comprobarEnter(scan)

    // Mirarar el dia del any
    val numeroDies: Int = diaAny(mes,any)

    // Mostrar resultat
    println("El numero de dies del mes $mes del any $any és $numeroDies")

}

fun diaAny(mes: Int, any: Int): Int {
    val numeroDies: Int

    // Cada valor representa el numero de dies d'un mes
    val arrayMesos: Array<Int> = arrayOf(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)

    // Busacr numero de dies
    if (mes == 2 && any%4==0 && any%100!=0 || any%400==0 ) numeroDies = 29
    else numeroDies = arrayMesos[mes - 1] // -1 pq els index de l'array començen per 0
    
    return numeroDies
}

