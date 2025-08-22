open class BankAccount(
    val accountHolder: String,
    internal val bankName: String,
    private val balance: Double
) {
    protected fun showBalance() {
        println("Account Holder: $accountHolder")
        println("Bank Name: $bankName")
        println("Current Balance: $balance")
    }
}

class SavingsAccount(
    accountHolder: String,
    bankName: String,
    balance: Double
) : BankAccount(accountHolder, bankName, balance) {

    fun displayAccountDetails() {
        showBalance()
    }
}

fun main() {
    val sa = SavingsAccount("Suraj Rajput", "SBI Bank", 50000.75)
    sa.displayAccountDetails()
}
