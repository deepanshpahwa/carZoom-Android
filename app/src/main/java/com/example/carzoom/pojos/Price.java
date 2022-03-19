
package com.example.carzoom.pojos;

import java.io.Serializable;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Price implements Serializable
{

    @SerializedName("facets")
    @Expose
    private List<Facet__19> facets = null;
    private final static long serialVersionUID = 4207763027943311777L;

    public List<Facet__19> getFacets() {
        return facets;
    }

    public void setFacets(List<Facet__19> facets) {
        this.facets = facets;
    }

}
