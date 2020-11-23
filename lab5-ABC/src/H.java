public class H extends G
{
    protected String h = "HhH";
    private X x = new X("xhx");

    public H(String h, X x)
    {
        super("ggg", x);
        this.h = h;
    }

    public String toString() {
        return super.toString() + ", h = " + h;
    }
}