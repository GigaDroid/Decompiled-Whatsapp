package com.whatsapp;

import android.content.Context;
import android.database.Cursor;
import android.support.v4.widget.CursorAdapter;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.protocol.co;
import org.v;
import org.whispersystems.at;

class w6 extends CursorAdapter {
    private static final String z;
    final StarredMessagesActivity b;

    static {
        char[] toCharArray = "\u0002\u0018Z{M\f\u0010LPZ6\u0017J@".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = arj.Theme_radioButtonStyle;
                    break;
                case at.g /*1*/:
                    i2 = 125;
                    break;
                case at.i /*2*/:
                    i2 = 35;
                    break;
                case at.o /*3*/:
                    i2 = 36;
                    break;
                default:
                    i2 = 63;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r5, android.view.View r6, android.view.ViewGroup r7) {
        /*
        r4 = this;
        r2 = com.whatsapp.DialogToastActivity.f;
        r3 = r4.a(r5);
        if (r6 != 0) goto L_0x0012;
    L_0x0008:
        r0 = r7.getContext();
        r0 = com.whatsapp.ConversationRowsActivity.a(r0, r3);
        if (r2 == 0) goto L_0x0058;
    L_0x0012:
        r6 = (com.whatsapp.ConversationRow) r6;
        r0 = 1;
        r6.a(r3, r0);
    L_0x0018:
        r0 = 2131755901; // 0x7f10037d float:1.9142694E38 double:1.053227356E-314;
        r0 = r6.findViewById(r0);
        r0 = (android.widget.ImageView) r0;
        r1 = r3.k;
        r1 = r1.a;
        if (r1 == 0) goto L_0x002f;
    L_0x0027:
        r1 = com.whatsapp.App.as;
        r1 = r1.e();
        if (r2 == 0) goto L_0x0041;
    L_0x002f:
        r2 = com.whatsapp.App.as;
        r1 = r3.k;
        r1 = r1.c;
        r1 = com.whatsapp.qm.i(r1);
        if (r1 == 0) goto L_0x0053;
    L_0x003b:
        r1 = r3.t;
    L_0x003d:
        r1 = r2.b(r1);
    L_0x0041:
        r2 = r4.b;
        r2 = com.whatsapp.StarredMessagesActivity.b(r2);
        r2.b(r1, r0);
        r0 = new com.whatsapp.zn;
        r0.<init>(r4, r3);
        r6.setOnClickListener(r0);
        return r6;
    L_0x0053:
        r1 = r3.k;
        r1 = r1.c;
        goto L_0x003d;
    L_0x0058:
        r6 = r0;
        goto L_0x0018;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.w6.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public int getViewTypeCount() {
        return 21;
    }

    public Object getItem(int i) {
        return a(i);
    }

    public w6(StarredMessagesActivity starredMessagesActivity) {
        this.b = starredMessagesActivity;
        super(starredMessagesActivity, null);
    }

    public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
        throw new AssertionError();
    }

    public co a(int i) {
        Cursor cursor = getCursor();
        if (cursor == null) {
            return null;
        }
        int columnIndex = cursor.getColumnIndex(z);
        cursor.moveToPosition(i);
        return App.aK.a(cursor, cursor.getString(columnIndex));
    }

    public int getItemViewType(int i) {
        return ConversationRowsActivity.b(a(i));
    }

    public void bindView(View view, Context context, Cursor cursor) {
        throw new AssertionError();
    }
}
