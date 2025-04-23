package tiil.ntu.advancedui_demo;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

// Chú ý: không import android.R; nếu có, hãy xóa để dùng đúng R của project

public class MainActivity extends AppCompatActivity {
    private BottomNavigationView bottomNav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNav = findViewById(R.id.bot_nav);

        // Xử lý khi chọn lần đầu (select)
        bottomNav.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        int id = item.getItemId();
                        if (id == R.id.mnu_home) {
                            Toast.makeText(MainActivity.this, "Thay HOME", Toast.LENGTH_SHORT).show();
                            // TODO: replace fragment Home
                        }
                        else if (id == R.id.mnu_search) {
                            Toast.makeText(MainActivity.this, "Thay SEARCH", Toast.LENGTH_SHORT).show();
                            // TODO: replace fragment Search
                        }
                        else if (id == R.id.mnu_profile) {
                            Toast.makeText(MainActivity.this, "Thay PROFILE", Toast.LENGTH_SHORT).show();
                            // TODO: replace fragment Profile
                        }
                        else {
                            return false;  // không phải item bạn muốn bắt
                        }
                        return true;  // đã xử lý
                    }
                }
        );

        // Xử lý khi re-select (chọn lại cùng một tab)
        bottomNav.setOnNavigationItemReselectedListener(
                new BottomNavigationView.OnNavigationItemReselectedListener() {
                    @Override
                    public void onNavigationItemReselected(@NonNull MenuItem item) {
                        Toast.makeText(MainActivity.this,
                                "Reselected: " + item.getTitle(),
                                Toast.LENGTH_SHORT).show();
                        // TODO: ví dụ scroll to top, refresh nội dung...
                    }
                }
        );
    }
}
