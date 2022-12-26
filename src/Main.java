public class Main {

    public static void main(String[] args) {

        Book liberty = new Book( "Liberty", 1800);
        Book amphibianMan = new Book("Человек амфибия", 1961);

        Author petrov = new Author("Петров", "Афанасий", "Валерьевич");
        Author belyaev = new Author("Беляев", "Александр", "Романович");


        System.out.println(liberty + " " + petrov);
        System.out.println(amphibianMan + " " + belyaev);

        System.out.println(liberty.equals(amphibianMan));
        System.out.println("Петров равен Беляеву: " + petrov.equals(belyaev));

        liberty = amphibianMan;
        System.out.println("Переопределенное значение книги Либерти равна Человеку-амфибии: " + liberty.equals(amphibianMan));
    }
}