package android.example.findlocation.activities.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.example.findlocation.App;
import android.example.findlocation.R;
import android.example.findlocation.activities.fingerprinting.FingerprintingScreenActivity;
import android.example.findlocation.activities.proximity.ProximityScreenActivity;
import android.example.findlocation.activities.sensors.SensorInformationActivity;
import android.example.findlocation.activities.trilateration.TrilaterationScreenActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Screen with options "Analysis" and "Find location of device"
 */
public class MainPageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //TODO: Start Service

        //TODO: Bind to Service

        //TODO: Start retrieving Data every 5 seconds

        setContentView(R.layout.activity_second);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        startScanningData();
        enableFingerprinting();
        startProximity();
        startTrilateration();
    }

    public void startScanningData(){
        final Intent scanStartIntent = new Intent(this, SensorInformationActivity.class);
        Button scanButton = (Button) findViewById(R.id.scanButtonId);
        scanButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(scanStartIntent);
            }
        });
    }

    public void enableFingerprinting(){
        final Intent fingerprintingIntent = new Intent(this, FingerprintingScreenActivity.class);
        Button mFingerprintingButton = findViewById(R.id.fingerprintButtonId);
        mFingerprintingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(fingerprintingIntent);
            }
        });
    }

    public void startProximity(){
        final Intent startProximityIntent = new Intent(this, ProximityScreenActivity.class);
        Button mProximityButton = findViewById(R.id.proximityButtonId);
        mProximityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(startProximityIntent);
            }
        });
    }

    public void startTrilateration(){
        final Intent mStartTrilaterationIntent = new Intent(this, TrilaterationScreenActivity.class);
        Button mTrilaterationButton = findViewById(R.id.trilaterationButtonId);
        mTrilaterationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(mStartTrilaterationIntent);
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //TODO: Destroy Service
        // The Service must only be active while we are handling scanning
    }
}
