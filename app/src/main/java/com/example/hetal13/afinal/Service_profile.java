package com.example.hetal13.afinal;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

public class Service_profile extends Navigation {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_service_profile);
        LayoutInflater inflater = (LayoutInflater) this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        //inflate your activity layout here!
        View contentView = inflater.inflate(R.layout.activity_service_profile, null, false);
        drawerLayout.addView(contentView, 0);
        getSupportActionBar().setTitle("Service profile");

    }
    public void onBackPressed()
    {
        Intent i_rating=new Intent(Service_profile.this,Service_feedback.class);
        i_rating.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        i_rating.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        i_rating.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);

        startActivity(i_rating);
        return;
    }
}
