public class moderatorObserver implements IObserver {
    @Override
    public void update(BlogPost BP) {
        System.out.println("Moderator Observer, To: BlogPost of title: "+BP.getTitle()+" and with ID: "+BP.getID());
    }
}
