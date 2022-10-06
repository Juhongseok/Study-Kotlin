package chap03

class User(val id: Int, val name: String, val address: String)

fun saveUserV1(user: User) {

    fun validate(user: User, value: String, fieldName: String) {
        if (value.isEmpty()) {
            throw IllegalArgumentException("Can't save user ${user.id} : empty $fieldName")
        }
    }

    validate(user, user.name, "Name")
    validate(user, user.address, "Address")

    fun validateV1(value: String, fieldName: String) {
        if (value.isEmpty()) {
            throw IllegalArgumentException("Can't save user ${user.id} : empty $fieldName")
        }
    }

    validateV1(user.name, "Name")
    validateV1(user.address, "Address")

    println("Save User Success")
}

fun saveUserV2(user: User) {
    user.validate()
    println("Save User Success")
}

fun User.validate(){
    fun validate(value: String, fieldName: String) {
        if (value.isEmpty()) {
            throw IllegalArgumentException("Can't save user $id : empty $fieldName")
        }
    }

    validate(name, "Name")
    validate(address, "Address")
}