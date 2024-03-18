package cat.uvic.teknos.ecommerce.domain.models;

public interface User {
    int getUserId ();
    void setUserId(int id);
    String getUsername ();
    void setUsername(String username);
    String getEmail ();
    void setEmail(String email);
    String getPassword ();
    void setPassword(String password);
    String getAdress ();
    void setAdress(String adress);
    String getPhoneNumber ();
    void setPhoneNumber(String phoneNumber);
    int getRegistrationDate ();
    void setRegistrationDate(int registrationDate);

}
