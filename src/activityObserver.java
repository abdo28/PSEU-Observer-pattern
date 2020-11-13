public class activityObserver implements IObserver {
    @Override
    public void update(BlogPost BP) {
        System.out.print("Activity Observer, To: BlogPost of title: "+BP.getTitle()+" and with ID: "+BP.getID());
    }
}
