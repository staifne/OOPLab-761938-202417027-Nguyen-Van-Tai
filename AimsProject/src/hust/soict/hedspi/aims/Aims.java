package hust.soict.hedspi.aims;

import hust.soict.hedspi.aims.cart.Cart;
import hust.soict.hedspi.aims.media.Book;
import hust.soict.hedspi.aims.media.CompactDisc;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.store.Store;
import java.util.Scanner;

public class Aims {
    private static Store store = new Store();
    private static Cart cart = new Cart();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        initData();
        boolean exit = false;
        while (!exit) {
            showMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    viewStore();
                    break;
                case 2:
                    System.out.println("Tính năng Update Store đang được phát triển...");
                    break;
                case 3:
                    seeCart();
                    break;
                case 0:
                    exit = true;
                    System.out.println("Cảm ơn bạn đã sử dụng AIMS. Hẹn gặp lại!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        }
    }
    private static void initData() {
        store.addMedia(new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f));
        store.addMedia(new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f));
        store.addMedia(new CompactDisc("Nhac Tre", "Music", "Son Tung M-TP", 15.5f));

        Book book = new Book();
        book.setTitle("Harry Potter");
        book.setCategory("Fantasy");
        book.setCost(20.0f);
        store.addMedia(book);
    }
    public static void showMenu() {
        System.out.println("AIMS: ");
        System.out.println("--------------------------------");
        System.out.println("1. View store");
        System.out.println("2. Update store");
        System.out.println("3. See current cart");
        System.out.println("0. Exit");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3");
    }
    public static void storeMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. See a media's details");
        System.out.println("2. Add a media to cart");
        System.out.println("3. Play a media");
        System.out.println("4. See current cart");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4");
    }
    public static void mediaDetailsMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Add to cart");
        System.out.println("2. Play");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2");
    }
    public static void cartMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Filter media in cart");
        System.out.println("2. Sort media in cart");
        System.out.println("3. Remove media from cart");
        System.out.println("4. Play a media");
        System.out.println("5. Place order");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4-5");
    }
    public static void viewStore() {
        boolean back = false;
        while (!back) {
            System.out.println("\n--- TRONG KHO ĐANG CÓ ---");
            System.out.println("Danh sách đĩa/sách đã được in ra...");
            storeMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Nhập tiêu đề (Title) muốn xem:");
                    String title = scanner.nextLine();
                    System.out.println("Đang hiển thị chi tiết cho: " + title);
                    mediaDetailsMenu();
                    int detailChoice = scanner.nextInt();
                    scanner.nextLine();
                    break;
                case 2:
                    System.out.println("Tính năng Add to cart đang phát triển...");
                    break;
                case 3:
                    System.out.println("Tính năng Play đang phát triển...");
                    break;
                case 4:
                    seeCart();
                    break;
                case 0:
                    back = true;
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        }
    }
    public static void seeCart() {
        boolean back = false;
        while (!back) {
            cart.print();
            cartMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("1. Lọc theo ID | 2. Lọc theo Tiêu đề");
                    break;
                case 2:
                    System.out.println("1. Xếp theo Tiêu đề | 2. Xếp theo Giá");
                    int sortChoice = scanner.nextInt();
                    if (sortChoice == 1) cart.sortByTitle();
                    else if (sortChoice == 2) cart.sortByCost();
                    break;
                case 3:
                    System.out.println("Tính năng Xóa khỏi giỏ đang phát triển...");
                    break;
                case 4:
                    System.out.println("Tính năng Play đang phát triển...");
                    break;
                case 5:
                    System.out.println("Đơn hàng đã được tạo thành công! Giỏ hàng đã được làm trống.");
                    cart = new Cart();
                    break;
                case 0:
                    back = true;
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        }
    }
}