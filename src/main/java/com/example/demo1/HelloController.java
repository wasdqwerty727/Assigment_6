package com.example.demo1;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

import java.text.DecimalFormat;

public class HelloController {
    private DecimalFormat df = new DecimalFormat("0.00");
    BMI bmi = new BMI();
    @FXML
    private TextField weightValue;
    @FXML
    private TextField heightValue;
    @FXML
    private RadioButton radioButton1;
    @FXML
    private RadioButton radioButton2;
    @FXML
    private Label result;
    
    @FXML
    public void getRadioButton(){
        if(radioButton1.isSelected()){
            bmi.setRadioButtonValue("Metric");
        } else if (radioButton2.isSelected()) {
            bmi.setRadioButtonValue("English");
        }
    }

    @FXML
    public void onBMIButtonClicked(){
        double userResult = bmi.bmiCalc(Double.parseDouble(weightValue.getText()), Double.parseDouble(heightValue.getText()), bmi.getRadioButtonValue());
        if (userResult < 18.5){
            result.setText(String.valueOf(df.format(userResult)) + "\n" + "Underweight");
        } else if (userResult > 18.5 && userResult < 24.9) {
            result.setText(String.valueOf(df.format(userResult)) + "\n" + "Normal");
        } else if (userResult > 25 && userResult < 29.9) {
            result.setText(String.valueOf(df.format(userResult)) + "\n" + "Overweight");
        } else{
            result.setText(String.valueOf(df.format(userResult)) + "\n" + "Obese");
        }
    }



}