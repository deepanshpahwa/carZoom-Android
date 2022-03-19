
package com.example.carzoom.pojos;

import java.io.Serializable;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Listing implements Serializable
{

    @SerializedName("accidentHistory")
    @Expose
    private AccidentHistory accidentHistory;
    @SerializedName("advantage")
    @Expose
    private boolean advantage;
    @SerializedName("atomOtherOptions")
    @Expose
    private List<String> atomOtherOptions = null;
    @SerializedName("atomTopOptions")
    @Expose
    private List<String> atomTopOptions = null;
    @SerializedName("backfill")
    @Expose
    private boolean backfill;
    @SerializedName("badge")
    @Expose
    private String badge;
    @SerializedName("bedLength")
    @Expose
    private String bedLength;
    @SerializedName("bodytype")
    @Expose
    private String bodytype;
    @SerializedName("cabType")
    @Expose
    private String cabType;
    @SerializedName("certified")
    @Expose
    private boolean certified;
    @SerializedName("currentPrice")
    @Expose
    private int currentPrice;
    @SerializedName("dealer")
    @Expose
    private Dealer dealer;
    @SerializedName("dealerType")
    @Expose
    private String dealerType;
    @SerializedName("displacement")
    @Expose
    private String displacement;
    @SerializedName("distanceToDealer")
    @Expose
    private double distanceToDealer;
    @SerializedName("drivetype")
    @Expose
    private String drivetype;
    @SerializedName("engine")
    @Expose
    private String engine;
    @SerializedName("exteriorColor")
    @Expose
    private String exteriorColor;
    @SerializedName("firstSeen")
    @Expose
    private String firstSeen;
    @SerializedName("followCount")
    @Expose
    private int followCount;
    @SerializedName("followedAt")
    @Expose
    private long followedAt;
    @SerializedName("following")
    @Expose
    private boolean following;
    @SerializedName("fuel")
    @Expose
    private String fuel;
    @SerializedName("hasViewed")
    @Expose
    private boolean hasViewed;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("imageCount")
    @Expose
    private int imageCount;
    @SerializedName("images")
    @Expose
    private Images images;
    @SerializedName("interiorColor")
    @Expose
    private String interiorColor;
    @SerializedName("isEnriched")
    @Expose
    private boolean isEnriched;
    @SerializedName("isOemPromoted")
    @Expose
    private boolean isOemPromoted;
    @SerializedName("isOemRefundFlag")
    @Expose
    private boolean isOemRefundFlag;
    @SerializedName("listPrice")
    @Expose
    private int listPrice;
    @SerializedName("make")
    @Expose
    private String make;
    @SerializedName("mileage")
    @Expose
    private int mileage;
    @SerializedName("model")
    @Expose
    private String model;
    @SerializedName("monthlyPaymentEstimate")
    @Expose
    private MonthlyPaymentEstimate monthlyPaymentEstimate;
    @SerializedName("mpgCity")
    @Expose
    private int mpgCity;
    @SerializedName("mpgHighway")
    @Expose
    private int mpgHighway;
    @SerializedName("noAccidents")
    @Expose
    private boolean noAccidents;
    @SerializedName("oneOwner")
    @Expose
    private boolean oneOwner;
    @SerializedName("onePrice")
    @Expose
    private int onePrice;
    @SerializedName("onePriceArrows")
    @Expose
    private List<OnePriceArrow> onePriceArrows = null;
    @SerializedName("onlineOnly")
    @Expose
    private boolean onlineOnly;
    @SerializedName("ownerHistory")
    @Expose
    private OwnerHistory ownerHistory;
    @SerializedName("personalUse")
    @Expose
    private boolean personalUse;
    @SerializedName("placed")
    @Expose
    private boolean placed;
    @SerializedName("recordType")
    @Expose
    private String recordType;
    @SerializedName("sentLead")
    @Expose
    private boolean sentLead;
    @SerializedName("serviceHistory")
    @Expose
    private ServiceHistory serviceHistory;
    @SerializedName("serviceRecords")
    @Expose
    private boolean serviceRecords;
    @SerializedName("sortScore")
    @Expose
    private double sortScore;
    @SerializedName("stockNumber")
    @Expose
    private String stockNumber;
    @SerializedName("subTrim")
    @Expose
    private String subTrim;
    @SerializedName("topOptions")
    @Expose
    private List<String> topOptions = null;
    @SerializedName("tpCostPerVdp")
    @Expose
    private double tpCostPerVdp;
    @SerializedName("tpEligible")
    @Expose
    private boolean tpEligible;
    @SerializedName("transmission")
    @Expose
    private String transmission;
    @SerializedName("trim")
    @Expose
    private String trim;
    @SerializedName("vdpUrl")
    @Expose
    private String vdpUrl;
    @SerializedName("vehicleCondition")
    @Expose
    private String vehicleCondition;
    @SerializedName("vehicleUseHistory")
    @Expose
    private VehicleUseHistory vehicleUseHistory;
    @SerializedName("vin")
    @Expose
    private String vin;
    @SerializedName("windowSticker")
    @Expose
    private String windowSticker;
    @SerializedName("year")
    @Expose
    private int year;
    private final static long serialVersionUID = -2612779641510334081L;

    public AccidentHistory getAccidentHistory() {
        return accidentHistory;
    }

    public void setAccidentHistory(AccidentHistory accidentHistory) {
        this.accidentHistory = accidentHistory;
    }

    public boolean isAdvantage() {
        return advantage;
    }

    public void setAdvantage(boolean advantage) {
        this.advantage = advantage;
    }

    public List<String> getAtomOtherOptions() {
        return atomOtherOptions;
    }

    public void setAtomOtherOptions(List<String> atomOtherOptions) {
        this.atomOtherOptions = atomOtherOptions;
    }

    public List<String> getAtomTopOptions() {
        return atomTopOptions;
    }

    public void setAtomTopOptions(List<String> atomTopOptions) {
        this.atomTopOptions = atomTopOptions;
    }

    public boolean isBackfill() {
        return backfill;
    }

    public void setBackfill(boolean backfill) {
        this.backfill = backfill;
    }

    public String getBadge() {
        return badge;
    }

    public void setBadge(String badge) {
        this.badge = badge;
    }

    public String getBedLength() {
        return bedLength;
    }

    public void setBedLength(String bedLength) {
        this.bedLength = bedLength;
    }

    public String getBodytype() {
        return bodytype;
    }

    public void setBodytype(String bodytype) {
        this.bodytype = bodytype;
    }

    public String getCabType() {
        return cabType;
    }

    public void setCabType(String cabType) {
        this.cabType = cabType;
    }

    public boolean isCertified() {
        return certified;
    }

    public void setCertified(boolean certified) {
        this.certified = certified;
    }

    public int getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(int currentPrice) {
        this.currentPrice = currentPrice;
    }

    public Dealer getDealer() {
        return dealer;
    }

    public void setDealer(Dealer dealer) {
        this.dealer = dealer;
    }

    public String getDealerType() {
        return dealerType;
    }

    public void setDealerType(String dealerType) {
        this.dealerType = dealerType;
    }

    public String getDisplacement() {
        return displacement;
    }

    public void setDisplacement(String displacement) {
        this.displacement = displacement;
    }

    public double getDistanceToDealer() {
        return distanceToDealer;
    }

    public void setDistanceToDealer(double distanceToDealer) {
        this.distanceToDealer = distanceToDealer;
    }

    public String getDrivetype() {
        return drivetype;
    }

    public void setDrivetype(String drivetype) {
        this.drivetype = drivetype;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getExteriorColor() {
        return exteriorColor;
    }

    public void setExteriorColor(String exteriorColor) {
        this.exteriorColor = exteriorColor;
    }

    public String getFirstSeen() {
        return firstSeen;
    }

    public void setFirstSeen(String firstSeen) {
        this.firstSeen = firstSeen;
    }

    public int getFollowCount() {
        return followCount;
    }

    public void setFollowCount(int followCount) {
        this.followCount = followCount;
    }

    public long getFollowedAt() {
        return followedAt;
    }

    public void setFollowedAt(long followedAt) {
        this.followedAt = followedAt;
    }

    public boolean isFollowing() {
        return following;
    }

    public void setFollowing(boolean following) {
        this.following = following;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public boolean isHasViewed() {
        return hasViewed;
    }

    public void setHasViewed(boolean hasViewed) {
        this.hasViewed = hasViewed;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getImageCount() {
        return imageCount;
    }

    public void setImageCount(int imageCount) {
        this.imageCount = imageCount;
    }

    public Images getImages() {
        return images;
    }

    public void setImages(Images images) {
        this.images = images;
    }

    public String getInteriorColor() {
        return interiorColor;
    }

    public void setInteriorColor(String interiorColor) {
        this.interiorColor = interiorColor;
    }

    public boolean isIsEnriched() {
        return isEnriched;
    }

    public void setIsEnriched(boolean isEnriched) {
        this.isEnriched = isEnriched;
    }

    public boolean isIsOemPromoted() {
        return isOemPromoted;
    }

    public void setIsOemPromoted(boolean isOemPromoted) {
        this.isOemPromoted = isOemPromoted;
    }

    public boolean isIsOemRefundFlag() {
        return isOemRefundFlag;
    }

    public void setIsOemRefundFlag(boolean isOemRefundFlag) {
        this.isOemRefundFlag = isOemRefundFlag;
    }

    public int getListPrice() {
        return listPrice;
    }

    public void setListPrice(int listPrice) {
        this.listPrice = listPrice;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public MonthlyPaymentEstimate getMonthlyPaymentEstimate() {
        return monthlyPaymentEstimate;
    }

    public void setMonthlyPaymentEstimate(MonthlyPaymentEstimate monthlyPaymentEstimate) {
        this.monthlyPaymentEstimate = monthlyPaymentEstimate;
    }

    public int getMpgCity() {
        return mpgCity;
    }

    public void setMpgCity(int mpgCity) {
        this.mpgCity = mpgCity;
    }

    public int getMpgHighway() {
        return mpgHighway;
    }

    public void setMpgHighway(int mpgHighway) {
        this.mpgHighway = mpgHighway;
    }

    public boolean isNoAccidents() {
        return noAccidents;
    }

    public void setNoAccidents(boolean noAccidents) {
        this.noAccidents = noAccidents;
    }

    public boolean isOneOwner() {
        return oneOwner;
    }

    public void setOneOwner(boolean oneOwner) {
        this.oneOwner = oneOwner;
    }

    public int getOnePrice() {
        return onePrice;
    }

    public void setOnePrice(int onePrice) {
        this.onePrice = onePrice;
    }

    public List<OnePriceArrow> getOnePriceArrows() {
        return onePriceArrows;
    }

    public void setOnePriceArrows(List<OnePriceArrow> onePriceArrows) {
        this.onePriceArrows = onePriceArrows;
    }

    public boolean isOnlineOnly() {
        return onlineOnly;
    }

    public void setOnlineOnly(boolean onlineOnly) {
        this.onlineOnly = onlineOnly;
    }

    public OwnerHistory getOwnerHistory() {
        return ownerHistory;
    }

    public void setOwnerHistory(OwnerHistory ownerHistory) {
        this.ownerHistory = ownerHistory;
    }

    public boolean isPersonalUse() {
        return personalUse;
    }

    public void setPersonalUse(boolean personalUse) {
        this.personalUse = personalUse;
    }

    public boolean isPlaced() {
        return placed;
    }

    public void setPlaced(boolean placed) {
        this.placed = placed;
    }

    public String getRecordType() {
        return recordType;
    }

    public void setRecordType(String recordType) {
        this.recordType = recordType;
    }

    public boolean isSentLead() {
        return sentLead;
    }

    public void setSentLead(boolean sentLead) {
        this.sentLead = sentLead;
    }

    public ServiceHistory getServiceHistory() {
        return serviceHistory;
    }

    public void setServiceHistory(ServiceHistory serviceHistory) {
        this.serviceHistory = serviceHistory;
    }

    public boolean isServiceRecords() {
        return serviceRecords;
    }

    public void setServiceRecords(boolean serviceRecords) {
        this.serviceRecords = serviceRecords;
    }

    public double getSortScore() {
        return sortScore;
    }

    public void setSortScore(double sortScore) {
        this.sortScore = sortScore;
    }

    public String getStockNumber() {
        return stockNumber;
    }

    public void setStockNumber(String stockNumber) {
        this.stockNumber = stockNumber;
    }

    public String getSubTrim() {
        return subTrim;
    }

    public void setSubTrim(String subTrim) {
        this.subTrim = subTrim;
    }

    public List<String> getTopOptions() {
        return topOptions;
    }

    public void setTopOptions(List<String> topOptions) {
        this.topOptions = topOptions;
    }

    public double getTpCostPerVdp() {
        return tpCostPerVdp;
    }

    public void setTpCostPerVdp(double tpCostPerVdp) {
        this.tpCostPerVdp = tpCostPerVdp;
    }

    public boolean isTpEligible() {
        return tpEligible;
    }

    public void setTpEligible(boolean tpEligible) {
        this.tpEligible = tpEligible;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getTrim() {
        return trim;
    }

    public void setTrim(String trim) {
        this.trim = trim;
    }

    public String getVdpUrl() {
        return vdpUrl;
    }

    public void setVdpUrl(String vdpUrl) {
        this.vdpUrl = vdpUrl;
    }

    public String getVehicleCondition() {
        return vehicleCondition;
    }

    public void setVehicleCondition(String vehicleCondition) {
        this.vehicleCondition = vehicleCondition;
    }

    public VehicleUseHistory getVehicleUseHistory() {
        return vehicleUseHistory;
    }

    public void setVehicleUseHistory(VehicleUseHistory vehicleUseHistory) {
        this.vehicleUseHistory = vehicleUseHistory;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getWindowSticker() {
        return windowSticker;
    }

    public void setWindowSticker(String windowSticker) {
        this.windowSticker = windowSticker;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

}
