public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");



        Channel telu= new Channel();
        Channel telu2 = new Channel();

        Subscriber s1= new Subscriber("Heshan");
        Subscriber s2= new Subscriber("Heshan");
        Subscriber s3= new Subscriber("Heshan");

        telu.subscribe(s1);
        telu.subscribe(s2);
        telu.subscribe(s3);

        s1.subscribeChannel(telu);
        s2.subscribeChannel(telu);
        s3.subscribeChannel(telu);



        telu.upload("design pattern");
    }
}