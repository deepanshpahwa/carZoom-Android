
package com.example.carzoom.pojos;

import java.io.Serializable;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class NoAccidents implements Serializable
{

    @SerializedName("facets")
    @Expose
    private List<Facet__12> facets = null;
    private final static long serialVersionUID = -7558484056819402024L;

    public List<Facet__12> getFacets() {
        return facets;
    }

    public void setFacets(List<Facet__12> facets) {
        this.facets = facets;
    }

}
