
//And God has both raised up the Lord, and will also raise up us by his own power. (1Cor 6:14)

package si.meeting.ejb;

import si.meeting.domain.Goods;
import si.meeting.domain.GoodsInOrder;
import si.meeting.domain.Order;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
@LocalBean
public class OrdersManagerBean {

    @PersistenceContext(unitName="examplePU")
    private EntityManager entityManager;

    public Order createOrder() {
        Order order = new Order();
        entityManager.persist(order);
        return order;
    }

    public Goods createGoods(String name, int price) {
        Goods goods = new Goods();
        goods.setName(name);
        goods.setPrice(price);
        entityManager.persist(goods);
        return goods;
    }

    public boolean addToOrder(long goodsId, long orderId, int quantity) {
        Goods goods = entityManager.find(Goods.class, goodsId);
        if (goods == null) {
            return false;
        }
        Order order = entityManager.find(Order.class, orderId);
        if (order == null) {
            return false;
        }

        GoodsInOrder goodsInOrder = new GoodsInOrder();
        goodsInOrder.setOrder(order);
        goodsInOrder.setGoods(goods);
        goodsInOrder.setQuantity(quantity);
        entityManager.persist(goodsInOrder);
        return true;
    }
}
