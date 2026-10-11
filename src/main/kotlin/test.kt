package ir.andy

import java.util.concurrent.ConcurrentHashMap



fun main() {


    1.a(Int::rez)

}




fun Int.rez(){println(this)}


fun<T> T.a (b : T.()->Any){
    this.b()
}