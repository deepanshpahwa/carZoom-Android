
package com.example.carzoom.pojos;

import java.io.Serializable;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class CabType implements Serializable
{

    @SerializedName("facets")
    @Expose
    private List<Facet__2> facets = null;
    private final static long serialVersionUID = 5553252545197162755L;

    public List<Facet__2> getFacets() {
        return facets;
    }

    public void setFacets(List<Facet__2> facets) {
        this.facets = facets;
    }

}
