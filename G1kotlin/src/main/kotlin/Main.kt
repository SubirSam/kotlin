fun main(){
    // var - mutable
    // val - immutable/constant
    // semicolon is optional
    // can print value within string using $
    // type can be inferred
    var age:Int=66;
    val pan:String="abcgdgghd11";
    println("hello sir, welcome to the world of India Kotlin");
    println("$age and $pan");

    // array index starts from 0 here
    // listOf - immutable
    // mutableListOf - mutable

    var immutableCountry= listOf<String>("India","Australia","UK","Germany","France","Russia","USA")
    println(immutableCountry.get(5))
    var country= mutableListOf<String>("India","Australia","UK","Germany","France","Russia","USA")
    println(country[6])
    country.set(6,"Japan")
    println(country[6])
    if (age<44){
        println("yet to be middle aged!!!!")
    }else if(age>60){
        println("Enjoy new childhood :)))")
    }
    var numers= listOf<Int>(22,4,65,7,78,89,9)
    println(numers.size)
    // usage of .. and until in for loop
    // size of list
    for(i in 0 until numers.size){
        println(numers.get(i))
        println(numers[i])
    }

    // substring
    // 2nd parameter of substring is always excluded
    var name = "india"
    println(name.substring(0))
    println(name.substring(0,4))


}