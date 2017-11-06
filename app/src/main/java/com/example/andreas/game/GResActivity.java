package com.example.andreas.game;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import static com.example.andreas.game.GamesActivity.game;
import static com.example.andreas.game.GamesActivity.buttButt;
import static com.example.andreas.game.GamesActivity.toggleFem;
import static com.example.andreas.game.GamesActivity.toggleFyra;
import static com.example.andreas.game.GamesActivity.toggleSex;
import static com.example.andreas.game.GamesActivity.toggleTre;
import static com.example.andreas.game.GamesActivity.toggleTva;
import static com.example.andreas.game.GamesActivity.toggleEtt;


public class GResActivity extends AppCompatActivity {
    TextView textView9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gres);
        String spelSkills;
        game = game.toLowerCase();

        switch (game){
            case "world of warcraft":
                spelSkills = "Du bör ha dessa kompetenser:\nTålamod\nKommunikationsfärdigheter\nLedarskapsförmågor";
                break;
            case "league of legends":
                spelSkills = "Du bör ha dessa kompetenser:\nNormal\nLång\nSmal";
                break;
            case "counter strike":
                spelSkills = "Du bör ha dessa kompetenser:\n \nStark\nSnygg\nSmart";
                break;
            default:
                spelSkills = "Du har nog stavat fel!";
        }

        textView9 = (TextView) findViewById(R.id.textView9);
        textView9.setText(Resultat(toggleEtt, toggleTva, toggleTre, toggleFyra, toggleFem, toggleSex)+ /*"\n" + */buttButt + "\n" +"\n" +"\n" +spelSkills);



    }

    public static String Resultat(String toggleEtt, String toggleTva, String toggleTre, String toggleFyra, String toggleFem, String toggleSex) {
        String result="";

        if (toggleEtt.equals("Ja")){
            result = result + "Spelaren blir lätt stressad";
        }
        else {
            result = result + "Du har bra stresstålighet";
        }
        if (toggleTva.equals("Ja")){
            result = result + "\nDu har en ledaregenskaper";
        }
        else {
           // result = result + "\nSpelaren är inte en ledare";
        }
        /*if (toggleTre.equals("Ja")){
            result = result + "\nSpelaren har skapat ett lag";
        }
        else {
            result = result + "\nSpelaren har inte skapat ett lag";
        }*/
        if (toggleFyra.equals("Spelar i lag")){
            result = result + "\nDu har enklare för lagarbete";
        }
        else {
            result = result + "\nDu jobbar helst ensam";
        }
        /*if (toggleFem.equals("Ja")){
            result = result + "\nHar deltagit i en turnering";
        }
        else {
            result = result + "\nHar inte spelat i en turnering";
        }*/
        /*if (toggleSex.equals("Ja")){
            result = result + "\nSpelaren spelar flera roller";
        }
        else {
            result = result + "\nSpelaren spelar en roll";
        }*/


        return result;
    }
}
