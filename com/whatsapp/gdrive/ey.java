package com.whatsapp.gdrive;

import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.View;
import android.view.View.OnClickListener;
import com.whatsapp.App;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.at;

class ey implements OnClickListener {
    private static final String[] z;
    final GoogleDriveActivity a;
    final boolean b;

    static {
        String[] strArr = new String[8];
        String str = "5gcj\u000b,~u\\\u001d0|dl\u0011";
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
                        i3 = 69;
                        break;
                    case at.g /*1*/:
                        i3 = 8;
                        break;
                    case at.i /*2*/:
                        i3 = 16;
                        break;
                    case at.o /*3*/:
                        i3 = 3;
                        break;
                    default:
                        i3 = 127;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "!aqo\u0010\"Wyg";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "\"lbj\t %q`\u000b,~yw\u0006jecd\f1gbfR!ggm\u0013*it.\u0019,fyp\u0017i(GjR\u0003a0b\t$a|b\u001d)m<#\f1ibw\u0016+o0n\u001a!aq#\r {dl\r &";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "&i~`\u001a)iro\u001a";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "+mwb\u000b,~u\\\u001d0|dl\u0011";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\"lbj\t %q`\u000b,~yw\u0006jecd\f1gbfR!ggm\u0013*it.\u0019,fyp\u0017ef\u007f#\u0012 lyb_1g0q\u001a6|\u007fq\u001ai(cf\u000b1a~d_7mcv\u00131(\u007fe_\u0002g\u007fd\u0013 (Tq\u00163m0b\u001c1afj\u000b<(dl_\u0007ISH*\u0015WVL*\u000bLOB1\u0001WBF,\u0011GBF;k";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\"lbj\t %q`\u000b,~yw\u0006jecd\f1gbfR!ggm\u0013*it.\u0019,fyp\u0017e{uw\u000b,fw#\r {eo\u000begv#8*gwo\u001aeLbj\t (q`\u000b,~yw\u0006e|\u007f#=\u0004K[V/\u001aN_V1\u0001WQM;\u001aZUP+\nZUGQ";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "(mcp\u001e\"m";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    ey(GoogleDriveActivity googleDriveActivity, boolean z) {
        this.a = googleDriveActivity;
        this.b = z;
    }

    public void onClick(View view) {
        boolean z = GoogleDriveService.c;
        if (this.b) {
            if (App.az() != 1) {
                DialogFragment promptDialogFragment = new PromptDialogFragment();
                Bundle bundle = new Bundle();
                bundle.putInt(z[2], 12);
                bundle.putString(z[1], this.a.getString(2131231231));
                bundle.putBoolean(z[4], false);
                bundle.putString(z[0], this.a.getString(2131231580));
                bundle.putString(z[5], this.a.getString(2131231247));
                promptDialogFragment.setArguments(bundle);
                promptDialogFragment.show(this.a.getSupportFragmentManager(), null);
                if (!z) {
                    return;
                }
            }
            Log.i(z[3]);
            GoogleDriveActivity.h(this.a);
            Log.i(z[7]);
            this.a.setResult(3);
            this.a.finish();
            if (!z) {
                return;
            }
        }
        GoogleDriveService.B();
        GoogleDriveService.x();
        Log.i(z[6]);
        this.a.setResult(3);
        this.a.finish();
    }
}
