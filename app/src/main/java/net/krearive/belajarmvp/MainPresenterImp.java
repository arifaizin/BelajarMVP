package net.krearive.belajarmvp;

import android.widget.EditText;

/**
 * Created by idn on 4/8/2018.
 */

public class MainPresenterImp implements MainPresenter {
    //1 Buat Constructor
    MainView mainView;
    //klik kanan > generate > constructor

    public MainPresenterImp(MainView mainView) {
        this.mainView = mainView;
    }

    //2 Implementasikan MainPresenter
    @Override
    public void hitungLuas(Double alas, Double tinggi) {
        Double luas = alas * tinggi / 2;
        mainView.updateTextHasil(luas);
    }

    @Override
    public void cekData(EditText edAlas, EditText edtinggi) {
        if (edAlas.getText().toString().isEmpty() || edtinggi.getText().toString().isEmpty()){
            mainView.ketikaKosong();
        } else {
            mainView.ketikaDiisi(edAlas, edtinggi);
        }
    }


}
