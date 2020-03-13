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
//    /@OneToOne(optional = false, mappedBy="car")
    @OneToOne(targetEntity = hiber.model.User.class,mappedBy = "car")
    public User user;

    public Car() {
    }

//    public Car(String name, int series) {
//        this.name = name;
//        this.series = series;
//    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getSeries() {
//        return series;
//    }
//
//    public void setSeries(int series) {
//        this.series = series;
//    }


}
