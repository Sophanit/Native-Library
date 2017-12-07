package rxandroid.androidapp.com.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv = (TextView) findViewById(R.id.sample_text);
        tv.setText(NativeLibrary.stringFromJNI());
        Toast.makeText(this, "" + NativeLibrary.getMyNewString(), Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "" + NativeLibrary.stringFromJNI(), Toast.LENGTH_SHORT).show();
    }
}
