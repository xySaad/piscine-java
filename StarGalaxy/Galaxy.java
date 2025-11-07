import java.util.ArrayList;
import java.util.List;

public class Galaxy {

    private List<CelestialObject> celestialObjects = new ArrayList<CelestialObject>();

    public List<CelestialObject> getCelestialObjects() {
        return celestialObjects;
    }

    public void addCelestialObject(CelestialObject co) {
        celestialObjects.add(co);
    }

    public void setCelestialObjects(List<CelestialObject> celestialObjects) {
        this.celestialObjects = celestialObjects;
    }
}