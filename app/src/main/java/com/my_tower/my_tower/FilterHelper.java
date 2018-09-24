package com.my_tower.my_tower;

import android.widget.Filter;

import com.my_tower.my_tower.Adapter.nameAdapter;

import java.util.ArrayList;

public class FilterHelper extends Filter {
    static ArrayList<String> currentList;
    static nameAdapter adapter;

    public static FilterHelper newInstance(ArrayList<String> currentList, nameAdapter adapter) {
        FilterHelper.adapter=adapter;
        FilterHelper.currentList=currentList;
        return new FilterHelper();
    }

    /*
    - Perform actual filtering.
     */
    @Override
    protected FilterResults performFiltering(CharSequence constraint) {
        FilterResults filterResults=new FilterResults();

        if(constraint != null && constraint.length()>0)
        {
            //CHANGE TO UPPER
            constraint=constraint.toString().toUpperCase();

            //HOLD FILTERS WE FIND
            ArrayList<String> foundFilters=new ArrayList<>();

            String galaxy;

            //ITERATE CURRENT LIST
            for (int i=0;i<currentList.size();i++)
            {
                galaxy= currentList.get(i);

                //SEARCH
                if(galaxy.toUpperCase().contains(constraint))
                {
                    //ADD IF FOUND
                    foundFilters.add(galaxy);
                }
            }

            //SET RESULTS TO FILTER LIST
            filterResults.count=foundFilters.size();
            filterResults.values=foundFilters;
        }else
        {
            //NO ITEM FOUND.LIST REMAINS INTACT
            filterResults.count=currentList.size();
            filterResults.values=currentList;
        }

        //RETURN RESULTS
        return filterResults;
    }

    @Override
    protected void publishResults(CharSequence charSequence, FilterResults filterResults) {

        adapter.setGalaxies((ArrayList<String>) filterResults.values);
        adapter.notifyDataSetChanged();
    }
}

