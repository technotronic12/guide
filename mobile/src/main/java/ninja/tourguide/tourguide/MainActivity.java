package ninja.tourguide.tourguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = getIntent();
        boolean shouldShowErrorMessage = intent.getBooleanExtra("permission", false);

        if (shouldShowErrorMessage) {
            Toast.makeText(this, "Cannot start application without current location permissions", Toast.LENGTH_LONG).show();
        }
    }

    public void openMaps(View view) {
        Intent openMapsActivity = new Intent(MainActivity.this, MapsActivity.class);
//        myIntent.putExtra("key", value); //Optional parameters
        MainActivity.this.startActivity(openMapsActivity);
    }
}
