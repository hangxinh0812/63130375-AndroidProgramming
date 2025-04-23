package tiil.ntu.advancedui_demo;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {
    private BottomNavigationView bottomNav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNav = findViewById(R.id.bot_nav);

        // Lắng nghe khi chọn item lần đầu
        bottomNav.setOnItemSelectedListener(
                new NavigationBarView.OnItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.mnu_home:
                                Toast.makeText(MainActivity.this, "Home", Toast.LENGTH_SHORT).show();
                                return true;
                            case R.id.mnu_search:
                                Toast.makeText(MainActivity.this, "Search", Toast.LENGTH_SHORT).show();
                                return true;
                            case R.id.mnu_profile:
                                Toast.makeText(MainActivity.this, "Profile", Toast.LENGTH_SHORT).show();
                                return true;
                            default:
                                return false;
                        }
                    }
                }
        );

        // (Tùy chọn) Lắng nghe khi tái chọn cùng một item
        bottomNav.setOnItemReselectedListener(
                new NavigationBarView.OnItemReselectedListener() {
                    @Override
                    public void onNavigationItemReselected(@NonNull MenuItem item) {
                        Toast.makeText(MainActivity.this,
                                "Reselected: " + item.getTitle(),
                                Toast.LENGTH_SHORT).show();
                    }
                }
        );
    }
}
