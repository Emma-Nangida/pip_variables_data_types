import javax.management.openmbean.ArrayType

fun main() {
    introduction("Emmayo",23,"Kenya")
    println(addition(300,500,1000,50000))
    println(numbersAverage(200.1,100.1,2.0,20.0,50.0))
    p println(personRecord("mercy",23,"0778985432","mercy#@gmail.com",24.5,"Rwandan"))




}
//1. Create and invoke a function that takes in a users name, age, and nationality and prints out “Hello my name is ${name}, I am ${age} and I am from ${nationality}” e.g
//given “Lucy”, 23, and “Kenya” it will print out “Hello my name is Lucy, I am 23 years old and I am from Kenya” (2 points)
fun introduction(name:String,age:Int,nationality:String){
    println("Hello my name is $name,I am $age years old and I am from $nationality")

}

//2. Create and invoke a function that returns the sum of any given 4 numbers (3 points)
fun addition(num1:Int,num2: Int,num3: Int,num4: Int):Int{
    var sum=num1+num2+num3+num4
    return sum
}

//3. Create and invoke a function that given any 5 numbers, it returns their average (2 points)
fun numbersAverage(num1:Double,num2: Double,num3: Double,num4: Double,num5: Double):Double{
   var total=num1+num2+num3+num4+num5
    var average=total/5
    return average


}

//4. You are creating an app to capture a person’s records. Some of the data you will
//capture includes full name, age, phone number, email, weight in kg, and citizen. For the
//citizen field, you will track whether a student is a Ugandan or not. (3 points)

fun personRecord(name: String,age: Int,phoneNumber:String,email:String,weight:Double,citizen:String) {
    var data =
        ("her name is $name,age$age phone number$phoneNumber,email address$email,weight$weight and she is a $citizen")
    var citizen = "Ugandan"
    if (citizen == "Rwandan") {
        println("Is a Ugandan")



        }
    }
