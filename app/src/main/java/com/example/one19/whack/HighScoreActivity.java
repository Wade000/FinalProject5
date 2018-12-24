package com.example.one19.whack;

import android.app.Activity;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class HighScoreActivity extends Activity {

        }











/*
        listView = findViewById(R.id.listView);
        adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1, items);
        listView.setAdapter(adapter);
        dbrw = new MyDBHelper(this)
                .getWritableDatabase();


        getdata=getIntent().getExtras().getInt("key");
        count=getIntent().getExtras().getInt("count");
        getstrcount=String.valueOf(count);

        dbrw.execSQL("INSERT INTO myTable(book, price) VALUES(?,?)", new Object[]{"玩家"+count,
                getdata});

        Cursor c;
        c = dbrw.rawQuery("SELECT * FROM myTable",null);
        c.moveToFirst();
        items.clear();
        Toast.makeText(HighScoreActivity.this,"共有" + c.getCount() +
                "筆資料",Toast.LENGTH_SHORT).show();
        for(int i = 0; i < c.getCount(); i++){
            items.add("\t\t\t\t"+c.getString(0) +
                    "\t\t\t\t\t\t\t\t 分數:" +"\t\t\t\t"+ c.getString(1)+"\t\t\t\t分");
            c.moveToNext();
        }
        adapter.notifyDataSetChanged();
        c.close();
*/


        // TODO read in file to ListView





