package com.example.firsttry;

public class BMIResult {
    public double weight, height, index;
    public int id;
    public String indexValue;

    public BMIResult(){}

    public BMIResult(double weight, double height, double index){
        this.weight = weight;
        this.height = height;
        this.index = index;
        this.indexValue = getValue(index);
    }

    public String getValue(double index){
        String val;
        if(index <= 15)
            val = "Very severely underweight";
        else if(index <= 16)
            val = "Severely underweight";
        else if(index <= 18.5)
            val = "Underweight";
        else if(index <= 25)
            val = "Normal";
        else if(index <= 30)
            val = "Overweight";
        else if(index <= 35)
            val = "Moderately obese";
        else if(index <= 40)
            val = "Severely obese";
        else if(index <= 45)
            val = "Very severely obese";
        else if(index <= 50)
            val = "Morbidly obese";
        else if(index <= 60)
            val = "Super obese";
        else
            val = "Hyper obese";
        return val;
    }

    public void setID(int id){
        this.id = id;
    }

    public void setWeight(double w){
        weight = w;
    }

    public void setHeight(double h){
        height = h;
    }

    public void setIndex(double id){
        index = id;
    }

    public void setIndexValue(String idVal){
        indexValue = idVal;
    }

    public int getID(){
        return id;
    }


    public double getWeight(){
        return weight;
    }

    public double getHeight(){
        return height;
    }

    public double getIndex(){
        return index;
    }

    public String getIndexValue(){
        return indexValue;
    }
}
