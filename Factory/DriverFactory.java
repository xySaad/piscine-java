public class DriverFactory {
    public static Driver getDriver(String name) {
        switch (name) {
            case "Plane":
                return new PlaneDriver();
            case "Car":
                return new CarDriver();
            default:
                return new Driver() {
                    Transport createTransport() {
                        return new Transport() {
                            public int getDistance() {
                                return 0;
                            }
                        };
                    }
                };
        }
    }

}
