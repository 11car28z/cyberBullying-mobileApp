package com.example.HOP_U;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class Quiz_Commentary_Fragment2 extends Fragment {

    private View view;
    private Button btn_next_frag;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_quiz_commentary_2, container, false);

        btn_next_frag = view.findViewById(R.id.btn_next_frag);
        btn_next_frag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                Quiz_Fragment3 quizFragment3 = new Quiz_Fragment3();
                transaction.replace(R.id.quiz_frameLayout, quizFragment3);
                transaction.commit();
            }
        });

        return view;
    }
}