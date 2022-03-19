
package com.example.carzoom.pojos;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class Dealer implements Serializable
{

    @SerializedName("address")
    @Expose
    private String address;
    @SerializedName("backfill")
    @Expose
    private boolean backfill;
    @SerializedName("carfaxId")
    @Expose
    private String carfaxId;
    @SerializedName("cfxMicrositeUrl")
    @Expose
    private String cfxMicrositeUrl;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("dealerInventoryUrl")
    @Expose
    private String dealerInventoryUrl;
    @SerializedName("dealerLeadType")
    @Expose
    private String dealerLeadType;
    @SerializedName("dealerReviewComments")
    @Expose
    private String dealerReviewComments;
    @SerializedName("dealerReviewCount")
    @Expose
    private int dealerReviewCount;
    @SerializedName("dealerReviewDate")
    @Expose
    private String dealerReviewDate;
    @SerializedName("dealerReviewReviewer")
    @Expose
    private String dealerReviewReviewer;
    @SerializedName("dealerReviewTitle")
    @Expose
    private String dealerReviewTitle;
    @SerializedName("latitude")
    @Expose
    private String latitude;
    @SerializedName("longitude")
    @Expose
    private String longitude;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("onlineOnly")
    @Expose
    private boolean onlineOnly;
    @SerializedName("phone")
    @Expose
    private String phone;
    @SerializedName("state")
    @Expose
    private String state;
    @SerializedName("zip")
    @Expose
    private String zip;
    private final static long serialVersionUID = 7218399869916360543L;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isBackfill() {
        return backfill;
    }

    public void setBackfill(boolean backfill) {
        this.backfill = backfill;
    }

    public String getCarfaxId() {
        return carfaxId;
    }

    public void setCarfaxId(String carfaxId) {
        this.carfaxId = carfaxId;
    }

    public String getCfxMicrositeUrl() {
        return cfxMicrositeUrl;
    }

    public void setCfxMicrositeUrl(String cfxMicrositeUrl) {
        this.cfxMicrositeUrl = cfxMicrositeUrl;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDealerInventoryUrl() {
        return dealerInventoryUrl;
    }

    public void setDealerInventoryUrl(String dealerInventoryUrl) {
        this.dealerInventoryUrl = dealerInventoryUrl;
    }

    public String getDealerLeadType() {
        return dealerLeadType;
    }

    public void setDealerLeadType(String dealerLeadType) {
        this.dealerLeadType = dealerLeadType;
    }

    public String getDealerReviewComments() {
        return dealerReviewComments;
    }

    public void setDealerReviewComments(String dealerReviewComments) {
        this.dealerReviewComments = dealerReviewComments;
    }

    public int getDealerReviewCount() {
        return dealerReviewCount;
    }

    public void setDealerReviewCount(int dealerReviewCount) {
        this.dealerReviewCount = dealerReviewCount;
    }

    public String getDealerReviewDate() {
        return dealerReviewDate;
    }

    public void setDealerReviewDate(String dealerReviewDate) {
        this.dealerReviewDate = dealerReviewDate;
    }

    public String getDealerReviewReviewer() {
        return dealerReviewReviewer;
    }

    public void setDealerReviewReviewer(String dealerReviewReviewer) {
        this.dealerReviewReviewer = dealerReviewReviewer;
    }

    public String getDealerReviewTitle() {
        return dealerReviewTitle;
    }

    public void setDealerReviewTitle(String dealerReviewTitle) {
        this.dealerReviewTitle = dealerReviewTitle;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isOnlineOnly() {
        return onlineOnly;
    }

    public void setOnlineOnly(boolean onlineOnly) {
        this.onlineOnly = onlineOnly;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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
