package se.terhol;

public class Demo {
    public static void main(String[] args) {
        Driveable tram1 = new Tram("Bystrc-Ecerova", "Reckovice", 100);
        Driver driver1 = new Driver(tram1);

        driver1.straightaway();
        System.out.println(tram1.toString());
        driver1.driveCarefully();
        System.out.println(tram1.toString());
        driver1.driveCarefully();
        System.out.println(tram1.toString());
        driver1.straightaway();
        System.out.println(tram1.toString());
        driver1.stop();
        System.out.println(tram1.toString());


    }
}
