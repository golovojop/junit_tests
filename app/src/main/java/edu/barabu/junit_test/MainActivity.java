package edu.barabu.junit_test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView tv;
    EditText etA, etB;
    Button btnAdd, btnSub, btnMul, btnDiv;
    Calculator calc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView)findViewById(R.id.result);
        etA = (EditText)findViewById(R.id.etA);
        etB = (EditText)findViewById(R.id.etB);
        calc = new Calculator();

        btnAdd = (Button)findViewById(R.id.btnAdd);
        btnSub = (Button)findViewById(R.id.btnSub);
        btnMul = (Button)findViewById(R.id.btnMul);
        btnDiv = (Button)findViewById(R.id.btnDiv);

        btnAdd.setOnClickListener(this);
        btnSub.setOnClickListener(this);
        btnMul.setOnClickListener(this);
        btnDiv.setOnClickListener(this);

        tv.setText("JUNIT tests");
    }

    public void onClick(View v) {

        int[] data;

        // по id определеяем кнопку, вызвавшую этот обработчик
        switch (v.getId()) {
            case R.id.btnAdd:
                // кнопка Add
                data = getData();
                tv.setText("" + calc.add(data[0], data[1]));
                break;
            case R.id.btnSub:
                // кнопка Sub
                data = getData();
                tv.setText("" + calc.sub(data[0], data[1]));
                break;
            case R.id.btnMul:
                // кнопка Sub
                data = getData();
                tv.setText("" + calc.mul(data[0], data[1]));
                break;
            case R.id.btnDiv:
                // кнопка Sub
                data = getData();
                tv.setText("" + calc.div(data[0], data[1]));
                break;
        }
    }

    /**
     * TODO: Get input data
     * @return Input data in array
     */
    private int[] getData() {
        int[] data = {0, 0};
        data[0] = Integer.parseInt(etA.getText().toString());
        data[1] = Integer.parseInt(etB.getText().toString());
        return data;
    }

}
