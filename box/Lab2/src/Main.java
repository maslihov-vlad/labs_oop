class Rectangle{
    private int length;
    private int width;
    private int depth;

    public Rectangle(){
        length = 1;
        width = 1;
        depth = 1;
    }

    public Rectangle(int size){
        length = size;
        width = size;
        depth = size;
    }

    public Rectangle(int l, int w,int d){
        length = l;
        width = w;
        depth = d;
    }
    public int getArea(){
        return 4 * (length*width) + 2 * (width * depth) ;
    }
    public int getVolume(){ return length * width * depth;}
}

public class Main{
    public static void main(String[] args){
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(5);
        Rectangle r3 = new Rectangle(4,8,2);
        System.out.println("Area1 = "+ r1.getArea());
        System.out.println(("Volume1 = " + r1.getVolume()));
        System.out.println("Area2 = "+ r2.getArea());
        System.out.println(("Volume2 = " + r2.getVolume()));
        System.out.println("Area3 = "+ r3.getArea());
        System.out.println(("Volume3 = " + r3.getVolume()));
    }
}