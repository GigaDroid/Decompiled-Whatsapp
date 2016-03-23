package com.whatsapp;

import android.widget.Filter;
import android.widget.Filter.FilterResults;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import org.v;
import org.whispersystems.at;

class a37 extends Filter {
    private static final String z;
    final av7 a;

    static {
        char[] toCharArray = "VN=\rdVU \u001fwTF>\u001ckA".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 53;
                    break;
                case at.g /*1*/:
                    i2 = 33;
                    break;
                case at.i /*2*/:
                    i2 = 83;
                    break;
                case at.o /*3*/:
                    i2 = 121;
                    break;
                default:
                    i2 = 5;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    protected FilterResults performFiltering(CharSequence charSequence) {
        FilterResults filterResults = new FilterResults();
        try {
            ArrayList b = ContactsFragment.b(this.a.a, charSequence);
            filterResults.values = b;
            filterResults.count = b.size();
        } catch (Throwable e) {
            Log.b(z, e);
        }
        return filterResults;
    }

    a37(av7 com_whatsapp_av7, yn ynVar) {
        this(com_whatsapp_av7);
    }

    protected void publishResults(CharSequence charSequence, FilterResults filterResults) {
        if (!ContactsFragment.d(this.a.a).isEmpty()) {
            ContactsFragment.a(this.a.a, charSequence);
            ContactsFragment.a(this.a.a, ael.h(charSequence == null ? null : charSequence.toString()));
            ContactsFragment.g(this.a.a).clear();
            ContactsFragment.g(this.a.a).addAll((ArrayList) filterResults.values);
        }
        ContactsFragment.a(this.a.a);
        this.a.notifyDataSetChanged();
    }

    private a37(av7 com_whatsapp_av7) {
        this.a = com_whatsapp_av7;
    }
}
