
package com.example.carzoom.pojos;

import java.io.Serializable;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class MileageRange implements Serializable
{

    @SerializedName("facets")
    @Expose
    private List<Facet__10> facets = null;
    private final static long serialVersionUID = -997490716067752513L;

    public List<Facet__10> getFacets() {
        return facets;
    }

    public void setFacets(List<Facet__10> facets) {
        this.facets = facets;
    }

}
