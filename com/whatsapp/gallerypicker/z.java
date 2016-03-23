package com.whatsapp.gallerypicker;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.View.OnClickListener;
import com.whatsapp.a28;
import com.whatsapp.arj;
import java.util.ArrayList;
import java.util.Iterator;
import org.v;
import org.whispersystems.at;

class z implements OnClickListener {
    private static final String[] z;
    final ImagePreview a;

    static {
        String[] strArr = new String[4];
        String str = "\u0018\rA\u000b.\u0003\r[";
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
                        i3 = arj.Theme_ratingBarStyle;
                        break;
                    case at.g /*1*/:
                        i3 = 98;
                        break;
                    case at.i /*2*/:
                        i3 = 53;
                        break;
                    case at.o /*3*/:
                        i3 = arj.Theme_ratingBarStyle;
                        break;
                    default:
                        i3 = 90;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "\t\u0003E\u001e3\u0005\f";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "\u000b\fQ\u00185\u0003\u0006\u001b\u00034\u001e\u0007[\u001et\u000f\u001aA\u0018;D1a8\u001f+/";
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\t\u0003E\u001e3\u0005\f";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void onClick(View view) {
        int i = MediaGalleryFragmentBase.e;
        Intent intent = new Intent();
        ArrayList arrayList = new ArrayList();
        Iterator it = ImagePreview.c(this.a).iterator();
        while (it.hasNext()) {
            Object obj = (Uri) it.next();
            Integer num = (Integer) ImagePreview.i(this.a).get(obj);
            String str = (String) ImagePreview.g(this.a).get(obj);
            if (ImagePreview.b(this.a).containsKey(obj)) {
                obj = (Uri) ImagePreview.b(this.a).get(obj);
            }
            if (obj.getQueryParameter(z[2]) != null) {
                obj = obj.buildUpon().query(null).build();
            }
            if (num != null) {
                obj = obj.buildUpon().appendQueryParameter(z[0], num.toString()).build();
            }
            if (str != null) {
                obj = obj.buildUpon().appendQueryParameter(z[1], a28.a(str)).build();
            }
            arrayList.add(obj);
            if (i != 0) {
                break;
            }
        }
        intent.putParcelableArrayListExtra(z[3], arrayList);
        this.a.setResult(-1, intent);
        ImagePreview.k(this.a);
        this.a.finish();
    }

    z(ImagePreview imagePreview) {
        this.a = imagePreview;
    }
}
