import java.sql.Struct;

public class A {
    protected String a = "AaA";
    protected X x = new X("xxx");

    public A(String A, X x){
        this.a = a;
        this.x= x;

    }
    public String toString(){
        return "a= " + a + ", x.value = " + x.getVal();
    }
}
