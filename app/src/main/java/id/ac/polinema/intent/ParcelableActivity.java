package id.ac.polinema.intent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import model.User;

import static id.ac.polinema.intent.ParcelableActivity.USER_KEY;

public class ParcelableActivity extends AppCompatActivity {
    public static final String USER_KEY = "User";
    private TextView usernameText;
    private TextView nameText;
    private TextView ageText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parcelable);

        usernameText = findViewById(R.id.input_username);
        nameText = findViewById(R.id.input_name);
        ageText = findViewById(R.id.input_age);

        User u = getIntent().getParcelableExtra(USER_KEY);
        if (u != null) {


            usernameText.setText(u.getUsername());
            nameText.setText(u.getName());
            ageText.setText(Integer.toString(u.getAge()));
        }
    }

    public void handleSubmit(View view) {
        Intent intent = new Intent(this, ProfileParcelableActivity.class);
        startActivity(intent);
    }
}



