package com.example.lower;

import java.util.Random;

import com.example.lower.R;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
	int randomNumber ;
	Random randomGenerator = new Random();
	public void guess(View view){
		
		int guessedNumber = 0;
		EditText guessedValue = (EditText) findViewById(R.id.guessedValue);
		String message ="";
		String guessedValueString = guessedValue.getText().toString();
		if(guessedValue.getText().toString().isEmpty()){
			message = "please enter a value";
		}
		else{
		 guessedNumber = Integer.parseInt(guessedValueString);
		
		
		if (guessedNumber < randomNumber){
			message = "you have choosen lower number";
			
		}
		else if (guessedNumber > randomNumber){
			message = "you have choosen higher number";
		}
		else {
			message = "correct! play again";
			randomNumber = randomGenerator.nextInt(21);
		}
				}
		Toast.makeText(getApplicationContext(), message, Toast.LENGTH_LONG).show();

	}
		

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		 randomNumber = randomGenerator.nextInt(21);
		 Toast.makeText(getApplicationContext(), "developer: Mohammed suhail", Toast.LENGTH_LONG).show();

	}
}
