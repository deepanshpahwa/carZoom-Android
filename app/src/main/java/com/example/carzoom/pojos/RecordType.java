
package com.example.carzoom.pojos;

import java.io.Serializable;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class RecordType implements Serializable
{

    @SerializedName("facets")
    @Expose
    private List<Facet__20> facets = null;
    private final static long serialVersionUID = 1681256970048179822L;

    public List<Facet__20> getFacets() {
        return facets;
    }

    public void setFacets(List<Facet__20> facets) {
        this.facets = facets;
    }

}
