package edu.dosw.Kappa_Stock_BackEnd.Domain.Model;

public class PointOfSale {
    private String id;
    private String name;
    private String type;
    private String location;
    private Boolean active;

    public PointOfSale() {}

    public PointOfSale(String id, String name, String type, String location, Boolean active) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.location = location;
        this.active = active;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

    public Boolean getActive() { return active; }
    public void setActive(Boolean active) { this.active = active; }
}