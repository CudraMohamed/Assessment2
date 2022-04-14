fun main(){
    var myAcc=CurrentAccount(1234567,"Cudra",900.50)
    println(myAcc.deposit(50.50))
    println(myAcc.withdraw(100.50))
    println(myAcc.details())

    var veg=Product("Carrots",3.5,50,"groceries")
    var soap=Product("Dettol",5.5,90,"hygiene")
    var pencil=Product("HB",0.5,30,"other")
    var milk=Product("Tuzo",12.5,90,"other")
    var veg2=Product("Apple",2.5,40,"groceries")
    var all=listOf(veg,soap,pencil,milk,veg2)
    println(all)


   var outcome= name(arrayOf("Cudra","Mami","Silvia","Nash"))
    println(outcome)

}
//1.Create a classCurrentAccount with the following attributes:account
//number, account name, balance. It has the following functions:
//a.deposit(amount: Double) - Increments the balance bythe
//amount deposited
//b.withdraw(amount: Double) - Decrements the balanceby the
//amount withdrawn
//c.details() - Prints out the account number and balanceand
//name in this format: “Account number x with balance y is
//operated by z”(5points)

open class CurrentAccount(var accNo:Int,var accName:String,var balance:Double){
    fun deposit(amount:Double){
        var x=amount+balance
            println(x)
    }
    open fun withdraw(amount2:Double){
        var d=balance-amount2
        println(d)
    }
    fun details(){
        println("Account number $accNo with balance $balance ia operated by $accName")
    }
}
//Create another classSavingsAccount. It has the samefunctions and
//attributes as the current account except for one attribute,
//withdrawals: Int. Withdrawals is a counter variablethat is used to
//keep track of how many withdrawals have been made from the account
//in a year. The only other difference is that the savings account
//withdraw() method first checks if the number of withdrawalsis less
//than 4 for it to allow one to withdraw money from the account. It also
//increments the withdrawals attribute after a successful withdrawal

//class SavingAccount(accNo:Int,accName:String,balance:Double,withdrawals:Int):CurrentAccount(accNo,accName,balance){
//    override fun withdraw(){
//        var totalw=
//    }
//}

//3.A product is represented by a data class with these attributes: name,
//weight, price, category. Category can either be groceries, hygiene or
//other. Write a function that takes in a product and uses a when
//statement to assign each product to a list based on its category

data class Product(var name:String,var weight:Double,var price:Int,var category:String)

fun myProduct(product:Product){
    var x= mutableListOf<Product>()
    var y= mutableListOf<Product>()
    var z= mutableListOf<Product>()

    when(product.category){
        "groceries"-> println(x.plus(product))
        "hygiene"-> println(x.plus(product))
        "other"-> println(x.plus(product))
    }
}

//4.Write a function that given a string returns a string composed of only
//the characters in even indices. For example given “banana” it will return
//“bnn”
fun name(names:Array<String>):List<String>{
    var nameString= mutableListOf<String>()
        names.forEachIndexed { index, s ->
           if( s.length%2==0)
               nameString.add(s)
        }
    return nameString
}