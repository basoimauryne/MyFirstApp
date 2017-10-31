package com.chepkoech.basoi.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
            Create a reference to the button and set onclicklistener to it.
            When button clicked, sendMessage() function is called
         */
        Button button = (Button) findViewById(R.id.button); //android:id="@+id/button" in activity_main.xml
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendMessage(view); //When button clicked, sendMessage() function is called
            }
        });
    }

    //Great work implementing starting new Activity and sending message using bundles
    public void sendMessage(View view){
        Intent intent=new Intent(this, DisplayMessageActivity.class);
        EditText editText=(EditText) findViewById(R.id.editText2);//android:id="@+id/editText2" in activity_main.xml
        String message= editText.getText().toString();
        intent.putExtra("EXTRA_MESSAGE", message);
        //First parameter(EXTRA_MESSAGE in this case) key that you provide and can be any String in double quotes
        startActivity(intent);
    }
}
