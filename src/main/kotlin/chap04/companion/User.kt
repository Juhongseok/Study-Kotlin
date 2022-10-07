package chap04.companion

class User {
    val nickname: String

    constructor(email: String){
        nickname = email.substringBefore("@")
    }
}

class CompanionUser private constructor(val nickname: String){
    companion object CreateUser{
        fun newSubscribingUser(email: String) = User(email.substringBefore("@"))
    }
}

fun main() {
    val user = User(email = "wnghdtjr@naver.com")
    user.nickname

    val newSubscribingUser = CompanionUser.newSubscribingUser("wnghdtjr@naver.com")
    val subscribingUser = CompanionUser.CreateUser.newSubscribingUser("wnghdtjr@naver.com")
    newSubscribingUser.nickname
}