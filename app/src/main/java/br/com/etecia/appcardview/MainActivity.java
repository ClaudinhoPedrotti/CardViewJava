package br.com.etecia.appcardview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.ToolbarWidgetWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Toolbar toolbar = (Toolbar) findViewById(R.id.Toolbar);
        setSupportActionBar(toolbar);

        getActionBar().setTitle("Voltar");
        getSupportActionBar().setIcon(R.drawable.ic_arrow_left);

    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_principal, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case R.id.mCompartilhar:
                startActivity(new Intent(MainActivity.this,CompartilharActivity.class));
                break;
            case R.id.mConfiguracoes:
                startActivity(new Intent(MainActivity.this,ConfigurarActivity.class));
                break;
            case R.id.mFavoritos:
                startActivity(new Intent(MainActivity.this,FavoritosActivity.class));
                break;
            case R.id.mSobre:
                startActivity(new Intent(MainActivity.this, SobreActivity.class));
                break;
        }



        return super.onOptionsItemSelected(item);
    }
}
