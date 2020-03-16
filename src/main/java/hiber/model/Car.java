package hiber.model;

import javax.persistence.*;

@Entity
@Table(name = "cars11")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private int series;

    @OneToOne(mappedBy = "car", targetEntity = User.class)
    private User user;

    public Car() {
    }

    public Car(String name, int series) {
        this.name = name;
        this.series = series;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }


}
