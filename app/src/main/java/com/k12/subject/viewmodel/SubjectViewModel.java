package com.k12.subject.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.k12.subject.model.SubjectListResponse;
import com.k12.subject.model.SubjectModel;
import com.k12.subject.net.SubjectRepository;

import java.util.List;

import lombok.Data;

@Data
public class SubjectViewModel extends ViewModel {
    private MutableLiveData<SubjectListResponse> subjectList;
    private SubjectRepository subjectRepository;

    public void init(){
        if(subjectList != null){
            return;
        }
        subjectRepository = new SubjectRepository();
        subjectList = subjectRepository.getSubjectList(2);
        System.out.println(subjectList);
    }

    public LiveData<SubjectListResponse> getSubjectRepository() {
        return subjectList;
    }

}
