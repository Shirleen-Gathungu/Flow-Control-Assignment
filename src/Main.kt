fun main() {
    println(countNameLongerThan5(arrayOf("Muindelaveni","Rashid","Lucia","Skelintai","Jamil","Sorugai","Amanda")))
    printOddNumbers()
    servingRobot(3)
    multiples3and5(15)
}
fun countNameLongerThan5(names:Array<String>):Int{
    var num=0
    names.forEach{name->
        if (name.length>5){
            num++
        }
    }
    return num
}



fun printOddNumbers(){
    for(nums in 1..100){
        if(nums%2 !==0){
            println(nums)
        }
    }

}

fun servingRobot(age:Int){
    if(age<6){
        println("Have a glass of milk")
    }
    else if(age>6 &&!age.equals(15 and 6) && age<15) {
        println("Have a bottle of Fanta")

    }
    else{
        println("Have a bottle of Coke")
    }
}

fun multiples3and5(num:Int) {
    for (num in 1..100) {
        if (num % 3 == 0) {
            println("Fizz")

        }
        else if (num % 5 == 0) {
            println("Buzz")

        }
        else if (num % 5 == 0 || num % 3 == 0) {
            println("FizzBuzz")

        }
        else {
            println(num)
        }
    }
}

