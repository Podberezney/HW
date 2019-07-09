package HomeWork_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class AreaCircle {

    double area (int radius) {
        return (3.14 * (radius * radius));
    }
}
class CalcAreaCircle{
    public static void main(String[] args) throws IOException {

        System.out.println("Введите радиус (в см) круга площадь которого нужно посчитать: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String read = reader.readLine();
        int r = Integer.parseInt(read);

        AreaCircle obj = new AreaCircle();
        System.out.println("Площадь круга = " + obj.area(r) + " см2");

    }
}