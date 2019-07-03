
package com.example.resultapp;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Marks {

    @SerializedName("obtainedMarks")
    @Expose
    private Integer obtainedMarks;
    @SerializedName("remarks")
    @Expose
    private String remarks;

    public Integer getObtainedMarks() {
        return obtainedMarks;
    }

    public void setObtainedMarks(Integer obtainedMarks) {
        this.obtainedMarks = obtainedMarks;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

}
