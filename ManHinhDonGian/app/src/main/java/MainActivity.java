package tiil.edu.manhinhdongian;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Ánh xạ button và thêm sự kiện chuyển màn hình
        Button btnMH1 = findViewById(R.id.btnMH1);
        Button btnMH2 = findViewById(R.id.btnMH2);

        btnMH1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MH1Activity.class);
                startActivity(intent);
            }
        });

        btnMH2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MH2Activity.class);
                startActivity(intent);
            }
        });
    }
}
