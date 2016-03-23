package com.whatsapp;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.whatsapp.protocol.co;
import com.whatsapp.util.ac;
import org.v;
import org.whispersystems.at;

class eu implements OnItemClickListener {
    private static final String[] z;
    final LinksGalleryFragment a;

    static {
        String[] strArr = new String[2];
        String str = "iHnP7aB$K6|CdVviE~K7f\b\\k\u001d_";
        Object obj = -1;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        int i = 0;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i2 = 0; length > i2; i2++) {
                int i3;
                char c = cArr[i2];
                switch (i2 % 5) {
                    case v.m /*0*/:
                        i3 = 8;
                        break;
                    case at.g /*1*/:
                        i3 = 38;
                        break;
                    case at.i /*2*/:
                        i3 = 10;
                        break;
                    case at.o /*3*/:
                        i3 = 34;
                        break;
                    default:
                        i3 = 88;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    i = 1;
                    strArr2 = strArr3;
                    str = "kIg\f9fBxM1l\bhP7\u007fUoPviVzN1kG~K7fycF";
                    obj = null;
            }
        }
    }

    eu(LinksGalleryFragment linksGalleryFragment) {
        this.a = linksGalleryFragment;
    }

    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        co coVar = LinksGalleryFragment.d(this.a).a(i).b;
        if (LinksGalleryFragment.e(this.a).a()) {
            LinksGalleryFragment.e(this.a).c(coVar);
            LinksGalleryFragment.d(this.a).notifyDataSetChanged();
            if (!DialogToastActivity.f) {
                return;
            }
        }
        Object d = ac.d(coVar.c());
        if (!TextUtils.isEmpty(d)) {
            Intent intent = new Intent(z[0], Uri.parse(d));
            intent.putExtra(z[1], this.a.getContext().getPackageName());
            App.a(this.a.getContext(), intent);
        }
    }
}
