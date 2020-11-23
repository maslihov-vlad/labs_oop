public class Cube implements GeomBody{
    double side;

    public Cube(double side) {
        this.side = side;
    }

    @Override
    public double getVolume() {
        return Math.pow(side,3);
    }

    @Override
    public double getSurface() {
        return 6*Math.pow(side,2);
    }

    @Override
    public String toString() {
        return "Cube with volume " + getVolume() + " and with " + getSurface() + " surface";
    }
}