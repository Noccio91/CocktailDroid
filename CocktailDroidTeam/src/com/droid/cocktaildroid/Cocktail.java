package com.droid.cocktaildroid;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Cocktail extends Activity {

	private ImageButton procButton;
	private Context mContext;
	private Resources appRes;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.cocktail);

		procButton = (ImageButton) findViewById(R.id.procButton);
		int i = R.drawable.sexonthebeach;
		mContext = getApplicationContext();
		appRes = mContext.getResources();

		ImageView imgView = (ImageView) findViewById(R.id.imageViewCocktail);
		Drawable ingredients = appRes.getDrawable(i);
		imgView.setImageDrawable(ingredients);

		procButton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				startProcessActivity();
			}
		});
	}

	private void startProcessActivity() {
		Intent cocktailProcessIntent = new Intent(this, Process.class);
		startActivity(cocktailProcessIntent);
	}
}
