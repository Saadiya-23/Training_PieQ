import kotlin.random.Random
fun main() {
    val arr=IntArray(50)

    for(i in 0..49){
        arr[i]=Random.nextInt(1,1001)
    }

    for(i in 0..49){
        print("${arr[i]} ")
    }
    println()
    println(arr.size)
    val list=arr.toMutableList()
    for(i in 0..24){
        list.removeAt(Random.nextInt(0,list.size))
    }
    println(list)
    println(list.size)
}
