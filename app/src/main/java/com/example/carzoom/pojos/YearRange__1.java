
package com.example.carzoom.pojos;

import java.io.Serializable;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class YearRange__1 implements Serializable
{

    @SerializedName("max")
    @Expose
    private int max;
    @SerializedName("min")
    @Expose
    private int min;
    private final static long serialVersionUID = 6736099630764802611L;

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

}
