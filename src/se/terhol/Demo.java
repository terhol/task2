package se.terhol;

public class Demo {
    public static void main (String[] args) {
        PublicTransport tram1 = new Tram("Bystrc-Ecerova", "Reckovice");
        Passenger passenger1 = new Passenger();

        passenger1.getOn(tram1);
        System.out.println(passenger1.toString());
        tram1.changeDirection();
        System.out.println(passenger1.toString());
        passenger1.getOff();
        System.out.println(passenger1.toString());
    }
}
