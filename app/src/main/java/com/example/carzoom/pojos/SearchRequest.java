
package com.example.carzoom.pojos;

import java.io.Serializable;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class SearchRequest implements Serializable
{

    @SerializedName("make")
    @Expose
    private String make;
    @SerializedName("mileageRange")
    @Expose
    private MileageRange__1 mileageRange;
    @SerializedName("model")
    @Expose
    private String model;
    @SerializedName("priceRange")
    @Expose
    private PriceRange priceRange;
    @SerializedName("radius")
    @Expose
    private int radius;
    @SerializedName("srpUrl")
    @Expose
    private String srpUrl;
    @SerializedName("webHost")
    @Expose
    private String webHost;
    @SerializedName("yearRange")
    @Expose
    private YearRange__1 yearRange;
    @SerializedName("zip")
    @Expose
    private String zip;
    private final static long serialVersionUID = 8414812890234326129L;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public MileageRange__1 getMileageRange() {
        return mileageRange;
    }

    public void setMileageRange(MileageRange__1 mileageRange) {
        this.mileageRange = mileageRange;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public PriceRange getPriceRange() {
        return priceRange;
    }

    public void setPriceRange(PriceRange priceRange) {
        this.priceRange = priceRange;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public String getSrpUrl() {
        return srpUrl;
    }

    public void setSrpUrl(String srpUrl) {
        this.srpUrl = srpUrl;
    }

    public String getWebHost() {
        return webHost;
    }

    public void setWebHost(String webHost) {
        this.webHost = webHost;
    }

    public YearRange__1 getYearRange() {
        return yearRange;
    }

    public void setYearRange(YearRange__1 yearRange) {
        this.yearRange = yearRange;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

}
