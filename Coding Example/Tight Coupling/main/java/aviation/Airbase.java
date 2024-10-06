package Aviation;

class AirBase extends Airport {
    private int airCraftCapacity;
    private int restrictedAirSpaceRadius;
    private int numOfStationedUnits;
    private List<String> hangers;

    public AirBase(String code, String name, String location, String country, List<String> terminals, int airCraftCapacity, int restrictedAirSpaceRadius, int numOfStationedUnits, List<String> hangers) {
        super(code, name, location, country, terminals);
        this.airCraftCapacity = airCraftCapacity;
        this.restrictedAirSpaceRadius = restrictedAirSpaceRadius;
        this.numOfStationedUnits = numOfStationedUnits;
        this.hangers = hangers;
    }

    public int getAirCraftCapacity() {
        return airCraftCapacity;
    }

    public int getRestrictedAirSpaceRadius() {
        return restrictedAirSpaceRadius;
    }

    public int getNumOfStationedUnits() {
        return numOfStationedUnits;
    }

    public String getTerminal() {
        throw new InvalidOperationException("Airbase has no terminal.")
    }

    public String servePassengers() {
        throw new InvalidOperationException("Airbase does not serve passengers.")
    }
}