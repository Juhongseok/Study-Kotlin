package chap04

interface UserInter{
    val nickname: String
}

class PrivateUser(override val nickname: String) : UserInter

class SubscribingUser(val email: String): UserInter{
    override val nickname: String
        get() = email.substringBefore("@")
}

class FaceBookUser(val accountId: Int) : UserInter {
    override val nickname: String = getName(accountId)

    private fun getName(accountId: Int) = "User $accountId"
}