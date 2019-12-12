package com.apsara.thirdassignment.ui;

import android.widget.Button;

public class Contacts {
    private String FullName;
    private String Age;
    private  String Address;
    private  String Gender;
    private String Button;

    private int imageId;

    public Contacts(String FullName,String Age,String Address, String Gender, int imageId, String Button){
        this.FullName=FullName;
        this.Age=Age;
        this.Address=Address;
        this.Gender=Gender;
        this.imageId=imageId;
        this.Button=Button;
    }

    public String getFullName(){return FullName;}
    public void setFullName(String FullName){this.FullName=FullName;}

    public String getAge(){return Age;}
    public void setAge(String Age){this.Age=Age;}

    public String getAddress(){return Address;}
    public void setAddress(String Address){this.Address=Address;}

    public String getGender(){return Gender;}
    public void setGender(String Gender){this.Gender=Gender;}

    public int getImageId(){return imageId;}
    public void setImageId(int imageId){this.imageId=imageId;}

    public String getButton(){return Button;}
    public void setButton(String Button){this.Button=Button;}
}
