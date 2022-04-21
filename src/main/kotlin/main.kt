fun main() {
    var nums = listOf(23,45,67,12,45,67,80)
    val sortnums=nums.sorted()
    println(sortnums)
    val numdesc=nums.sortedDescending()
println(numdesc)
    val num =nums.reversed()
    println(num)
    var f =CurrentAccount("det564733","Dallen",3400.0)
    f.deposit(4500.7)
    println(f.balance)
    f.withdraw(350.0)
    println(f.balance)
    f.detail()
    println(f.withdraw(300.0))
    var saving=SavingAccount("346ed","dalllen",200.0,2)
    saving.withdraws(200.0)
}

open class CurrentAccount(var accountnumber:String, var accountname:String, var balance:Double){
    fun deposit(amount:Double):Double{
        balance+=amount
        return balance
    }
    open fun withdraw(amount:Double):Double{
        balance-=amount
        return balance
    }
    open fun detail(){
        println("Acountnumber $accountnumber with balance $balance is operated by $accountname" )
    }
    open fun withdraws(amount: Double){
        var remainingBalance = balance - amount
        println(remainingBalance)
    }

}
class SavingAccount(accountnumber: String,accountname: String,balance: Double,var withdraws:Int):CurrentAccount(accountnumber,accountnumber,balance){
    override fun withdraws(amount: Double){
        super.withdraw(amount)
        if (withdraws< 4){
            withdraws++
            println("can withdraw")

        }else{
            println("not allowed to withdraw")
    }
}
}


