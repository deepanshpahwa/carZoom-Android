
package com.example.carzoom.pojos;

import java.io.Serializable;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Facet__8 implements Serializable
{

    @SerializedName("encodedName")
    @Expose
    private String encodedName;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("value")
    @Expose
    private int value;
    private final static long serialVersionUID = -6176627813977146365L;

    public String getEncodedName() {
        return encodedName;
    }

    public void setEncodedName(String encodedName) {
        this.encodedName = encodedName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

}
