package chap04

class User1 constructor(nickname: String){
    val nickname:String
    init {
        this.nickname = nickname
    }
}

class User2 /*private */constructor(nickname: String){
    val nickname = nickname
}

class User (val nickname: String){
    var address: String = "unspecified"
        set(value) {
            println("""
                Address was changed for $nickname:
                    "$field" -> "$value"
            """.trimIndent())
            field = value
        }
} // 가장 간단히 사용가능한 주생성자 방법

open class OpenUser(val nickname: String){

}

class TwitterUser(nickname: String) : OpenUser(nickname) {
}

class FacebookUser(val nickname: String) {
    var age: Int = 0
    constructor(nickname: String, age: Int):this(nickname){
        this.age = age
    }
}

fun main() {
    val user = User("user")
    user.address = "서울시"
}