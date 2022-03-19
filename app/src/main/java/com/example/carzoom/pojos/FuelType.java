
package com.example.carzoom.pojos;

import java.io.Serializable;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class FuelType implements Serializable
{

    @SerializedName("facets")
    @Expose
    private List<Facet__7> facets = null;
    private final static long serialVersionUID = -9177653326598042512L;

    public List<Facet__7> getFacets() {
        return facets;
    }

    public void setFacets(List<Facet__7> facets) {
        this.facets = facets;
    }

}
