package ru.netology
import ru.netology.cardType.*


fun main() {

    println(moneyTransfers(Mastercard, 20000, true) )


}

fun moneyTransfers(

    card: cardType,
    cashTransfer: Int,
    stock: Boolean

) : Int {

    val commission = when (card) {

        Mastercard, Maestro ->
            if (stock) {
                if (cashTransfer < 300_00) {
                    (cashTransfer * 0.006 + 20_00).toInt()
                } else if (cashTransfer < 75_000_00 ) {
                    0
                } else {
                    (cashTransfer * 0.006 + 20_00).toInt()
                }
            }
            else {
                (cashTransfer * 0.006 + 20_00).toInt()
            }

        Visa, Мир ->
            if (cashTransfer > 3500_00 / 0.75) {
                (cashTransfer * 0.0075).toInt()
            } else {
                35_00
            }

        VKPay -> 0


    }

    return commission
}