
//And such were some of you: but you are washed, but you are sanctified, but you are justified in the name of the Lord Jesus, and by the Spirit of our God. (1Cor 6:11)

package si.meeting.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

/*
* Everything created by Merciful Lord Jesus
*/
@Entity
public class Goods {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private int price;

    private List<GoodsInOrder> goodsInOrders;

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }
    }
