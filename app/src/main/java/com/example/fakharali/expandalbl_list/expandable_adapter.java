package com.example.fakharali.expandalbl_list;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;



/**
 * Created by Fakhar Ali on 11/16/2018.
 */

public class expandable_adapter extends BaseExpandableListAdapter{

    String[] groupnames={"Sports","Computer","Food"};
    String[][] childnames={{"Cricket","Hockey"},{"Laptop","Desktop"},{"Burger","Pizza"}};


    Context context;

    public expandable_adapter(Context context){
        this.context=context;
    }

    @Override
    public int getGroupCount() {
        return groupnames.length;
    }

    @Override
    public int getChildrenCount(int i) {
        return childnames[i].length;
    }

    @Override
    public Object getGroup(int group) {
        return groupnames[group];
    }

    @Override
    public Object getChild(int i, int group) {
        return childnames[group][i];
    }

    @Override
    public long getGroupId(int group) {
        return group;
    }

    @Override
    public long getChildId(int i, int i1) {
        return i1;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int i, boolean b, View view, ViewGroup viewGroup) {

        TextView txtview=new TextView(context);
        txtview.setText(groupnames[i]);
        txtview.setTextColor(Color.BLUE);
        return txtview;

    }

    @Override
    public View getChildView(int i, int i1, boolean b, View view, ViewGroup viewGroup) {
        TextView txtview=new TextView(context);
        txtview.setText(childnames[i][i1]);
        txtview.setTextColor(Color.BLUE);
        return  txtview;
    }

    @Override
    public boolean isChildSelectable(int i, int i1) {
        return false;
    }
}
