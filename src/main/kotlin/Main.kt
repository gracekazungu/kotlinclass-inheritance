fun main(){
val banker= Banker("Grace",30)
    banker.eat()
//    banker.sleep()
//    banker.talk("mshenee")
//    println(banker.countMoney(arrayOf(20,65,5,6,90)))
    banker.introduction()

    val doctor=Doctor("Becky",45)
    doctor.eat()
//    doctor.sleep()
//    doctor.talk("treating")
//    doctor.treatPatient("cathy","malaria")
    doctor.introduction()

    val farmer=Farmer("Idaya",78)
    farmer.eat()
//    farmer.sleep()
//    farmer.talk("English")
//    farmer.cultivateLand()
    farmer.introduction()

}
open class Person(var name:String,var age:Int){
    fun talk(words:String){
        println(words)
    }
    open fun eat(){
        println("yum")
    }
    fun sleep(){
        println("zzzzz")
    }
    open fun introduction(){
        println("Hi my name is $name")
    }
}

class Banker(name:String,age:Int): Person(name,age){

    fun countMoney(notes:Array<Int>):Int{
        return notes.sum()
    }

    override fun eat() {
        super.eat()
        println("Banker eating")
    }
}
class Doctor(name:String, age:Int): Person(name,age){
//    fun talk(words:String){
//        println(words)
//    }
//    fun eat(){
//        println("yum")
//    }
//    fun sleep(){
//        println("zzzzz")
//    }
    fun treatPatient(patient:String,disease:String){
        println("treating $patient for $disease")
    }
    override fun introduction(){
        println("Hello my name is kayo")
    }
}
class Farmer(name:String,age:Int): Person(name,age){
//    fun talk(words:String){
//        println(words)
//    }
//    fun eat(){
//        println("yum")
//    }
//    fun sleep(){
//        println("zzzzz")
//    }
    fun cultivateLand() {
        println("dig dig dig")
    }

    override fun eat() {
        super.eat()//it invoke eat from the parent class
        println("Farmer eating")
    }
}

