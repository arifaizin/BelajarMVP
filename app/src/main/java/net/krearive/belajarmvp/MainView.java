package net.krearive.belajarmvp;

import android.widget.EditText;

/**
 * Created by idn on 4/8/2018.
 */

public interface MainView {
    void updateTextHasil(Double luas);

    void ketikaKosong();

    void ketikaDiisi(EditText edAlas, EditText edTinggi);
}
