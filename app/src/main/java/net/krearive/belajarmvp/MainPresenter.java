package net.krearive.belajarmvp;

import android.widget.EditText;

/**
 * Created by idn on 4/8/2018.
 */

public interface MainPresenter {
    void hitungLuas(Double alas, Double tinggi);

    void cekData(EditText edAlas, EditText edTinggi);
}
