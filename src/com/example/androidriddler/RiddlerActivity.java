package com.example.androidriddler;

/*Course: CS2302
 *Section: 01
 *Name: Andrew El-Masry
 *Professor: Dr. Shaw
 *Assignment #: Lab 16
 */

import android.R;
import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class RiddlerActivity extends Activity {
	
	private TextView headerTxt;
	private Button answerBtn;
	private Button nextBtn;
	private TextView riddleTxt;
	private EditText answerTxt;
	
	private String[] riddle = new String[3];
	private String[] answer = new String[3];
	private int riddleNum = 0;
	private boolean answerRight = false;
	private String beforeMovingOn;
	
	
	
	
	
	
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_riddler);
       

     } 

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.riddler, menu);
        return true;
    }
}
