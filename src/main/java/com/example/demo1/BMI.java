package com.example.demo1;

public class BMI {
    private double weight;
    private double height;
    private double result;
    private String radioButtonValue;

    public double bmiCalc(double w, double h, String rb){
        if(rb.equals("Metric")){
            return w / (h*h);
        } else if (rb.equals("English")) {
            return (w / (h*h)) * 703;
        } else return 0;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public String getRadioButtonValue() {
        return radioButtonValue;
    }

    public void setRadioButtonValue(String radioButtonValue) {
        this.radioButtonValue = radioButtonValue;
    }
}
