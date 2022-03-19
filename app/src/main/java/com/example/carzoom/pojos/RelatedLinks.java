
package com.example.carzoom.pojos;

import java.io.Serializable;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class RelatedLinks implements Serializable
{

    @SerializedName("Fiat 124 Spider Trim Levels")
    @Expose
    private List<Fiat124SpiderTrimLevel> fiat124SpiderTrimLevels = null;
    @SerializedName("Similar Cars")
    @Expose
    private List<SimilarCar> similarCars = null;
    @SerializedName("Used Fiat 124 Spider by Year")
    @Expose
    private List<UsedFiat124SpiderByYear> usedFiat124SpiderByYear = null;
    private final static long serialVersionUID = -3121225327467610242L;

    public List<Fiat124SpiderTrimLevel> getFiat124SpiderTrimLevels() {
        return fiat124SpiderTrimLevels;
    }

    public void setFiat124SpiderTrimLevels(List<Fiat124SpiderTrimLevel> fiat124SpiderTrimLevels) {
        this.fiat124SpiderTrimLevels = fiat124SpiderTrimLevels;
    }

    public List<SimilarCar> getSimilarCars() {
        return similarCars;
    }

    public void setSimilarCars(List<SimilarCar> similarCars) {
        this.similarCars = similarCars;
    }

    public List<UsedFiat124SpiderByYear> getUsedFiat124SpiderByYear() {
        return usedFiat124SpiderByYear;
    }

    public void setUsedFiat124SpiderByYear(List<UsedFiat124SpiderByYear> usedFiat124SpiderByYear) {
        this.usedFiat124SpiderByYear = usedFiat124SpiderByYear;
    }

}
