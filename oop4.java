public class oop4 {
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
    class Book {
        private String name;
        private Author author;
        private double price;
        private int qtyInStock;
        public Book(String name, Author author, double price, int qtyInStock) {
            this.name = name;
            this.author = author;
            this.price = price;
            this.qtyInStock = qtyInStock;
        }
        public String getName() {
            return name;
        }

        public Author getAuthor() {
            return author;
        }

        public double getPrice() {
            return price;
        }

        public int getQtyInStock() {
            return qtyInStock;
        }
        public void setName(String name) {
            this.name = name;
        }

        public void setAuthor(Author author) {
            this.author = author;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public void setQtyInStock(int qtyInStock) {
            this.qtyInStock = qtyInStock;
        }

        public String toString() {
            return "Book[name=" + name + ", " + author + ", price=" + price + ", qtyInStock=" + qtyInStock + "]";
        }
    }

    public static void main(String[] args) {
        oop4 obj = new oop4();
        Author author = obj.new Author("Rohini Reddy", "rohini@example.com", 'F');
        Book book = obj.new Book("Java Programming", author, 499.99, 20);
        System.out.println(book.toString());
    }
}

