package com.syntax;

public class Main {

    public static void main(String[] args) {

SolarSystem FactorX=new SolarSystem();

        FactorX.Sun="1";
        FactorX.Moon="4";
        FactorX.Planet="2";
        FactorX.Stars="10000";

        //adding features to our sun

        FeatureSun Xfact=new FeatureSun();
        Xfact.color="green";
        Xfact.radius="10000000000";
        Xfact.heat="42989038429038492";

        //adding the features for star in the solar system

        FeatureStars FacX=new FeatureStars();
        FacX.color="green";
        FacX.radius="2423424234 km";
        FacX.size="34424234234234 m";


        //adding planet 2

            Planet2 Olso = new Planet2();
            Olso.name="Ozhan";
            Olso.size="694254km";
            Olso.color="pink";

        // adding features for planet 1

            Planet1Features GulK= new Planet1Features();

            GulK.color="blue";
            GulK.size="45435345353km";
            GulK.name="preacheX";



    }
}
