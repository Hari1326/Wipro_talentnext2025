public class oop7 {

    static class Fruit {
        protected String name;
        protected String taste;
        protected String size;

        public Fruit(String name, String taste, String size) {
            this.name = name;
            this.taste = taste;
            this.size = size;
        }

        public void eat() {
            System.out.println("Fruit: " + name + ", Taste: " + taste);
        }
    }

    static class Apple extends Fruit {
        public Apple(String size) {
            super("Apple", "Sweet and Crisp", size);
        }

        public void eat() {
            System.out.println("Eating an Apple. Taste: " + taste + ", Size: " + size);
        }
    }

    static class Orange extends Fruit {
        public Orange(String size) {
            super("Orange", "Tangy and Juicy", size);
        }

        public void eat() {
            System.out.println("Eating an Orange. Taste: " + taste + ", Size: " + size);
        }
    }

    public static void main(String[] args) {
        Apple apple = new Apple("Medium");
        Orange orange = new Orange("Large");

        apple.eat();
        orange.eat();
    }
}
