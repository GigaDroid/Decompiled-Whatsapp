package com.whatsapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import com.whatsapp.util.Log;
import com.whatsapp.util.cs;
import java.util.Date;
import java.util.TimeZone;
import org.v;
import org.whispersystems.at;

final class ai7 extends aic {
    private static final String z;
    final Activity c;

    static {
        char[] toCharArray = "V(@E\u000bG4OG\u0007Z)]\u001c\rY(MXCB5A]\t\u00183G^\u000b\u0015".toCharArray();
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
                    i2 = 71;
                    break;
                case at.i /*2*/:
                    i2 = 46;
                    break;
                case at.o /*3*/:
                    i2 = 51;
                    break;
                default:
                    i2 = 110;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    ai7(Activity activity, int i, Activity activity2) {
        this.c = activity2;
        super(activity, i);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Date date = new Date();
        Log.w(z + date.toString());
        long time = App.Y == null ? date.getTime() : App.Y.getTime();
        ((TextView) findViewById(2131755421)).setText(this.c.getString(2131230922, new Object[]{cs.l(App.z(), time), TimeZone.getDefault().getDisplayName()}));
        findViewById(2131755422).setOnClickListener(new hw(this));
    }
}
