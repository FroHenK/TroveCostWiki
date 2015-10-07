package ru.frohenk.trovewiki;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.analytics.HitBuilders;
import com.google.android.gms.analytics.Tracker;

import java.util.ArrayList;

public class SearchActivity extends AppCompatActivity {

    private EditText editTextQuery;
    private ListView listResults;
    private ArrayList<TroveItem> troveItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_search);
        {//ADS
            //Locate the Banner Ad in activity_main.xml
            AdView adView = (AdView) this.findViewById(R.id.adViewSearch);

            // Request for Ads
            AdRequest adRequest = new AdRequest.Builder()

                    // Add a test device to show Test Ads
                    //.addTestDevice("095ECA72D190115F3A321F9194714E24")//TODO Remove
                    .build();

            // Load ads into Banner Ads
            adView.loadAd(adRequest);
        }
        try {

            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        } catch (Exception e) {
            e.printStackTrace(System.err);

        }
        setTitle("Search");
        listResults = (ListView) findViewById(R.id.listViewSearchResults);
        listResults.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(SearchActivity.this, ShowItemActivity.class);
                intent.putExtra("SHIT", troveItems.get(position));
                startActivity(intent);
            }
        });
        editTextQuery = (EditText) findViewById(R.id.editTextSearchQuery);
        editTextQuery.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                troveItems = new ArrayList<TroveItem>();
                String text = v.getText().toString();
                for (TroveItem troveItem : TroveItem.values()){

                    if(troveItem.name.toLowerCase().contains(text.toLowerCase())){
                        troveItems.add(troveItem);

                    }


                }

                Tracker tracker = ((TroveApp) SearchActivity.this.getApplication()).getTracker();
                tracker.setScreenName("search screen");

                tracker.send(new HitBuilders.EventBuilder()
                        .setCategory("UX")
                        .setAction("searched item")
                        .setLabel(text)
                        .build());
                listResults.setAdapter(new ArrayAdapter<TroveItem>(SearchActivity.this,R.layout.drawer_list_item, troveItems));
                hideKeyboard();
                return true;
            }
        });
    }
    private void hideKeyboard() {
        // Check if no view has focus:
        View view = this.getCurrentFocus();
        if (view != null) {
            InputMethodManager inputManager = (InputMethodManager) this.getSystemService(Context.INPUT_METHOD_SERVICE);
            inputManager.hideSoftInputFromWindow(view.getWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_search, menu);
        
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
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
