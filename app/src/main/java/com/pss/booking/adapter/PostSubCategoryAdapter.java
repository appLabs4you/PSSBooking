package com.pss.booking.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.pss.booking.R;
import com.pss.booking.model.SubCategoryModel;

import java.util.List;

/**
 * Created by mdev3 on 12/13/16.
 */

public class PostSubCategoryAdapter extends BaseAdapter {
    public Context context;
    public LayoutInflater inflater;
    List<SubCategoryModel.SubCategoriesEntity> mItemList;

    public PostSubCategoryAdapter(Context context, List<SubCategoryModel.SubCategoriesEntity> mItemList) {
        super();

        this.context = context;
        this.mItemList = mItemList;

        this.inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return mItemList.size();
    }

    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return mItemList.get(position);
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub

        DialListAdapter.ViewHolder holder;
        if (convertView == null) {
            holder = new DialListAdapter.ViewHolder();
            convertView = inflater.inflate(R.layout.category_row, null);
            holder.txtViewTitle = (TextView) convertView.findViewById(R.id.categoryLabel);
            convertView.setTag(holder);
        } else
            holder = (DialListAdapter.ViewHolder) convertView.getTag();
        holder.txtViewTitle.setText(mItemList.get(position).getSub_category());


        return convertView;
    }

    public static class ViewHolder {
        TextView txtViewTitle;


    }
}

