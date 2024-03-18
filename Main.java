public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book<String> book1 = new Book<>("Introduction to Java");
        LibraryCard<Integer, String> card1 = new LibraryCard<>(1, "Information about book 1");

        Book<String> book2 = new Book<>("Data Structures and Algorithms");
        LibraryCard<Integer, String> card2 = new LibraryCard<>(2, "Information about book 2");

        library.addBook(book1, card1);
        library.issueBook(book2, card2);

        library.displayIssuedBooks();
    }
}