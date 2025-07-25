# Training_PieQ

```
import kotlin.random.Random
fun main() {
    val arr=IntArray(50)
    for(i in 0..49){
        arr[i]=Random.nextInt(1,1001)
    }
    print("Initial Array:")
    for(i in 0..49){

        print("${arr[i]} ")
    }
    println()
    println(arr.size)
    val list=arr.toMutableList()
    val randArr=mutableListOf<Int>()
    for(i in 0..24){
        val num=Random.nextInt(0,50)
        list[num]=-1
        randArr.add(num)

    }
    val res=mutableListOf<Int>()
    for(num in list){
        if(num!=-1) res.add(num)
    }
    println("After deletion : ${res}")
    println(res.size)
    println("Deleted Index: ${randArr.sorted()}")
}
```

<img width="1911" height="643" alt="image" src="https://github.com/user-attachments/assets/93217a5c-0d0b-418f-bd4b-0024e03d5f94" />








21/07/2025


OOPS Feature :

Class - It defines the variables and the methods which is common to all the objects instantiated from it.

Object - It is an instance of the class. They can use the variables and methods of the class to store their values and to compute. A class can have many objects . 

Encapsulation - It is the binding of variables and methods as a single entity . A class binds the data and the method under a single entity . It allows allows the accesbility of the data and methods(public , private , protected)

Polymorphism - 'poly' means 'many' . It is the abilty of the method to take many forms . It is of two types : function overloading and overriding . There can be many functions with different arguments and datatypes but with the same function name  --> This property is known as function overloading . A child class can override a function which was dervied from the parent class.

Abstraction - It allows us to hide all the complex implementation of the program . It helps to show only the necessary part. It is obtained through abstract classes and interfaces.

Inheritance - A class can inherit another class allowing them to derive all the properties of that class thus promoting reusabilty . The inherited class can add more properties in addition to the parent class properties. 
