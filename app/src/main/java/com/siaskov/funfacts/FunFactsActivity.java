package com.siaskov.funfacts;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class FunFactsActivity extends AppCompatActivity {

    // Declare our View var

    private TextView mFactTextView;
    private TextView mQuotationView;
    private ColorWheel mColorWheel = new ColorWheel();
    private Button mShowFactButton;
    private FactBook mFactBook = new FactBook();
    private RelativeLayout mRelativeLayout;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        // Assign the Views from the layout file

        mFactTextView = (TextView) findViewById(R.id.factTextView);
        mQuotationView = (TextView) findViewById(R.id.textViewQ);
        mShowFactButton = (Button) findViewById(R.id.showFactbutton);
        mRelativeLayout = (RelativeLayout)  findViewById(R.id.relativeLayout);


        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               String fact = mFactBook.getFact();

                String quotation = mFactBook.getQuotation();
                int color = mColorWheel.getColor();

                // Update the screen with our dynamic fact

                mQuotationView.setText(quotation);
                mFactTextView.setText(fact);
                mRelativeLayout.setBackgroundColor(color);
                mShowFactButton.setTextColor(color);
            }
        };

        mShowFactButton.setOnClickListener(listener);

        //Showing tost message
        //Toast.makeText(FunFactsActivity.this, "Ну что, щеглы?!", Toast.LENGTH_SHORT).show();
    }
}
