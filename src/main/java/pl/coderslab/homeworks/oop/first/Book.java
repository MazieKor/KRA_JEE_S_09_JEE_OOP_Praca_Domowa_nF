package pl.coderslab.homeworks.oop.first;

public class Book {
    private int id;
    private String title;
    private boolean available = true;
    private Author author;
    private Author[] additionalAuthors;

//    public Book (int id, String title){
//    }
//    public Book (int id, String title, Author author){
//    }
//    public Book (int id, String title, Author author, Author[] additionalAuthors){
//    }

    public int getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setTitle(String title){
        this.title = title;
    }

//    public Author setAuthor(int id){
//        author.id = setId(id);
//    }


}
