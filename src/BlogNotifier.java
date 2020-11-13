import java.util.ArrayList;
public class BlogNotifier implements IBlogNotifier {
    private static ArrayList<IObserver> observers;
    // static block
    static {
        observers= new ArrayList<IObserver>();
    }
    @Override
    public void subscribe(IObserver o) {
        observers.add(o);
    }

    @Override
    public void unsubscribe(IObserver o) {
        observers.remove(o);
    }

    @Override
    public void notify(BlogPost p) {
        for(int i=0; i<observers.size(); i++){
            observers.get(i).update(p);
        }
    }
}
