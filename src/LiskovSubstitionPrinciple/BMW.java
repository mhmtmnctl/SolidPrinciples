package LiskovSubstitionPrinciple;

public class BMW extends Araba{
    @Override
    public void go() {
        System.out.println("BMW gidiyor");
    }

    @Override
    public void stop() {
        System.out.println("BMW durdu");

    }

    @Override
    public void sendSMS() {

    }
//    @Override
//    public void sendEmail() {
//        System.out.println("desteklenmemektedir");
//    }

}
