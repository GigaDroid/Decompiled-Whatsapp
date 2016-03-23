package com.whatsapp;

import android.app.Activity;
import android.support.v7.view.ActionMode;
import android.view.Menu;
import com.whatsapp.util.Log;
import java.util.Map;
import org.v;
import org.whispersystems.at;

class adj extends adp {
    private static final String z;
    final StarredMessagesActivity o;

    static {
        char[] toCharArray = "\u0014GH\u000f.\u0002W\u0006\u000e9\u000bVJ\t5\b]L\u00138\u0002W".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = arj.Theme_checkedTextViewStyle;
                    break;
                case at.g /*1*/:
                    i2 = 51;
                    break;
                case at.i /*2*/:
                    i2 = 41;
                    break;
                case at.o /*3*/:
                    i2 = 125;
                    break;
                default:
                    i2 = 92;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void f() {
        if (this.o.v != null) {
            this.o.v.finish();
        }
    }

    public Map a() {
        return this.o.u;
    }

    public void onDestroyActionMode(ActionMode actionMode) {
        Log.i(z);
        super.onDestroyActionMode(actionMode);
        this.o.u = null;
        StarredMessagesActivity.f(this.o).notifyDataSetChanged();
        this.o.v = null;
    }

    public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        super.onPrepareActionMode(actionMode, menu);
        if (!(this.o.u == null || this.o.u.size() == 0)) {
            if (this.o.u.size() == 1) {
                String c = qm.c(b());
                if (c != null) {
                    if (App.as.b(c).l == null) {
                        this.j.setVisible(true);
                        this.d.setVisible(true);
                    }
                    this.l.setVisible(true);
                    this.l.setTitle(this.i.getResources().getString(2131231445, new Object[]{r0.i()}));
                    this.k.setVisible(true);
                    this.k.setTitle(this.i.getResources().getString(2131230866, new Object[]{r0.i()}));
                }
            }
            this.j.setVisible(false);
            this.d.setVisible(false);
        }
        return true;
    }

    adj(StarredMessagesActivity starredMessagesActivity, Activity activity) {
        this.o = starredMessagesActivity;
        super(activity);
    }
}
