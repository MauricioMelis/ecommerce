package cat.uvic.teknos.ecommerce.domain.models;

import java.util.Set;

public interface Product {
    int getProductId ();
    void setProductId(int productId);
    String getName ();
    void setName(String name);
    String getDescription ();
    void setDescription(String description);
    String getPriceDecimal ();
    void setPriceDecimal(String priceDecimal);
    int getStockQuantity ();
    void setStockQuantity(int stockQuantity);
    void setCategories(Set<Category> categories);
    Set<Category> getCategories();
    int getCreatedAt ();
    void setCreatedAt(int createdAt);
    int getUpdatedAt ();
    void setUpdatedAt(int updatedAt);

}
