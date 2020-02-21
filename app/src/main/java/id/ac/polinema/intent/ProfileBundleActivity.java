package id.ac.polinema.intent;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ProfileBundleActivity extends AppCompatActivity {
    private TextView usernameText;
    private TextView nameText;
    private TextView ageText;
    Intent intent = new Intent(this, ProfileBundleActivity.class);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_bundle);

        // TODO: bind here
        usernameText=findViewById(R.id.text_username);
        nameText=findViewById(R.id.text_name);
        ageText=findViewById(R.id.text_age);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            // TODO: display value here
            usernameText.setText(extras.getString( "username"));
            nameText.setText(extras.getString( "name"));
            ageText.setText(String.valueOf(extras.getInt( "age")));
        }
    }

}