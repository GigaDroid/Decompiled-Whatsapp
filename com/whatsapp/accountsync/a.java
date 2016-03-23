package com.whatsapp.accountsync;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

class a extends AsyncTask {
    private static final String[] z;
    final LoginActivity a;
    final ProgressDialog b;

    static {
        String[] strArr = new String[4];
        String str = "\u0015EX2\u0011\u0018IK2\t\u0010^Ft\u001b\u0016cQ\u0019\u001e\u001aAX)\u0010\fD[";
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
                        i3 = 121;
                        break;
                    case at.g /*1*/:
                        i3 = 42;
                        break;
                    case at.i /*2*/:
                        i3 = 63;
                        break;
                    case at.o /*3*/:
                        i3 = 91;
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
                    str = "\u0018_K3>\u001aIP.\u0011\r";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "\u001aERu\b\u0011KK(\u001e\tZ";
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u0018I\\4\n\u0017^k\"\u000f\u001c";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void onPostExecute(Object obj) {
        a((Boolean) obj);
    }

    a(LoginActivity loginActivity, Context context, e eVar) {
        this(loginActivity, context);
    }

    private a(LoginActivity loginActivity, Context context) {
        this.a = loginActivity;
        this.b = ProgressDialog.show(context, "", loginActivity.getString(2131230774), true, false);
        this.b.setCancelable(true);
    }

    public Boolean a(Void[] voidArr) {
        try {
            Thread.sleep(2000);
        } catch (Throwable e) {
            Log.b(z[0], e);
        }
        Account account = new Account(this.a.getString(2131232306), z[3]);
        if (!AccountManager.get(this.a).addAccountExplicitly(account, null, null)) {
            return Boolean.valueOf(false);
        }
        Bundle bundle = new Bundle();
        bundle.putString(z[2], account.name);
        bundle.putString(z[1], account.type);
        this.a.setAccountAuthenticatorResult(bundle);
        return Boolean.valueOf(true);
    }

    public Object doInBackground(Object[] objArr) {
        return a((Void[]) objArr);
    }

    public void a(Boolean bool) {
        this.b.dismiss();
        if (bool.booleanValue()) {
            this.a.finish();
        }
    }
}
