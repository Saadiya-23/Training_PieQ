import kotlin.math.min
import kotlin.random.Random

fun main(){
    val lst= mutableListOf<Int>()
    for(i in 0..49){
        lst.add(Random.nextInt(1,1001))
    }
    println("array before deletion:")
    println(lst)
    println("Enter the number of elements to be deleted :")
    val n=readln().toInt()
    for(i in 1..n){
        print("Enter the element to be deleted :")
        var el=readln().toInt()
        if(lst.contains(el)){
            lst.remove(el)
        }
    }
    print("array after deletion :")
    println(lst)
}
