public class Main {

    public static void main(String[] args) {

        Book liberty = new Book( "Liberty", 1800);
        Book amphibianMan = new Book("Человек амфибия", 1961);

        Author petrov = new Author("Петров", "Афанасий", "Валерьевич");
        Author belyaev = new Author("Беляев", "Александр", "Романович");

        liberty.setYear(2000);

        System.out.println(liberty + " " + petrov);
        System.out.println(amphibianMan + " " + belyaev);
    }
}