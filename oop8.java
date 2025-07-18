public class oop8 {

    static class Shape {
        public void draw() {
            System.out.println("Drawing Shape");
        }

        public void erase() {
            System.out.println("Erasing Shape");
        }
    }

    static class Circle extends Shape {

        public void draw() {
            System.out.println("Drawing Circle");
        }

        public void erase() {
            System.out.println("Erasing Circle");
        }
    }

    static class Triangle extends Shape {

        public void draw() {
            System.out.println("Drawing Triangle");
        }

        public void erase() {
            System.out.println("Erasing Triangle");
        }
    }

    static class Square extends Shape {

        public void draw() {
            System.out.println("Drawing Square");
        }

        public void erase() {
            System.out.println("Erasing Square");
        }
    }

    public static void main(String[] args) {
        Shape c = new Circle();
        Shape t = new Triangle();
        Shape s = new Square();

        System.out.println("Circle Object:");
        c.draw();
        c.erase();

        System.out.println("\nTriangle Object:");
        t.draw();
        t.erase();

        System.out.println("\nSquare Object:");
        s.draw();
        s.erase();
    }
}

