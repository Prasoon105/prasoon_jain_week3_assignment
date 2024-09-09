package abstractClass;

public class Manager implements Workable {
   
    @Override
    public void performDuties() {
        System.out.println("The manager oversees team operations and makes strategic decisions.");
    }
}

