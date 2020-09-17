package flow
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*


fun main() = runBlocking<Unit> {
    // 启动并发的协程以验证主线程并未阻塞
    launch {
        for (k in 1..3) {
            println("I'm not blocked $k")
            delay(1040)
        }
    }
    // 收集这个流
    simple().collect { value -> println(value) }
}

fun simple(): Flow<Int> = flow { // 流构建器
    for (i in 1..3) {
        delay(1000) // 假装我们在这里做了一些有用的事情
        emit(i) // 发送下一个值
    }
}

