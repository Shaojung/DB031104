package com.example.teacher.db031104;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.app.Fragment;
import android.app.FragmentManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.lang.reflect.Array;


/**
 * A simple {@link Fragment} subclass.
 */
public class ListFragment extends Fragment {
    String str[] = {"AAA", "BBBB", "CC", "DDDD"};

    public ListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_list, container, false);


        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        View v = getView();
        ListView lv = (ListView) v.findViewById(R.id.listView);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, str);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                View v = getActivity().findViewById(R.id.layout3);

                if (v == null)
                {
                    Log.d("FRA", "沒有 f_a");
                    Intent it = new Intent(getActivity(), ArticleActivity.class);
                    it.putExtra("data", str[position]);
                    startActivity(it);
                }
                else
                {
                    Log.d("FRA", "有 f_a");
                    TextView tv2 = (TextView) getActivity().findViewById(R.id.textView2);
                    tv2.setText(str[position]);
                }

            }
        });
    }
}
