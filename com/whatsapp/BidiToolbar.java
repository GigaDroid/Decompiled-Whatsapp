package com.whatsapp;

import android.content.Context;
import android.support.v7.view.ActionBarPolicy;
import android.support.v7.widget.ActionMenuView;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import org.v;
import org.whispersystems.at;

public class BidiToolbar extends Toolbar {
    private static final String z;

    static {
        char[] toCharArray = "\t\u0000qdQ\u0001\n;eK\u0018\u001ezdJF\u0018\"8I\u0001\nrsJF/vbW\u0007\u0000XsP\u001d>gsM\r\u0000asL".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = arj.Theme_editTextStyle;
                    break;
                case at.g /*1*/:
                    i2 = 110;
                    break;
                case at.i /*2*/:
                    i2 = 21;
                    break;
                case at.o /*3*/:
                    i2 = 22;
                    break;
                default:
                    i2 = 62;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public BidiToolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    private void a(View view, int i) {
        boolean z = DialogToastActivity.f;
        if ((view instanceof ViewGroup) && view.getId() != 2131755178) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            int i2 = 0;
            while (i2 < childCount) {
                View childAt = viewGroup.getChildAt(i2);
                childAt.layout(i - childAt.getRight(), childAt.getTop(), i - childAt.getLeft(), childAt.getBottom());
                a(childAt, childAt.getRight() - childAt.getLeft());
                i2++;
                if (z) {
                    return;
                }
            }
        }
    }

    public BidiToolbar(Context context) {
        super(context);
    }

    public void addView(View view, LayoutParams layoutParams) {
        if (!(!(view instanceof ActionMenuView) || ActionBarPolicy.get(getContext()).showsOverflowMenuButton() || (getResources().getConfiguration().screenLayout & 15) == 4)) {
            ActionMenuView actionMenuView = (ActionMenuView) view;
            if (actionMenuView.getChildCount() > 0 && actionMenuView.getChildAt(0).getClass().getName().startsWith(z)) {
                actionMenuView.removeViewAt(0);
            }
            actionMenuView.setOnHierarchyChangeListener(new aq1(this, actionMenuView));
        }
        super.addView(view, layoutParams);
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (App.av && !aam.a) {
            a(this, i3 - i);
        }
    }

    public BidiToolbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
