package tiil.ntu.advancedui_demo;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottomNav;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Timf
        bottomNav = findViewById(R.id.bot_nav);
        //Lang nghe
        bottomNav.setOnNavigationItemReselectedListener(new BottomNavigationView.OnNavigationItemSelectedListener()
                
    }
}