import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        LibraryClass library = new LibraryClass();

        ArrayList<Integer> myNumberst = new ArrayList<>();
        myNumberst.add(new Integer(23));
       // myNumberst.add("rsr"); //niemozliwe, bo arraylist jest sparametryzowana
        myNumberst.remove(0); //index lub referencja

        for( Integer integer : myNumberst) {
            System.out.println(integer);
        }


        BookClass book1 = new BookClass("sienkiewicz", "krzyżacy");
        BookClass book2 = new BookClass("gabriel garcia marquez", "sto lat samotności");
        BookClass book3 = new BookClass("samuel l jackson", "diaries");

        int book1idx = library.addBook(book1);
        int book2idx = library.addBook(book2);
        int book3idx = library.addBook(book3);

        System.out.println("now borrowing books");

        BookClass b1 = library.getBook(book1idx);
        System.out.println("borrowed book: " + b1.getTitle());

        BookClass b2 = library.getBook(book2idx);
        System.out.println("borrowed book: " + b2.getTitle());

        BookClass b3 = library.getBook(book3idx);
        System.out.println("borrowed book: " + b3.getTitle());

        //BookClass








    }
}
