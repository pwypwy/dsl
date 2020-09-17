package temp

import org.jetbrains.debugger.sourcemap.parseMapSafely

typealias Param = Map<String,String>
typealias Roles = Map<String,Role>

fun main() {
    var roles = mapOf(
        "主角" to Role("小白")
    )
    val m1 = mapOf(
        "r1" to Role("aaaa")
    )

    val m2 = mapOf(
        "r2" to m1["r1"]
    )

    val m = mapOf(
        "吃东西" to {a:Param,r:Roles ->
            println("hhhhhhhhhhh")
            r["主角"]?.name+"吃"+a["食物"]
        }

    )

    val txt = m["吃东西"]?.invoke(
        param(
            "主语" to "江小白",
            "食物" to "西瓜"
        ),
        roles
    )
   // println(txt)



    m2["r2"]?.attr?.set("sex", "男")

   // println(m1)


}

fun param(vararg pairs: Pair<String, String>): Param {
    return mapOf(*pairs)
}

class Role(val name:String){
    var attr:MutableMap<String,String> = mutableMapOf()
    override fun toString(): String {
        return "$name  attr:  $attr"
    }
}