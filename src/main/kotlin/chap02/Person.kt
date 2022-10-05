package chap02

class Person(
    val name: String, // <- getter
    var isMarried: Boolean // <- getter, setter
)

fun main() {
    val person = Person("Bob", true)
    println(person.name) // getter 대신 프로퍼트 이름 직접 사용
    println(person.isMarried)
    person.isMarried = false // setter 대신 프로퍼트 이름 직접 사용
}
/**
 * With Java
    public class Person {
        private final String name;
        private boolean isMarried;

        public Person(String name, boolean isMarried) {
            this.name = name;
            this.isMarried = isMarried;
        }

        public String getName() {
            return name;
        }

        public boolean isMarried() {
            return isMarried;
        }

        public void setMarried(boolean married) {
            isMarried = married;
        }
    }
 */