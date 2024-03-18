package cat.uvic.teknos.ecommerce.domain.models;

public interface ProductCategory {
    int getProductCategoryId ();
    void setProductCategoryId(int productCategoryId);
    Product getProductId ();
    void setProductId(Product productId);
    Category getCategoryId ();
    void setCategoryId(Category id);
}
