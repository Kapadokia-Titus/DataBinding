package kapadokia.nyandoro.mydatabinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import kapadokia.nyandoro.mydatabinding.databinding.ActivityMainBinding;
import kapadokia.nyandoro.mydatabinding.model.User;

public class MainActivity extends AppCompatActivity {

    // create an instance of the user
    private User user;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding databinding= DataBindingUtil.setContentView(this, R.layout.activity_main);

        user = new User();
        user.setUsername("Kapadokia");
        user.setEmail("Kapadokia@mail.com");

        databinding.setUser(user);
    }
}