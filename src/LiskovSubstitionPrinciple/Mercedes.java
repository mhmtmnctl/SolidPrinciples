package LiskovSubstitionPrinciple;

public class Mercedes extends Araba{
    @Override
    public void go() {
        System.out.println("Mercedes gidiyor");
    }

    @Override
    public void stop() {
        System.out.println("Mercedes durdu");

    }

    @Override
    public void sendSMS() {

    }

    @Override
    public void sendEmail() {

    }

}
