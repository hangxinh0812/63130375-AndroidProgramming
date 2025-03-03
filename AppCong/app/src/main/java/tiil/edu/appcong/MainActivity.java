package ntu.vd2;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText edtNumber1, edtNumber2;
    private TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Ánh xạ các View từ layout
        edtNumber1 = findViewById(R.id.edtNumber1);
        edtNumber2 = findViewById(R.id.edtNumber2);
        txtResult = findViewById(R.id.txtResult);
    }

    // Hàm xử lý khi bấm nút "Tính Tổng"
    public void calculateSum(View view) {
        String strNum1 = edtNumber1.getText().toString().trim();
        String strNum2 = edtNumber2.getText().toString().trim();

        // Kiểm tra nếu ô nhập trống
        if (strNum1.isEmpty() || strNum2.isEmpty()) {
            Toast.makeText(this, "Vui lòng nhập đầy đủ số!", Toast.LENGTH_SHORT).show();
            return;
        }

        // Chuyển đổi sang số thực và tính tổng
        try {
            float num1 = Float.parseFloat(strNum1);
            float num2 = Float.parseFloat(strNum2);
            float sum = num1 + num2;
            txtResult.setText("Kết quả: " + sum);
        } catch (NumberFormatException e) {
            Toast.makeText(this, "Vui lòng nhập số hợp lệ!", Toast.LENGTH_SHORT).show();
        }
    }
}
