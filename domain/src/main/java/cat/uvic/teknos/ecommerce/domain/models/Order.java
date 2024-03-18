package cat.uvic.teknos.ecommerce.domain.models;

public interface Order {
    int getOrderId ();
    void setOrderId(int orderId);
    User getUserId ();
    void setUserId(User userId);
    int getOrderDate ();
    void setOrderDate(int orderDate);
}
