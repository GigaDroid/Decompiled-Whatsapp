package com.whatsapp;

import android.content.Context;
import android.os.Environment;
import android.support.v4.content.AsyncTaskLoader;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.v;
import org.whispersystems.at;

class an6 extends AsyncTaskLoader {
    private static File[] a;
    private static final String[] z;
    List b;

    public void cancelLoadInBackground() {
        super.cancelLoadInBackground();
    }

    public an6(Context context) {
        super(context);
    }

    static {
        String[] strArr = new String[2];
        String str = "'A\u0000\u0011#\u0006@\u0017\u0017";
        int i = -1;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        int i2 = 0;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i3 = 0; length > i3; i3++) {
                int i4;
                char c = cArr[i3];
                switch (i3 % 5) {
                    case v.m /*0*/:
                        i4 = 99;
                        break;
                    case at.g /*1*/:
                        i4 = 46;
                        break;
                    case at.i /*2*/:
                        i4 = 99;
                        break;
                    case at.o /*3*/:
                        i4 = 100;
                        break;
                    default:
                        i4 = 78;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    a = new File[]{new File(Environment.getExternalStorageDirectory(), z[1]), Environment.getExternalStorageDirectory(), dg.f(), new File(Environment.getExternalStorageDirectory(), z[0])};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "'A\u0014\n\"\fO\u0007";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
            }
        }
    }

    protected void onStopLoading() {
        cancelLoad();
    }

    public void onCanceled(Object obj) {
        a((List) obj);
    }

    public List a() {
        boolean z = DialogToastActivity.f;
        List arrayList = new ArrayList();
        File[] fileArr = a;
        int length = fileArr.length;
        int i = 0;
        while (i < length) {
            File[] listFiles = fileArr[i].listFiles(new d1(this));
            if (listFiles != null) {
                arrayList.addAll(Arrays.asList(listFiles));
            }
            i++;
            if (z) {
                break;
            }
        }
        DocumentPickerActivity.b(arrayList, 0);
        return arrayList;
    }

    protected void onReset() {
        super.onReset();
        onStopLoading();
        this.b = null;
    }

    public void deliverResult(Object obj) {
        b((List) obj);
    }

    public Object loadInBackground() {
        return a();
    }

    public void a(List list) {
    }

    protected void onStartLoading() {
        if (this.b != null) {
            b(this.b);
        }
        if (takeContentChanged() || this.b == null) {
            forceLoad();
        }
    }

    public void b(List list) {
        if (!isReset()) {
            this.b = list;
            if (isStarted()) {
                super.deliverResult(list);
            }
        }
    }
}
