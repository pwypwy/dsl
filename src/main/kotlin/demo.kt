fun main() {
    println("32332323")

    var o = one {
        head()
        body()
    }


    println("b: ${o.b}  h: ${o.h}")

}

class One(var h:Int=1,var b:Int=2){
    fun head(){
        h=111
        println(1111)
    }

    fun body(){
        b=2222
        println(2222)
    }
}

fun one(init: One.() -> Unit): One {
    val o = One()
    o.init()
    return o
}

/**
 * 1,2,3,4,6
 *  do everything ,but forever this is not allow to get info by this function
 *  only put map and go something,
 */

