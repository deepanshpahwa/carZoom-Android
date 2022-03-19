
package com.example.carzoom.pojos;

import java.io.Serializable;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class History implements Serializable
{

    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("endOwnershipDate")
    @Expose
    private String endOwnershipDate;
    @SerializedName("ownerNumber")
    @Expose
    private int ownerNumber;
    @SerializedName("purchaseDate")
    @Expose
    private String purchaseDate;
    @SerializedName("state")
    @Expose
    private String state;
    private final static long serialVersionUID = 9160459324612550793L;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEndOwnershipDate() {
        return endOwnershipDate;
    }

    public void setEndOwnershipDate(String endOwnershipDate) {
        this.endOwnershipDate = endOwnershipDate;
    }

    public int getOwnerNumber() {
        return ownerNumber;
    }

    public void setOwnerNumber(int ownerNumber) {
        this.ownerNumber = ownerNumber;
    }

    public String getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(String purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

}
