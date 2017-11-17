
//Know you not that your bodies are the members of Christ? shall I then take the members of Christ, and make them the members of a harlot? God forbid. (1Cor 6:15)

package si.meeting.ejb;

import si.meeting.domain.Goods;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Stateless
@LocalBean
public class GoodsManagerBean {

    @PersistenceContext(unitName = "examplePU")
    protected EntityManager entityManager;

    public Goods createGoods(String name, int price) {
        Goods goods = new Goods();
        goods.setName(name);
        goods.setPrice(price);
        entityManager.persist(goods);
        return goods;
    }

    public List<Goods> getGoods() {
        TypedQuery<Goods> query = entityManager.createQuery("select c from Goods c", Goods.class);
        return query.getResultList();
    }
}
