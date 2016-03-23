package com.whatsapp;

import android.os.Bundle;
import android.support.v7.widget.SearchView.OnQueryTextListener;
import org.v;
import org.whispersystems.at;

class alx implements OnQueryTextListener {
    private static final String z;
    final StarredMessagesActivity a;

    static {
        char[] toCharArray = "(\nRb;".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 89;
                    break;
                case at.g /*1*/:
                    i2 = 127;
                    break;
                case at.i /*2*/:
                    i2 = 55;
                    break;
                case at.o /*3*/:
                    i2 = 16;
                    break;
                default:
                    i2 = 66;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    alx(StarredMessagesActivity starredMessagesActivity) {
        this.a = starredMessagesActivity;
    }

    public boolean onQueryTextSubmit(String str) {
        return false;
    }

    public boolean onQueryTextChange(String str) {
        StarredMessagesActivity.a(this.a, str);
        StarredMessagesActivity.a(this.a, ael.h(str));
        Bundle bundle = new Bundle();
        bundle.putString(z, str);
        this.a.getSupportLoaderManager().restartLoader(0, bundle, this.a);
        return false;
    }
}
