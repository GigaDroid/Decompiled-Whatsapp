package com.whatsapp;

import android.app.Dialog;
import android.os.Bundle;
import android.view.WindowManager.LayoutParams;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class jn extends Dialog {
    EditText a;
    private int b;
    final InputMethodManager c;
    private asf d;
    private String e;
    private String f;

    public void onStart() {
        super.onStart();
        a();
        this.a.setText(App.as.c(this.e).a(getContext()));
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        setContentView(2130903175);
        ((TextView) findViewById(2131755626)).setText(this.b);
        ((Button) findViewById(2131755628)).setOnClickListener(new at8(this, null));
        ((Button) findViewById(2131755629)).setOnClickListener(new t(this));
        this.a = (EditText) findViewById(2131755627);
        this.a.setText(this.f);
        aam.a(this.a);
        this.a.addTextChangedListener(new a2y(this));
        LayoutParams attributes = getWindow().getAttributes();
        attributes.width = -1;
        attributes.gravity = 48;
        getWindow().setAttributes(attributes);
    }

    static void b(jn jnVar) {
        jnVar.a();
    }

    static asf a(jn jnVar) {
        return jnVar.d;
    }

    private void a() {
        if (!this.c.isFullscreenMode()) {
            this.c.toggleSoftInput(2, 0);
        }
    }
}
