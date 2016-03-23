package com.whatsapp;

import android.support.v7.widget.ActionMenuView;
import android.view.View;
import android.view.ViewGroup.OnHierarchyChangeListener;
import org.v;
import org.whispersystems.at;

class aq1 implements OnHierarchyChangeListener {
    private static final String z;
    final ActionMenuView a;
    final BidiToolbar b;

    static {
        char[] toCharArray = "\u0001\u001fz|I\t\u00150}S\u0010\u0001q|RN\u0007) Q\t\u0015ykRN0}zO\u000f\u001fSkH\u0015!lkU\u0005\u001fjkT".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 96;
                    break;
                case at.g /*1*/:
                    i2 = 113;
                    break;
                case at.i /*2*/:
                    i2 = 30;
                    break;
                case at.o /*3*/:
                    i2 = 14;
                    break;
                default:
                    i2 = 38;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void onChildViewAdded(View view, View view2) {
        if (view2.getClass().getName().startsWith(z)) {
            this.a.removeView(view2);
        }
    }

    public void onChildViewRemoved(View view, View view2) {
    }

    aq1(BidiToolbar bidiToolbar, ActionMenuView actionMenuView) {
        this.b = bidiToolbar;
        this.a = actionMenuView;
    }
}
