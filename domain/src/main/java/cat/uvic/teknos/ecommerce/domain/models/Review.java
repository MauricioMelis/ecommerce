package cat.uvic.teknos.ecommerce.domain.models;

public interface Review {
    int getReviewId ();
    void setReviewId(int reviewId);
    User getUserId ();
    void setUserId(User userId);
    Product getProductId ();
    void setProductId(Product productId);
    int getRating ();
    void setRating(int rating);
    String getComment ();
    void setComment(String comment);
    int getReviewDate ();
    void setReviewDate (int reviewDate);
}
