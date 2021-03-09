package com.example.calculator;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.ContextMenu;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        createMenu(menu);
        return true;

    }

    private void createMenu(Menu menu) {

        MenuItem mnu1= menu.add(0,0,0, "History");
        {

            mnu1.setShowAsAction(MenuItem.SHOW_AS_ACTION_NEVER);
        }

        MenuItem mnu2= menu.add(1,1,1, "Choose Theme");
        {
            mnu2.setShowAsAction(MenuItem.SHOW_AS_ACTION_NEVER);
        }

        MenuItem mnu3= menu.add(2,2,2, "Send feedback");
        {

            mnu3.setShowAsAction(MenuItem.SHOW_AS_ACTION_NEVER);
        }
        MenuItem mnu4= menu.add(3,3,3, "Help");
        {

            mnu4.setShowAsAction(MenuItem.SHOW_AS_ACTION_NEVER);
        }


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return menuChoice(item);
    }

    private boolean menuChoice(MenuItem item){
        switch(item.getItemId()){
            case 0:
                displayToast("History");
                return true;
            case 1:
                displayToast("Choose theme");
                return true;
            case 2:
                displayToast("Send Feedback");
                return true;
            case 3:
                displayToast("Help");
                return true;

        }return false;
    }

    private void displayToast(String text){
        Toast.makeText(this,text,Toast.LENGTH_SHORT).show();
    }
    public void onCreateContextMenu(ContextMenu menu, View view, ContextMenu.ContextMenuInfo menuInfo){
        super.onCreateContextMenu(menu, view, menuInfo);
        createMenu(menu);
    }






}
