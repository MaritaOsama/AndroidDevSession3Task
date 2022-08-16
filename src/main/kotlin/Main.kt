import java.util.*

fun main(){

    val scn = Scanner(System.`in`)

    println("Enter a number: ")
    val N: Int = scn.nextInt()


    val nameList : MutableList<String> = mutableListOf<String>()

    println("Enter list names:")

    for(size in 0..N) {
        val name = scn.nextLine()
        nameList.add(name)
    }

    println("Updated List:")
    for(item in nameList){
        if(item.contains("B", ignoreCase = true) || item.contains("M", ignoreCase = true)){
            println(item.uppercase())
        }
    }
}


