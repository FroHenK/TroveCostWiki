package ru.frohenk.trovewiki;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.analytics.HitBuilders;
import com.google.android.gms.analytics.Tracker;

public class ShowItemActivity extends AppCompatActivity {

    private TroveItem troveItem;
    private TextView itemNameText;
    private TextView itemCostText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_item);
        // Get tracker.
        Tracker tracker = ((TroveApp) this.getApplication()).getTracker();
        {//ADS
            //Locate the Banner Ad in activity_main.xml
            AdView adView = (AdView) this.findViewById(R.id.adViewShowItem);

            // Request for Ads
            AdRequest adRequest = new AdRequest.Builder()

                    // Add a test device to show Test Ads
                    //.addTestDevice("095ECA72D190115F3A321F9194714E24")//TODO Remove
                    .build();

            // Load ads into Banner Ads
            adView.loadAd(adRequest);
        }
        troveItem = (TroveItem) getIntent().getSerializableExtra("SHIT");
        try {

            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        } catch (Exception e) {
            e.printStackTrace(System.err);

        }

        setTitle(troveItem.name);
        itemCostText = (TextView) findViewById(R.id.textCost);
        itemNameText = (TextView) findViewById(R.id.textItemName);
        itemCostText.setText(troveItem.cost);
        itemNameText.setText(troveItem.name);

        tracker.setScreenName("items screen");

        tracker.send(new HitBuilders.EventBuilder()
                .setCategory("UX")
                .setAction("viewed item")
                .setLabel(troveItem.name)
                .build());

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_show_item, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        switch (id) {
            // Respond to the action bar's Up/Home button
            case android.R.id.home:
                finish();
                return true;
            case R.id.action_exit:
                System.exit(0);
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}
