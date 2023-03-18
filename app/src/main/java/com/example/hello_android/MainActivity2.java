package com.example.hello_android;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ActionBar actionBar = getSupportActionBar();

        actionBar.setTitle("Actionbar Title!");
        actionBar.setSubtitle("subtitle!");

        actionBar.setIcon(R.drawable.ic_launcher_background);
        actionBar.setDisplayUseLogoEnabled(true);
        actionBar.setDisplayShowCustomEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(@NonNull MenuItem item){

        switch (item.getItemId()){
            case R.id.search:
                showAlertDialog();
                break;
            case R.id.refresh:
                DialogFragment dialogFragment = new DialogFragment();
                dialogFragment.show(getSupportFragmentManager(), "My Fragment");
                break;
            case R.id.copy:
                Toast.makeText(this, "copy clicked!", Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);


    }

    private void showAlertDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Alert!").setMessage("Danger!");

        builder.setPositiveButton("Yes!", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //user clicked ok button
            }
        });

        AlertDialog dialog = builder.create();
        dialog.show();
    }
}