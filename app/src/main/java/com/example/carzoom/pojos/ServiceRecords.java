
package com.example.carzoom.pojos;

import java.io.Serializable;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class ServiceRecords implements Serializable
{

    @SerializedName("facets")
    @Expose
    private List<Facet__21> facets = null;
    private final static long serialVersionUID = 7351183203050639693L;

    public List<Facet__21> getFacets() {
        return facets;
    }

    public void setFacets(List<Facet__21> facets) {
        this.facets = facets;
    }

}
