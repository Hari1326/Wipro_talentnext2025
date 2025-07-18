import java.util.Optional;
public class oop21 {
    public static void main(String[] args) {
        String names[] = new String[5];
        Optional<String> optionalName = Optional.ofNullable(names[0]);
        int length = optionalName.map(String::length).orElse(0);

        System.out.println("Length of names[0]: " + length);
    }
}

