package com.example.android.quizapp_02;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    //Score for questions.
    int score1 = 0;
    int score2 = 0;
    int score3 = 0;
    int score4 = 0;
    int score5 = 0;
    //Declare instant variables for radio buttons.
    RadioButton sataRadioButton, lunguRadioButton, nineRadioButton, tenRadioButton;
    //Declare instant variables for checkboxes.
    CheckBox livinstoneCheckBox, pretoriaCheckBox, ndolaCheckBox, harareCheckBox, zimbabweCheckBox, southAfricaCheckBox, malawiCheckBox, swazilancheckBox;
    //Declare instant variables for editable text field.
    EditText capitalCityEditText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Create objects for radio buttons.
        sataRadioButton = findViewById(R.id.sata_radio_button);
        lunguRadioButton = findViewById(R.id.lungu_radio_button);
        nineRadioButton = findViewById(R.id.nine_radio_button);
        tenRadioButton = findViewById(R.id.ten_radio_button);
        //Create objects for checkBoxes.
        livinstoneCheckBox = findViewById(R.id.livinstone_checkbox);
        pretoriaCheckBox = findViewById(R.id.pretoria_checkbox);
        ndolaCheckBox = findViewById(R.id.ndola_checkbox);
        harareCheckBox = findViewById(R.id.harare_checkbox);
        zimbabweCheckBox = findViewById(R.id.zimbabwe_checkbox);
        southAfricaCheckBox = findViewById(R.id.southafrica_checkbox);
        malawiCheckBox = findViewById(R.id.malawi_checkbox);
        swazilancheckBox = findViewById(R.id.swaziland_checkbox);
        //Create object for editable text field.
        capitalCityEditText = findViewById(R.id.capital_city_edit_text);
    }
    //Called when question 1 text field is clicked..
    public void onClickSetQ1(View view) {
        // Get what the user types in.
        String capitalCity = capitalCityEditText.getText().toString();

        switch (view.getId()) {
            case R.id.capital_city_edit_text:
                // Check if text field has the correct text.
                if (capitalCity.equalsIgnoreCase("Lusaka")) {

                    //Add 20 marks for correct answer.
                    score1 += 20;
                    capitalCityEditText.setEnabled(false);
                } else {
                    capitalCityEditText.setEnabled(false);
                }
        }
    }
    //Called when question 2 radio buttons are clicked.
    public void onClickSetQ2(View view) {
        //Set the value of the radio buttons to isChecked.
        boolean sata = sataRadioButton.isChecked();
        boolean lungu = lunguRadioButton.isChecked();

        switch (view.getId()) {
            //Focus or switch action to sata radio button.
            case R.id.sata_radio_button:
                //Check if sata radio button is checked.
                if (sata) {
                    //Add 0 marks if sata radio button is clicked.
                    sataRadioButton.setChecked(true);
                    sataRadioButton.setEnabled(false);
                    lunguRadioButton.setEnabled(false);
                    break;
                }
        }

        switch (view.getId()) {
            //Check if lungu radio button is checked.
            case R.id.lungu_radio_button:
                //Check if lungu radio button is checked.
                if (lungu) {
                    //Add 20 marks if lungu radio button is clicked.
                    score2 += 20;
                    lunguRadioButton.setEnabled(false);
                    sataRadioButton.setEnabled(false);
                    break;
                }
        }
    }
    //Called when questions 3 check boxes are clicked.
    public void onClickSetQ3(View view) {
        //Set the value of the check boxes to isChecked.
        boolean livingstone = livinstoneCheckBox.isChecked();
        boolean pretoria = pretoriaCheckBox.isChecked();
        boolean ndola = ndolaCheckBox.isChecked();
        boolean harare = harareCheckBox.isChecked();

        switch (view.getId()) {
            //Focus or switch action to livingstone checkbox.
            case R.id.livinstone_checkbox:
                //Check if livingstone checkbox is checked.
                if (livingstone) {

                    //Add 20 marks if livingstone checkbox is clicked.
                    score3 += 10;
                    livinstoneCheckBox.setEnabled(false);
                    pretoriaCheckBox.setEnabled(false);
                    break;
                }
        }

        switch (view.getId()) {
            //Focus or switch action to pretoria checkbox.
            case R.id.pretoria_checkbox:
                //Check if pretoria checkbox is checked.
                if (pretoria) {
                    //Add 0 marks if pretoria checkbox is clicked.
                    pretoriaCheckBox.setEnabled(false);
                    livinstoneCheckBox.setEnabled(false);
                    break;
                }
        }

        switch (view.getId()) {
            //Focus or switch action to ndola checkbox.
            case R.id.ndola_checkbox:
                //Check if ndola checkbox is checked.
                if (ndola) {
                    //Add 20 marks if ndola checkbox is clicked.
                    score3 += 10;
                    ndolaCheckBox.setEnabled(false);
                    harareCheckBox.setEnabled(false);
                    break;
                }
        }

        switch (view.getId()) {
            //Focus or switch action to harare checkbox.
            case R.id.harare_checkbox:

                //Check if harare checkbox is checked.
                if (harare) {

                    //Add 0 marks if harare checkbox is clicked.
                    harareCheckBox.setEnabled(false);
                    ndolaCheckBox.setEnabled(false);
                    break;
                }
        }

    }
    //Called when question 4 radio buttons are clicked.
    public void onClickSetQ4(View view) {
        //Set the value of the radio buttons to isChecked.
        boolean nine = nineRadioButton.isChecked();
        boolean ten = tenRadioButton.isChecked();

        switch (view.getId()) {
            //Focus or switch action to nine radio button.
            case R.id.nine_radio_button:
                //Check if nine radio button is checked.
                if (nine) {
                    //Add 0 marks if nine radio button is clicked.
                    nineRadioButton.setChecked(true);
                    nineRadioButton.setEnabled(false);
                    tenRadioButton.setEnabled(false);
                    break;
                }
        }

        switch (view.getId()) {
            //Focus or switch action to ten radio button.
            case R.id.ten_radio_button:
                //Check if ten radio button is checked.
                if (ten) {
                    //Add 20 marks if nine radio button is clicked.
                    score4 += 20;
                    tenRadioButton.setEnabled(false);
                    nineRadioButton.setEnabled(false);
                    break;
                }
        }
    }
    //Called when checkbox is clicked.
    public void onClickSetQ5(View view) {
        //Sets the value of the object to checked.
        boolean zimbabwe = zimbabweCheckBox.isChecked();
        boolean southafrica = southAfricaCheckBox.isChecked();
        boolean malawi = malawiCheckBox.isChecked();
        boolean swaziland = swazilancheckBox.isChecked();

        switch (view.getId()) {
            //Focus or switch action to zimbabwe checkbox.
            case R.id.zimbabwe_checkbox:
                //Check if zimbabwe checkbox is checked.
                if (zimbabwe) {
                    //Add 20 marks if zimbabwe checkbox is clicked.
                    score5 += 10;
                    zimbabweCheckBox.setEnabled(false);
                    southAfricaCheckBox.setEnabled(false);
                    break;
                }
        }

        switch (view.getId()) {
            //Focus or switch action to south africa checkbox.
            case R.id.southafrica_checkbox:
                //Check if south africa checkbox is checked.
                if (southafrica) {
                    //Add 0 marks if south africa checkbox is clicked.
                    southAfricaCheckBox.setEnabled(false);
                    zimbabweCheckBox.setEnabled(false);
                    break;
                }
        }

        switch (view.getId()) {
            //Focus or switch action to malawi checkbox.
            case R.id.malawi_checkbox:
                //Check if south africa checkbox is checked.
                if (malawi) {
                    //Add 20 marks if south africa checkbox is clicked.
                    score5 += 10;
                    malawiCheckBox.setEnabled(false);
                    swazilancheckBox.setEnabled(false);
                    break;
                }
        }

        switch (view.getId()) {
            //Focus or switch action to swaziland checkbox.
            case R.id.swaziland_checkbox:
                //Check if south swaziland checkbox is checked.
                if (swaziland) {
                    //Add 0 marks if swaziland checkbox is clicked.
                    swazilancheckBox.setEnabled(false);
                    malawiCheckBox.setEnabled(false);
                    break;
                }
        }

    }
    //Called when Submit button is clicked.
    public void onClickSetSubmit(View view) {
        String scoreMessage = createScoreMessage();
        Toast.makeText(this, scoreMessage, Toast.LENGTH_LONG).show();
    }
    //Called when the Reset button is clicked.
    public void onClickReset(View view) {
        //Sets the scores to 0.
        score1 = 0;
        score2 = 0;
        score3 = 0;
        score4 = 0;
        score5 = 0;
        //Sets the Q1 Radio buttons to default.
        lunguRadioButton.setChecked(false);
        sataRadioButton.setChecked(false);
        lunguRadioButton.setEnabled(true);
        sataRadioButton.setEnabled(true);
        //Sets Q2 Check boxes to default
        livinstoneCheckBox.setChecked(false);
        pretoriaCheckBox.setChecked(false);
        ndolaCheckBox.setChecked(false);
        harareCheckBox.setChecked(false);
        livinstoneCheckBox.setEnabled(true);
        pretoriaCheckBox.setEnabled(true);
        ndolaCheckBox.setEnabled(true);
        harareCheckBox.setEnabled(true);
        //Sets Q3 Edit text field to default.
        capitalCityEditText.setEnabled(true);
        //Sets the Q4 Radio buttons to default.
        nineRadioButton.setChecked(false);
        tenRadioButton.setChecked(false);
        nineRadioButton.setEnabled(true);
        tenRadioButton.setEnabled(true);
        //Sets the Q5 Check buttons to default.
        zimbabweCheckBox.setChecked(false);
        southAfricaCheckBox.setChecked(false);
        malawiCheckBox.setChecked(false);
        swazilancheckBox.setChecked(false);
        zimbabweCheckBox.setEnabled(true);
        southAfricaCheckBox.setEnabled(true);
        malawiCheckBox.setEnabled(true);
        swazilancheckBox.setEnabled(true);
    }
    /**
     * Creates score summary.
     *
     * @return scoreMessage.
     */
    private String createScoreMessage() {
        String scoreMessage = getString(R.string.score_summary_title);
        scoreMessage += "\n ";
        scoreMessage += "\n " + getString(R.string.score_summary_question_one, score1);
        scoreMessage += "\n ";
        scoreMessage += "\n " + getString(R.string.score_summary_question_two, score2);
        scoreMessage += "\n ";
        scoreMessage += "\n " + getString(R.string.score_summary_question_three, score3);
        scoreMessage += "\n ";
        scoreMessage += "\n " + getString(R.string.score_summary_question_four, score4);
        scoreMessage += "\n ";
        scoreMessage += "\n " + getString(R.string.score_summary_question_five, score5);
        scoreMessage += "\n ";
        scoreMessage += "\n " + getString(R.string.total_score_header, calculateTotalScore());
        scoreMessage += "\n ";
        return scoreMessage;
    }
    /**
     * Calculates the total score.
     *
     * @return
     */
    private int calculateTotalScore() {
        return score1 + score2 + score3 + score4 + score5;
    }
}
