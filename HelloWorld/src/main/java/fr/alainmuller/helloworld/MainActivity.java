package fr.alainmuller.helloworld;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends Activity {
    // Afficher l'un ou l'autre texte sur l'activité
    boolean alternate = false;
    // Les éléments du layout
    TextView tv;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Instanciation des éléments du layout
        tv = (TextView) findViewById(R.id.tvTitle);
        img = (ImageView) findViewById(R.id.ivLogo);

        // Gestion du click sur l'image
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switchText();
            }
        });

        // Gestion du click sur le bouton (changement d'Activity)
        Button btn1 = (Button) findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getApplicationContext(), "PLOP! =)", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, Step1Activity.class);
                startActivity(intent);
            }
        });
    }

    // Changement du texte affiché
    private void switchText() {
        alternate = !alternate;
        tv.setText(getString(alternate ? R.string.hello_world_alt : R.string.hello_world));
    }
}
