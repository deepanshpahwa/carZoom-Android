
package com.example.carzoom.pojos;

import java.io.Serializable;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Images implements Serializable
{

    @SerializedName("baseUrl")
    @Expose
    private String baseUrl;
    @SerializedName("firstPhoto")
    @Expose
    private FirstPhoto firstPhoto;
    @SerializedName("large")
    @Expose
    private List<String> large = null;
    @SerializedName("medium")
    @Expose
    private List<String> medium = null;
    @SerializedName("small")
    @Expose
    private List<String> small = null;
    private final static long serialVersionUID = 4273683627966363951L;

    public String getBaseUrl() {
        return baseUrl;
    }

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public FirstPhoto getFirstPhoto() {
        return firstPhoto;
    }

    public void setFirstPhoto(FirstPhoto firstPhoto) {
        this.firstPhoto = firstPhoto;
    }

    public List<String> getLarge() {
        return large;
    }

    public void setLarge(List<String> large) {
        this.large = large;
    }

    public List<String> getMedium() {
        return medium;
    }

    public void setMedium(List<String> medium) {
        this.medium = medium;
    }

    public List<String> getSmall() {
        return small;
    }

    public void setSmall(List<String> small) {
        this.small = small;
    }

}
