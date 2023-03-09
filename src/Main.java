import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name : ");
        String name = scanner.next();

        System.out.print("Enter your bith year : ");
        int bithYear = scanner.nextInt();
        int newYear = 2023;
        int age = newYear - bithYear;

        System.out.print("Enter the length of the side of the square : ");
        int squareLength = scanner.nextInt();
        int perimeter = squareLength * 4;

        System.out.print("Enter the radius of the circle : ");
        int radiusСircle = scanner.nextInt();
        double areaCircle = radiusСircle * radiusСircle * 3.14;

        System.out.print("Enter the distance in km between the two cities : ");
        int distance = scanner.nextInt();
        System.out.print("Enter the time you would like to arrive : ");
        int time = scanner.nextInt();
        int speed = distance / time;

        System.out.print("Enter dollars : ");
        int dollars = scanner.nextInt();
        final double euro = dollars / 1.0675;

        System.out.print("Enter the size of the flash drive in GB : ");
        int gb = scanner.nextInt();
        double file = gb / 0.820;

        System.out.print("Enter amount : ");
        int sum = scanner.nextInt();
        System.out.print("Enter the price of chocolate : ");
        int chocolate = scanner.nextInt();
        int chocolate1 = sum / chocolate;


        System.out.println("HI, " + name + "!" +
                "\nYour age " + age +
                "\nPerimeter of the square " + perimeter +
                "\nCircle area " + areaCircle +
                "\nMoving speedmax " + speed + "km/h" +
                "\nEuro exchange rate " + euro +
                "\nSum file " + file +
                "\nSum chocolate = " + chocolate1 + "\nchange = " + (sum % chocolate));


    }
}