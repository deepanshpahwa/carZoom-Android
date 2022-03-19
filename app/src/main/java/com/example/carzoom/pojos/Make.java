
package com.example.carzoom.pojos;

import java.io.Serializable;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Make implements Serializable
{

    @SerializedName("facets")
    @Expose
    private List<Facet__9> facets = null;
    private final static long serialVersionUID = -6047851591894483683L;

    public List<Facet__9> getFacets() {
        return facets;
    }

    public void setFacets(List<Facet__9> facets) {
        this.facets = facets;
    }

}
