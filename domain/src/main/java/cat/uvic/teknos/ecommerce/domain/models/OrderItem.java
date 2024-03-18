package cat.uvic.teknos.ecommerce.domain.models;

public interface OrderItem {
    int getOrderItemId ();
    void setOrderItemId(int orderItemId);
    Order getOrderId ();
    void setOrderId(Order orderId);
    Product getProductId ();
    void setProductId(Product productId);
    int getQuantity ();
    void setQuantity(int quantity);
    String getPricePerUnit ();
    void setPricePerUnit(String pricePerUnit);
}
