package pl.coderslab.homeworks.oop.first;

public class Author {
    private int id;
    private String firstName;
    private String lastName;
    private String pseudonym;

    public Author(int id, String firstName, String lastName, String pseudonym){

    }
        public void setId(int id){
            this.id = id;
        }

    public static void main(String[] args) {
        Book book1;
        String book1Name = new Book().getTitle();
        System.out.println("pierwszy String: " + book1Name);

    }



}
