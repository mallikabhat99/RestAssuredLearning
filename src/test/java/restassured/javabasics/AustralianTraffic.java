package restassured.javabasics;

public class AustralianTraffic implements CentralTraffic, Continentaltraffic {
    public static void main(String[] args) {
        CentralTraffic at = new AustralianTraffic();
        at.greenGo();
        at.redStop();
        at.flashYellow();
        AustralianTraffic a = new AustralianTraffic();
        a.walking();
        Continentaltraffic c = new AustralianTraffic();
        c.train();
    }

    @Override
    public void greenGo() {
        System.out.println("green go");
    }

    @Override
    public void redStop() {
        System.out.println("red stop");

    }

    @Override
    public void flashYellow() {
        System.out.println("flash yellow");

    }

    public void walking() {
        System.out.println("walking");

    }

    @Override
    public void train() {
        System.out.println("train");
    }
}
