package fr.alainmuller.helloworld;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Step1Activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.step1_main);

        final EditText et1 = (EditText) findViewById(R.id.step1_et1);
        Button btn1 = (Button) findViewById(R.id.step1_btn1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(view.getContext(), "Hello " + et1.getText() + "!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Step1Activity.this, NameActivity.class);
                intent.putExtra(getString(R.string.nameToDisplay), String.valueOf(et1.getText()));
                startActivity(intent);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.step1, menu);
        return true;
    }

}
