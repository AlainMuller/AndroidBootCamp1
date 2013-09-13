package fr.alainmuller.helloworld;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;

public class NameActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.name_main);

        // On récupère les paramètres du bundle (ie. paramètres supplémentaires passés à l'Intent)
        Bundle extras = getIntent().getExtras();
        // Affichage de la chaine par défaut
        String nameToDisplay = getString(R.string.hello);

        // Si la clé "name" existe dans le bundle, on va en chercher la valeur
        if (extras != null && extras.containsKey(getString(R.string.nameToDisplay)))
            nameToDisplay += " " + getIntent().getStringExtra(getString(R.string.nameToDisplay)) + "!";
        TextView tv1 = (TextView) findViewById(R.id.name_tv1);

        // On affiche le texte par défaut et s'il existe, le paramètre name.
        tv1.setText(nameToDisplay);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.name, menu);
        return true;
    }

}
