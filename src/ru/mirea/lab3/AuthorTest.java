package ru.mirea.lab3;

public class AuthorTest {
    public static void main(String[] args) {
        Author a1 = new Author("Jess", "jess90874@gmail.com", 'm');
        System.out.println(a1.get_name());
        System.out.println(a1.get_email());
        a1.set_email("jessy20152gmail.com");
        System.out.println(a1.get_gender());
        System.out.println(a1);
    }
}
