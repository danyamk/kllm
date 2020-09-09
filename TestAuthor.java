package package_Author;


public class TestAuthor {
    public static void main (String[] args){
        Author a1 = new Author("Pushkin", 1799);
        Author a2 = new Author ("King", 1900); //1947
        a2.Print();
        a2.setYaer(1947);
        System.out.println(a1.getName());
        System.out.println(a2.getYear());
        a1.Print();
        a2.Print();
    }
}
