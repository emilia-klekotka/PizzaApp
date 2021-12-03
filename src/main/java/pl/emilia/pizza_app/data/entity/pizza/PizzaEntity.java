package pl.emilia.pizza_app.data.entity.pizza;

import nonapi.io.github.classgraph.json.Id;
import pl.emilia.pizza_app.data.entity.size.SizeEntity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="pizzas")
public class PizzaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Id")
    private Integer Id;

    @Column(name="name")
    private String name;

    @OneToMany(mappedBy = "pizza")
    private Set<SizeEntity> Sizes;
}
