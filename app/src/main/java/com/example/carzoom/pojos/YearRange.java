
package com.example.carzoom.pojos;

import java.io.Serializable;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class YearRange implements Serializable
{

    @SerializedName("facets")
    @Expose
    private List<Facet__24> facets = null;
    private final static long serialVersionUID = -1709322085585651703L;

    public List<Facet__24> getFacets() {
        return facets;
    }

    public void setFacets(List<Facet__24> facets) {
        this.facets = facets;
    }

}
