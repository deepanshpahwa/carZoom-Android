
package com.example.carzoom.pojos;

import java.io.Serializable;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class BreadCrumb implements Serializable
{

    @SerializedName("label")
    @Expose
    private String label;
    @SerializedName("link")
    @Expose
    private String link;
    @SerializedName("position")
    @Expose
    private int position;
    private final static long serialVersionUID = -8584227545073386033L;

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

}
