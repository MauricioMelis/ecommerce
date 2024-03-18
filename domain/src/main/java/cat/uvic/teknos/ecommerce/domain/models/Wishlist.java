package cat.uvic.teknos.ecommerce.domain.models;

public interface Wishlist {
    int getWishilistId();
    void setWishlistId(int wishlistId);
    User setUserId();
    void setUserId(User userId);
    Product setProductId();
    void setProductId(Product productId);
}
