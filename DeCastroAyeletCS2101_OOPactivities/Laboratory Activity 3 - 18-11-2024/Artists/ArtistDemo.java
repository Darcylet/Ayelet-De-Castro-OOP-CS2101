public class ArtistDemo {
    public static void main(String[] args) {


        System.out.println();


        Singer singer = new Singer("Bruno Mars" ,"American", 39, "Music", Genre.POP);
        singer.displayInfo();

        System.out.println();


        Painter painter = new Painter("David Hockney", "English", 87, "Painting", Medium.ACRYLIC);
        painter.displayInfo();

        System.out.println();


        Writer writer = new Writer("Cixin Liu", "Chinese", 61, "Writer", WritingStyle.FICTION);
        writer.displayInfo();

        System.out.println();


        Dancer dancer = new Dancer("Niana Guerrero", "Filipino", 18, "Dance", DanceStyle.HIPHOP);
        dancer.displayInfo();

        System.out.println();


    }
}