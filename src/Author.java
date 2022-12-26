public class Author {
    public String name;
    public String surname;
    public String patronymic;

    public Author(String surname, String name, String patronymic){
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
    }


    @Override
    public String toString() {
        return "Автор - " + surname + " " + name + " " + patronymic;

    }

}
