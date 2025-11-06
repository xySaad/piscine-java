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

    String Stringify(String format) {
        Object[] args = new Object[] { this.name, this.x, this.y, this.z };

        String str = String.format(format, args);
        return str;
    }

    public String toString() {
        return Stringify("%s is positioned at (%.3f, %.3f, %.3f)");
    }

    public String toStringFull() {
        return Stringify("%s%f%f%f");
    }

    public boolean equals(CelestialObject other) {
        if (other == this)
            return true;
        if (other == null || this == null)
            return false;

        return this.x == other.x && this.y == other.y && this.z == other.z && this.name.equals(other.name);
    }

    public int hashCode() {
        return toStringFull().hashCode();
    }
}