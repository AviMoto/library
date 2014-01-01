package com.admintheweb.library;

import android.app.Activity;
import android.content.Intent;
import android.view.View;

public class HomeActivity extends Activity {

	public void newNoteBooks (View view){
		Intent intent = new Intent(this, NewNotebookActivity.class);
		startActivity(intent);
	}
}
