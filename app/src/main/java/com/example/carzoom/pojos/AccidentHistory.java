
package com.example.carzoom.pojos;

import java.io.Serializable;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class AccidentHistory implements Serializable
{

    @SerializedName("accidentSummary")
    @Expose
    private List<String> accidentSummary = null;
    @SerializedName("icon")
    @Expose
    private String icon;
    @SerializedName("iconUrl")
    @Expose
    private String iconUrl;
    @SerializedName("text")
    @Expose
    private String text;
    private final static long serialVersionUID = 3123391775007040799L;

    public List<String> getAccidentSummary() {
        return accidentSummary;
    }

    public void setAccidentSummary(List<String> accidentSummary) {
        this.accidentSummary = accidentSummary;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

}
