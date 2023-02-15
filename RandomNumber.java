import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        var r = new Random();
        System.out.println("Eine Zufallszahl: " + r.nextInt(100));
    }
}

