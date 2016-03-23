package com.whatsapp.gallerypicker;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import com.whatsapp.App;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.r;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

public class GalleryPickerLauncher extends FragmentActivity {
    private static final String[] z;

    static {
        String[] strArr = new String[6];
        String str = "u\u0002F8k`\u001a\u0005$gq\bO&!~\u0002_:mz\u0006X{m`\u0006K k";
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
                        i3 = 18;
                        break;
                    case at.g /*1*/:
                        i3 = 99;
                        break;
                    case at.i /*2*/:
                        i3 = 42;
                        break;
                    case at.o /*3*/:
                        i3 = 84;
                        break;
                    default:
                        i3 = 14;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "\u007f\u0002R\u000bgf\u0006G'";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "{\rI8{v\u0006u9kv\nK";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "b\u0011O\"gw\u0014";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "u\u0002F8k`\u001a\u0005$gq\bO&!~\u0002_:mz\u0006X{jw\u0010^&ak";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "}\u0016^${f";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void onDestroy() {
        Log.i(z[5]);
        super.onDestroy();
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        int i3 = MediaGalleryFragmentBase.e;
        switch (i) {
            case at.g /*1*/:
                setResult(i2, intent);
                finish();
                if (i3 == 0) {
                    return;
                }
                break;
            case 151:
                break;
        }
        if (i2 == -1) {
            a();
            if (i3 == 0) {
                return;
            }
        }
        finish();
        if (i3 != 0) {
            super.onActivityResult(i, i2, intent);
        }
    }

    private void a() {
        if (App.aO()) {
            Intent intent = new Intent(this, GalleryPicker.class);
            intent.putExtra(z[3], 1);
            intent.putExtra(z[2], 1);
            intent.putExtra(z[4], false);
            intent.putExtra(z[1], Uri.fromFile(r.a()));
            startActivityForResult(intent, 1);
            if (MediaGalleryFragmentBase.e == 0) {
                return;
            }
        }
        RequestPermissionActivity.a(this, 2131231677, 2131231648);
    }

    public void onCreate(Bundle bundle) {
        Log.i(z[0]);
        super.onCreate(bundle);
        if (bundle == null) {
            a();
        }
    }
}
