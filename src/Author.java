import java.util.Objects;

public class Author {
    public String name;
    public String surname;
    public String patronymic;

    public Author(String surname, String name, String patronymic){
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
    }
    public String getSurname() {
        return this.surname;
    }
    public String getName() {
        return this.name;
    }
    public String getPatronymic() {
        return this.patronymic;
    }

    @Override
    public String toString() {
        return "Автор - " + surname + " " + name + " " + patronymic;

    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;                                       // Сравниваем объект с самим собой
        if (o == null || getClass() != o.getClass()) return false;        // Сравниваем объекты с нулем и с объектом из другого класса
        Author author = (Author) o;
        return Objects.equals(name, author.name) && Objects.equals(surname, author.surname) && Objects.equals(patronymic, author.patronymic);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, surname, patronymic);
    }
}
