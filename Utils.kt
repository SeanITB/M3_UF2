import java.util.*

fun main(){
    // Definir Scanner
    val scan: Scanner = Scanner(System.`in`)

    // Presentar programa
    println("Aquest programa comprova que un numero sigui capicua")

    // Llegir numero
    val numero: Int = comprobarEnter(scan)

    // Funcio que mira si és cap i cua
    val esCapicua: Boolean = comprobarCapicua(numero)

    // Mostrar resultat
    if (esCapicua == true) println("Numero $numero és capicua")
    else println("Numero $numero no és capicua")
}

fun comprobarCapicua(num: Int): Boolean{
    var esCapicua: Boolean

    // Comprobar si poscio inicial es igual que la final
    val numString = num.toString()
    if (numString[0] == numString[numString.lastIndex]) esCapicua = true
    else esCapicua = false

    return esCapicua
}
