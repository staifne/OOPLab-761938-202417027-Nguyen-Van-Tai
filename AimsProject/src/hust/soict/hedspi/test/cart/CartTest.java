package hust.soict.hedspi.test.cart;

import hust.soict.hedspi.aims.cart.Cart;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;

public class CartTest {
    public static void main(String[] args) {
        Cart cart = new Cart();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
                "Animation", "Roger Allers", 87, 19.95f);
        cart.addMedia(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars",
                "Science Fiction", "George Lucas", 87, 24.95f);
        cart.addMedia(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin",
                "Animation", 18.99f);
        cart.addMedia(dvd3);

        // Test the print method
        cart.print();

        // Test the search methods
        System.out.println("\n--- Search by ID ---");
        cart.searchById(1); // Tìm thấy đĩa số 1
        cart.searchById(99); // Không tìm thấy

        System.out.println("\n--- Search by Title ---");
        cart.searchByTitle("star"); // Có chữ star -> tìm thấy Star Wars
        cart.searchByTitle("Cinderella"); // Không tìm thấy
    }
}