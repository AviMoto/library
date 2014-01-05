package com.admintheweb.library;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home);
	}
	
	public void newNoteBooks (View view){
		Intent intent = new Intent(this, NewNotebookActivity.class);
		startActivity(intent);
	}
	
	public void myNoteBooks(View view){
		Intent intent = new Intent(this, MyNotebooks.class);
		startActivity(intent);
	}
}
