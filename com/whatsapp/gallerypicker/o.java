package com.whatsapp.gallerypicker;

import android.content.Intent;
import com.whatsapp.DialogToastActivity;
import com.whatsapp.VideoPreviewActivity;
import com.whatsapp.a59;
import com.whatsapp.akr;
import com.whatsapp.util.m;
import java.io.File;
import org.v;
import org.whispersystems.at;

class o implements m {
    private static final String[] z;
    final MediaPickerFragment a;
    final DialogToastActivity b;

    static {
        String[] strArr = new String[3];
        String str = ";#[h\u0018-+Ce";
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
                        i3 = 93;
                        break;
                    case at.g /*1*/:
                        i3 = 74;
                        break;
                    case at.i /*2*/:
                        i3 = 55;
                        break;
                    case at.o /*3*/:
                        i3 = 13;
                        break;
                    default:
                        i3 = 71;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    i = 2;
                    strArr2 = strArr3;
                    str = ";#[h\u0018-+Ce";
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "7#S";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void a(File file) {
        int i = MediaGalleryFragmentBase.e;
        if (akr.c(file)) {
            Intent intent = new Intent(this.b, VideoPreviewActivity.class);
            intent.putExtra(z[0], file.getAbsolutePath());
            intent.putExtra(z[1], MediaPickerFragment.c(this.a));
            this.a.getActivity().startActivityForResult(intent, 2);
            if (i == 0) {
                return;
            }
        }
        if (file.length() > ((long) a59.e) * 1048576) {
            this.b.f(this.a.getString(2131231149, new Object[]{Integer.valueOf(a59.e)}));
            if (i == 0) {
                return;
            }
        }
        Intent intent2 = new Intent();
        intent2.putExtra(z[2], file.getAbsolutePath());
        this.b.setResult(-1, intent2);
        this.b.finish();
    }

    o(MediaPickerFragment mediaPickerFragment, DialogToastActivity dialogToastActivity) {
        this.a = mediaPickerFragment;
        this.b = dialogToastActivity;
    }
}
