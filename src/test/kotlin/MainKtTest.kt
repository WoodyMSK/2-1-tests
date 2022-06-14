import ru.netology.cardType.*
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import ru.netology.moneyTransfers


class MainKtTest {

    @Test
    fun moneyTransfersTest() {

        val card = Mastercard
        val cashTransfer = 200_00
        val stock = true
        val result = moneyTransfers(card, cashTransfer, stock)
        val expected = 2120

        assertEquals(expected, result)
    }


}
