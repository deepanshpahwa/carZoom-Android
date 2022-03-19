
package com.example.carzoom.pojos;

import java.io.Serializable;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class DriveType implements Serializable
{

    @SerializedName("facets")
    @Expose
    private List<Facet__4> facets = null;
    private final static long serialVersionUID = 9115388308113526948L;

    public List<Facet__4> getFacets() {
        return facets;
    }

    public void setFacets(List<Facet__4> facets) {
        this.facets = facets;
    }

}
