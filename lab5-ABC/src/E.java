public class E extends D
{
    protected String e = "EeE";

    public E(String e, X x)
    {
        super("ddd", x);
        this.e = e;
    }

    public String toString() {
        return super.toString() + ", e = " + e;
    }
}