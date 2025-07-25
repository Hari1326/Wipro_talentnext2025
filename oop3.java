public class oop3 {
    class Author {
        private String name;
        private String email;
        private char gender;
        public Author(String name, String email, char gender) {
            this.name = name;
            this.email = email;
            this.gender = gender;
        }
        public String getName() {
            return name;
        }

        public String getEmail() {
            return email;
        }

        public char getGender() {
            return gender;
        }
        public String toString() {
            return "Author[name=" + name + ", email=" + email + ", gender=" + gender + "]";
        }
    }
    public static void main(String[] args) {
        oop3 obj = new oop3();
        oop3.Author author = obj.new Author("Rohini Reddy", "rohini@example.com", 'F');

        System.out.println(author.toString());
    }
}
