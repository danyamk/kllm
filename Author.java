package package_Author;
import java.lang.*;

public class Author{
    private String name;
    private int year;


    public Author(String n, int y){
        name = n;
        year = y;
    }

    public void setYaer (int setyear){
        this.year = setyear;
    }
    public String getName(){
        return name;
    }
    public int getYear(){
        return year;
    }

    public void Print(){
        System.out.println(name+ " was born in "+year);
    }
}





