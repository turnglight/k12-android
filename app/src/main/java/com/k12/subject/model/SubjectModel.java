package com.k12.subject.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import lombok.Data;

@Data
public class SubjectModel{
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("level")
    @Expose
    private String level;
    @SerializedName("levelName")
    @Expose
    private String levelName;
}
