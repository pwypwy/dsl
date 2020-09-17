fun main() {
    println("32332323")

    var o = one {
        head()
        body()
    }


    println("b: ${o.b}  h: ${o.h}")
    val dependencies = Dependencies()

    dependencies{
        compile("aaaaaaaa")
        compile("bbbbbbbb")
        compile2 {
            compile2 {
                println("++++++++++")
            }
        }
    }

    println(dependencies.get())
    //js("aa")
    val e = Event("好哈皮下")



}

class Event( name:String = ""){
    var next = listOf<String>()
    var child = listOf<String>()
    var tag = listOf<String>()
    var content = mutableMapOf<String,String>()
    //var next = listOf<String>()

}

abstract class Rule<T>{

    //处理
    abstract fun deal(t: T)
}

class Ob{

}

/**
 *
 */
class Role{
    var name = ""
    //var a = Int.monoid
    var props = mutableMapOf<String,MutableMap<String,String>>()
    val eventQueue = mutableListOf<Event>()

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

class Dependencies{

    var i = 0

    fun get():Int{
        return i
    }

    fun compile(coordinate:String){
        println("add $coordinate")
    }

    fun compile2(block:Dependencies.()->Unit){
        i++
        block()
    }

    operator fun invoke(block:Dependencies.()->Unit){
        block()
    }
}


/**
 * 1,2,3,4,6
 *  do everything ,but forever this is not allow to get info by this function
 *  only put map and go something,
 */

