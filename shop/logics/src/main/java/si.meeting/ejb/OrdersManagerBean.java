
//


package si.meeting.ejb;

import si.meeting.domain.Order;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

@Stateless
@LocalBean
public class OrdersManagerBean {

    public Order createOrder() {return order;}
}


