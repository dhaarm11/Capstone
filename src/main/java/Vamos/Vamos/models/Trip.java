package Vamos.Vamos.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Trip {
    @Id
    @GeneratedValue
    private int id;
}
