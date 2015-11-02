package com.example.simonespinosa.hellow1;

/**
 * Created by Simon ESPINOSA on 01/11/2015.
 */
public class QIChecker2 extends QIChecker {

    public  String checkQI(String Nom, String Prenom) {
        String re = "";
        if (Nom.equals("Espinosa") || Nom.equals("espinosa")) {
            re = "Qi d'une huitre";
        } else if (Prenom.equals("Laure") || Prenom.equals("laure")) {
            re = "Vous êtes un génie";
        } else {
            re = "Dans la moyenne...";
        }
        return  re;
    }
}