package com.whatsapp;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.ViewGroup;
import com.whatsapp.util.u;

public class aic extends Dialog {
    private final Activity a;
    private final int b;

    protected void onCreate(Bundle bundle) {
        aam.a(getWindow());
        super.onCreate(bundle);
        setContentView(aam.a(getWindow().getLayoutInflater(), this.b, null, false));
        getWindow().setLayout(-1, -1);
    }

    public aic(Activity activity, int i) {
        super(activity, 2131493071);
        this.a = activity;
        this.b = i;
    }

    public void a() {
        onCreate(onSaveInstanceState());
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (App.j == 3) {
            ViewGroup viewGroup = (ViewGroup) findViewById(16908290);
            switch (i) {
                case arj.Toolbar_subtitleTextColor /*24*/:
                    return true;
                case arj.Theme_actionMenuTextAppearance /*25*/:
                    u.d();
                    return true;
                case arj.Theme_colorAccent /*84*/:
                    u.a(viewGroup, this.a, false);
                    return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }
}
