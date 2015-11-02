package com.example.simonespinosa.hellow1;

/**
 * Created by Simon ESPINOSA on 01/11/2015.
 */
public class QIChecker {


    public String checkQI( String Nom, String Prenom)
    {
        String re = "";
        if (  Nom.equals("Salzstein") ||  Nom.equals("salzstein") )
        {
            re = "Qi d'une huitre";
        }
        else if ( Prenom.equals("Simon") ||  Prenom.equals("simon") )
        {
            re = "Vous êtes un génie";
        }
        else {
            re = "Dans la moyenne...";
        }
        return  re;
    }
}
