package com.damaisl.carikuliner10119012.view.profile;
/*
    nim                 : 10119012
    nama                : Damai Saputra Laoli
    kelas               : IF-3
*/
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.damaisl.carikuliner10119012.R;

public class ProfileFragment extends Fragment {
    public ProfileFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_profile, container, false);
    }
}