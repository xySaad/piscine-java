public class Planet extends CelestialObject {
    private Star centerStar;

    public Star getCenterStar() {
        return centerStar;
    }

    public void setCenterStar(Star centerStar) {
        this.centerStar = centerStar;
    }

    public Planet(String name, double x, double y, double z, Star centerStar) {
        super(name, x, y, z);
        this.centerStar = centerStar;
    }

    public Planet() {
        super();
        this.centerStar = new Star();
    }

    public boolean equals(CelestialObject other) {
        return false;
    }

    public boolean equals(Planet planet) {
        return super.equals(planet) && this.centerStar.equals(planet.centerStar);
    }

    public String toString() {
        double dist = CelestialObject.getDistanceBetween(this, this.centerStar);
        String format = "%s circles around %s at the %.3f AU";
        return String.format(format, this.name, this.centerStar.name, dist);
    }

    public String toStringFull() {
        return super.toStringFull() + this.centerStar.toStringFull();
    }
}