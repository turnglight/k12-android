package com.k12.subject.net;

import com.k12.subject.model.SubjectListResponse;
import com.k12.subject.model.SubjectModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface SubjectApi {
    @GET("/subject/findList")
    Call<SubjectListResponse> getSubjectList(@Query("level") Integer level);
}
