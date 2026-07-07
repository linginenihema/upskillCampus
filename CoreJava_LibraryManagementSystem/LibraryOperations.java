public interface LibraryOperations {

    void addBook(Book book);

    void displayBooks();

    void issueBook(int id);

    void returnBook(int id);

}