
//Foods for the belly, and the belly for foods: but God shall destroy both it and them. Now the body is not for fornication, but for the Lord; and the Lord for the body. (1Cor 6:13)

package si.meeting.domain;

import javax.persistence.*;

@Entity
public class GoodsInOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne
    private Goods goods;

    @ManyToOne
    private Order order;

    private int quantity;

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}


