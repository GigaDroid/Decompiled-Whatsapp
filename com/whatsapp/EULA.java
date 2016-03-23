package com.whatsapp;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.view.Menu;
import android.view.MenuItem;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class EULA extends UserFeedbackActivity {
    private static final String[] z;
    private jf n;

    static {
        String[] strArr = new String[13];
        String str = "\u007fPs\u000e";
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
                        i3 = 26;
                        break;
                    case at.g /*1*/:
                        i3 = 37;
                        break;
                    case at.i /*2*/:
                        i3 = 31;
                        break;
                    case at.o /*3*/:
                        i3 = 111;
                        break;
                    default:
                        i3 = 67;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "H@l\n7:wz\f,l@m\u0016";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "\u007f]|\n3nLp\u0001cmMv\u0003&:R~\u00067sKxO,t\u0005k\u000e0q\u0005t\u0006/v@m\u001ccnMm\n\"~\u0005k\u0000c|Lq\u00060r\u0005{\u001a1sKxO,tfm\n\"n@?";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "\u007fPs\u000elyWz\u000e7\u007f";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "\u007f]|\n3nLp\u0001cmMv\u0003&:R~\u00067sKxO,t\u0005k\u000e0q\u0005t\u0006/v@m\u001ccnMm\n\"~\u0005k\u0000c|Lq\u00060r\u0005{\u001a1sKxO,tfm\n\"n@?";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\u007fPs\u000elyIp\f(7Rm\u0000-}";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "iU~\f&T@z\u000b&~lq-:n@l";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "\u007fPs\u000elyWz\u000e7\u007f\nh\u001d,tB2\u001c7{QzO!uPq\f&:QpO.{Lq";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "n@m\u000207Dq\u000bnjWv\u0019\"y\\2\u001f,vL|\u0016";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "iMp\u0018\u001ch@x\u00060nW~\u001b*uK@\t*hVk0'vB";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "yJrA4rDk\u001c\"jU1=&}Ll\u001b&huw\u0000-\u007f\u000bm\n0\u007fQl\u001b\"n@";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "h@x\u00060n@m@&oI~@\"yFz\u001f7";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "H@l\n7:u~\u001c0mJm\u000b";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    private void b() {
        findViewById(2131755661).setBackgroundResource(0);
        findViewById(2131755661).setBackgroundResource(2130837616);
        if (getResources().getConfiguration().orientation == 1) {
            findViewById(2131755169).setVisibility(0);
            if (!DialogToastActivity.f) {
                return;
            }
        }
        findViewById(2131755169).setVisibility(8);
    }

    public EULA() {
        this.n = jf.AGREE_NONE;
    }

    static void a(EULA eula) {
        eula.a();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r11) {
        /*
        r10 = this;
        r4 = 1048576; // 0x100000 float:1.469368E-39 double:5.180654E-318;
        r7 = 8;
        r6 = 1;
        r2 = 0;
        r3 = com.whatsapp.DialogToastActivity.f;
        r0 = z;	 Catch:{ Exception -> 0x0074 }
        r1 = 4;
        r0 = r0[r1];	 Catch:{ Exception -> 0x0074 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ Exception -> 0x0074 }
        r0 = 0;
        r10.b(r0);	 Catch:{ Exception -> 0x0074 }
        super.onCreate(r11);	 Catch:{ Exception -> 0x0074 }
        r0 = android.os.Build.VERSION.SDK_INT;	 Catch:{ Exception -> 0x0074 }
        r1 = 21;
        if (r0 < r1) goto L_0x002c;
    L_0x001e:
        r0 = r10.getWindow();	 Catch:{ Exception -> 0x0074 }
        r1 = 2131623942; // 0x7f0e0006 float:1.887505E38 double:1.0531621596E-314;
        r1 = android.support.v4.content.ContextCompat.getColor(r10, r1);	 Catch:{ Exception -> 0x0074 }
        r0.setStatusBarColor(r1);	 Catch:{ Exception -> 0x0074 }
    L_0x002c:
        r0 = 2130903181; // 0x7f03008d float:1.7413173E38 double:1.0528060563E-314;
        r10.setContentView(r0);
        r0 = com.whatsapp.App.ak();	 Catch:{ Exception -> 0x0076 }
        r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1));
        if (r0 >= 0) goto L_0x0056;
    L_0x003a:
        r0 = new android.content.Intent;	 Catch:{ Exception -> 0x0076 }
        r1 = com.whatsapp.InsufficientStorageSpaceActivity.class;
        r0.<init>(r10, r1);	 Catch:{ Exception -> 0x0076 }
        r1 = 268435456; // 0x10000000 float:2.5243549E-29 double:1.32624737E-315;
        r0 = r0.setFlags(r1);	 Catch:{ Exception -> 0x0076 }
        r1 = z;	 Catch:{ Exception -> 0x0076 }
        r4 = 7;
        r1 = r1[r4];	 Catch:{ Exception -> 0x0076 }
        r4 = 1048576; // 0x100000 float:1.469368E-39 double:5.180654E-318;
        r0 = r0.putExtra(r1, r4);	 Catch:{ Exception -> 0x0076 }
        r10.startActivity(r0);	 Catch:{ Exception -> 0x0076 }
    L_0x0056:
        r10.b();
        r0 = com.whatsapp.App.t(r10);
        if (r0 == 0) goto L_0x0078;
    L_0x005f:
        r0 = z;
        r0 = r0[r7];
        com.whatsapp.util.Log.e(r0);
        r0 = new android.content.Intent;
        r1 = com.whatsapp.Main.class;
        r0.<init>(r10, r1);
        r10.startActivity(r0);
        r10.finish();
    L_0x0073:
        return;
    L_0x0074:
        r0 = move-exception;
        throw r0;
    L_0x0076:
        r0 = move-exception;
        throw r0;
    L_0x0078:
        r0 = com.whatsapp.App.al;	 Catch:{ Exception -> 0x014e }
        r4 = 10;
        r1 = java.util.concurrent.TimeUnit.SECONDS;	 Catch:{ Exception -> 0x014e }
        r0 = r0.a(r4, r1);	 Catch:{ Exception -> 0x014e }
    L_0x0082:
        if (r0 == 0) goto L_0x008e;
    L_0x0084:
        r0 = r0.a;	 Catch:{ Exception -> 0x016b }
        if (r0 == 0) goto L_0x008e;
    L_0x0088:
        r0 = 6;
        r10.showDialog(r0);	 Catch:{ Exception -> 0x016d }
        if (r3 == 0) goto L_0x0099;
    L_0x008e:
        r0 = com.whatsapp.ve.C();	 Catch:{ Exception -> 0x016f }
        if (r0 == 0) goto L_0x0099;
    L_0x0094:
        r0 = 8;
        r10.showDialog(r0);	 Catch:{ Exception -> 0x016f }
    L_0x0099:
        r4 = new android.text.SpannableString;
        r0 = 2131231133; // 0x7f08019d float:1.8078338E38 double:1.052968086E-314;
        r1 = new java.lang.Object[r6];
        r5 = 2131231131; // 0x7f08019b float:1.8078334E38 double:1.052968085E-314;
        r5 = r10.getString(r5);
        r1[r2] = r5;
        r0 = r10.getString(r0, r1);
        r0 = android.text.Html.fromHtml(r0);
        r4.<init>(r0);
        r0 = r4.length();
        r1 = android.text.style.URLSpan.class;
        r0 = r4.getSpans(r2, r0, r1);
        r0 = (android.text.style.URLSpan[]) r0;
        if (r0 == 0) goto L_0x00f5;
    L_0x00c2:
        r5 = r0.length;
        r1 = r2;
    L_0x00c4:
        if (r1 >= r5) goto L_0x00f5;
    L_0x00c6:
        r6 = r0[r1];
        r7 = z;
        r8 = 9;
        r7 = r7[r8];
        r8 = r6.getURL();
        r7 = r7.equals(r8);
        if (r7 == 0) goto L_0x00f1;
    L_0x00d8:
        r7 = r4.getSpanStart(r6);
        r8 = r4.getSpanEnd(r6);
        r9 = r4.getSpanFlags(r6);
        r4.removeSpan(r6);
        r6 = new com.whatsapp.a3;
        r6.<init>(r10);
        r4.setSpan(r6, r7, r8, r9);	 Catch:{ Exception -> 0x0171 }
        if (r3 == 0) goto L_0x00f5;
    L_0x00f1:
        r1 = r1 + 1;
        if (r3 == 0) goto L_0x00c4;
    L_0x00f5:
        r0 = 2131755662; // 0x7f10028e float:1.914221E38 double:1.053227238E-314;
        r0 = r10.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r1 = new android.text.method.LinkMovementMethod;
        r1.<init>();
        r0.setMovementMethod(r1);
        r0.setText(r4);
        r0.setHighlightColor(r2);
        r0 = 2131755663; // 0x7f10028f float:1.9142212E38 double:1.0532272384E-314;
        r0 = r10.findViewById(r0);
        r0 = (android.widget.Button) r0;
        r1 = new com.whatsapp.li;	 Catch:{ Exception -> 0x0173 }
        r1.<init>(r10);	 Catch:{ Exception -> 0x0173 }
        r0.setOnClickListener(r1);	 Catch:{ Exception -> 0x0173 }
        r0 = r10.getIntent();	 Catch:{ Exception -> 0x0173 }
        r1 = z;	 Catch:{ Exception -> 0x0173 }
        r3 = 10;
        r1 = r1[r3];	 Catch:{ Exception -> 0x0173 }
        r3 = 0;
        r0 = r0.getBooleanExtra(r1, r3);	 Catch:{ Exception -> 0x0173 }
        if (r0 == 0) goto L_0x0132;
    L_0x012e:
        r0 = 1;
        r10.showDialog(r0);	 Catch:{ Exception -> 0x0173 }
    L_0x0132:
        r0 = 0;
        com.whatsapp.App.d(r10, r0);	 Catch:{ Exception -> 0x0175 }
        r0 = com.whatsapp.App.p;	 Catch:{ Exception -> 0x0175 }
        r0 = r0.F();	 Catch:{ Exception -> 0x0175 }
        if (r0 == 0) goto L_0x0149;
    L_0x013e:
        r0 = z;	 Catch:{ Exception -> 0x0175 }
        r1 = 6;
        r0 = r0[r1];	 Catch:{ Exception -> 0x0175 }
        com.whatsapp.util.Log.w(r0);	 Catch:{ Exception -> 0x0175 }
        r10.d();	 Catch:{ Exception -> 0x0175 }
    L_0x0149:
        com.whatsapp.accountsync.PerformSyncManager.a(r2);
        goto L_0x0073;
    L_0x014e:
        r0 = move-exception;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r4 = z;
        r5 = 5;
        r4 = r4[r5];
        r1 = r1.append(r4);
        r0 = r1.append(r0);
        r0 = r0.toString();
        com.whatsapp.util.Log.w(r0);
        r0 = 0;
        goto L_0x0082;
    L_0x016b:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x016d }
    L_0x016d:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x016f }
    L_0x016f:
        r0 = move-exception;
        throw r0;
    L_0x0171:
        r0 = move-exception;
        throw r0;
    L_0x0173:
        r0 = move-exception;
        throw r0;
    L_0x0175:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.EULA.onCreate(android.os.Bundle):void");
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, 0, 0, 2131231750).setIcon(2130839514);
        if (App.am == 3) {
            menu.add(0, 1, 0, z[1]);
            menu.add(0, 2, 0, z[2]);
        }
        return super.onCreateOptionsMenu(menu);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        b();
    }

    public void onResume() {
        super.onResume();
        switch (z1.a[this.n.ordinal()]) {
            case at.g /*1*/:
                showDialog(6);
                if (!DialogToastActivity.f) {
                    return;
                }
                break;
            case at.i /*2*/:
                break;
            default:
                return;
        }
        showDialog(8);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.app.Dialog onCreateDialog(int r7) {
        /*
        r6 = this;
        r4 = 2131231070; // 0x7f08015e float:1.807821E38 double:1.052968055E-314;
        r5 = 0;
        r1 = 2131230798; // 0x7f08004e float:1.8077659E38 double:1.0529679207E-314;
        r3 = 2131231580; // 0x7f08035c float:1.8079245E38 double:1.052968307E-314;
        r2 = com.whatsapp.DialogToastActivity.f;
        switch(r7) {
            case 1: goto L_0x003a;
            case 2: goto L_0x0054;
            case 3: goto L_0x0072;
            case 4: goto L_0x000f;
            case 5: goto L_0x0094;
            case 6: goto L_0x0135;
            case 7: goto L_0x0165;
            case 8: goto L_0x0180;
            case 9: goto L_0x0014;
            default: goto L_0x000f;
        };
    L_0x000f:
        r0 = super.onCreateDialog(r7);
    L_0x0013:
        return r0;
    L_0x0014:
        r0 = new android.support.v7.app.AlertDialog$Builder;	 Catch:{ Exception -> 0x0038 }
        r0.<init>(r6);	 Catch:{ Exception -> 0x0038 }
        r1 = 2131230798; // 0x7f08004e float:1.8077659E38 double:1.0529679207E-314;
        r0 = r0.setTitle(r1);	 Catch:{ Exception -> 0x0038 }
        r1 = 2131230921; // 0x7f0800c9 float:1.8077908E38 double:1.0529679814E-314;
        r0 = r0.setMessage(r1);	 Catch:{ Exception -> 0x0038 }
        r1 = 2131231580; // 0x7f08035c float:1.8079245E38 double:1.052968307E-314;
        r2 = new com.whatsapp.ti;	 Catch:{ Exception -> 0x0038 }
        r2.<init>(r6);	 Catch:{ Exception -> 0x0038 }
        r0 = r0.setPositiveButton(r1, r2);	 Catch:{ Exception -> 0x0038 }
        r0 = r0.create();	 Catch:{ Exception -> 0x0038 }
        goto L_0x0013;
    L_0x0038:
        r0 = move-exception;
        throw r0;
    L_0x003a:
        r0 = new android.support.v7.app.AlertDialog$Builder;
        r0.<init>(r6);
        r1 = 2131231754; // 0x7f08040a float:1.8079598E38 double:1.052968393E-314;
        r0 = r0.setMessage(r1);
        r1 = new com.whatsapp.z7;
        r1.<init>(r6);
        r0 = r0.setPositiveButton(r3, r1);
        r0 = r0.create();
        goto L_0x0013;
    L_0x0054:
        r0 = new android.support.v7.app.AlertDialog$Builder;
        r0.<init>(r6);
        r0 = r0.setTitle(r1);
        r1 = 2131231815; // 0x7f080447 float:1.8079722E38 double:1.052968423E-314;
        r0 = r0.setMessage(r1);
        r1 = new com.whatsapp.a2b;
        r1.<init>(r6);
        r0 = r0.setPositiveButton(r3, r1);
        r0 = r0.create();
        goto L_0x0013;
    L_0x0072:
        r0 = new android.support.v7.app.AlertDialog$Builder;
        r0.<init>(r6);
        r0 = r0.setTitle(r1);
        r1 = 2131231132; // 0x7f08019c float:1.8078336E38 double:1.0529680857E-314;
        r1 = r6.getString(r1);
        r0 = r0.setMessage(r1);
        r1 = new com.whatsapp._g;
        r1.<init>(r6);
        r0 = r0.setPositiveButton(r3, r1);
        r0 = r0.create();
        goto L_0x0013;
    L_0x0094:
        r0 = com.whatsapp.App.al;	 Catch:{ Exception -> 0x010f }
        r0 = r0.a();	 Catch:{ Exception -> 0x010f }
        r1 = r0;
    L_0x009b:
        if (r1 == 0) goto L_0x00a9;
    L_0x009d:
        r0 = r1.a;	 Catch:{ Exception -> 0x012d }
        if (r0 == 0) goto L_0x00a9;
    L_0x00a1:
        r0 = r1.a;	 Catch:{ Exception -> 0x012d }
        r0 = r0.isEmpty();	 Catch:{ Exception -> 0x012d }
        if (r0 == 0) goto L_0x00ae;
    L_0x00a9:
        r0 = "";
        if (r2 == 0) goto L_0x01b0;
    L_0x00ae:
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r0 = r1.a;
        r1 = r0.iterator();
    L_0x00b9:
        r0 = r1.hasNext();
        if (r0 == 0) goto L_0x00d8;
    L_0x00bf:
        r0 = r1.next();
        r0 = (com.whatsapp.util.d) r0;
        r4 = 9;
        r4 = r3.append(r4);
        r0 = r0.b;
        r0 = r4.append(r0);
        r4 = 10;
        r0.append(r4);
        if (r2 == 0) goto L_0x00b9;
    L_0x00d8:
        r0 = r3.length();
        r0 = r0 + -1;
        r3.setLength(r0);
        r0 = r3.toString();
        r1 = r0;
    L_0x00e6:
        r2 = new android.support.v7.app.AlertDialog$Builder;	 Catch:{ Exception -> 0x012f }
        r2.<init>(r6);	 Catch:{ Exception -> 0x012f }
        r0 = android.os.Build.VERSION.SDK_INT;	 Catch:{ Exception -> 0x012f }
        r3 = 7;
        if (r0 > r3) goto L_0x0131;
    L_0x00f0:
        r0 = 2131232140; // 0x7f08058c float:1.808038E38 double:1.0529685837E-314;
    L_0x00f3:
        r3 = 1;
        r3 = new java.lang.Object[r3];
        r3[r5] = r1;
        r0 = r6.getString(r0, r3);
        r0 = r2.setMessage(r0);
        r1 = new com.whatsapp.c;
        r1.<init>(r6);
        r0 = r0.setOnCancelListener(r1);
        r0 = r0.create();
        goto L_0x0013;
    L_0x010f:
        r0 = move-exception;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r3 = z;
        r4 = 3;
        r3 = r3[r4];
        r1 = r1.append(r3);
        r0 = r1.append(r0);
        r0 = r0.toString();
        com.whatsapp.util.Log.w(r0);
        r0 = 0;
        r1 = r0;
        goto L_0x009b;
    L_0x012d:
        r0 = move-exception;
        throw r0;
    L_0x012f:
        r0 = move-exception;
        throw r0;
    L_0x0131:
        r0 = 2131232139; // 0x7f08058b float:1.8080379E38 double:1.052968583E-314;
        goto L_0x00f3;
    L_0x0135:
        r0 = com.whatsapp.jf.AGREE_1;
        r6.n = r0;
        r0 = new android.support.v7.app.AlertDialog$Builder;
        r0.<init>(r6);
        r0 = r0.setTitle(r1);
        r1 = 2131232138; // 0x7f08058a float:1.8080377E38 double:1.0529685827E-314;
        r0 = r0.setMessage(r1);
        r0 = r0.setCancelable(r5);
        r1 = new com.whatsapp.g5;
        r1.<init>(r6);
        r0 = r0.setPositiveButton(r4, r1);
        r1 = new com.whatsapp.a3q;
        r1.<init>(r6);
        r0 = r0.setNegativeButton(r3, r1);
        r0 = r0.create();
        goto L_0x0013;
    L_0x0165:
        r0 = new android.support.v7.app.AlertDialog$Builder;
        r0.<init>(r6);
        r1 = 2131231016; // 0x7f080128 float:1.8078101E38 double:1.0529680284E-314;
        r0 = r0.setMessage(r1);
        r1 = new com.whatsapp.bs;
        r1.<init>(r6);
        r0 = r0.setOnCancelListener(r1);
        r0 = r0.create();
        goto L_0x0013;
    L_0x0180:
        r0 = com.whatsapp.jf.AGREE_2;
        r6.n = r0;
        r0 = new android.support.v7.app.AlertDialog$Builder;
        r0.<init>(r6);
        r0 = r0.setTitle(r1);
        r1 = 2131231015; // 0x7f080127 float:1.80781E38 double:1.052968028E-314;
        r0 = r0.setMessage(r1);
        r0 = r0.setCancelable(r5);
        r1 = new com.whatsapp.aoe;
        r1.<init>(r6);
        r0 = r0.setPositiveButton(r4, r1);
        r1 = new com.whatsapp.a27;
        r1.<init>(r6);
        r0 = r0.setNegativeButton(r3, r1);
        r0 = r0.create();
        goto L_0x0013;
    L_0x01b0:
        r1 = r0;
        goto L_0x00e6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.EULA.onCreateDialog(int):android.app.Dialog");
    }

    static jf a(EULA eula, jf jfVar) {
        eula.n = jfVar;
        return jfVar;
    }

    private void a() {
        Log.i(z[12]);
        vh.l(this);
        App.d((Context) this, 1);
        Intent intent = new Intent(this, RegisterPhone.class);
        intent.putExtra(z[11], true);
        startActivity(intent);
        finish();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case v.m /*0*/:
                e(z[0]);
                return true;
            case at.g /*1*/:
                ve.c();
                return true;
            case at.i /*2*/:
                ve.H();
                return true;
            default:
                return false;
        }
    }
}
