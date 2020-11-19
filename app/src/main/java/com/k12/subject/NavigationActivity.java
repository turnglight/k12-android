package com.k12.subject;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import com.k12.R;
import com.k12.subject.viewmodel.SubjectViewModel;


public class NavigationActivity  extends AppCompatActivity {

    private SubjectViewModel subjectViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.subject_activity);

        subjectViewModel = new ViewModelProvider(this).get(SubjectViewModel.class);

    }
}
