 
public class Subscriber implements ScoreListener {
    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void scoreChanged(ScoreEvent event) {
        System.out.println("[" + name + "] live result: " + event.getScore());
    }
}