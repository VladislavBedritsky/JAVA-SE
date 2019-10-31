package modul_4.simpleClassesAndObjs.task_9.untity;
/*
9. Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и
метод toString(). Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и
методами. Задать критерии выбора данных и вывести эти данные на консоль.
Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
Найти и вывести:
a) список книг заданного автора;
b) список книг, выпущенных заданным издательством;
c) список книг, выпущенных после заданного года
 */
public class Book {

    private int id;
    private String name;
    private String author;
    private String publishCompany;
    private int year;
    private int page;
    private int value;
    private String type;

    public Book (int id, String name, String author, String publishCompany, int year, int page, int value, String type) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publishCompany = publishCompany;
        this.year = year;
        this.page = page;
        this.value = value;
        this.type = type;
    }

    public void setId (int id) {
        this.id = id;
    }
    public void setName (String name) {
        this.name = name;
    }
    public void setAuthor (String author) {
        this.author = author;
    }
    public void setPublishCompany (String publishCompany) {
        this.publishCompany = publishCompany;
    }
    public void setYear (int year) {
        this.year = year;
    }
    public void setPage (int page) {
        this.page = page;
    }
    public void setValue (int value) {
        this.value = value;
    }
    public void setType (String type) {
        this.type = type;
    }

    public int getId () {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getAuthor() {
        return author;
    }
    public String getPublishCompany() {
        return publishCompany;
    }
    public int getYear() {
        return year;
    }
    public int getValue() {
        return value;
    }
    public int getPage() {
        return page;
    }
    public String getType() {
        return type;
    }
    @Override
    public boolean equals (Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book other = (Book) obj;
        return id == other.id &&
                author.equals(other.author) &&
                name.equals(other.name) &&
                publishCompany.equals(other.publishCompany) &&
                year == other.year &&
                page == other.page &&
                value == other.value &&
                type.equals(other.type);
    }
    @Override
    public int hashCode () {
        int result = 1;
        result = 31*result + id;
        result = 31*result + year;
        result = 31*result + page;
        result = 31*result + value;
        result = 31*result + (author == null ? 0 : author.hashCode());
        result = 31*result + (name == null ? 0 : name.hashCode());
        result = 31*result + (publishCompany == null ? 0 : publishCompany.hashCode());
        result = 31*result + (type == null ? 0 : type.hashCode());
        return result;
    }
    @Override
    public String toString() {
        return "Book{ id=" + id + ", name='" + name + '\'' + ", author='" + author + '\'' + ", publishCompany='" + publishCompany + '\'' + ", year=" + year + ", page=" + page + ", value($)=" + value + ", type='" + type + '\'' + '}';
    }
}
