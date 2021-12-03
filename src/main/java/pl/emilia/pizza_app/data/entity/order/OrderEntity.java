package pl.emilia.pizza_app.data.entity.order;

import pl.emilia.pizza_app.data.entity.ordersize.OrderSizeEntity;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "orders")
public class OrderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name="Id")
    private Integer Id;

    @Column(name="Client_name")
    private String Clientname;

    @Column(name="Client_address")
    private String Clientaddress;

    @Column(name="Client_phone")
    private String Clientphone;

    @Column(name="Floor")
    private Integer Floor;

    @Column(name="Status")
    private String Status;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="Created_at")
    private Date Createdat;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="Updated_at")
    private Date Updatedat;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="Expected_at")
    private Date Expectedat;

    @Column(name="Token")
    private String Token;

    @OneToMany(mappedBy = "Order")
    private Set<OrderSizeEntity> orderSizes;
}
