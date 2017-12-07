package baseSample;

public class Adapter implements Target{
    //持有被适配者对象
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.oldMothed();
    }
}
