package sg.edu.rp.c346.p01_dailygoals;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import static sg.edu.rp.c346.p01_dailygoals.R.id.rg3;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button) findViewById(R.id.buttonOK);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Get the RadioGroup object
                RadioGroup rg1 = (RadioGroup) findViewById(R.id.rg1);
                //Get the Id of the selected radio button in the RadioGroup
                int selectedButtonId1 = rg1.getCheckedRadioButtonId();
                //Get the radio button object from the Id we had gotten above
                RadioButton rb1 = (RadioButton) findViewById(selectedButtonId1);

                //Get the RadioGroup object
                RadioGroup rg2 = (RadioGroup) findViewById(R.id.rg2);
                //Get the Id of the selected radio button in the RadioGroup
                int selectedButtonId2 = rg2.getCheckedRadioButtonId();
                //Get the radio button object from the Id we had gotten above
                RadioButton rb2 = (RadioButton) findViewById(selectedButtonId2);

                //Get the RadioGroup object
                RadioGroup rg3 = (RadioGroup) findViewById(R.id.rg3);
                //Get the Id of the selected radio button in the RadioGroup
                int selectedButtonId3 = rg3.getCheckedRadioButtonId();
                //Get the radio button object from the Id we had gotten above
                RadioButton rb3 = (RadioButton) findViewById(selectedButtonId3);

                EditText etMutiline = (EditText) findViewById(R.id.MultilineText);
                // Put the name and age into an array
                String[] info = {etMutiline.getText().toString(),
                        rb1.getText().toString(), rb2.getText().toString(), rb3.getText().toString() };

                Intent i = new Intent(MainActivity.this,
                        Summary.class);
                // Pass the String array holding the name & age to new activity
                i.putExtra("info", info);
                // Start the new activity
                startActivity(i);

            }
        });


    }
}
