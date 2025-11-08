import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    public Map<String, Integer> computeMassRepartition() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Star", 0);
        map.put("Planet", 0);
        map.put("Other", 0);

        celestialObjects.forEach(co -> {
            if (co instanceof Star) {
                map.put("Star", map.get("Star") + co.getMass());
                return;
            }

            if (co instanceof Planet) {
                map.put("Planet", map.get("Planet") + co.getMass());
                return;
            }

            map.put("Other", map.get("Other") + co.getMass());
        });

        return map;
    }
}