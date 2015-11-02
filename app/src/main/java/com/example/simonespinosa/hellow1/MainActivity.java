package com.example.simonespinosa.hellow1;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Editable;

import android.database.MatrixCursor;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;

import datas.MyData;

public class MainActivity extends AppCompatActivity {


    // test modification du fichier
    // test2

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //setContentView(R.layout.test_layout);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void bt_test_onclick(View view)
    {
        String Nom = ((EditText) findViewById( R.id.TxtNom )).getText().toString();
        String Prenom = ((EditText) findViewById( R.id.TxtPrenom)).getText().toString();

        TextView QI = (TextView)findViewById( R.id.textViewQi );

        if (  Nom.equals("Salzstein") ||  Nom.equals("salzstein") )
        {
            QI.setText("Qi d'une huitre");
        }
        else if ( Prenom.equals("Simon") ||  Prenom.equals("simon") )
        {
            QI.setText("Vous êtes un génie");
        }
        else {
            QI.setText("Dans la moyenne...");
        }
    }

    public void bt2_onclick(View view) {

        String Nom = ((EditText) findViewById(R.id.TxtNom)).getText().toString();
        String Prenom = ((EditText) findViewById(R.id.TxtPrenom)).getText().toString();

        QIChecker _qi = new QIChecker2();
        String re = _qi.checkQI(Nom, Prenom);

        TextView QI = (TextView) findViewById(R.id.textViewQi);
        QI.setText(re);
    }

    public void bttab_onclick(View view) {

        String Nom = ((EditText) findViewById(R.id.TxtNom)).getText().toString();
        String Prenom = ((EditText) findViewById(R.id.TxtPrenom)).getText().toString();

        MyData _datas = MyData.get_instance();
        _datas.mesCouillons.get(0).Nom = Nom;
        _datas.mesCouillons.get(0).Prenom = Prenom;


        // afficher une activité
        Intent _intent = new Intent(this, LoginActivity.class);
        startActivity(_intent);


        String[] columns = new String[] { "_id", "col1", "col2" };
        MatrixCursor matrixCursor= new MatrixCursor(columns);
        startManagingCursor(matrixCursor);
        matrixCursor.addRow(new Object[]{1, "col1:ligne1", "col2:ligne1"});
        matrixCursor.addRow(new Object[] { 2,"col1:ligne2","col2:ligne2" });




        /*
        for ( int i = 0 ; i < _datas.mesCouillons.size() ; i ++)
        {
            matrixCursor.addRow(new Object[] { i+3, _datas.mesCouillons.get(i).Prenom,  _datas.mesCouillons.get(i).Nom });
        }

        String[] from = new String[] {"col1", "col2"};

        int[] to = new int[] { R.id.textViewCol1, R.id.textViewCol2};

        SimpleCursorAdapter adapter = new SimpleCursorAdapter(this, R.layout.row_item, matrixCursor, from, to, 0);

        ListView lv = (ListView) findViewById(R.id.lv);
        lv.setAdapter(adapter);*/
    }
}
