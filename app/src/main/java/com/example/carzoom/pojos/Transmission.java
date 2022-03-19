
package com.example.carzoom.pojos;

import java.io.Serializable;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Transmission implements Serializable
{

    @SerializedName("facets")
    @Expose
    private List<Facet__22> facets = null;
    private final static long serialVersionUID = 1799315503762089371L;

    public List<Facet__22> getFacets() {
        return facets;
    }

    public void setFacets(List<Facet__22> facets) {
        this.facets = facets;
    }

}
