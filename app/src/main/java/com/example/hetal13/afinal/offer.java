package com.example.hetal13.afinal;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;

public class offer extends Navigation {
Toolbar toolbar_offer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //LayoutInflater inflater = (LayoutInflater) this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        //inflate your activity layout here!
        /*View contentView = inflater.inflate(R.layout.activity_offer, null, false);
        drawerLayout.addView(contentView, 0);*/
        setContentView(R.layout.activity_offer);
        Toolbar toolbar= (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Offer");


        /*setContentView(R.layout.activity_offer);
        toolbar_offer=(Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar_offer);
        getSupportActionBar().setTitle("offer");*/


    }
  /*  public void onBackPressed()
    {
        Intent i_offer=new Intent(offer.this,Home.class);
        i_offer.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        i_offer.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        i_offer.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);

        startActivity(i_offer);
        return;
    }*/
  public boolean onOptionsItemSelected(MenuItem item) {

      switch (item.getItemId())
      {
          case android.R.id.home:
              onBackPressed();
      }
      return super.onOptionsItemSelected(item);
  }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        this.finish();
    }
}
