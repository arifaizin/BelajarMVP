package net.krearive.belajarmvp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements MainView {

    //1 kenalin
    EditText edAlas, edtinggi;
    Button btnHitung;
    TextView tvHasil;
    MainPresenterImp presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //2 sambungin
        edAlas = (EditText) findViewById(R.id.ed_alas);
        edtinggi = findViewById(R.id.ed_tinggi);
        btnHitung = findViewById(R.id.btn_hitung);
        tvHasil = findViewById(R.id.tv_hasil);

        presenter = new MainPresenterImp(this);

        //3 ngapain
        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //setelah sholat

                //cekdata
                //fungsi (cekData()
                //respon ketikaKosong() sama ketikaDiiisi()

                presenter.cekData(edAlas, edtinggi);

//                hitungLuas(alas, tinggi);
//                 Double luas = alas * tinggi / 2;
//                 tvHasil.setText(luas.toString());
            }
        });
    }

//    private void hitungLuas(Double alas, Double tinggi) {
//        Double luas = alas * tinggi;
//        updateTextHasil(luas);
//    }

    @Override
    public void updateTextHasil(Double luas) {
        tvHasil.setText(luas.toString());
    }

    @Override
    public void ketikaKosong() {
        Toast.makeText(MainActivity.this, "Harap diisi", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void ketikaDiisi(EditText edAlas, EditText edTinggi) {
        Double alas = Double.valueOf(edAlas.getText().toString());
        Double tinggi = Double.valueOf(edtinggi.getText().toString());
        Toast.makeText(MainActivity.this, "Sudah diisi", Toast.LENGTH_SHORT).show();
        presenter.hitungLuas(alas, tinggi);
    }
}
