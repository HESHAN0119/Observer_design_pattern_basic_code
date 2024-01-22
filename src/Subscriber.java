public class Subscriber implements Observer{
    private String name;
    private Channel channel;

    public Subscriber(String name) {
        this.name = name;
    }

    public void update(){
        System.out.println("video Uploaded");
    }

    public void subscribeChannel(Channel ch){
        channel =ch;
    }
}
