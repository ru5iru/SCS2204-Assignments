class Account(id:String, n:Int, b:Double){
    val nic:String = id
    val acno = n
    var balance = b
    
    override def toString = "[ " + nic + " : " + acno + " : " + balance +" ]"
}

object Q4 extends App{
    val acc1 = new Account("001", 1234, 50000)
    val acc2 = new Account("002", 2345, 40000)
    val acc3 = new Account("003", 3456, -20000)
    val acc4 = new Account("004", 4567, 2500)
    val acc5 = new Account("005", 5678, -3500)

    var bank:List[Account]=List(acc1, acc2, acc3, acc4, acc5)
  
    println("\nAccounts with negative balances:\n"+ find(bank))
    add(bank)
    interest(bank)

    def find(list:List[Account]) = {
        list.filter(x => x.balance<0)
     }

    def add(list:List[Account]) = {
        var sum = list.foldLeft(0.0)((sum, y) => sum + y.balance)
        println("\nSum of all account balances: " + sum + "\n")
    }

    def interest(list:List[Account]) = {
        list.map(x => {
        if (x.balance > 0.0){
            x.balance = x.balance + x.balance*0.05
            println("Final balance of account " + x.acno+" = "+(x.balance)) 
        }else{
            x.balance = x.balance + x.balance*0.1
            println("Final balance of account " + x.acno+" = "+(x.balance)) 
        }
        })
    }
}