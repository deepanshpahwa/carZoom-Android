
package com.example.carzoom.pojos;

import java.io.Serializable;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class BodyStyle implements Serializable
{

    @SerializedName("facets")
    @Expose
    private List<Facet__1> facets = null;
    private final static long serialVersionUID = 5494643623888630070L;

    public List<Facet__1> getFacets() {
        return facets;
    }

    public void setFacets(List<Facet__1> facets) {
        this.facets = facets;
    }

}
