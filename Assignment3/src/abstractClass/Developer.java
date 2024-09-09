package abstractClass;

public class Developer implements Workable {
   
    @Override
    public void performDuties() {
        System.out.println("The developer writes and maintains code for applications.");
    }
}
