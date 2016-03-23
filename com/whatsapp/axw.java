package com.whatsapp;

import android.content.DialogInterface.OnClickListener;
import org.v;
import org.whispersystems.at;

class axw implements OnClickListener {
    private static final String[] z;
    final GroupChatRecentLocationsActivity a;

    static {
        String[] strArr = new String[7];
        String str = "\u0004z\u0005Li";
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
                        i3 = 116;
                        break;
                    case at.g /*1*/:
                        i3 = 18;
                        break;
                    case at.i /*2*/:
                        i3 = arj.Theme_ratingBarStyle;
                        break;
                    case at.o /*3*/:
                        i3 = 34;
                        break;
                    default:
                        i3 = 12;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "\u0004z\u0005Li";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "\u0004z\u0005Li+f\u0013Ri";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "\u0002|\u000e\fm\u001av\u0018Me\u0010<\tW~\u0007}\u0018\fe\u0000w\u0007\ro\u001b|\u001eCo\u0000";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "\u0015|\u000ePc\u001dvDKb\u0000w\u0004V\"\u0015q\u001eKc\u001a<#l_1@>}C&M/fE ";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\u0013`\u0005W|\u0017z\u000bV~\u0011q\u000fLx\u0018}\tCx\u001d}\u0004Q#\u0017}\u0004Vi\ffJQu\u0007f\u000fO,\u0017}\u0004Vm\u0017fJNe\u0007fJAc\u0001~\u000e\u0002b\u001bfJDc\u0001|\u000e";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u0015|\u000ePc\u001dvDKb\u0000w\u0004V\"\u0015q\u001eKc\u001a<#l_1@>";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onClick(android.content.DialogInterface r8, int r9) {
        /*
        r7 = this;
        r6 = 2;
        r5 = 0;
        r0 = com.whatsapp.DialogToastActivity.f;
        switch(r9) {
            case 0: goto L_0x000b;
            case 1: goto L_0x001c;
            case 2: goto L_0x002b;
            case 3: goto L_0x0088;
            default: goto L_0x0007;
        };
    L_0x0007:
        r8.dismiss();
        return;
    L_0x000b:
        r1 = r7.a;
        r2 = r7.a;
        r2 = com.whatsapp.GroupChatRecentLocationsActivity.k(r2);
        r2 = com.whatsapp.Conversation.a(r2);
        r1.startActivity(r2);
        if (r0 == 0) goto L_0x0007;
    L_0x001c:
        r1 = r7.a;
        r1 = com.whatsapp.GroupChatRecentLocationsActivity.k(r1);
        r2 = r7.a;
        r3 = com.whatsapp.fieldstats.cd.GROUP_CHAT_RECENT_LOCATION;
        com.whatsapp.App.a(r1, r2, r3, r5);
        if (r0 == 0) goto L_0x0007;
    L_0x002b:
        r1 = r7.a;
        r1 = com.whatsapp.GroupChatRecentLocationsActivity.k(r1);
        r1 = r1.l;
        if (r1 == 0) goto L_0x0042;
    L_0x0035:
        r1 = r7.a;
        r1 = com.whatsapp.GroupChatRecentLocationsActivity.k(r1);
        r2 = r7.a;
        com.whatsapp.ContactInfo.a(r1, r2);
        if (r0 == 0) goto L_0x0007;
    L_0x0042:
        r1 = r7.a;
        r1 = com.whatsapp.GroupChatRecentLocationsActivity.k(r1);
        r1 = r1.s();
        r2 = new android.content.Intent;
        r3 = z;
        r4 = 1;
        r3 = r3[r4];
        r4 = android.provider.ContactsContract.Contacts.CONTENT_URI;
        r2.<init>(r3, r4);
        r3 = z;
        r3 = r3[r5];
        r2.putExtra(r3, r1);
        r1 = r7.a;
        r1 = r1.getPackageManager();
        r1 = r2.resolveActivity(r1);
        r2.setComponent(r1);
        r1 = r2.getComponent();
        if (r1 == 0) goto L_0x007b;
    L_0x0072:
        r1 = r7.a;
        r3 = 10;
        r1.startActivityForResult(r2, r3);
        if (r0 == 0) goto L_0x0086;
    L_0x007b:
        r1 = z;
        r2 = 6;
        r1 = r1[r2];
        com.whatsapp.util.Log.i(r1);
        com.whatsapp.App.aa();
    L_0x0086:
        if (r0 == 0) goto L_0x0007;
    L_0x0088:
        r0 = new android.content.Intent;
        r1 = z;
        r2 = 5;
        r1 = r1[r2];
        r0.<init>(r1);
        r1 = z;
        r2 = 4;
        r1 = r1[r2];
        r0.setType(r1);
        r1 = z;
        r1 = r1[r6];
        r2 = r7.a;
        r2 = com.whatsapp.GroupChatRecentLocationsActivity.k(r2);
        r3 = r7.a;
        r2 = r2.a(r3);
        r0.putExtra(r1, r2);
        r1 = z;
        r2 = 3;
        r1 = r1[r2];
        r0.putExtra(r1, r6);
        r1 = 524288; // 0x80000 float:7.34684E-40 double:2.590327E-318;
        r0.setFlags(r1);
        r1 = r7.a;
        r2 = 11;
        r1.startActivityForResult(r0, r2);
        goto L_0x0007;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.axw.onClick(android.content.DialogInterface, int):void");
    }

    axw(GroupChatRecentLocationsActivity groupChatRecentLocationsActivity) {
        this.a = groupChatRecentLocationsActivity;
    }
}
