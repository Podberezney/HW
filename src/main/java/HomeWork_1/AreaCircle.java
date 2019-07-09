package HomeWork_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class AreaCircle {

    double calculationAreaCircle (int radius) {
        return (3.14 * (radius * radius));
    }
}
class CalcAreaCircle{
    public static void main(String[] args) throws IOException {

        System.out.println("Enter the radius of the circle (in cm) whose area you want to calculate: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String read = reader.readLine();
        int radiusCircle = Integer.parseInt(read);

        AreaCircle obj = new AreaCircle();
        System.out.println("Area of a circle = " + obj.calculationAreaCircle(radiusCircle) + " сm2");

    }
}