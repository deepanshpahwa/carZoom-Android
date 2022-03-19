
package com.example.carzoom.pojos;

import java.io.Serializable;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Trim implements Serializable
{

    @SerializedName("facets")
    @Expose
    private List<Facet__23> facets = null;
    private final static long serialVersionUID = 371227733838813762L;

    public List<Facet__23> getFacets() {
        return facets;
    }

    public void setFacets(List<Facet__23> facets) {
        this.facets = facets;
    }

}
