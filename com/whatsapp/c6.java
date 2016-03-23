package com.whatsapp;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.v;
import org.whispersystems.at;

class c6 extends FragmentStatePagerAdapter implements g1 {
    private static final String[] z;
    final HomeActivity a;
    vm[] b;
    int c;

    static {
        String[] strArr = new String[3];
        String str = "\bP\u007f\u001d](]w\u001dD3KsI]3V:N\\3MvY\u0014>]:QQ/K:RF|]kHU0\u0018nR\u000eo";
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
                        i3 = 92;
                        break;
                    case at.g /*1*/:
                        i3 = 56;
                        break;
                    case at.i /*2*/:
                        i3 = 26;
                        break;
                    case at.o /*3*/:
                        i3 = 61;
                        break;
                    default:
                        i3 = 52;
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
                    str = "\bP\u007f\u001d](]w\u001dD3KsI]3V:N\\3MvY\u0014>]:QQ/K:RF|]kHU0\u0018nR\u000eo";
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u001dj]b}\u0012qNtu\u0010gJrg\u0015lSrz";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.support.v4.app.Fragment getItem(int r5) {
        /*
        r4 = this;
        r3 = 1;
        r1 = com.whatsapp.DialogToastActivity.f;
        switch(r5) {
            case 0: goto L_0x001a;
            case 1: goto L_0x0013;
            case 2: goto L_0x0021;
            default: goto L_0x0006;
        };
    L_0x0006:
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0011 }
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x0011 }
        r2 = 0;
        r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x0011 }
        r0.<init>(r1);	 Catch:{ IllegalArgumentException -> 0x0011 }
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0011 }
    L_0x0011:
        r0 = move-exception;
        throw r0;
    L_0x0013:
        r0 = new com.whatsapp.ConversationsFragment;
        r0.<init>();
        if (r1 == 0) goto L_0x0028;
    L_0x001a:
        r0 = new com.whatsapp.CallsFragment;
        r0.<init>();
        if (r1 == 0) goto L_0x0028;
    L_0x0021:
        r0 = new com.whatsapp.ContactsFragment;
        r0.<init>();
        if (r1 != 0) goto L_0x0006;
    L_0x0028:
        r1 = r4.c;
        if (r1 <= 0) goto L_0x003b;
    L_0x002c:
        r1 = new android.os.Bundle;
        r1.<init>();
        r2 = z;
        r2 = r2[r3];
        r1.putInt(r2, r3);
        r0.setArguments(r1);
    L_0x003b:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.c6.getItem(int):android.support.v4.app.Fragment");
    }

    public int getCount() {
        return 3;
    }

    public CharSequence getPageTitle(int i) {
        switch (i) {
            case v.m /*0*/:
                return this.a.getString(2131230874).toUpperCase();
            case at.g /*1*/:
                try {
                    return this.a.getString(2131230910).toUpperCase();
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            case at.i /*2*/:
                return this.a.getString(2131230963).toUpperCase();
            default:
                throw new IllegalArgumentException(z[2]);
        }
    }

    static vm a(c6 c6Var, int i) {
        return c6Var.b(i);
    }

    public void m475a(int i) {
        this.c = i;
    }

    private vm b(int i) {
        if (this.b[i] == null) {
            vm vmVar = new vm(null);
            vmVar.b = aam.a(this.a.getLayoutInflater(), 2130903200, null, false);
            vmVar.a = (TextView) vmVar.b.findViewById(2131755701);
            vmVar.a.setText(getPageTitle(i));
            vmVar.c = (TextView) vmVar.b.findViewById(2131755702);
            this.b[i] = vmVar;
        }
        return this.b[i];
    }

    public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        super.setPrimaryItem(viewGroup, i, obj);
    }

    public c6(HomeActivity homeActivity, FragmentManager fragmentManager) {
        this.a = homeActivity;
        super(fragmentManager);
        this.b = new vm[3];
    }

    public View a(int i) {
        return b(i).b;
    }
}
