package ntu.vd2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
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

        // Ánh xạ các View
        edtNumber1 = findViewById(R.id.edtNumber1);
        edtNumber2 = findViewById(R.id.edtNumber2);
        txtResult = findViewById(R.id.txtResult);
    }

    // Hàm lấy số từ EditText và kiểm tra dữ liệu
    private float getNumber(EditText editText) {
        String input = editText.getText().toString().trim();
        if (input.isEmpty()) {
            return Float.NaN; // Trả về giá trị không hợp lệ nếu ô trống
        }
        return Float.parseFloat(input);
    }

    // Hàm tính tổng
    public void calculateSum(View view) {
        float num1 = getNumber(edtNumber1);
        float num2 = getNumber(edtNumber2);

        if (Float.isNaN(num1) || Float.isNaN(num2)) {
            Toast.makeText(this, "Vui lòng nhập đầy đủ số!", Toast.LENGTH_SHORT).show();
            return;
        }

        float result = num1 + num2;
        txtResult.setText("Kết quả: " + result);
    }

    // Hàm tính hiệu
    public void calculateSubtract(View view) {
        float num1 = getNumber(edtNumber1);
        float num2 = getNumber(edtNumber2);

        if (Float.isNaN(num1) || Float.isNaN(num2)) {
            Toast.makeText(this, "Vui lòng nhập đầy đủ số!", Toast.LENGTH_SHORT).show();
            return;
        }

        float result = num1 - num2;
        txtResult.setText("Kết quả: " + result);
    }

    // Hàm tính tích
    public void calculateMultiply(View view) {
        float num1 = getNumber(edtNumber1);
        float num2 = getNumber(edtNumber2);

        if (Float.isNaN(num1) || Float.isNaN(num2)) {
            Toast.makeText(this, "Vui lòng nhập đầy đủ số!", Toast.LENGTH_SHORT).show();
            return;
        }

        float result = num1 * num2;
        txtResult.setText("Kết quả: " + result);
    }

    // Hàm tính thương
    public void calculateDivide(View view) {
        float num1 = getNumber(edtNumber1);
        float num2 = getNumber(edtNumber2);

        if (Float.isNaN(num1) || Float.isNaN(num2)) {
            Toast.makeText(this, "Vui lòng nhập đầy đủ số!", Toast.LENGTH_SHORT).show();
            return;
        }

        if (num2 == 0) {
            Toast.makeText(this, "Không thể chia cho 0!", Toast.LENGTH_SHORT).show();
            return;
        }

        float result = num1 / num2;
        txtResult.setText("Kết quả: " + result);
    }
}
