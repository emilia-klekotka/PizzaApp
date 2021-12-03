package pl.emilia.pizza_app.data.entity.size;

import pl.emilia.pizza_app.data.entity.ordersize.OrderSizeEntity;
import pl.emilia.pizza_app.data.entity.pizza.PizzaEntity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="Sizes")
public class SizeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Integer Id;

    @Column(name = "Size_type")
    private Integer Sizetype;

    @Column(name = "Price_base")
    private Integer Pricebase;

    @Column(name = "Pizza_id")
    private Integer Pizzaid;

    @ManyToOne
    @JoinColumn(name = "Pizza_id", insertable = false, updatable = false)
    private PizzaEntity Pizza;

    @OneToMany(mappedBy = "Size")
    private  Set<OrderSizeEntity> Ordersizes;
}
