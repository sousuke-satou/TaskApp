package com.example.vic72.taskapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by vic72 on 2017/10/01.
 */

public class TaskAdapter extends BaseAdapter  {
    private LayoutInflater mLayout;
private List<String> mTaskList;

    public TaskAdapter(Context context) {
        mLayout = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    public void setmTaskList(List<String> taskList) {
        mTaskList = taskList;
    }

    @Override
    public int getCount() {
        return mTaskList.size();
    }

    @Override
    public Object getItem(int position) {
        return mTaskList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null) {
            convertView = mLayout.inflate(android.R.layout.simple_list_item_2, null);
        }

        TextView text1 = (TextView) convertView.findViewById(R.id.text);
        TextView text2 = (TextView) convertView.findViewById(R.id.text2);


//        text1.setText(mTaskList.get(position));

        return convertView;
    }

}
