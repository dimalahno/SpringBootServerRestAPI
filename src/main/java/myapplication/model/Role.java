package myapplication.model;


import javax.persistence.*;



@Entity
@Table(name = "roles")
public class Role{


    @Id
    @Column(name = "id_role")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    @Column(name = "name_role")
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
