package com.whatsapp;

import android.app.Activity;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBar.LayoutParams;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class akz {
    public static View a(Activity activity, ActionBar actionBar, String str, OnClickListener onClickListener) {
        View a = aam.a(LayoutInflater.from(actionBar.getThemedContext()), 2130903067, null, false);
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        int i = (App.a1() || !aam.a) ? 5 : 3;
        layoutParams.gravity = i;
        actionBar.setCustomView(a, layoutParams);
        ((TextView) a.findViewById(2131755180)).setText(str.toUpperCase());
        a.findViewById(2131755179).setOnClickListener(onClickListener);
        return a;
    }
}
