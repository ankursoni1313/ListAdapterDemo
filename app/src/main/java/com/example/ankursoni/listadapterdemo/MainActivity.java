package com.example.ankursoni.listadapterdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {
    String [] listdata={"lemon","apple","lemon","apple","lemon","apple","lemon","apple","lemon","apple"};
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       listView=(ListView)findViewById(R.id.listviewdemo);
        ArrayAdapter arrayAdapter=new ArrayAdapter<String>(this,R.layout.item_holder,listdata);
        listView.setAdapter(arrayAdapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.primary_menu,menu);
        return true;
    }
    public void loadactivity()
    {
        Intent intent=new Intent(MainActivity.this,ItemForMenu.class);
        startActivity(intent);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.primarybar:
                loadactivity();
            case R.id.secondmenuitem:
                loadactivity();
            case R.id.subdemo1:
                loadactivity();
                default:
                    return true;
        }
    }
}
