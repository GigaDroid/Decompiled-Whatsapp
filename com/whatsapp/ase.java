package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.text.TextUtils;
import android.widget.EditText;
import com.whatsapp.util.bq;

class ase implements OnClickListener {
    final EditText a;
    final VerifySms b;

    ase(VerifySms verifySms, EditText editText) {
        this.b = verifySms;
        this.a = editText;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Object trim = this.a.getText().toString().trim();
        if (TextUtils.isEmpty(trim) || trim.length() != VerifySms.k()) {
            this.b.removeDialog(32);
            this.b.showDialog(33);
            if (!DialogToastActivity.f) {
                return;
            }
        }
        this.b.removeDialog(32);
        bq.a(new _k(this.b), new String[]{trim});
    }
}
