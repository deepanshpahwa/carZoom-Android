
package com.example.carzoom.pojos;

import java.io.Serializable;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class OnePriceArrow implements Serializable
{

    @SerializedName("arrow")
    @Expose
    private String arrow;
    @SerializedName("arrowUrl")
    @Expose
    private String arrowUrl;
    @SerializedName("icon")
    @Expose
    private String icon;
    @SerializedName("iconUrl")
    @Expose
    private String iconUrl;
    @SerializedName("order")
    @Expose
    private int order;
    @SerializedName("text")
    @Expose
    private String text;
    private final static long serialVersionUID = 431845121034747330L;

    public String getArrow() {
        return arrow;
    }

    public void setArrow(String arrow) {
        this.arrow = arrow;
    }

    public String getArrowUrl() {
        return arrowUrl;
    }

    public void setArrowUrl(String arrowUrl) {
        this.arrowUrl = arrowUrl;
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

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

}
