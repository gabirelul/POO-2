package model;

import model.Owner;

public interface Vehicle {
    String getBrand();
    String getModel();
    int getYear();
    double getPrice();
    int getId();
    void setId(int id);

    /** Returns the type of vehicle ("CAR" or "MOTORCYCLE") */
    String getType();
    /** Sets the type of vehicle */
    void setType(String type);

    /** Returns the owner of the vehicle */
    Owner getOwner();
    /** Sets the owner of the vehicle */
    void setOwner(Owner owner);
}