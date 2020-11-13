public class activityObserver implements IObserver {
    @Override
    public void update(BlogPost BP) {
        System.out.println("Activity Observer, To: BlogPost of title: "+BP.getTitle()+" and with ID: "+BP.getID());
    }
}
