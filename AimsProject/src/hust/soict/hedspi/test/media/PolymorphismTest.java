package hust.soict.hedspi.test.media;

import hust.soict.hedspi.aims.media.Book;
import hust.soict.hedspi.aims.media.CompactDisc;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.media.Media;

import java.util.ArrayList;
import java.util.List;

public class PolymorphismTest {
    public static void main(String[] args) {
        List<Media> mediae = new ArrayList<Media>(); // [cite: 1152, 1157]

        CompactDisc cd = new CompactDisc("Tieng chuong va nhan dao", "Music", "Various", 15.5f);
        DigitalVideoDisc dvd = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        Book book = new Book();
        book.setTitle("The Valley of Fear");
        book.setCategory("Detective");
        book.setCost(20.00f);

        mediae.add(cd); // [cite: 1162]
        mediae.add(dvd); // [cite: 1163]
        mediae.add(book); // [cite: 1164]

        for (Media m : mediae) { // [cite: 1166]
            System.out.println(m.toString()); // [cite: 1169]
        }
    }
}