package com.admintheweb.library;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.Menu;
import android.widget.ImageView;

public class MainActivity extends Activity {
	
	static final int REQUEST_IMAGE_CAPTURE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    
    private void takePictureIntent(){
    	Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
    	if(takePictureIntent.resolveActivity(getPackageManager()) != null){
    		startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE);
    	}
    }
    
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data){
    	ImageView boardPic = (ImageView) findViewById(R.id.boardPic);
    	if(requestCode == REQUEST_IMAGE_CAPTURE && resultCode == RESULT_OK){
    		Bundle extras = data.getExtras();
    		Bitmap imageBitmap = (Bitmap) extras.get("data");
    		boardPic.setImageBitmap(imageBitmap);
    	}
    }
}
