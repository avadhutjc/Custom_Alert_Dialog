package com.example.customdiaglog;

import android.annotation.SuppressLint;
import android.os.Bundle;

import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

public class CustomDialog extends Activity {

    @SuppressLint("ResourceAsColor")
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.custom_dialog_main);

        Button buttonClick = findViewById(R.id.buttonClick);

        // add listener to button
        buttonClick.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

                // Create custom dialog object
                final Dialog dialog = new Dialog(CustomDialog.this);
                // Include dialog.xml file
                dialog.setContentView(R.layout.dialog);
                // Set dialog title
                dialog.setTitle("Custom Dialog");

                // set values for custom dialog components - text, image and button
                TextView text = (TextView) dialog.findViewById(R.id.textDialog);
                text.setText("Shushma Kumar");
              //  ImageView image = (ImageView) dialog.findViewById(R.id.imageDialog);
              //  image.setImageResource(R.drawable.image_logo);
//                Button btnActive = (Button) dialog.findViewById(R.id.btn_Active);
//                btnActive.setBackgroundColor(R.color.active_btn_color);

                dialog.show();

                Button declineButton = (Button) dialog.findViewById(R.id.declineButton);
                declineButton.setOnClickListener(new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });
            }

        });

    }

}
