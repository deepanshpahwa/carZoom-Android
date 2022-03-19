
package com.example.carzoom.pojos;

import java.io.Serializable;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class PercentilePrices implements Serializable
{

    @SerializedName("facets")
    @Expose
    private List<Facet__15> facets = null;
    private final static long serialVersionUID = -1181214212279155822L;

    public List<Facet__15> getFacets() {
        return facets;
    }

    public void setFacets(List<Facet__15> facets) {
        this.facets = facets;
    }

}
