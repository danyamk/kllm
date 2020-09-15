package package_Author;
import java.lang.*;

public class Author_pr2 {
    private String name;
    private String email;
    private char gender;


    public Author_pr2(String s_name, String s_email, char g_gender) {
        name = s_name;
        email = s_email;
        gender = g_gender;
    }

    public String getName() {
        return ("Имя - " + name);
    }

    public String getEmail() {
        return ("Email - " + email);
    }

    public void setEmail(String setem) {
        email = setem;
    }

    public String getGender() {
        return ("Род - " + gender);
    }

    public String toString() {
        return "Имя - " + name + "\nРод - " + gender + "\nEmail - " + email;
    }
}