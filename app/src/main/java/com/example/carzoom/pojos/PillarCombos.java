
package com.example.carzoom.pojos;

import java.io.Serializable;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class PillarCombos implements Serializable
{

    @SerializedName("facets")
    @Expose
    private List<Facet__17> facets = null;
    private final static long serialVersionUID = 8425069988579817265L;

    public List<Facet__17> getFacets() {
        return facets;
    }

    public void setFacets(List<Facet__17> facets) {
        this.facets = facets;
    }

}
