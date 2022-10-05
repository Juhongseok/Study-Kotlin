package chap02

class Rectangle(val height: Int, val width: Int) {
    // backing field 없이 getter 만 있음
    val isSquare: Boolean
        get() = height == width
}

/**
 * With Java
    public class Rectangle {
        private final int height;
        private final int width;

        public Rectangle(int height, int width) {
            this.height = height;
            this.width = width;
        }

        public int getHeight() {
            return height;
        }

        public int getWidth() {
            return width;
        }

        public boolean isSquare(){
            return height == width;
        }
    }
 */

fun main() {
    val rectangle = Rectangle(4, 4)
    println(rectangle.isSquare)
}