package chap03

fun main() {
    //toRegex()로 정규식을 명시
    println("12.345-6A".split("\\.|-".toRegex()))
    println("12.345-6A".split(".", "-"))

    parsePath("/Users/kotlin-book/chapter.adoc")
    parsePathWithRegx("/Users/kotlin-book/chapter.adoc")

    val kotlinLogo = """| //
                       .| //
                       .|/ \""".trimMargin(".")
    println(kotlinLogo)
}

fun parsePath(path: String) {
    val directory = path.substringBeforeLast("/")
    val fullName = path.substringAfterLast("/")
    val fileName = fullName.substringBeforeLast(".")
    val extension = fullName.substringAfterLast(".")

    println("Dir: $directory, name: $fileName, ext: $extension")
}

fun parsePathWithRegx(path: String) {
    val regex = """(.+)/(.+)\.(.+)""".toRegex()
    val matchResult = regex.matchEntire(path)
    if (matchResult != null) {
        val (directory, fileName, extension) = matchResult.destructured
        println("Dir: $directory, name: $fileName, ext: $extension")
    }
}