package homework2;

public class BookTest {
    public static void main(String[] args) {
        Book[] books = {
            new Book(15000),
            new Book(50000),
            new Book(20000)
        };

        System.out.println("정렬 전");
        for (int i = 0; i < books.length; i++) {
            books[i].show();
        }

        for (int i = 0; i < books.length - 1; i++) {
            for (int j = 0; j < books.length - 1 - i; j++) {
                if (books[j].price > books[j + 1].price) {
                    Book temp = books[j];
                    books[j] = books[j + 1];
                    books[j + 1] = temp;
                }
            }
        }

        System.out.println("\n정렬 후");
        for (int i = 0; i < books.length; i++) {
            books[i].show();
        }
    }
}