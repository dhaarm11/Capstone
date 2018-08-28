package Vamos.Vamos.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Location {
    @Id
    @GeneratedValue
    private int id;

    @NotNull
    private String attraction;

    @NotNull
    private String city;

    @NotNull
    private String classification;

    public Location(String attraction, String city, String classification) {
        this.attraction = attraction;
        this.city = city;
        this.classification = classification;
    }

    public Location() {
    }


    public int getId() {
        return this.id;
    }
    public String getAttraction() {
        return attraction;
    }
    public String getCity() {
        return city;
    }
    public String getClassification() {
        return classification;
    }
}