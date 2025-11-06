public class CelestialObject {
    public double x, y, z = 0.0;
    public String name = "Soleil";
    public static final double KM_IN_ONE_AU = 150_000_000;

    public CelestialObject() {
    }

    public CelestialObject(String name, double x, double y, double z) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public double getZ() {
        return this.z;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String v) {
        this.name = v;
    }

    public void setX(double v) {
        this.x = v;
    }

    public void setY(double v) {
        this.y = v;
    }

    public void setZ(double v) {
        this.z = v;
    }

    public static double getDistanceBetween(CelestialObject a, CelestialObject b) {
        double x = a.x - b.x;
        double y = a.y - b.y;
        double z = a.z - b.z;

        return Math.sqrt(x * x + y * y + z * z);
    }

    public static double getDistanceBetweenInKm(CelestialObject a, CelestialObject b) {
        return getDistanceBetween(a, b) * KM_IN_ONE_AU;
    }
}