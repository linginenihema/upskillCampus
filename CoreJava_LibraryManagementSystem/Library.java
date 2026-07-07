import java.util.ArrayList;

public class Library implements LibraryOperations {

    private ArrayList<Book> books = new ArrayList<>();

    @Override
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book Added Successfully.");
    }

    @Override
    public void displayBooks() {

        if (books.isEmpty()) {
            System.out.println("No Books Available.");
            return;
        }

        for (Book b : books) {
            b.displayBook();
        }
    }

    @Override
    public void issueBook(int id) {

        for (Book b : books) {
            if (b.getId() == id) {

                if (!b.isIssued()) {
                    b.issueBook();
                    System.out.println("Book Issued Successfully.");
                } else {
                    System.out.println("Book Already Issued.");
                }
                return;
            }
        }

        System.out.println("Book Not Found.");
    }

    @Override
    public void returnBook(int id) {

        for (Book b : books) {

            if (b.getId() == id) {

                if (b.isIssued()) {
                    b.returnBook();
                    System.out.println("Book Returned Successfully.");
                } else {
                    System.out.println("Book was not Issued.");
                }

                return;
            }
        }

        System.out.println("Book Not Found.");
    }
}