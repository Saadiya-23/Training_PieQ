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
