package com.whatsapp;

import android.os.Bundle;
import android.view.MenuItem;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

public class ArchivedConversationsActivity extends DialogToastActivity {
    private static final String[] z;

    static {
        String[] strArr = new String[2];
        String str = "4.;=W#9<6Q;*='M4(1:P&s;'[4(=";
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
                        i3 = 85;
                        break;
                    case at.g /*1*/:
                        i3 = 92;
                        break;
                    case at.i /*2*/:
                        i3 = 88;
                        break;
                    case at.o /*3*/:
                        i3 = 85;
                        break;
                    default:
                        i3 = 62;
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
                    str = "4.;=W#9<6Q;*='M4(1:P&s<0M!.7,";
                    obj = null;
            }
        }
    }

    protected void onCreate(Bundle bundle) {
        Log.i(z[0]);
        super.onCreate(bundle);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setContentView(2130903077);
        if (bundle == null) {
            getSupportFragmentManager().beginTransaction().add(2131755308, new ArchivedConversationsFragment()).commit();
        }
    }

    protected void onDestroy() {
        super.onDestroy();
        Log.i(z[1]);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case 16908332:
                finish();
                return true;
            default:
                return false;
        }
    }
}
