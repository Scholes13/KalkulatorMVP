package com.example.mvpapplication.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.mvpapplication.R;
import com.example.mvpapplication.presenter.RumusPresenterImp;
import com.example.mvpapplication.presenter.RumusView;

public class MainActivity extends AppCompatActivity implements RumusView {

    private EditText etPanjang, etLebar;
    private TextView tvHasilkeliling, tvHasilluas;
    private Button btnHitung;
    private RumusPresenterImp rumusPresenterImp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etPanjang = findViewById(R.id.etPanjang);
        etLebar = findViewById(R.id.etLebar);
        tvHasilkeliling = findViewById(R.id.tvHasilkeliling);
        tvHasilluas = findViewById(R.id.tvHasilluas);
        btnHitung = findViewById(R.id.btnHitung);

        rumusPresenterImp = new RumusPresenterImp(this);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double panjang = Double.valueOf(etPanjang.getText().toString());
                Double lebar = Double.valueOf((etLebar.getText().toString()));

                rumusPresenterImp.hitungLuas(panjang, lebar);
                rumusPresenterImp.hitungKeliling(panjang, lebar);
            }
        });
    }

    @Override
    public void hasilLuas(Double hasilLuas) {
        tvHasilluas.setText(hasilLuas.toString());

    }

    @Override
    public void hasilKeliling(Double hasilKeliling) {
        tvHasilkeliling.setText(hasilKeliling.toString());

    }
}