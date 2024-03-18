import java.util.HashMap;
import java.util.Map;

class Book<T> {
    private T title;

    public Book(T title) {
        this.title = title;
    }

    public T getTitle() {
        return title;
    }
}

class LibraryCard<K, V> {
    private K cardNumber;
    private V bookInfo;

    public LibraryCard(K cardNumber, V bookInfo) {
        this.cardNumber = cardNumber;
        this.bookInfo = bookInfo;
    }

    public K getCardNumber() {
        return cardNumber;
    }

    public V getBookInfo() {
        return bookInfo;
    }
}

class Library {
    private Map<LibraryCard<Integer, String>, Book<String>> issuedBooks = new HashMap<>();

    public void addBook(Book<String> book, LibraryCard<Integer, String> libraryCard) {
        issuedBooks.put(libraryCard, book);
    }

    // Метод для выдачи книги с библиотечной карточкой
    public void issueBook(Book<String> book, LibraryCard<Integer, String> libraryCard) {
        addBook(book, libraryCard);
    }

    public void displayIssuedBooks() {
        for (Map.Entry<LibraryCard<Integer, String>, Book<String>> entry : issuedBooks.entrySet()) {
            LibraryCard<Integer, String> libraryCard = entry.getKey();
            Book<String> book = entry.getValue();
            System.out.println("Library Card Number: " + libraryCard.getCardNumber());
            System.out.println("Book Title: " + book.getTitle());
            System.out.println();
        }
    }
}