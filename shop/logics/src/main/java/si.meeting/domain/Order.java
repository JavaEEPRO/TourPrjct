
//


package si.meeting.domain;


import javax.persistence.*;
import java.util.List;

@Entity
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @OneToMany
    private List<GoodsInOrder> goodsInOrders;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}

