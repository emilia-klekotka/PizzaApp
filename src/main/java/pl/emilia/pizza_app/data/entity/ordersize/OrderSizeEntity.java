package pl.emilia.pizza_app.data.entity.ordersize;

import javax.persistence.*;

@Entity
@Table(name = "Orders_sizes")
public class OrderSizeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "Id")
    private Integer Id;

    @Column(name = "Order_id")
    private Integer Orderid;

    @Column(name = "Size_id")
    private Integer Sizeid;

    @Column(name = "Size_count")
    private Integer Sizecount;


}
