package com.js.przelicznik;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
 final EditText editCentymetry = (EditText) findViewById(R.id.editCentymetry);
        
        final EditText editCale = (EditText) findViewById(R.id.editCale);
        editCentymetry.setText("0");
        editCale.setText("0");
        Button buttonConvert = (Button)findViewById(R.id.buttonConvert);
        
        buttonConvert.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				
				
				double centymetry = Double.valueOf( editCentymetry.getText().toString());
				double cale = Double.valueOf( editCale.getText().toString());
				if (centymetry == 0){
					
				centymetry = cale/2.54;
				editCentymetry.setText(String.valueOf(centymetry));
				} else {
				cale = centymetry *  2.54 ;
				
				editCale.setText(String.valueOf(cale));
				}
				
				
			}
		});
        
    }
}
