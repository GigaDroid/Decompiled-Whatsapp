package com.whatsapp;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.WindowManager.LayoutParams;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class aij extends aic {
    private EditText c;
    private final String d;
    private k3 e;
    private final int f;
    private final aw7 g;
    private final Activity h;
    private final int i;
    private final int j;
    private final Context k;
    private String l;
    private boolean m;
    private final int n;
    private TextView o;

    static EditText f(aij com_whatsapp_aij) {
        return com_whatsapp_aij.c;
    }

    static int b(aij com_whatsapp_aij) {
        return com_whatsapp_aij.f;
    }

    public aij(Activity activity, int i, String str, aw7 com_whatsapp_aw7, int i2, int i3, int i4) {
        super(activity, 2130903176);
        this.m = true;
        this.h = activity;
        this.k = activity.getBaseContext();
        this.g = com_whatsapp_aw7;
        this.i = i;
        this.f = i2;
        this.n = i3;
        this.j = i4;
        this.d = str;
    }

    static int a(aij com_whatsapp_aij) {
        return com_whatsapp_aij.j;
    }

    static aw7 c(aij com_whatsapp_aij) {
        return com_whatsapp_aij.g;
    }

    static boolean a(aij com_whatsapp_aij, boolean z) {
        com_whatsapp_aij.m = z;
        return z;
    }

    static Activity d(aij com_whatsapp_aij) {
        return com_whatsapp_aij.h;
    }

    static String a(aij com_whatsapp_aij, String str) {
        com_whatsapp_aij.l = str;
        return str;
    }

    public void onStop() {
        super.onStop();
        if (this.m) {
            this.l = this.c.getText().toString();
        }
    }

    public void onStart() {
        super.onStart();
        String str = this.l != null ? this.l : this.d;
        if (this.n != 0) {
            this.c.setHint(this.n);
        }
        this.c.setText(a28.b(str, this.k));
        if (str != null) {
            this.c.selectAll();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((TextView) findViewById(2131755626)).setText(this.i);
        setTitle(this.i);
        ((Button) findViewById(2131755628)).setOnClickListener(new v0(this));
        ((Button) findViewById(2131755629)).setOnClickListener(new atm(this));
        this.o = (TextView) findViewById(2131755632);
        this.c = (EditText) findViewById(2131755631);
        aam.a(this.c);
        if (this.f > 0) {
            this.o.setVisibility(0);
            this.c.setFilters(new InputFilter[]{new aes(this.f)});
        }
        this.c.addTextChangedListener(new hu(this.c, this.o, this.f));
        aam.a(this.c);
        LayoutParams attributes = getWindow().getAttributes();
        attributes.width = -1;
        attributes.gravity = 48;
        getWindow().setAttributes(attributes);
        this.e = new k3(this.h, getWindow().getDecorView());
        this.e.a(new qu(this));
        ((ImageButton) findViewById(2131755630)).setOnClickListener(new gq(this));
        setOnCancelListener(new e8(this));
        getWindow().setSoftInputMode(5);
    }

    static k3 e(aij com_whatsapp_aij) {
        return com_whatsapp_aij.e;
    }
}
