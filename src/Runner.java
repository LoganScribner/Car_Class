public class Runner {
    public static void main(String[] args) {
        Car myCar = new Car(2000, "Ford", 10000, "Mustang");

        System.out.println(myCar.toString());
        myCar.drive(1234);
        System.out.println(myCar.toString());
        Rectangle myRectangle = new Rectangle(10, 10);
        System.out.println(myRectangle.toString());
    }
}
