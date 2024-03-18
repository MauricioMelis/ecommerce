package cat.uvic.teknos.ecommerce.domain.models;

import java.util.Set;

public interface Category {
    int getCategoryId ();
    void setCategoryId(int id);
    Product getName ();
    void setName(Product name);
    void setCategories(Set<Category> categories);
    Set<Category> getCategories();
}
