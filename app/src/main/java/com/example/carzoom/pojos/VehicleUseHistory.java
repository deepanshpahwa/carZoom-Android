
package com.example.carzoom.pojos;

import java.io.Serializable;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class VehicleUseHistory implements Serializable
{

    @SerializedName("history")
    @Expose
    private List<History__2> history = null;
    @SerializedName("icon")
    @Expose
    private String icon;
    @SerializedName("iconUrl")
    @Expose
    private String iconUrl;
    @SerializedName("text")
    @Expose
    private String text;
    private final static long serialVersionUID = 1979770588592743288L;

    public List<History__2> getHistory() {
        return history;
    }

    public void setHistory(List<History__2> history) {
        this.history = history;
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
