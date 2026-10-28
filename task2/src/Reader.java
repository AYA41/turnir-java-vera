import java.util.Date;

public class Reader {
    private String name;
    private int libraryCardNumber;
    private String faculty;
    private String dateOfBirth;
    private String phoneNumber;

    public Reader(String name, int libraryCardNumber, String faculty, String dateOfBirth, String phoneNumber) {
        this.name = name;
        this.libraryCardNumber = libraryCardNumber;
        this.faculty = faculty;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
    }

    public void takeBook(int amount) {
        System.out.println(this.name + " взял " + amount + nounForm(amount));
    }

    public void takeBook(String ...titles) {
        StringBuilder builder = new StringBuilder();
        builder.append(this.name + " взял книги: ");
        int i = 0;
        for (String title : titles) {
            builder.append(title);
            if (i < titles.length-1) {
                builder.append(", ");
            }
        }
        System.out.println(builder.toString());
    }

    public void returnBook(int amount) {
        System.out.println(this.name + " вернул " + amount + nounForm(amount));
    }

    public void returnBook(String ...titles) {
        StringBuilder builder = new StringBuilder();
        builder.append(this.name + " вернул книги: ");
        int i = 0;
        for (String title : titles) {
            builder.append(title);
            if (i < titles.length-1) {
                builder.append(", ");
            }
        }
        System.out.println(builder.toString());
    }

    private String nounForm(int amount) {
        switch (amount%100) {
            case 11, 12, 13, 14, 15, 16, 17, 18, 19: return " книг";
            default: break;
        }
        switch (amount%10) {
            case 1: return " книгу";
            case 2, 3, 4: return " книги";
            case 0, 5, 6, 7, 8, 9: return " книг";
            default: return " книги";
        }
    }
}
