package com.whatsapp;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import org.v;
import org.whispersystems.at;

class a_j implements OnClickListener {
    private static final String[] z;
    final VideoPreviewActivity a;

    static {
        String[] strArr = new String[4];
        String str = "6R1,*$I3$";
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
                        i3 = 66;
                        break;
                    case at.g /*1*/:
                        i3 = 59;
                        break;
                    case at.i /*2*/:
                        i3 = 92;
                        break;
                    case at.o /*3*/:
                        i3 = 73;
                        break;
                    default:
                        i3 = 117;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "!Z,=\u001c-U";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "6R1,*6T";
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "$R0,*2Z(!";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    a_j(VideoPreviewActivity videoPreviewActivity) {
        this.a = videoPreviewActivity;
    }

    public void onClick(View view) {
        VideoPreviewActivity.i(this.a).d();
        Intent intent = new Intent();
        if (VideoPreviewActivity.n(this.a) - VideoPreviewActivity.d(this.a) < 1000) {
            VideoPreviewActivity.a(this.a, Math.min(VideoPreviewActivity.d(this.a) + 1000, VideoPreviewActivity.g(this.a).c()));
            VideoPreviewActivity.b(this.a, Math.max(0, VideoPreviewActivity.n(this.a) - 1000));
        }
        if (VideoPreviewActivity.d(this.a) - 200 > 0 || VideoPreviewActivity.n(this.a) + 200 < VideoPreviewActivity.g(this.a).c()) {
            intent.putExtra(z[0], VideoPreviewActivity.d(this.a));
            intent.putExtra(z[3], VideoPreviewActivity.n(this.a));
        }
        intent.putExtra(z[1], VideoPreviewActivity.a(this.a).getAbsolutePath());
        intent.putExtra(z[2], a28.a(VideoPreviewActivity.m(this.a).getText().toString()));
        this.a.setResult(-1, intent);
        this.a.finish();
    }
}
