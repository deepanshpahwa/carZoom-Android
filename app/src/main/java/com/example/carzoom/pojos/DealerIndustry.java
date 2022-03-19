
package com.example.carzoom.pojos;

import java.io.Serializable;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class DealerIndustry implements Serializable
{

    @SerializedName("facets")
    @Expose
    private List<Facet__3> facets = null;
    private final static long serialVersionUID = 497559262297002221L;

    public List<Facet__3> getFacets() {
        return facets;
    }

    public void setFacets(List<Facet__3> facets) {
        this.facets = facets;
    }

}
