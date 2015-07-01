package com.example.kawabata.studysqlite_listviewfor0526;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;


public class MainActivity extends Activity {

    private ListView myListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onStart() {
        super.onStart();

        myListView = (ListView)findViewById(R.id.listView);

        // 表示するカラム名
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
                "Test"
        };

        // アダプターの生成
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this, R.layout.listitem_layout, title);

        // adapterをListViewにbindして表示
        myListView.setAdapter(adapter);

        // クリックしたとき各itemのデータを取得
        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                //各要素を取得
                String transName = ((TextView)view).getText().toString();

                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setAction(transName);

                startActivity(intent);

            }
        });
    }
}
