
package com.example.carzoom.pojos;

import java.io.Serializable;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class PersonalUse implements Serializable
{

    @SerializedName("facets")
    @Expose
    private List<Facet__16> facets = null;
    private final static long serialVersionUID = -8223353197963721589L;

    public List<Facet__16> getFacets() {
        return facets;
    }

    public void setFacets(List<Facet__16> facets) {
        this.facets = facets;
    }

}
