/*
 * Christian Dominguez
 * CS 478 - Fall 2019
 * cdomin26@uic.edu
 * Project 2
 * 3 activities: main, bigger picture activity, browser activity
 */


package com.example.cs478_project2;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.content.Intent;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    protected static ArrayList<Integer> idsPhones = new ArrayList<Integer>(
            Arrays.asList(R.drawable.iphoneelevenpromax,
            R.drawable.iphone10s, R.drawable.googlepixel3,
                    R.drawable.oneplus7pro, R.drawable.razer2, R.drawable.samsunggalaxysten));

    private ArrayList<String> phoneInfo;

    private ArrayList<String> phoneSpecs;

    private ArrayList<DisplayElements> displayList;
    protected static final String EXTRA_RES_ID = "POS";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        phoneInfo = new ArrayList<String>(
                Arrays.asList(getString(R.string.iPhone11ProMaxInfo), getString(R.string.iPhoneXSInfo),
                        getString(R.string.GooglePixel3Info), getString(R.string.OnePlus7ProInfo), getString(R.string.Razer2Info),
                        getString(R.string.SamsungGalaxys10Info)));

        phoneSpecs = new ArrayList<String>(
                Arrays.asList(getString(R.string.iPhone11ProMaxSpecs), getString(R.string.iPhoneXSSpecs),
                        getString(R.string.GooglePixel3Specs), getString(R.string.OnePlus7ProSpecs), getString(R.string.Razer2Specs),
                        getString(R.string.SamsungGalaxys10Specs)));

        displayList = new ArrayList<DisplayElements>();

        ListView listView = (ListView) findViewById(R.id.listView);

        registerForContextMenu(listView);

        //Populating the list that will be displayed
        for(int i = 0; i < 6; i++){
            DisplayElements e = new DisplayElements();

            e.setPictureID(idsPhones.get(i));
            e.setPhoneInfo(phoneInfo.get(i));
            e.setPhoneSpecs(phoneSpecs.get(i));

            displayList.add(e);
        }

        listView.setAdapter(new CustomImageAdapter(this, displayList));

        //Setting on short click listener of items
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(MainActivity.this, ExpandImageActivity.class);

                i.putExtra(EXTRA_RES_ID, position);

                startActivity(i);
            }
        });

    }//End of onCreate()

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.context_menu, menu);

    }//End of onCreateContextMenu()

    @Override
    public boolean onContextItemSelected(MenuItem item){
        AdapterView.AdapterContextMenuInfo info = (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();


        if(info.position == 0) {
            if(item.getItemId() == 2131230879){
                Intent i = new Intent(MainActivity.this, SpecsActivity.class);
                startActivity(i);
            }
            if (item.getItemId() == 2131230796) {
                ImageView iv = new ImageView(getApplicationContext());
                iv.setImageResource(R.drawable.iphoneelevenpromax);
                setContentView(iv);
            }
            if(item.getItemId() == 2131230923){
                Intent webIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.apple.com/iphone-11-pro/"));
                startActivity(webIntent);
            }
        }
        if(info.position == 1) {
            if(item.getItemId() == 2131230879){

            }
            if (item.getItemId() == 2131230796) {
                ImageView iv = new ImageView(getApplicationContext());
                iv.setImageResource(R.drawable.iphone10s);
                setContentView(iv);
            }
            if(item.getItemId() == 2131230923){
                Intent webIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.t-mobile.com/cell-phone/apple-iphone-xs"));
                startActivity(webIntent);
            }
        }
        if(info.position == 2) {
            if(item.getItemId() == 2131230879){

            }
            if (item.getItemId() == 2131230796) {
                ImageView iv = new ImageView(getApplicationContext());
                iv.setImageResource(R.drawable.googlepixel3);
                setContentView(iv);
            }
            if(item.getItemId() == 2131230923){
                Intent webIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://store.google.com/product/pixel_3?gclid=EAIaIQobChMI_qParKya5QIVlRx9Ch3KswYvEAAYASAAEgL9U_D_BwE&gclsrc=aw.ds"));
                startActivity(webIntent);
            }
        }
        if(info.position == 3) {
            if(item.getItemId() == 2131230879){

            }
            if (item.getItemId() == 2131230796) {
                ImageView iv = new ImageView(getApplicationContext());
                iv.setImageResource(R.drawable.oneplus7pro);
                setContentView(iv);
            }
            if(item.getItemId() == 2131230923){
                Intent webIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.oneplus.com/oneplus-7pro?utm_source=google&utm_medium=cpc&utm_campaign=brand-op7pro&gclid=EAIaIQobChMIpc6e06ya5QIV9yCtBh34GwFBEAAYASAAEgI3kfD_BwE&gclsrc=aw.ds"));
                startActivity(webIntent);
            }
        }
        if(info.position == 4) {
            if(item.getItemId() == 2131230879){

            }
            if (item.getItemId() == 2131230796) {
                ImageView iv = new ImageView(getApplicationContext());
                iv.setImageResource(R.drawable.razer2);
                setContentView(iv);
            }
            if(item.getItemId() == 2131230923){
                Intent webIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.razer.com/mobile/razer-phone-2"));
                startActivity(webIntent);
            }
        }
        if(info.position == 5) {
            if(item.getItemId() == 2131230879){

            }
            if (item.getItemId() == 2131230796) {
                ImageView iv = new ImageView(getApplicationContext());
                iv.setImageResource(R.drawable.samsunggalaxysten);
                setContentView(iv);
            }
            if(item.getItemId() == 2131230923){
                Intent webIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.samsung.com/us/mobile/galaxy-s10/"));
                startActivity(webIntent);
            }
        }


        return true;
    }

}//End of MainActivity class
