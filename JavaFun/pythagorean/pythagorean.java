import java.lang.*;
public class pythagorean {
    public double calculateHypotenuse(int legA, int legB) {
        double legC=(legA)^2+(legB)^2;
        double square=Math.sqrt(legC);
        return square;
    }

}