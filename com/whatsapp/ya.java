package com.whatsapp;

import android.content.Intent;
import android.view.View;
import com.whatsapp.util.ap;

class ya extends ap {
    final About b;

    public void a(View view) {
        this.b.startActivity(new Intent(this.b, Licenses.class));
    }

    ya(About about) {
        this.b = about;
    }
}
