public interface IBlogNotifier {
    public void subscribe(IObserver o);
    public void unsubscribe(IObserver o);
    public void notify(BlogPost p);
}
