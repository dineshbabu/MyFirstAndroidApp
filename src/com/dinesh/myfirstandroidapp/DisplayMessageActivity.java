package com.dinesh.myfirstandroidapp;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class DisplayMessageActivity extends Activity{

	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Are you sure you want to exit?")
               .setCancelable(false)
               .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                   public void onClick(DialogInterface dialog, int id) {
                   	
                   //	startActivity(intent);
                   }
               })
               .setNegativeButton("No", new DialogInterface.OnClickListener() {
                   public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                   }
               });
        AlertDialog alert = builder.create();
        
        // Get the message from the intent
        Intent intent = getIntent();
        String message = intent.getStringExtra(" Story details ");

        // Create the text view
        EditText textView = new EditText(this);
        textView.setTextSize(10);
        textView.setText(message);

        setContentView(textView);
        
        
       
        
        
    }
}
