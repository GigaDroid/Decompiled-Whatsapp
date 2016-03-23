package com.whatsapp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.widget.Button;
import android.widget.TextView;
import com.whatsapp.accountsync.PerformSyncManager;
import java.io.File;
import org.v;
import org.whispersystems.at;

public class OverlayAlert extends WAActivity {
    private static final String[] z;

    static {
        String[] strArr = new String[4];
        String str = "\n2\u0018\u0002l\u0001<\u0001_z\u0019-[~~\u000e4\u0006X~\u001b\r\u001dCu\fs\u0007Ih\f)\u0006Xz\u001d8";
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
                        i3 = arj.Theme_radioButtonStyle;
                        break;
                    case at.g /*1*/:
                        i3 = 93;
                        break;
                    case at.i /*2*/:
                        i3 = 117;
                        break;
                    case at.o /*3*/:
                        i3 = 44;
                        break;
                    default:
                        i3 = 27;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "\n2\u0018\u0002l\u0001<\u0001_z\u0019-[~~\u000e4\u0006X~\u001b\r\u001dCu\fs\u0016@~\b/*\\s\u00063\u0010su\u001c0\u0017Ii";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "\u001a)\u0007Eu\u000e4\u0011";
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u00048";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public static void a(@NonNull Activity activity) {
        DeleteAccountConfirmation.a((Context) activity);
        App.S = false;
        aup.e();
        App.aL();
        l5 e = App.as.e();
        if (e != null) {
            e.u();
            e.c(0, 0);
        }
        File file = new File(activity.getFilesDir(), z[1]);
        if (file.exists()) {
            file.delete();
        }
        App.ay = null;
        App.f(activity, null);
        App.aK.h();
        ve.c();
        Intent intent = new Intent(activity, RegisterPhone.class);
        intent.putExtra(z[0], true);
        intent.putExtra(z[2], true);
        if (VERSION.SDK_INT >= 11) {
            intent.addFlags(32768);
        }
        App.d((Context) activity, 1);
        vh.l(activity);
        App.Z = false;
        App.aY();
        ve.w();
        aup.c();
        PerformSyncManager.a(false);
        App.g(true);
        activity.startActivity(intent);
        activity.finish();
        App.c(false);
        zb.i();
        Conversation.B();
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        if (VERSION.SDK_INT >= 11) {
            setFinishOnTouchOutside(false);
        }
        setContentView(aam.a(getLayoutInflater(), 2130903246, null, false));
        Button button = (Button) findViewById(2131755629);
        button.setText(2131230923);
        button.setOnClickListener(new tg(this));
        button = (Button) findViewById(2131755628);
        button.setText(2131231588);
        button.setOnClickListener(new wc(this));
        int intExtra = getIntent().getIntExtra(z[3], -1);
        if (intExtra == -1) {
            finish();
            if (!DialogToastActivity.f) {
                return;
            }
        }
        ((TextView) findViewById(2131755820)).setText(getString(intExtra));
    }
}
