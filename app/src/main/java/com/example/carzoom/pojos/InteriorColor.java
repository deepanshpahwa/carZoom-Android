
package com.example.carzoom.pojos;

import java.io.Serializable;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class InteriorColor implements Serializable
{

    @SerializedName("facets")
    @Expose
    private List<Facet__8> facets = null;
    private final static long serialVersionUID = 3071063863798344834L;

    public List<Facet__8> getFacets() {
        return facets;
    }

    public void setFacets(List<Facet__8> facets) {
        this.facets = facets;
    }

}
