package package_Ball;
import java.lang.*;



public class Ball {
    private double r;
    private String brand;
    private String color;

    public Ball (double r, String brand, String color){
        this.r = r;
        this.brand = brand;
        this.color = color;

    }

    public static double roundAvoid(double value, int places) {
        double scale = Math.pow(10, places);
        return Math.round(value * scale) / scale;
    }

    public double GetR(){
        return r;
    }

    public String GetBrand(){
        return brand;
    }

    public String GetColor(){
        return color;
    }

    public void SetColor(String s){
        color = s;
    }

    public String GetVolume(){
        double x =  ((4*3.14*Math.pow(r, 3)/3));
        return  brand + ": " + roundAvoid(x, 2) + " volume";
    }

    public void PrintInfo(){
        System.out.println("Brand: " + brand + "\nColor: " + color +
                "\nVolume: " + r + "\n");
    }



}