public class Star extends CelestialObject {
    private double magnitude;

    public double getMagnitude() {
        return magnitude;
    }

    public void setMagnitude(double magnitude) {
        this.magnitude = magnitude;
    }

    public Star() {
        super();
    }

    public Star(String name, double x, double y, double z, double magnitude) {
        super(name, x, y, z);
        this.magnitude = magnitude;
    }

    public String toString() {
        return String.format("%s shines at the %.3f magnitude", this.name, magnitude);
    }

    public String toStringFull() {
        return super.toStringFull() + this.magnitude;
    }

    public boolean equals(Star other) {
        return super.equals(other) && other.magnitude == this.magnitude;
    }

    public boolean equals(CelestialObject other) {
        return false;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Star) {
            return this.equals((Star) obj);
        }

        if (obj instanceof CelestialObject) {
            return this.equals((CelestialObject) obj);
        }
        return super.equals(obj);
    }

}