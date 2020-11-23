import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<GeomBody> geometricBodies = new ArrayList <> ();
        GeomBody sphere = new Sphere (5);
        GeomBody cube = new Cube (15);
        GeomBody parallelepiped = new Parallelepiped (2,4,5);
        geometricBodies.add(sphere);
        geometricBodies.add(cube);
        geometricBodies.add(parallelepiped);
        System.out.println ("Geometric body with the biggest surface is:"+GeomBodyController.getTheBiggestSurface(geometricBodies) );
        System.out.println ("Geometric body with the biggest volume  is:"+GeomBodyController.getTheBiggestVolume (geometricBodies) );

    }
}