public class J extends I
{
    protected String j = "JjJ";

    public J(String j, X x)
    {
        super("iii", x);
        this.j = j;
    }


    public String toString() {
        return super.toString() + ", j = " + j;
    }
}
