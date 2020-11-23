public class F extends E
{
    protected String f = "FfF";

    public F(String f, X x)
    {
        super("eee", x);
        this.f = f;
    }

    public String toString() {
        return super.toString() + ", f = " + f;
    }
}