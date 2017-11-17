
//All things are lawful unto me, but all things are not expedient: all things are lawful for me, but I will not be brought under the power of any (1Cor 6:12)

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
