import java.util.Scanner;

public class GettingInputs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the year: ");
        int Year = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter the genre: ");
        String Genre = scanner.nextLine();

        System.out.print("Enter the album: ");
        String Album = scanner.nextLine();

        System.out.print("Enter the song title: ");
        String Title = scanner.nextLine();

        System.out.print("Enter the artist: ");
        String Artist = scanner.nextLine();

        System.out.println("------------------------------");
        System.out.println("SONG DETAILS");
        System.out.println("------------------------------");
        System.out.println("Year Released: " + Year);
        System.out.println("Genre: " + Genre);
        System.out.println("Album: " + Album);
        System.out.println("Title: \"" + Title + "\"");
        System.out.println("Artist: " + Artist);

        scanner.close();
    }
}