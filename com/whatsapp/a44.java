package com.whatsapp;

import android.text.Editable;
import android.text.TextWatcher;
import com.whatsapp.util.Log;
import java.io.IOException;
import org.v;
import org.whispersystems.at;

class a44 implements TextWatcher {
    private static final String[] z;
    final ChangeNumber a;
    private at6 b;

    static {
        String[] strArr = new String[2];
        String str = "\u0012W2&\"\u0014Q&%'\u0014M|?$\u0005\\;-7^^5< \u0003K601\u0012W2&\"\u0014[s.$\u0018S6,e\u001dP<#0\u0001|<=+\u0005M*\u000b*\u0015Zs.7\u001eRs\u000b*\u0004Q':<!W<& 8Q5'";
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
                        i3 = 113;
                        break;
                    case at.g /*1*/:
                        i3 = 63;
                        break;
                    case at.i /*2*/:
                        i3 = 83;
                        break;
                    case at.o /*3*/:
                        i3 = 72;
                        break;
                    default:
                        i3 = 69;
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
                    str = "-{";
                    obj = null;
            }
        }
    }

    public a44(ChangeNumber changeNumber, at6 com_whatsapp_at6) {
        this.a = changeNumber;
        this.b = com_whatsapp_at6;
    }

    public void afterTextChanged(Editable editable) {
        String str = null;
        if (editable != null) {
            try {
                if (editable.length() > 0) {
                    str = u0.c(editable.toString());
                    try {
                        this.b.d = str;
                    } catch (Throwable e) {
                        Throwable th = e;
                        String str2 = str;
                        Throwable th2 = th;
                        Log.b(z[0], th2);
                        str = str2;
                        if (!this.b.e.getText().toString().equals("")) {
                        }
                    }
                    if (!this.b.e.getText().toString().equals("") && str != null) {
                        ChangeNumber.a(this.a, str, this.b);
                        try {
                            this.b.c.setText(this.b.c.getText().toString().replaceAll(z[1], ""));
                            if (this.b.e.hasFocus()) {
                                this.b.c.requestFocus();
                                return;
                            }
                            return;
                        } catch (IOException e2) {
                            throw e2;
                        }
                    }
                }
            } catch (IOException e3) {
                throw e3;
            } catch (Throwable e4) {
                th = e4;
                str2 = str;
                th2 = th;
            }
        }
        this.b.d = null;
        try {
            if (!this.b.e.getText().toString().equals("")) {
            }
        } catch (IOException e22) {
            throw e22;
        }
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
