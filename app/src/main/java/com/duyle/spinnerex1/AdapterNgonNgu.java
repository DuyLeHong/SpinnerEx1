package com.duyle.spinnerex1;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AdapterNgonNgu extends BaseAdapter {

    private Activity activity;
    private ArrayList<NgonNguModel> list;

    public AdapterNgonNgu (Activity activity, ArrayList<NgonNguModel> list) {
        this.activity = activity;
        this.list = list;
    }


    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        LayoutInflater inflater = activity.getLayoutInflater();
        view = inflater.inflate(R.layout.item_ngonngu, viewGroup, false);

        ImageView ivAvatar = view.findViewById(R.id.ivAvatar);
        TextView txtName = view.findViewById(R.id.txtName);

        NgonNguModel ngonNguModel = list.get(i);
        ivAvatar.setImageResource(ngonNguModel.getIconId());
        txtName.setText(ngonNguModel.getName());

        return view;
    }
}
