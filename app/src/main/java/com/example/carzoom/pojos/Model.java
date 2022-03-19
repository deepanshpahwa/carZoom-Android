
package com.example.carzoom.pojos;

import java.io.Serializable;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Model implements Serializable
{

    @SerializedName("facets")
    @Expose
    private List<Facet__11> facets = null;
    private final static long serialVersionUID = -6257549512935154776L;

    public List<Facet__11> getFacets() {
        return facets;
    }

    public void setFacets(List<Facet__11> facets) {
        this.facets = facets;
    }

}
