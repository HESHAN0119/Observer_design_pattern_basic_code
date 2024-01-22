public interface Subject_interface {
    void subscribe(Subscriber sub);
    void unSubscribe(Subscriber sub);

    void notifySubscribers();
}
