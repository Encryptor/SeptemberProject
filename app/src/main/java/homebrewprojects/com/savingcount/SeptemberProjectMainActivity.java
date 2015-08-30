package homebrewprojects.com.savingcount;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;


public class SeptemberProjectMainActivity extends ActionBarActivity {

    public TextView txtMake;
    public TextView txtModel;
    public TextView txtHp;
    public TextView txtZeroToSixty;
    public TextView txtPrice;
    public ImageView imageViewCar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_september_project_main);

        txtMake = (TextView) findViewById(R.id.txt_make);
        txtModel = (TextView) findViewById(R.id.txt_model);
        txtHp = (TextView) findViewById(R.id.txt_hp);
        txtZeroToSixty = (TextView) findViewById(R.id.txt_zero_sixty);
        txtPrice = (TextView) findViewById(R.id.txt_price);
        imageViewCar = (ImageView) findViewById(R.id.imageViewCar);

        if(findViewById(R.id.fragment_container) != null) {

            // to avoid overlapping fragments
            if (savedInstanceState != null) {
                return;
            }

            
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_september_project_main, menu);
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
}
