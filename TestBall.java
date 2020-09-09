package package_Ball;

import package_Ball.Ball;

public class TestBall {
    public static void main (String[] args) {
        Ball b1 = new Ball(4, "Adidas", "White");
        Ball b2 = new Ball (2, "Nike", "Red");
        b1.PrintInfo();
        b2.PrintInfo();
        b1.SetColor("Blue");
        b1.PrintInfo();
        System.out.println(b1.GetVolume());
        System.out.println(b2.GetVolume());
    }
}

