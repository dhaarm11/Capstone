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
    private String classification;

    @NotNull
    private String city;

    @NotNull
    private String attraction;

    @NotNull
    private String category;

    @NotNull
    private String subcategory;

    public Location() {
    }

    public Location(String classification, String city, String attraction,
                    String category, String subcategory) {
        this.classification = classification;
        this.city = city;
        this.attraction = attraction;
        this.category = category;
        this.subcategory = subcategory;
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSubcategory() {
        return subcategory;
    }

    public void setSubcategory(String subcategory) {
        this.subcategory = subcategory;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setAttraction(String attraction) {
        this.attraction = attraction;
    }
}