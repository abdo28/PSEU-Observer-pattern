public class ObserverPattern {
    public static void main(String[] args) {
        moderatorObserver mOb = new moderatorObserver();
        activityObserver aOb = new activityObserver();
        BlogNotifier BN = new BlogNotifier();

        BN.subscribe(mOb);
        BN.subscribe(aOb);

        BlogPost BP = new BlogPost("Ahmad", "First Blog", "Hi All, This is my first blog", "20.12.2020", 1);
        BN.notify(BP);

    }
}
