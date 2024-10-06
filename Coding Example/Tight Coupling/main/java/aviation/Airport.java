package Aviation;

abstract class Airport {
    private String code;
    private String name;
    private String location;
    private String country;
    private List<String> terminals;

    public Airport(String code, String name, String location, String country, List<String> terminals) {
        this.code = code;
        this.name = name;
        this.location = location;
        this.country = country;
        this.terminals = terminals;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public String getCountry() {
        return country;
    }

    public abstract String getTerminal();
    public abstract void servePassengers();
}