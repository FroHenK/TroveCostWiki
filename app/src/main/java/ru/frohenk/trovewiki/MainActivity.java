package ru.frohenk.trovewiki;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {


    public static final NavigationItem[] NAVIGATION_ITEMS = NavigationItem.values();
    private DrawerLayout mDrawerLayout;
    private ListView mDrawerList;
    private ActionBarDrawerToggle mDrawerToggle;
    private ListView mListView;
    private ArrayList<TroveItem> showItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.navigation_drawer);

        mDrawerLayout = (DrawerLayout) findViewById(R.id.navigation_drawer_layout);
        mDrawerToggle = new ActionBarDrawerToggle(this, mDrawerLayout, R.drawable.ic_drawer, R.string.navigation_drawer_open, R.string.navigation_drawer_close) {

        };
        mDrawerLayout.setDrawerListener(mDrawerToggle);

        mDrawerList = (ListView) findViewById(R.id.navigation_left_drawer);

        mDrawerList.setAdapter(new ArrayAdapter<NavigationItem>(this, R.layout.drawer_list_item, NAVIGATION_ITEMS));
        mDrawerLayout.openDrawer(mDrawerList);

        mDrawerLayout.setBackgroundColor(Color.parseColor("#9bc2db"));
        mDrawerList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ArrayList<TroveItem> troveItems = getCategoryItems(NAVIGATION_ITEMS[position]);


                mListView.setAdapter(new ArrayAdapter<TroveItem>(MainActivity.this, R.layout.drawer_list_item, troveItems));
                mDrawerLayout.closeDrawer(mDrawerList);

            }
        });
        LayoutInflater inflater = LayoutInflater.from(this);
        mListView = (ListView) inflater.inflate(R.layout.items_list, null, false);


        mDrawerLayout.addView(mListView, 0);

        NavigationItem navigationItem = NavigationItem.DRAGONS;

        ArrayList<TroveItem> troveItems = getCategoryItems(navigationItem);

        AdView adView = (AdView) ((LayoutInflater)MainActivity.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE)).inflate(R.layout.ad_on_main_page, null, false);
        {//ADS
            //Locate the Banner Ad in activity_main.xml

            // Request for Ads
            AdRequest adRequest = new AdRequest.Builder()

                    // Add a test device to show Test Ads
                    //.addTestDevice("095ECA72D190115F3A321F9194714E24")//TODO Remove
                    .build();

            // Load ads into Banner Ads
            adView.loadAd(adRequest);
        }
        //mListView.addFooterView(footerView);
        mListView.addHeaderView(adView);
        mListView.setAdapter(new ArrayAdapter<TroveItem>(this, R.layout.drawer_list_item, troveItems));
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this, ShowItemActivity.class);
                intent.putExtra("SHIT", showItems.get(position));
                startActivity(intent);
            }
        });

    }

    boolean doubleBackToExitPressedOnce = false;

    @Override
    public void onBackPressed() {
        if (doubleBackToExitPressedOnce) {
            super.onBackPressed();
            return;
        }

        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, "Please click BACK again to exit", Toast.LENGTH_SHORT).show();

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                doubleBackToExitPressedOnce = false;
            }
        }, 2000);
    }

    @NonNull
    public ArrayList<TroveItem> getCategoryItems(NavigationItem navigationItem) {
        ArrayList<TroveItem> troveItems = new ArrayList<>(Arrays.asList(TroveItem.values()));
        showItems = new ArrayList<>();
        for (TroveItem troveItem : troveItems) {
            if (troveItem.navigationCategory == navigationItem)
                showItems.add(troveItem);
        }
        return showItems;
    }


    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        // Sync the toggle state after onRestoreInstanceState has occurred.
        mDrawerToggle.syncState();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        mDrawerToggle.onConfigurationChanged(newConfig);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        switch (id) {
            case R.id.action_exit:
                //exit pressed
                System.exit(0);
                break;
            case R.id.action_calculate:
                Toast.makeText(this, "Trade calculator SOON!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.action_search:
                Intent intent = new Intent(MainActivity.this, SearchActivity.class);

                startActivity(intent);
                break;


        }

        return super.onOptionsItemSelected(item);
    }
}
