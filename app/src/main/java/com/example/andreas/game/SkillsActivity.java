package com.example.andreas.game;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class SkillsActivity extends AppCompatActivity {
    int numberOfCheckboxesChecked;
   // string API = "http://afgamingserver.azurewebsites.net/api/gaming";
    @Override
    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.activity_skills);
        final int checkBoxCount = 0;

        final CheckBox Konfliktlösningsförmåga = (CheckBox) findViewById(R.id.Konfliktlösningsförmåga);
        final CheckBox Kommunikationsförmåga = (CheckBox) findViewById(R.id.Kommunikationsförmåga);
        final CheckBox Sammarbetsförmåga = (CheckBox) findViewById(R.id.Sammarbetsförmåga);
        final CheckBox Flexibel = (CheckBox) findViewById(R.id.Flexibel);
        final CheckBox Tålamod = (CheckBox) findViewById(R.id.Tålamod);
        final CheckBox Problemlösning = (CheckBox) findViewById(R.id.Problemlösning);
        final CheckBox Fokus = (CheckBox) findViewById(R.id.Fokus);
        final CheckBox Prioriteringsförmåga = (CheckBox) findViewById(R.id.Prioriteringsförmåga);
        final CheckBox Besluttagningförmåga = (CheckBox) findViewById(R.id.Besluttagningförmåga);
        final CheckBox Initiativtagare = (CheckBox) findViewById(R.id.Initiativtagare);
        final CheckBox Ansvarstagande = (CheckBox) findViewById(R.id.Ansvarstagande);
        final CheckBox Ledarskapsförmåga = (CheckBox) findViewById(R.id.Ledarskapsförmåga);


        Button clickMe = (Button) findViewById(R.id.getGame);

        clickMe.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                StringBuffer OUTPUT = new StringBuffer();
                OUTPUT.append("First skill:").append(Konfliktlösningsförmåga.isChecked());
                OUTPUT.append("First skill:").append(Kommunikationsförmåga.isChecked());
                OUTPUT.append("First skill:").append(Sammarbetsförmåga.isChecked());
                OUTPUT.append("First skill:").append(Flexibel.isChecked());
                OUTPUT.append("First skill:").append(Tålamod.isChecked());
                OUTPUT.append("First skill:").append(Problemlösning.isChecked());
                OUTPUT.append("First skill:").append(Fokus.isChecked());
                OUTPUT.append("First skill:").append(Prioriteringsförmåga.isChecked());
                OUTPUT.append("First skill:").append(Besluttagningförmåga.isChecked());
                OUTPUT.append("First skill:").append(Initiativtagare.isChecked());
                OUTPUT.append("First skill:").append(Ansvarstagande.isChecked());
                OUTPUT.append("First skill:").append(Ledarskapsförmåga.isChecked());

                //Toast.makeText(SkillsActivity.this, OUTPUT.toString(),Toast.LENGTH_LONG).show();
                if(Ansvarstagande.isChecked() && Initiativtagare.isChecked()){

                   Toast.makeText(SkillsActivity.this,"Cs:Go och LoL",Toast.LENGTH_LONG).show();


                }

                if(Tålamod.isChecked() && Konfliktlösningsförmåga.isChecked() || Tålamod.isChecked() || Konfliktlösningsförmåga.isChecked()){

                    Toast.makeText(SkillsActivity.this,"Du letar efter någon som spelar WoW eller LoL",Toast.LENGTH_LONG).show();
                }

                if (Kommunikationsförmåga.isChecked() && Tålamod.isChecked()){
                    Toast.makeText(SkillsActivity.this,"Du letar efter någon som spelar Cs:go eller WoW ",Toast.LENGTH_LONG).show();

                }





            }

        });

       /* final Button button = (Button) findViewById(R.id.Skill1);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // your handler code here
                // button.setText("Win");
                startActivity(new Intent(getApplicationContext(),GamesActivity.class));
            }
        });
     */
    }



    }
