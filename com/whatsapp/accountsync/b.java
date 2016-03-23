package com.whatsapp.accountsync;

import android.accounts.AbstractAccountAuthenticator;
import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.whatsapp.util.Log;
import java.util.Arrays;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

class b extends AbstractAccountAuthenticator {
    private static final String[] z;
    private final Context a;

    static {
        String[] strArr = new String[9];
        String str = "\u0003ju\u001c@\f}W\u0006A\nlx\u0007\\\u0001hb\u001cG0le\u0003Z\fzs";
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
                        i3 = 98;
                        break;
                    case at.g /*1*/:
                        i3 = 9;
                        break;
                    case at.i /*2*/:
                        i3 = 22;
                        break;
                    case at.o /*3*/:
                        i3 = 115;
                        break;
                    default:
                        i3 = 53;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "\u000bgb\u0016[\u0016";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "\u0003ju\u001c@\f}9\u0000L\fj9\u0014P\u0016Hc\u0007]6f}\u0016[.ht\u0016Y";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "\u0003ju\u001c@\f}9\u0000L\fj9\u0016Q\u000b}F\u0001Z\u0012ld\u0007\\\u0007z";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "\u0003ju\u001c@\f}9\u0000L\fj9\u0014P\u0016Hc\u0007]6f}\u0016[";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\u0003ju\u001c@\f}9\u0000L\fj9\u0010Z\fo\u007f\u0001X!{s\u0017P\f}\u007f\u0012Y\u0011";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\u0003ju\u001c@\f}9\u0000L\fj9\u0006E\u0006hb\u0016v\u0010lr\u0016[\u0016`w\u001fF";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "\u0003ju\u001c@\f}9\u0000L\fj9\u001bT\u0011Os\u0012A\u0017{s\u0000\u000fB";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u0003ju\u001c@\f}9\u0000L\fj9\u0012Q\u0006Hu\u0010Z\u0017gb";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public b(Context context) {
        super(context);
        this.a = context;
    }

    public Bundle getAuthToken(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, String str, Bundle bundle) {
        Log.i(z[5]);
        return null;
    }

    public String getAuthTokenLabel(String str) {
        Log.i(z[3]);
        return null;
    }

    public Bundle hasFeatures(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, String[] strArr) {
        Log.i(z[8] + Arrays.toString(strArr));
        return null;
    }

    public Bundle editProperties(AccountAuthenticatorResponse accountAuthenticatorResponse, String str) {
        Log.i(z[4]);
        return null;
    }

    public Bundle addAccount(AccountAuthenticatorResponse accountAuthenticatorResponse, String str, String str2, String[] strArr, Bundle bundle) {
        Log.i(z[1]);
        Bundle bundle2 = new Bundle();
        Parcelable intent = new Intent(this.a, LoginActivity.class);
        intent.putExtra(z[0], accountAuthenticatorResponse);
        bundle2.putParcelable(z[2], intent);
        return bundle2;
    }

    public Bundle confirmCredentials(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, Bundle bundle) {
        Log.i(z[6]);
        return null;
    }

    public Bundle updateCredentials(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, String str, Bundle bundle) {
        Log.i(z[7]);
        return null;
    }
}
