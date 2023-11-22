import java.util.*

fun main(){
    // Definir Scanner
    val scan: Scanner = Scanner(System.`in`)

    // Presentar programa
    println("Aquest programa, a partir d'un mes i un any, et diu el numero de dies que te aquell mes")

    // Llegir les entrades
    do{
        var mes: Int = comprobarEnter(scan)

    }while (mes>12)
    val any: Int = comprobarEnter(scan)

    // Mirarar el dia del any
    val numeroDies: Int = diaAny(mes,any)

    // Mostrar resultat
    println("El numero de dies del mes $mes del any $any és $numeroDies")

}

fun diaAny(mes: Int, any: Int): Int {
    val numeroDies: Int

    //Definir dies de mes
    val mes31: Int = 31
    val mes28: Int = 28
    val mes29: Int = 29
    val mes30: Int = 30

    // Busacr el dia
    when (mes) {
        1 -> numeroDies = mes31
        2 -> {
            if (any%4==0 && any%400==0 && any%100!=0) numeroDies = mes29
            else numeroDies = mes28
        }
        3 -> numeroDies = mes31
        4 -> numeroDies = mes30
        5 -> numeroDies = mes31
        6 -> numeroDies = mes30
        7 -> numeroDies = mes31
        8 -> numeroDies = mes31
        9 -> numeroDies = mes30
        10 -> numeroDies = mes31
        11 -> numeroDies = mes30
        else -> numeroDies = mes31
    }

    return numeroDies
}
