
package com.example.carzoom.pojos;

import java.io.Serializable;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class PriceRange implements Serializable
{

    @SerializedName("min")
    @Expose
    private int min;
    private final static long serialVersionUID = 4126187038899397612L;

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

}
