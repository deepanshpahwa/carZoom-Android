
package com.example.carzoom.pojos;

import java.io.Serializable;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Options implements Serializable
{

    @SerializedName("facets")
    @Expose
    private List<Facet__14> facets = null;
    private final static long serialVersionUID = 8746367532568149617L;

    public List<Facet__14> getFacets() {
        return facets;
    }

    public void setFacets(List<Facet__14> facets) {
        this.facets = facets;
    }

}
