package com.example.samadvora_androidproject1;

import android.graphics.drawable.Drawable;

//Custom java class tha acts a structure for holding  information of every item in recycle view
public class Product {
    private String CComp;
    private String Cname;
    private Drawable CImages;
    private String CPrice;
    private String CID;
    private String CRatings;
    private String CDetails;

//Implementing the setters// Constructor is implemented
    public Product( String Cname, String CComp, String CRatings, String CDetails, String CID, String CPrice, Drawable CImages){

        this.CID=CID;
        this.Cname=Cname;
        this.CComp=CComp;
        this.CRatings=CRatings;
        this.CDetails=CDetails;
        this.CPrice = CPrice;
        this.CImages=CImages;
    }


    // Implementing all the getters
    public String getCname()


    {
        return Cname;
    }

    public String getCComp()


    {
        return CComp;
    }

    public String getCRatings()


    {
        return CRatings;
    }

    public String getCDetails()


    {
        return CDetails;
    }

    public String getCPrice()


    {
        return CPrice;
    }
    public String getCID()

    {
        return CID;
    }

    public Drawable getCImages()

    {
        return CImages;
    }
}
