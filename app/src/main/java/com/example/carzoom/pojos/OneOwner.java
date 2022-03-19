
package com.example.carzoom.pojos;

import java.io.Serializable;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class OneOwner implements Serializable
{

    @SerializedName("facets")
    @Expose
    private List<Facet__13> facets = null;
    private final static long serialVersionUID = -304602853324159103L;

    public List<Facet__13> getFacets() {
        return facets;
    }

    public void setFacets(List<Facet__13> facets) {
        this.facets = facets;
    }

}
