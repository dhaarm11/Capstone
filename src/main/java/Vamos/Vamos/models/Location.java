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
    private String name;

    public Location(String name) {
        this.name = name;
    }

    public Location() {
    }


    public int getId() {
        return this.id;
    }

    public String getName() {
        return name;
    }
}