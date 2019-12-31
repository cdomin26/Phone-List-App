package com.example.cs478_project2;

import android.net.Uri;
import android.os.Bundle;
import android.content.Intent;


import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;

public class ExpandImageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent i = getIntent();

        ImageView iv = new ImageView(getApplicationContext());

        int picID = i.getIntExtra(MainActivity.EXTRA_RES_ID, 0);

        iv.setImageResource(MainActivity.idsPhones.get(picID));
        Integer t = picID;
        iv.setTag(t);

        setContentView(iv);



        iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(iv.getTag().equals(0)) {
                    Intent webIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.apple.com/iphone-11-pro/"));
                    startActivity(webIntent);
                }
                if(iv.getTag().equals(1)) {
                    Intent webIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.t-mobile.com/cell-phone/apple-iphone-xs"));
                    startActivity(webIntent);
                }
                if(iv.getTag().equals(2)) {
                    Intent webIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://store.google.com/product/pixel_3?gclid=EAIaIQobChMI_qParKya5QIVlRx9Ch3KswYvEAAYASAAEgL9U_D_BwE&gclsrc=aw.ds"));
                    startActivity(webIntent);
                }
                if(iv.getTag().equals(3)) {
                    Intent webIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.oneplus.com/oneplus-7pro?utm_source=google&utm_medium=cpc&utm_campaign=brand-op7pro&gclid=EAIaIQobChMIpc6e06ya5QIV9yCtBh34GwFBEAAYASAAEgI3kfD_BwE&gclsrc=aw.ds"));
                    startActivity(webIntent);
                }
                if(iv.getTag().equals(4)) {
                    Intent webIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.razer.com/mobile/razer-phone-2"));
                    startActivity(webIntent);
                }
                if(iv.getTag().equals(5)) {
                    Intent webIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.samsung.com/us/mobile/galaxy-s10/"));
                    startActivity(webIntent);
                }

            }//End of onClick()
        });


    }//End of onCreate()

}//End of ExpandImageActivity class
