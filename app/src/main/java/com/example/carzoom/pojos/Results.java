
package com.example.carzoom.pojos;

import java.io.Serializable;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Results implements Serializable
{

    @SerializedName("backfillCount")
    @Expose
    private int backfillCount;
    @SerializedName("breadCrumbs")
    @Expose
    private List<BreadCrumb> breadCrumbs = null;
    @SerializedName("dealerNewCount")
    @Expose
    private int dealerNewCount;
    @SerializedName("dealerUsedCount")
    @Expose
    private int dealerUsedCount;
    @SerializedName("enhancedCount")
    @Expose
    private int enhancedCount;
    @SerializedName("facetCountMap")
    @Expose
    private FacetCountMap facetCountMap;
    @SerializedName("listings")
    @Expose
    private List<Listing> listings = null;
    @SerializedName("page")
    @Expose
    private int page;
    @SerializedName("pageSize")
    @Expose
    private int pageSize;
    @SerializedName("relatedLinks")
    @Expose
    private RelatedLinks relatedLinks;
    @SerializedName("searchArea")
    @Expose
    private SearchArea searchArea;
    @SerializedName("searchRequest")
    @Expose
    private SearchRequest searchRequest;
    @SerializedName("seoUrl")
    @Expose
    private String seoUrl;
    @SerializedName("totalListingCount")
    @Expose
    private int totalListingCount;
    @SerializedName("totalPageCount")
    @Expose
    private int totalPageCount;
    private final static long serialVersionUID = -6019379231176328309L;

    public int getBackfillCount() {
        return backfillCount;
    }

    public void setBackfillCount(int backfillCount) {
        this.backfillCount = backfillCount;
    }

    public List<BreadCrumb> getBreadCrumbs() {
        return breadCrumbs;
    }

    public void setBreadCrumbs(List<BreadCrumb> breadCrumbs) {
        this.breadCrumbs = breadCrumbs;
    }

    public int getDealerNewCount() {
        return dealerNewCount;
    }

    public void setDealerNewCount(int dealerNewCount) {
        this.dealerNewCount = dealerNewCount;
    }

    public int getDealerUsedCount() {
        return dealerUsedCount;
    }

    public void setDealerUsedCount(int dealerUsedCount) {
        this.dealerUsedCount = dealerUsedCount;
    }

    public int getEnhancedCount() {
        return enhancedCount;
    }

    public void setEnhancedCount(int enhancedCount) {
        this.enhancedCount = enhancedCount;
    }

    public FacetCountMap getFacetCountMap() {
        return facetCountMap;
    }

    public void setFacetCountMap(FacetCountMap facetCountMap) {
        this.facetCountMap = facetCountMap;
    }

    public List<Listing> getListings() {
        return listings;
    }

    public void setListings(List<Listing> listings) {
        this.listings = listings;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public RelatedLinks getRelatedLinks() {
        return relatedLinks;
    }

    public void setRelatedLinks(RelatedLinks relatedLinks) {
        this.relatedLinks = relatedLinks;
    }

    public SearchArea getSearchArea() {
        return searchArea;
    }

    public void setSearchArea(SearchArea searchArea) {
        this.searchArea = searchArea;
    }

    public SearchRequest getSearchRequest() {
        return searchRequest;
    }

    public void setSearchRequest(SearchRequest searchRequest) {
        this.searchRequest = searchRequest;
    }

    public String getSeoUrl() {
        return seoUrl;
    }

    public void setSeoUrl(String seoUrl) {
        this.seoUrl = seoUrl;
    }

    public int getTotalListingCount() {
        return totalListingCount;
    }

    public void setTotalListingCount(int totalListingCount) {
        this.totalListingCount = totalListingCount;
    }

    public int getTotalPageCount() {
        return totalPageCount;
    }

    public void setTotalPageCount(int totalPageCount) {
        this.totalPageCount = totalPageCount;
    }

}
