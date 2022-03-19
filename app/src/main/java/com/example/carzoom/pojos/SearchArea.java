
package com.example.carzoom.pojos;

import java.io.Serializable;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class SearchArea implements Serializable
{

    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("dynamicRadii")
    @Expose
    private List<Integer> dynamicRadii = null;
    @SerializedName("dynamicRadius")
    @Expose
    private boolean dynamicRadius;
    @SerializedName("latitude")
    @Expose
    private double latitude;
    @SerializedName("longitude")
    @Expose
    private double longitude;
    @SerializedName("radius")
    @Expose
    private int radius;
    @SerializedName("state")
    @Expose
    private String state;
    @SerializedName("zip")
    @Expose
    private String zip;
    private final static long serialVersionUID = 8220035786681652856L;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<Integer> getDynamicRadii() {
        return dynamicRadii;
    }

    public void setDynamicRadii(List<Integer> dynamicRadii) {
        this.dynamicRadii = dynamicRadii;
    }

    public boolean isDynamicRadius() {
        return dynamicRadius;
    }

    public void setDynamicRadius(boolean dynamicRadius) {
        this.dynamicRadius = dynamicRadius;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

}
