package id.co.digitalindo.myapplication;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

public class BlankFragment2 extends Fragment {

    int[] data = {R.drawable.gambar4, R.drawable.image1, R.drawable.image2};
    String judul[] = {"Avanza", "Xenia", "Nando "};
    String keterangan[] = {"ini kamu bahagia", "pokoknya bahagia deh", "Masuk surga"};
    @BindView(R.id.recycler)
    RecyclerView recycler;
    Unbinder unbinder;

    public BlankFragment2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_blank_fragment1, container, false);
        unbinder = ButterKnife.bind(this, view);

        recycler = view.findViewById(R.id.recycler);

        recycler.setAdapter(new MyAdapter(data, judul, keterangan));
        recycler.setLayoutManager(new LinearLayoutManager(getActivity()));
        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}
