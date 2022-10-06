package chap03.strings

fun<T> joinToString(
    collection: Collection<T>,
    separator: String = ", ",
    prefix: String = "",
    postfix: String = ""
): String{
    val result = StringBuilder(prefix)
    for ((index, element) in collection.withIndex()) {
        if (index > 0) {
            result.append(separator)
        }
        result.append(element)
    }

    result.append(postfix)
    return result.toString()
}

//확장함수 -> 정적 메소드로 컴파일, 상속 불가
fun<T> Collection<T>.joinToStringV1(
    separator: String = ", ",
    prefix: String = "",
    postfix: String = ""
): String{
    val result = StringBuilder(prefix)
    for ((index, element) in withIndex()) {
        if (index > 0) {
            result.append(separator)
        }
        result.append(element)
    }

    result.append(postfix)
    return result.toString()
}

fun Collection<String>.join(
    separator: String = ", ",
    prefix: String = "",
    postfix: String = ""
) = joinToStringV1(separator, prefix, postfix)


fun String.lastChar() = get(length - 1)
//this.get(this.length-1)

//프로퍼티를 String class 내부에 추가 해준다고 생각
val String.lastChar:Char
    get() = get(length - 1)
