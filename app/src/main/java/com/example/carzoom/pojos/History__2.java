
package com.example.carzoom.pojos;

import java.io.Serializable;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class History__2 implements Serializable
{

    @SerializedName("averageMilesPerYear")
    @Expose
    private int averageMilesPerYear;
    @SerializedName("ownerNumber")
    @Expose
    private int ownerNumber;
    @SerializedName("useType")
    @Expose
    private String useType;
    private final static long serialVersionUID = 7182899135137658196L;

    public int getAverageMilesPerYear() {
        return averageMilesPerYear;
    }

    public void setAverageMilesPerYear(int averageMilesPerYear) {
        this.averageMilesPerYear = averageMilesPerYear;
    }

    public int getOwnerNumber() {
        return ownerNumber;
    }

    public void setOwnerNumber(int ownerNumber) {
        this.ownerNumber = ownerNumber;
    }

    public String getUseType() {
        return useType;
    }

    public void setUseType(String useType) {
        this.useType = useType;
    }

}
