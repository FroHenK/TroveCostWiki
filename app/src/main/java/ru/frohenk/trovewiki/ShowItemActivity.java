package ru.frohenk.trovewiki;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class ShowItemActivity extends AppCompatActivity {

    private TroveItem troveItem;
    private TextView itemNameText;
    private TextView itemCostText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_item);

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
