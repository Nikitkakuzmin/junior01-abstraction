import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Car[] cars = new Car[9];

        cars[0] = new Car("Lada","Priora",120,2002,1.1);
        cars[1] = new Car("Daewoo","Nexia",150,2004,1.6);
        cars[2] = new Car("Nissan","Almera",160,2005,1.8);
        cars[3] = new Toyota("Toyota", "Camry",180,1998,2.2,"Japan");
        cars[4] = new Toyota("Toyota","Prius",168,2006,2.4,"Japan");
        cars[5] = new Toyota("Toyota","Yaris",201,2004,2.1,"Japan");
        cars[6] = new Mercedes("Mercedes","Benz C",225,1997,4.2,"C-Class");
        cars[7] = new Mercedes("Mercedes","Benz E",209,1999,4.6,"E-class");
        cars[8] = new Mercedes("Mercedes","Benz SL",262,2001,6.6,"SL-Class");

        for(int i = 0; i < cars.length;i++){
            cars[i].ride();
        }
    }
}
