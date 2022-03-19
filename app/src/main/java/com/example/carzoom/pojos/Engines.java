
package com.example.carzoom.pojos;

import java.io.Serializable;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Engines implements Serializable
{

    @SerializedName("facets")
    @Expose
    private List<Facet__5> facets = null;
    private final static long serialVersionUID = 4893845606307422437L;

    public List<Facet__5> getFacets() {
        return facets;
    }

    public void setFacets(List<Facet__5> facets) {
        this.facets = facets;
    }

}
