package com.whatsapp;

import android.support.v7.widget.PopupMenu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import org.v;
import org.whispersystems.at;

class ano implements OnClickListener {
    private static final String z;
    final DeleteAccountFeedback a;
    final TextView b;
    final String[] c;

    static {
        char[] toCharArray = ":r^\u0019~\fqK\u0018b<x".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 83;
                    break;
                case at.g /*1*/:
                    i2 = 28;
                    break;
                case at.i /*2*/:
                    i2 = 46;
                    break;
                case at.o /*3*/:
                    i2 = arj.Theme_spinnerStyle;
                    break;
                default:
                    i2 = 10;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void onClick(View view) {
        boolean z = DialogToastActivity.f;
        DeleteAccountFeedback.a(this.a).clearFocus();
        ((InputMethodManager) this.a.getSystemService(z)).hideSoftInputFromWindow(this.a.getCurrentFocus().getWindowToken(), 0);
        PopupMenu popupMenu = new PopupMenu(this.a, this.a.findViewById(2131755602));
        int i = 0;
        while (i < this.c.length) {
            popupMenu.getMenu().add(0, i, 0, this.c[i]);
            i++;
            if (z) {
                break;
            }
        }
        popupMenu.setOnMenuItemClickListener(new a4b(this));
        popupMenu.show();
    }

    ano(DeleteAccountFeedback deleteAccountFeedback, String[] strArr, TextView textView) {
        this.a = deleteAccountFeedback;
        this.c = strArr;
        this.b = textView;
    }
}
