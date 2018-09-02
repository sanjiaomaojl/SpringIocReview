package IOC;

public class A {

    private IB b;

    public IB getB() {
        return b;
    }

    public void setB(IB b) {
        this.b = b;
    }

    public A() {
        System.out.println("A()");
    }

    public void execute(){
        b.f1();
        System.out.println("execute()");
    }
}
