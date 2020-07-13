package android.example.findlocation.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.example.findlocation.R;
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
        setContentView(R.layout.activity_second);
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
        final Intent fingerprintingIntent = new Intent(this, FingerprintingActivity.class);
        Button mFingerprintingButton = findViewById(R.id.fingerprintButtonId);
        mFingerprintingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(fingerprintingIntent);
            }
        });
    }

    public void startProximity(){
        final Intent startProximityIntent = new Intent(this,ProximityScreenActivity.class);
        Button mProximityButton = findViewById(R.id.proximityButtonId);
        mProximityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(startProximityIntent);
            }
        });
    }

    public void startTrilateration(){
        final Intent mStartTrilaterationIntent = new Intent(this,TrilaterationScreenActivity.class);
        Button mTrilaterationButton = findViewById(R.id.trilaterationButtonId);
        mTrilaterationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(mStartTrilaterationIntent);
            }
        });
    }
}
