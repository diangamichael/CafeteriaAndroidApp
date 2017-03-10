package com.example.asucomputerengineeringteam.finalcafeteriaandroidmobileapp2017.Adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.asucomputerengineeringteam.finalcafeteriaandroidmobileapp2017.Activities.CategoriesActivity;
import com.example.asucomputerengineeringteam.finalcafeteriaandroidmobileapp2017.Activities.MenuItemsActivity;
import com.example.asucomputerengineeringteam.finalcafeteriaandroidmobileapp2017.DataModels.CafeteriaModel;
import com.example.asucomputerengineeringteam.finalcafeteriaandroidmobileapp2017.DataModels.CategoryModel;
import com.example.asucomputerengineeringteam.finalcafeteriaandroidmobileapp2017.R;

import java.util.List;

/**
 * Created by Esraa Hosny on 3/5/2017.
 */

public class CategoriesAdapter extends BaseAdapter {
    //initialize context , arraylist
    private Context context;
    public List<CategoryModel> categoryModelList;


    //costructor takes context ,arraylist
    public CategoriesAdapter(Context context, List<CategoryModel> arrayList) {
        super();
        this.context = context;
        this.categoryModelList = arrayList;
    }

    @Override
    public int getCount() {
        return categoryModelList.size();
    }

    @Override
    public Object getItem(int position) {
        return categoryModelList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View view, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(R.layout.category_row_item, parent, false);
         ImageView image = (ImageView) view.findViewById(R.id.imagecat);
        image.setImageResource(R.drawable.pizza);
        // image.setImageResource(Integer.parseInt(cafeteriaModelArrayList.get(position).getImage()));
        TextView catname = (TextView) view.findViewById(R.id.catname);
        catname.setText(categoryModelList.get(position).getName());
        final TextView catid = (TextView) view.findViewById(R.id.catid);
        catid.setText((categoryModelList.get(position).getId())+ "");
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context,MenuItemsActivity.class);
                String id = catid.getText().toString();
                intent.putExtra("idCat",id);
                context.startActivity(intent);

                //Toast.makeText(context,"yes",Toast.LENGTH_LONG).show();
            }
        });
        return view;
    }
}

