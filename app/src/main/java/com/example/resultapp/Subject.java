
package com.example.resultapp;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Subject {

    @SerializedName("alias")
    @Expose
    private String alias;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("subjectName")
    @Expose
    private String subjectName;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("fullMarks")
    @Expose
    private Integer fullMarks;
    @SerializedName("passMarks")
    @Expose
    private Integer passMarks;


    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getFullMarks() {
        return fullMarks;
    }

    public void setFullMarks(Integer fullMarks) {
        this.fullMarks = fullMarks;
    }

    public Integer getPassMarks() {
        return passMarks;
    }

    public void setPassMarks(Integer passMarks) {
        this.passMarks = passMarks;
    }
}
