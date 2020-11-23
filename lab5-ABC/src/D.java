public class D extends C
{
    protected String d = "DdD";
    protected X x = new X("xdx");

    public D(String d, X x)
    {
        super("ccc", x);
        this.d = d;
    }

    public String toString() {
        return super.toString() + ", d = " + d;
    }
}