class Monitor{
    public double diag;
    public int resWidth;
    public int resLength;
    public int dimWidth;
    public int dimLen;
    public String color;


    public Monitor(double d, int rW,int rL, int dL, int dW, String c){
        diag = d;
        resWidth = rW;
        resLength = rL;
        dimLen = dL;
        dimWidth = dW;
        color = c;
    }
}



public class Main {
    public static void main(String[] args){
        Monitor mon1 = new Monitor(13.5,1080,1920,45,30,"blue");
        Monitor mon2 = new Monitor(30,4320,7860,150,80,"black");
        if (mon1.resLength == mon2.resLength){ System.out.println("First monitor has a bigger resolution in length"); } else {System.out.println("One of them has bigger resolution length");}
        if (mon1.color == mon2.color){System.out.println("Both monitors have the same color"); } else {System.out.println("They have different colors");}
    }
}
