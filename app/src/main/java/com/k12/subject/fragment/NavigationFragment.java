package com.k12.subject.fragment;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.k12.R;
import com.k12.constant.BaseConfig;
import com.k12.subject.model.SubjectModel;
import com.k12.subject.viewmodel.SubjectViewModel;
import com.k12.subject.net.SubjectApi;

import java.io.IOException;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class NavigationFragment extends Fragment {

    private SubjectViewModel subjectViewModel;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.subject_navigation_fragment, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        subjectViewModel = new ViewModelProvider(this).get(SubjectViewModel.class);
        subjectViewModel.init();
        subjectViewModel.getSubjectRepository().observe(this, subjectListResponse -> {
            Log.i("", subjectListResponse.toString());
        });
    }
}
