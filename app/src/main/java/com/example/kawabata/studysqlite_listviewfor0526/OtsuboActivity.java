package com.example.kawabata.studysqlite_listviewfor0526;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;


public class OtsuboActivity extends Activity {

    private ListView myListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otsubo);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_otsubo, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void onStart() {
        super.onStart();

        myListView = (ListView)findViewById(R.id.listView);

        String[] title = {
                "Isobe",
                "Otsubo",
                "Kato",
                "Shimazawa",
                "Yoshida",
                "Awaji",
                "Ito",
                "Gomibuchi",
                "Nagahora",
                "Kodate",
                "Odagiri",
                "Sunako",
                "Wada",
                "Test",
                "KawaTest"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(OtsuboActivity.this, R.layout.listitem_layout, title);

        myListView.setAdapter(adapter);

        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                String transName = ((TextView) view).getText().toString();

                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setAction(transName);

                startActivity(intent);

            }
        });
    }
}
