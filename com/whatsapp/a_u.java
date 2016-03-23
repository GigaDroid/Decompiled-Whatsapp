package com.whatsapp;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

class a_u implements OnClickListener {
    final DeleteAccount a;

    a_u(DeleteAccount deleteAccount) {
        this.a = deleteAccount;
    }

    public void onClick(View view) {
        Intent intent = new Intent(this.a, CountryPicker.class);
        intent.putExtra(CountryPicker.w, this.a.v.getText().toString());
        this.a.startActivityForResult(intent, 0);
        this.a.p.removeTextChangedListener(DeleteAccount.a(this.a));
    }
}
