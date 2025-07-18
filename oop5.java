public class oop5 {
    class Animal {
        public void eat() {
            System.out.println("Animal eats food");
        }

        public void sleep() {
            System.out.println("Animal sleeps");
        }
    }
    class Bird extends Animal {
        @Override
        public void eat() {
            System.out.println("Bird pecks at food");
        }

        @Override
        public void sleep() {
            System.out.println("Bird sleeps in its nest");
        }

        public void fly() {
            System.out.println("Bird flies in the sky");
        }
    }
    public static void main(String[] args) {
        oop5 obj = new oop5();
        Animal animal = obj.new Animal();
        System.out.println("Animal object:");
        animal.eat();
        animal.sleep();
        System.out.println();
        Bird bird = obj.new Bird();
        System.out.println("Bird object:");
        bird.eat();
        bird.sleep();
        bird.fly();
    }
}
