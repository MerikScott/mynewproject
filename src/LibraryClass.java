public class LibraryClass {
    private BookClass[] books = new BookClass[30];
    private int currIdx = 0;

    public int addBook(BookClass book) {
        books[currIdx] = book;
        currIdx += 1;
        System.out.println("book: " + book.getTitle() + " added! ");
        return currIdx;
    }

    public BookClass getBook(int index) {
        return books[index];
    }

    public BookClass getBookByTitle(String title) {
        BookClass foundBook = null;
        for (BookClass book : books) {
            if (book.getTitle().equals(title) == true ) {
                foundBook = book;
                break;
            }

        }
    }
}

