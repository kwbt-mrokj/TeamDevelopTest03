package com.example.kawabata.studysqlite_listviewfor0526;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class RegisterActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    @Override
    public void onStart() {
        super.onStart();

        final EditText nameEdit = (EditText)findViewById(R.id.regNameEdit);
        final EditText contentEdit = (EditText)findViewById(R.id.regContentEdit);
        final EditText dateEdit = (EditText)findViewById(R.id.regDateEdit);

        Button regButton = (Button)findViewById(R.id.regButton);

        regButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent regIntent = new Intent(RegisterActivity.this, MainActivity.class);
                regIntent.putExtra("name", nameEdit.getText().toString());
                regIntent.putExtra("content", contentEdit.getText().toString());
                regIntent.putExtra("date", dateEdit.getText().toString());

//                System.out.println(nameEdit.getText().toString());
//                System.out.println(contentEdit.getText().toString());
//                System.out.println(dateEdit.getText().toString());

                startActivity(regIntent);
            }
        });
    }
}
