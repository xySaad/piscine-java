public class CelestialObject {
    public double x, y, z = 0.0;
    public String name = "Soleil";

    public CelestialObject() {
    }

    public CelestialObject(String name, double x, double y, double z) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.z = z;
    }
}