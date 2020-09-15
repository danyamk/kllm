package package_Author;


public class TestAuthor_pr2 {
    public static void main (String[] args){
     Author_pr2 a1 = new Author_pr2("Daniil", "mail.ru", 'M');
     System.out.println(a1.getName());
     System.out.println(a1.getEmail());
     System.out.println(a1.getGender());
     a1.setEmail("gmail.ru");
     System.out.println(a1.getEmail());
     System.out.println(a1.toString());
    }
}
