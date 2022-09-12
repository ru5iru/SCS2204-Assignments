 import scala.io.StdIn.readDouble

 class Account(id:String, n:Int, b:Double){
    val nic:String = id
    val acno = n
    var balance = b
    
    override def toString = "[ " + nic + " : " + acno + " : " + balance +" ]"

    def withdraw(amount:Double) = this.balance - amount
   
    def deposit(amount:Double) = this.balance + amount
    
    def transfer(acc:Account, amount:Double) = {
        if(amount > this.balance){
          println("Insufficient balance")
        }else{
          this.balance = this.withdraw(amount)
          acc.balance = acc.deposit(amount)
        }
    }
}
object Q3 extends App{
    val acc1 = new Account("001", 12345, 25000)
    val acc2 = new Account("002", 67890, 50000)

    var bank:List[Account] = List(acc1, acc2)

    println("Before:")
    println("Account "+acc1.acno+" balance: "+acc1.balance)
    println("Account "+acc2.acno+" balance: "+acc2.balance)

    print("\nEnter the amount you want to transfer: ")
    var amount = readDouble()
    acc1.transfer(acc2, amount)
    
    println("\nAfter:")
    println("Account "+acc1.acno+" balance: "+acc1.balance)
    println("Account "+acc2.acno+" balance: "+acc2.balance)
}

