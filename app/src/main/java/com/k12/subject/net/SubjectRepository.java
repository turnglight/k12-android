package com.k12.subject.net;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;

import com.k12.subject.model.SubjectListResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SubjectRepository {

    private static SubjectRepository subjectRepository;

    public static SubjectRepository getInstance(){
        if (subjectRepository == null){
            subjectRepository = new SubjectRepository();
        }
        return subjectRepository;
    }

    private SubjectApi subjectApi;

    public SubjectRepository(){
        subjectApi = RetrofitService.cteateService(SubjectApi.class);
    }


    public MutableLiveData<SubjectListResponse> getSubjectList(Integer level){
        MutableLiveData<SubjectListResponse> responseMutableLiveData = new MutableLiveData<>();
        subjectApi.getSubjectList(level).enqueue(new Callback<SubjectListResponse>() {
            @Override
            public void onResponse(Call<SubjectListResponse> call,
                                   Response<SubjectListResponse> response) {
                if (response.isSuccessful()){
                    responseMutableLiveData.setValue(response.body());
                }
            }

            @Override
            public void onFailure(Call<SubjectListResponse> call, Throwable t) {
                Log.i("", t.getMessage());
            }
        });
        return responseMutableLiveData;
    }

}
