package com.droid.cocktaildroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.mainmenu, menu);
        return true;
    }
    
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
        case R.id.cocktailList:
            /**
             * 
             */
            return true;
        case R.id.randomCocktail:
        	Intent randomCocktailIntent = new Intent(this, Cocktail.class);
        	startActivity(randomCocktailIntent);
            return true;
        case R.id.findByIng:
        	Intent findByIngIntent = new Intent(this, FindByIng.class);
        	startActivity(findByIngIntent);
            return true;
        case R.id.credits:
            /**
             * 
             */
            return true;
        default:
            return super.onOptionsItemSelected(item);
        }
    }
}