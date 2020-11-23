import java.util.ArrayList;

public class GeomBodyController {

    public static GeomBody getTheBiggestVolume(ArrayList<GeomBody> geometricBodies){
        GeomBody biggestVolumeBody = geometricBodies.get (0);
        for (int i = 1; i < geometricBodies.size (); i++) {
            if (biggestVolumeBody.getVolume() < geometricBodies.get (i).getVolume()) {
                biggestVolumeBody = geometricBodies.get (i);
            }
        }
        return biggestVolumeBody;
    }

    public static GeomBody getTheBiggestSurface(ArrayList<GeomBody> geometricBodies) {
        GeomBody biggestSurfaceBody = geometricBodies.get (0);
        for (int i = 1; i < geometricBodies.size (); i++) {
            if (biggestSurfaceBody.getSurface() < geometricBodies.get (i).getSurface()) {
                biggestSurfaceBody = geometricBodies.get (i);
            }
        }
        return biggestSurfaceBody;
    }

}
