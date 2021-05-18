package com.example.homework7viewpager;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;


public class OnJustFragment extends Fragment {

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private static final String ARG_PARAM3 = "param3";


    // TODO: Rename and change types of parameters
    private String name;
    private String description;
    private int image;

    private TextView txtTitle, txtDescripton;
    private ImageView imageView;


    public OnJustFragment() {

    }

    public static OnJustFragment newInstance(String name, String description, int image) {
        OnJustFragment fragment = new OnJustFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, name);
        args.putString(ARG_PARAM2, description);
        args.putInt(ARG_PARAM3, image);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            name = getArguments().getString(ARG_PARAM1);
            description = getArguments().getString(ARG_PARAM2);
            image = getArguments().getInt(ARG_PARAM3);

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_on_just, container, false);
        txtTitle = view.findViewById(R.id.title_text);
        txtDescripton = view.findViewById(R.id.description_text);
        imageView = view.findViewById(R.id.waletr_image);
        setData();
        return view;
    }

    private void setData() {
        txtTitle.setText(name);
        txtDescripton.setText(description);
        imageView.setImageResource(image);
    }

}