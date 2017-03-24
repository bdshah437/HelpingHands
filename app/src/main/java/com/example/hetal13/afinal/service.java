package com.example.hetal13.afinal;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class service extends Navigation {
Toolbar toolbar_service;
    private RecyclerView recyclerView;
    private Service_CatAdapter adapter;
    private List<Service_ListPojo> catlist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LayoutInflater inflater = (LayoutInflater) this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        //inflate your activity layout here!
        View contentView = inflater.inflate(R.layout.activity_service, null, false);

        drawerLayout.addView(contentView, 0);
        getSupportActionBar().setTitle("Service");
       // getSupportActionBar().setHomeAsUpIndicator(R.drawable.leftarrow);
        recyclerView= (RecyclerView) findViewById(R.id.recycler_view);
        catlist = new ArrayList<>();
        adapter = new Service_CatAdapter(this, catlist);
        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.addItemDecoration(new GridSpacingItemDecoration(2, dpToPx(10), true));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);
        prepareAlbums();


    }
    private void prepareAlbums() {
//        int[] covers = new int[]{
//                R.drawable.pg11,
//                R.drawable.tiffin11,
//                R.drawable.maid11,
//                R.drawable.contractor11,
//                R.drawable.mechanic,
//                R.drawable.s1,
//                R.drawable.driver};
//
//        Service_ListPojo a = new Service_ListPojo(covers[0],"P.G.",1);
//        catlist.add(a);
//
//        a = new Service_ListPojo(covers[1],"Tiffin",2);
//        catlist.add(a);
//
//        a = new Service_ListPojo(covers[2],"Maid",3);
//        catlist.add(a);
//
//        a = new Service_ListPojo(covers[3],"Contractor",4);
//        catlist.add(a);
//
//        a = new Service_ListPojo(covers[4],"Mechanic",5);
//        catlist.add(a);
//
//        a = new Service_ListPojo(covers[5],"Security",6);
//        catlist.add(a);
//
//        a = new Service_ListPojo(covers[6],"Driver",7);
//        catlist.add(a);
//
//        adapter.notifyDataSetChanged();
//    }
    }
    /**
     * RecyclerView item decoration - give equal margin around grid item
     */
    public class GridSpacingItemDecoration extends RecyclerView.ItemDecoration {

        private int spanCount;
        private int spacing;
        private boolean includeEdge;

        public GridSpacingItemDecoration(int spanCount, int spacing, boolean includeEdge) {
            this.spanCount = spanCount;
            this.spacing = spacing;
            this.includeEdge = includeEdge;
        }

        @Override
        public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
            int position = parent.getChildAdapterPosition(view); // item position
            int column = position % spanCount; // item column

            if (includeEdge) {
                outRect.left = spacing - column * spacing / spanCount; // spacing - column * ((1f / spanCount) * spacing)
                outRect.right = (column + 1) * spacing / spanCount; // (column + 1) * ((1f / spanCount) * spacing)

                if (position < spanCount) { // top edge
                    outRect.top = spacing;
                }
                outRect.bottom = spacing; // item bottom
            } else {
                outRect.left = column * spacing / spanCount; // column * ((1f / spanCount) * spacing)
                outRect.right = spacing - (column + 1) * spacing / spanCount; // spacing - (column + 1) * ((1f /    spanCount) * spacing)
                if (position >= spanCount) {
                    outRect.top = spacing; // item top
                }
            }
        }

    }
    private int dpToPx(int dp) {
        Resources r = getResources();
        return Math.round(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, r.getDisplayMetrics()));
    }
    public void onBackPressed()
    {
        Intent i_service=new Intent(service.this,Home.class);
        i_service.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        i_service.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        i_service.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);

        startActivity(i_service);
        return;
    }
}
