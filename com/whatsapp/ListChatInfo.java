package com.whatsapp;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.provider.ContactsContract.Contacts;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AlertDialog.Builder;
import android.text.TextUtils;
import android.transition.Slide;
import android.transition.Transition;
import android.transition.TransitionSet;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import com.whatsapp.util.Log;
import com.whatsapp.util.bq;
import com.whatsapp.util.cs;
import java.util.ArrayList;
import java.util.Collection;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class ListChatInfo extends ChatInfoActivity implements tm {
    private static final String[] M;
    private TextView A;
    private ChatInfoLayout B;
    private a2_ C;
    private TextView D;
    private View E;
    private ArrayList F;
    private ListView G;
    private ll H;
    private final akc I;
    private LinearLayout J;
    private View K;
    private j L;
    private View v;
    private ImageButton w;
    private l5 x;
    private l5 y;
    private ce z;

    static {
        String[] strArr = new String[24];
        String str = "n\u0002\\X?";
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
                        i3 = 30;
                        break;
                    case at.g /*1*/:
                        i3 = arj.Theme_ratingBarStyle;
                        break;
                    case at.i /*2*/:
                        i3 = 51;
                        break;
                    case at.o /*3*/:
                        i3 = 54;
                        break;
                    default:
                        i3 = 90;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "h\u0004W\u0018;p\u000eAY3zDPC(m\u0005A\u00183j\u000f^\u00199q\u0004GW9j";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "n\u0002\\X?A\u001eJF?";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "}\u0003AU/r\u000bAi.l\u000b]E3j\u0003\\X";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "y\u0003W";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "}\u0003AU/r\u000bAi.l\u000b]E3j\u0003\\X";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "r\u0003@B\u0005}\u0002RB\u0005w\u0004UYu}\u0018VW.{";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "R\u0003@B\u0019v\u000bG\u007f4x\u0005zX3j";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "y\u0003W";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "m\u000f_S9j\u000fWi0w\u000e";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "^\u0019\u001dA2\u007f\u001e@W*nD]S.";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "y\u0003W";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "r\u0003@B9v\u000bG_4x\u0005\u001cW>zJVN3m\u001eZX=>\t\\X.\u007f\tG\fz\u007f\tG_,w\u001eJ\u00164q\u001e\u0013P5k\u0004W\u001azn\u0018\\T;|\u0006J\u0016.\u007f\b_S.";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "t\u0003W";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "r\u0003@B9v\u000bG_4x\u0005\u001cU({\u000bG_5pGG_7{EVD(q\u0018\u0013";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "m\u000f_S9j\u000fWi0w\u000e";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "r\u0003@B\u0005}\u0002RB\u0005w\u0004UYul\u000f@C6jEPY4j\u000bPBzp\u0005G\u0016;z\u000eVR";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "}\u0005]B;}\u001e";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "r\u0003@B\u0005}\u0002RB\u0005w\u0004UYul\u000f@C6jE@]3nEPY4j\u000bPBzp\u0005G\u0016;z\u000eVR";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "r\u0003@B\u0005}\u0002RB\u0005w\u0004UYuz\u000f@B(q\u0013";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "y\u0018\\C*>\u0003]P51\t\\X.{\u0012G\u0016)g\u0019GS7>\t\\X.\u007f\tG\u00166w\u0019G\u00169q\u001f_Rzp\u0005G\u0016<q\u001f]R";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "\u007f\u0004WD5w\u000e\u001d_4j\u000f]Bt\u007f\tG_5pDzx\t[8g";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "n\u0002\\X?";
                    obj = 22;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i] = str;
                    M = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u007f\u0004WD5w\u000e\u001d_4j\u000f]Bt\u007f\tG_5pDzx\t[8gi\u0015L5vr\u0013J";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    static void i(ListChatInfo listChatInfo) {
        listChatInfo.l();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m() {
        /*
        r5 = this;
        r0 = com.whatsapp.a59.j;	 Catch:{ NumberFormatException -> 0x0058 }
        if (r0 != 0) goto L_0x001c;
    L_0x0004:
        r0 = r5.A;	 Catch:{ NumberFormatException -> 0x005a }
        r1 = java.text.NumberFormat.getInstance();	 Catch:{ NumberFormatException -> 0x005a }
        r2 = r5.F;	 Catch:{ NumberFormatException -> 0x005a }
        r2 = r2.size();	 Catch:{ NumberFormatException -> 0x005a }
        r2 = (long) r2;	 Catch:{ NumberFormatException -> 0x005a }
        r1 = r1.format(r2);	 Catch:{ NumberFormatException -> 0x005a }
        r0.setText(r1);	 Catch:{ NumberFormatException -> 0x005a }
        r0 = com.whatsapp.DialogToastActivity.f;	 Catch:{ NumberFormatException -> 0x005a }
        if (r0 == 0) goto L_0x0041;
    L_0x001c:
        r0 = r5.A;	 Catch:{ NumberFormatException -> 0x005a }
        r1 = 2131231591; // 0x7f080367 float:1.8079267E38 double:1.0529683124E-314;
        r2 = 2;
        r2 = new java.lang.Object[r2];	 Catch:{ NumberFormatException -> 0x005a }
        r3 = 0;
        r4 = r5.F;	 Catch:{ NumberFormatException -> 0x005a }
        r4 = r4.size();	 Catch:{ NumberFormatException -> 0x005a }
        r4 = java.lang.Integer.valueOf(r4);	 Catch:{ NumberFormatException -> 0x005a }
        r2[r3] = r4;	 Catch:{ NumberFormatException -> 0x005a }
        r3 = 1;
        r4 = com.whatsapp.a59.j;	 Catch:{ NumberFormatException -> 0x005a }
        r4 = java.lang.Integer.valueOf(r4);	 Catch:{ NumberFormatException -> 0x005a }
        r2[r3] = r4;	 Catch:{ NumberFormatException -> 0x005a }
        r1 = r5.getString(r1, r2);	 Catch:{ NumberFormatException -> 0x005a }
        r0.setText(r1);	 Catch:{ NumberFormatException -> 0x005a }
    L_0x0041:
        r0 = r5.F;
        r1 = new com.whatsapp.t2;
        r2 = r5.getApplicationContext();
        r1.<init>(r2);
        java.util.Collections.sort(r0, r1);
        r0 = r5.H;
        r0.notifyDataSetChanged();
        r5.b();
        return;
    L_0x0058:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x005a }
    L_0x005a:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ListChatInfo.m():void");
    }

    public void finishAfterTransition() {
        if (VERSION.SDK_INT >= 21) {
            this.v.setTransitionName(null);
            Transition transitionSet = new TransitionSet();
            Transition slide = new Slide(48);
            slide.addTarget(this.v);
            transitionSet.addTransition(slide);
            slide = new Slide(80);
            slide.addTarget(this.G);
            transitionSet.addTransition(slide);
            getWindow().setReturnTransition(transitionSet);
        }
        super.finishAfterTransition();
    }

    static ArrayList h(ListChatInfo listChatInfo) {
        return listChatInfo.F;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean a(com.whatsapp.l5 r5, int r6) {
        /*
        r4 = this;
        r1 = 0;
        r3 = 1;
        switch(r6) {
            case 0: goto L_0x0006;
            case 1: goto L_0x0027;
            case 2: goto L_0x0010;
            case 3: goto L_0x0023;
            case 4: goto L_0x002f;
            case 5: goto L_0x0035;
            case 6: goto L_0x003a;
            default: goto L_0x0005;
        };
    L_0x0005:
        return r3;
    L_0x0006:
        r0 = r5.l;	 Catch:{ NumberFormatException -> 0x000e }
        if (r0 == 0) goto L_0x0005;
    L_0x000a:
        com.whatsapp.ContactInfo.a(r5, r4);	 Catch:{ NumberFormatException -> 0x000e }
        goto L_0x0005;
    L_0x000e:
        r0 = move-exception;
        throw r0;
    L_0x0010:
        if (r5 != 0) goto L_0x001d;
    L_0x0012:
        r0 = 2131231272; // 0x7f080228 float:1.807862E38 double:1.052968155E-314;
        r1 = 0;
        com.whatsapp.App.a(r4, r0, r1);	 Catch:{ NumberFormatException -> 0x0021 }
        r0 = com.whatsapp.DialogToastActivity.f;	 Catch:{ NumberFormatException -> 0x0021 }
        if (r0 == 0) goto L_0x0005;
    L_0x001d:
        r4.b(r5);	 Catch:{ NumberFormatException -> 0x0021 }
        goto L_0x0005;
    L_0x0021:
        r0 = move-exception;
        throw r0;
    L_0x0023:
        r4.i();
        goto L_0x0005;
    L_0x0027:
        r0 = com.whatsapp.Conversation.a(r5);
        r4.startActivity(r0);
        goto L_0x0005;
    L_0x002f:
        r0 = com.whatsapp.fieldstats.cd.ANDROID_LIST_CHAT_INFO;
        com.whatsapp.App.a(r5, r4, r0, r1);
        goto L_0x0005;
    L_0x0035:
        r0 = 6;
        r4.showDialog(r0);
        goto L_0x0005;
    L_0x003a:
        r0 = new android.content.Intent;
        r1 = com.whatsapp.IdentityVerificationActivity.class;
        r0.<init>(r4, r1);
        r1 = M;
        r2 = 14;
        r1 = r1[r2];
        r2 = r4.x;
        r2 = r2.p;
        r0.putExtra(r1, r2);
        r4.startActivity(r0);
        goto L_0x0005;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ListChatInfo.a(com.whatsapp.l5, int):boolean");
    }

    public void onResume() {
        this.z.b(t4.ON_RESUME);
        super.onResume();
        this.z.a(t4.ON_RESUME);
    }

    public void a(String str) {
        if (!str.equals(App.ad() + M[11])) {
            l5.a(this.F, new aa_(App.as.b(str)));
            this.H.notifyDataSetChanged();
        }
    }

    public ListChatInfo() {
        this.F = new ArrayList();
        this.C = new a2_();
        this.I = new ato(this);
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        this.x = ((am0) ((AdapterContextMenuInfo) menuItem.getMenuInfo()).targetView.getTag()).e;
        a(this.x, menuItem.getItemId());
        return true;
    }

    static l5 g(ListChatInfo listChatInfo) {
        return listChatInfo.x;
    }

    public void onDestroy() {
        try {
            Log.i(M[20]);
            super.onDestroy();
            this.z.b();
            if (this.L != null) {
                this.L.cancel(true);
            }
            this.C.a();
            App.aK.a(this.I);
            App.a((tm) this);
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    static void a(ListChatInfo listChatInfo, View view) {
        listChatInfo.a(view);
    }

    static a2_ a(ListChatInfo listChatInfo) {
        return listChatInfo.C;
    }

    public void d(String str) {
        if (!qm.i(str)) {
            l5.a(this.F, new aas(App.as.b(str)));
            this.H.notifyDataSetChanged();
        }
    }

    private void l() {
        if (this.F.size() < a59.j) {
            Intent intent = new Intent(this, ContactPicker.class);
            try {
                intent.putExtra(M[12], this.y.p);
                startActivityForResult(intent, 1);
                if (!DialogToastActivity.f) {
                    return;
                }
            } catch (NumberFormatException e) {
                throw e;
            }
        }
        new Builder(this).setTitle(getString(2131230798)).setMessage(getString(2131230852, new Object[]{Integer.valueOf(a59.j)})).setPositiveButton(getString(2131231580), new se(this)).create().show();
    }

    private void n() {
        try {
            String i = cs.i(this, Long.parseLong(this.y.j));
            this.D.setText(getResources().getString(2131231284, new Object[]{i}));
            this.D.setVisibility(0);
        } catch (NumberFormatException e) {
            Log.e(M[15] + e);
            this.D.setVisibility(8);
        }
        try {
            if (this.L != null) {
                this.L.cancel(true);
            }
            f();
            setSupportProgressBarIndeterminateVisibility(true);
            this.L = new j(this, null);
            bq.a(this.L, new Void[0]);
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void k() {
        /*
        r6 = this;
        r2 = com.whatsapp.DialogToastActivity.f;
        r0 = com.whatsapp.App.aZ();
        if (r0 == 0) goto L_0x007b;
    L_0x0008:
        r0 = 2131755199; // 0x7f1000bf float:1.914127E38 double:1.053227009E-314;
        r0 = r6.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r1 = 2131755200; // 0x7f1000c0 float:1.9141273E38 double:1.0532270097E-314;
        r1 = r6.findViewById(r1);
        r1 = (android.widget.ImageView) r1;
        r3 = com.whatsapp.App.as;	 Catch:{ NumberFormatException -> 0x0094 }
        r4 = r6.y;	 Catch:{ NumberFormatException -> 0x0094 }
        r4 = r4.p;	 Catch:{ NumberFormatException -> 0x0094 }
        r5 = com.whatsapp.it.ALLOW;	 Catch:{ NumberFormatException -> 0x0094 }
        r3 = r3.a(r4, r5);	 Catch:{ NumberFormatException -> 0x0094 }
        if (r3 == 0) goto L_0x003f;
    L_0x0028:
        r3 = 2131230848; // 0x7f080080 float:1.807776E38 double:1.0529679454E-314;
        r0.setText(r3);	 Catch:{ NumberFormatException -> 0x0096 }
        r3 = new com.whatsapp.util.bz;	 Catch:{ NumberFormatException -> 0x0096 }
        r4 = 2130839485; // 0x7f0207bd float:1.7283982E38 double:1.0527745863E-314;
        r4 = android.support.v4.content.ContextCompat.getDrawable(r6, r4);	 Catch:{ NumberFormatException -> 0x0096 }
        r3.<init>(r4);	 Catch:{ NumberFormatException -> 0x0096 }
        r1.setImageDrawable(r3);	 Catch:{ NumberFormatException -> 0x0096 }
        if (r2 == 0) goto L_0x0054;
    L_0x003f:
        r3 = 2131230850; // 0x7f080082 float:1.8077764E38 double:1.0529679463E-314;
        r0.setText(r3);	 Catch:{ NumberFormatException -> 0x0096 }
        r0 = new com.whatsapp.util.bz;	 Catch:{ NumberFormatException -> 0x0096 }
        r3 = 2130839484; // 0x7f0207bc float:1.728398E38 double:1.052774586E-314;
        r3 = android.support.v4.content.ContextCompat.getDrawable(r6, r3);	 Catch:{ NumberFormatException -> 0x0096 }
        r0.<init>(r3);	 Catch:{ NumberFormatException -> 0x0096 }
        r1.setImageDrawable(r0);	 Catch:{ NumberFormatException -> 0x0096 }
    L_0x0054:
        r0 = 2131755198; // 0x7f1000be float:1.9141269E38 double:1.0532270087E-314;
        r0 = r6.findViewById(r0);	 Catch:{ NumberFormatException -> 0x0098 }
        r1 = new com.whatsapp.y6;	 Catch:{ NumberFormatException -> 0x0098 }
        r1.<init>(r6);	 Catch:{ NumberFormatException -> 0x0098 }
        r0.setOnClickListener(r1);	 Catch:{ NumberFormatException -> 0x0098 }
        r0 = 2131755198; // 0x7f1000be float:1.9141269E38 double:1.0532270087E-314;
        r0 = r6.findViewById(r0);	 Catch:{ NumberFormatException -> 0x0098 }
        r1 = 0;
        r0.setVisibility(r1);	 Catch:{ NumberFormatException -> 0x0098 }
        r0 = 2131755197; // 0x7f1000bd float:1.9141266E38 double:1.053227008E-314;
        r0 = r6.findViewById(r0);	 Catch:{ NumberFormatException -> 0x0098 }
        r1 = 0;
        r0.setVisibility(r1);	 Catch:{ NumberFormatException -> 0x0098 }
        if (r2 == 0) goto L_0x0093;
    L_0x007b:
        r0 = 2131755198; // 0x7f1000be float:1.9141269E38 double:1.0532270087E-314;
        r0 = r6.findViewById(r0);	 Catch:{ NumberFormatException -> 0x0098 }
        r1 = 8;
        r0.setVisibility(r1);	 Catch:{ NumberFormatException -> 0x0098 }
        r0 = 2131755197; // 0x7f1000bd float:1.9141266E38 double:1.053227008E-314;
        r0 = r6.findViewById(r0);	 Catch:{ NumberFormatException -> 0x0098 }
        r1 = 8;
        r0.setVisibility(r1);	 Catch:{ NumberFormatException -> 0x0098 }
    L_0x0093:
        return;
    L_0x0094:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0096 }
    L_0x0096:
        r0 = move-exception;
        throw r0;
    L_0x0098:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ListChatInfo.k():void");
    }

    protected void onSaveInstanceState(Bundle bundle) {
        try {
            super.onSaveInstanceState(bundle);
            if (this.x != null) {
                bundle.putString(M[16], this.x.p);
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    private void a(View view) {
        view.getViewTreeObserver().addOnPreDrawListener(new amv(this, view));
    }

    public String a() {
        try {
            return this.y == null ? null : this.y.p;
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    private void a(l5 l5Var) {
        qm.b(this.y.p, l5Var.p);
        this.F.remove(l5Var);
        k();
        m();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected android.app.Dialog onCreateDialog(int r9) {
        /*
        r8 = this;
        r5 = 2131230884; // 0x7f0800a4 float:1.8077833E38 double:1.052967963E-314;
        r4 = 2131231580; // 0x7f08035c float:1.8079245E38 double:1.052968307E-314;
        r3 = 1;
        r6 = 0;
        switch(r9) {
            case 2: goto L_0x002e;
            case 4: goto L_0x00ca;
            case 6: goto L_0x0082;
            case 50: goto L_0x0010;
            default: goto L_0x000b;
        };
    L_0x000b:
        r0 = super.onCreateDialog(r9);
    L_0x000f:
        return r0;
    L_0x0010:
        r4 = new com.whatsapp.jj;
        r4.<init>(r8);
        r0 = new com.whatsapp.aij;
        r2 = 2131231080; // 0x7f080168 float:1.807823E38 double:1.05296806E-314;
        r1 = com.whatsapp.App.as;
        r3 = r8.y;
        r3 = r3.p;
        r1 = r1.c(r3);
        r3 = r1.q;
        r5 = com.whatsapp.a59.h;
        r1 = r8;
        r7 = r6;
        r0.<init>(r1, r2, r3, r4, r5, r6, r7);
        goto L_0x000f;
    L_0x002e:
        r0 = r8.y;
        r0 = r0.a(r8);
        r0 = android.text.TextUtils.isEmpty(r0);
        if (r0 == 0) goto L_0x0045;
    L_0x003a:
        r0 = 2131231059; // 0x7f080153 float:1.8078188E38 double:1.0529680496E-314;
        r0 = r8.getString(r0);
        r1 = com.whatsapp.DialogToastActivity.f;
        if (r1 == 0) goto L_0x0056;
    L_0x0045:
        r0 = 2131231058; // 0x7f080152 float:1.8078186E38 double:1.052968049E-314;
        r1 = new java.lang.Object[r3];
        r2 = r8.y;
        r2 = r2.a(r8);
        r1[r6] = r2;
        r0 = r8.getString(r0, r1);
    L_0x0056:
        r1 = new android.support.v7.app.AlertDialog$Builder;
        r1.<init>(r8);
        r2 = r8.getBaseContext();
        r0 = com.whatsapp.a28.b(r0, r2);
        r0 = r1.setMessage(r0);
        r0 = r0.setCancelable(r3);
        r1 = new com.whatsapp.asv;
        r1.<init>(r8);
        r0 = r0.setNegativeButton(r5, r1);
        r1 = new com.whatsapp.ho;
        r1.<init>(r8);
        r0 = r0.setPositiveButton(r4, r1);
        r0 = r0.create();
        goto L_0x000f;
    L_0x0082:
        r0 = r8.x;
        if (r0 == 0) goto L_0x00c4;
    L_0x0086:
        r0 = 2131231828; // 0x7f080454 float:1.8079748E38 double:1.0529684295E-314;
        r1 = new java.lang.Object[r3];
        r2 = r8.x;
        r2 = r2.a(r8);
        r1[r6] = r2;
        r0 = r8.getString(r0, r1);
        r1 = new android.support.v7.app.AlertDialog$Builder;
        r1.<init>(r8);
        r2 = r8.getBaseContext();
        r0 = com.whatsapp.a28.b(r0, r2);
        r0 = r1.setMessage(r0);
        r0 = r0.setCancelable(r3);
        r1 = new com.whatsapp.op;
        r1.<init>(r8);
        r0 = r0.setNegativeButton(r5, r1);
        r1 = new com.whatsapp.aev;
        r1.<init>(r8);
        r0 = r0.setPositiveButton(r4, r1);
        r0 = r0.create();
        goto L_0x000f;
    L_0x00c4:
        r0 = super.onCreateDialog(r9);
        goto L_0x000f;
    L_0x00ca:
        r0 = M;
        r1 = 13;
        r0 = r0[r1];
        com.whatsapp.util.Log.w(r0);
        r0 = new android.support.v7.app.AlertDialog$Builder;
        r0.<init>(r8);
        r1 = 2131230782; // 0x7f08003e float:1.8077626E38 double:1.0529679127E-314;
        r0 = r0.setMessage(r1);
        r1 = new com.whatsapp.k7;
        r1.<init>(r8);
        r0 = r0.setPositiveButton(r4, r1);
        r0 = r0.create();
        goto L_0x000f;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ListChatInfo.onCreateDialog(int):android.app.Dialog");
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuItemCompat.setShowAsAction(menu.add(0, 1, 0, 2131230784).setIcon(2130839423), 2);
        return super.onCreateOptionsMenu(menu);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreateContextMenu(android.view.ContextMenu r10, android.view.View r11, android.view.ContextMenu.ContextMenuInfo r12) {
        /*
        r9 = this;
        r8 = 1;
        super.onCreateContextMenu(r10, r11, r12);
        r12 = (android.widget.AdapterView.AdapterContextMenuInfo) r12;
        r0 = r12.targetView;
        r0 = r0.getTag();
        r0 = (com.whatsapp.am0) r0;
        r0 = r0.e;
        if (r0 != 0) goto L_0x0013;
    L_0x0012:
        return;
    L_0x0013:
        r1 = 0;
        r2 = 1;
        r3 = 0;
        r4 = 2131231445; // 0x7f0802d5 float:1.8078971E38 double:1.0529682403E-314;
        r5 = 1;
        r5 = new java.lang.Object[r5];	 Catch:{ NumberFormatException -> 0x00b0 }
        r6 = 0;
        r7 = r0.i();	 Catch:{ NumberFormatException -> 0x00b0 }
        r5[r6] = r7;	 Catch:{ NumberFormatException -> 0x00b0 }
        r4 = r9.getString(r4, r5);	 Catch:{ NumberFormatException -> 0x00b0 }
        r10.add(r1, r2, r3, r4);	 Catch:{ NumberFormatException -> 0x00b0 }
        r1 = 0;
        r2 = 4;
        r3 = 0;
        r4 = 2131230866; // 0x7f080092 float:1.8077797E38 double:1.0529679542E-314;
        r5 = 1;
        r5 = new java.lang.Object[r5];	 Catch:{ NumberFormatException -> 0x00b0 }
        r6 = 0;
        r7 = r0.i();	 Catch:{ NumberFormatException -> 0x00b0 }
        r5[r6] = r7;	 Catch:{ NumberFormatException -> 0x00b0 }
        r4 = r9.getString(r4, r5);	 Catch:{ NumberFormatException -> 0x00b0 }
        r10.add(r1, r2, r3, r4);	 Catch:{ NumberFormatException -> 0x00b0 }
        r1 = r0.l;	 Catch:{ NumberFormatException -> 0x00b0 }
        if (r1 != 0) goto L_0x0063;
    L_0x0045:
        r1 = 0;
        r2 = 2;
        r3 = 0;
        r4 = 2131230786; // 0x7f080042 float:1.8077635E38 double:1.0529679147E-314;
        r4 = r9.getString(r4);	 Catch:{ NumberFormatException -> 0x00b2 }
        r10.add(r1, r2, r3, r4);	 Catch:{ NumberFormatException -> 0x00b2 }
        r1 = 0;
        r2 = 3;
        r3 = 0;
        r4 = 2131230789; // 0x7f080045 float:1.807764E38 double:1.052967916E-314;
        r4 = r9.getString(r4);	 Catch:{ NumberFormatException -> 0x00b2 }
        r10.add(r1, r2, r3, r4);	 Catch:{ NumberFormatException -> 0x00b2 }
        r1 = com.whatsapp.DialogToastActivity.f;	 Catch:{ NumberFormatException -> 0x00b2 }
        if (r1 == 0) goto L_0x007a;
    L_0x0063:
        r1 = 0;
        r2 = 0;
        r3 = 0;
        r4 = 2131232228; // 0x7f0805e4 float:1.808056E38 double:1.052968627E-314;
        r5 = 1;
        r5 = new java.lang.Object[r5];	 Catch:{ NumberFormatException -> 0x00b2 }
        r6 = 0;
        r7 = r0.i();	 Catch:{ NumberFormatException -> 0x00b2 }
        r5[r6] = r7;	 Catch:{ NumberFormatException -> 0x00b2 }
        r4 = r9.getString(r4, r5);	 Catch:{ NumberFormatException -> 0x00b2 }
        r10.add(r1, r2, r3, r4);	 Catch:{ NumberFormatException -> 0x00b2 }
    L_0x007a:
        r1 = r9.F;	 Catch:{ NumberFormatException -> 0x00b4 }
        r1 = r1.size();	 Catch:{ NumberFormatException -> 0x00b4 }
        if (r1 <= r8) goto L_0x0099;
    L_0x0082:
        r1 = 0;
        r2 = 5;
        r3 = 0;
        r4 = 2131231819; // 0x7f08044b float:1.807973E38 double:1.052968425E-314;
        r5 = 1;
        r5 = new java.lang.Object[r5];	 Catch:{ NumberFormatException -> 0x00b4 }
        r6 = 0;
        r0 = r0.i();	 Catch:{ NumberFormatException -> 0x00b4 }
        r5[r6] = r0;	 Catch:{ NumberFormatException -> 0x00b4 }
        r0 = r9.getString(r4, r5);	 Catch:{ NumberFormatException -> 0x00b4 }
        r10.add(r1, r2, r3, r0);	 Catch:{ NumberFormatException -> 0x00b4 }
    L_0x0099:
        r0 = com.whatsapp.App.aZ();	 Catch:{ NumberFormatException -> 0x00ae }
        if (r0 == 0) goto L_0x0012;
    L_0x009f:
        r0 = 0;
        r1 = 6;
        r2 = 0;
        r3 = 2131232200; // 0x7f0805c8 float:1.8080503E38 double:1.0529686133E-314;
        r3 = r9.getString(r3);	 Catch:{ NumberFormatException -> 0x00ae }
        r10.add(r0, r1, r2, r3);	 Catch:{ NumberFormatException -> 0x00ae }
        goto L_0x0012;
    L_0x00ae:
        r0 = move-exception;
        throw r0;
    L_0x00b0:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x00b2 }
    L_0x00b2:
        r0 = move-exception;
        throw r0;
    L_0x00b4:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ListChatInfo.onCreateContextMenu(android.view.ContextMenu, android.view.View, android.view.ContextMenu$ContextMenuInfo):void");
    }

    public void b(String str) {
    }

    private void i() {
        try {
            Intent intent = new Intent(M[1]);
            intent.setType(M[2]);
            intent.putExtra(M[0], this.x.a((Context) this));
            intent.putExtra(M[3], 2);
            intent.setFlags(524288);
            startActivityForResult(intent, 11);
        } catch (ActivityNotFoundException e) {
            showDialog(4);
        }
    }

    static ce b(ListChatInfo listChatInfo) {
        return listChatInfo.z;
    }

    static void j(ListChatInfo listChatInfo) {
        listChatInfo.j();
    }

    public static void a(l5 l5Var, Activity activity) {
        a(l5Var, activity, null);
    }

    public static void a(l5 l5Var, Activity activity, ActivityOptionsCompat activityOptionsCompat) {
        Intent intent = new Intent(activity, ListChatInfo.class);
        try {
            Bundle bundle;
            intent.putExtra(M[5], l5Var.p);
            intent.putExtra(M[4], true);
            if (activityOptionsCompat == null) {
                bundle = null;
            } else {
                bundle = activityOptionsCompat.toBundle();
            }
            ActivityCompat.startActivity(activity, intent, bundle);
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    private void b(l5 l5Var) {
        String s = l5Var.s();
        Intent intent = new Intent(M[22], Contacts.CONTENT_URI);
        try {
            intent.putExtra(M[23], s);
            intent.setComponent(intent.resolveActivity(getPackageManager()));
            if (intent.getComponent() != null) {
                startActivityForResult(intent, 10);
                if (!DialogToastActivity.f) {
                    return;
                }
            }
            Log.i(M[21]);
            App.aa();
        } catch (NumberFormatException e) {
            throw e;
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    public void c(String str) {
    }

    static void a(ListChatInfo listChatInfo, l5 l5Var) {
        listChatInfo.a(l5Var);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onActivityResult(int r6, int r7, android.content.Intent r8) {
        /*
        r5 = this;
        r4 = -1;
        r0 = com.whatsapp.DialogToastActivity.f;
        switch(r6) {
            case 1: goto L_0x004e;
            case 10: goto L_0x0007;
            case 11: goto L_0x0035;
            default: goto L_0x0006;
        };
    L_0x0006:
        return;
    L_0x0007:
        if (r7 != r4) goto L_0x002a;
    L_0x0009:
        if (r8 == 0) goto L_0x001e;
    L_0x000b:
        r1 = r8.getData();	 Catch:{ NumberFormatException -> 0x005e }
        if (r1 == 0) goto L_0x001e;
    L_0x0011:
        r1 = com.whatsapp.App.as;	 Catch:{ NumberFormatException -> 0x0060 }
        r2 = r8.getData();	 Catch:{ NumberFormatException -> 0x0060 }
        r3 = r5.x;	 Catch:{ NumberFormatException -> 0x0060 }
        r1.a(r2, r3);	 Catch:{ NumberFormatException -> 0x0060 }
        if (r0 == 0) goto L_0x0025;
    L_0x001e:
        r1 = com.whatsapp.App.as;	 Catch:{ NumberFormatException -> 0x0060 }
        r2 = r5.x;	 Catch:{ NumberFormatException -> 0x0060 }
        r1.n(r2);	 Catch:{ NumberFormatException -> 0x0060 }
    L_0x0025:
        r5.m();	 Catch:{ NumberFormatException -> 0x0062 }
        if (r0 == 0) goto L_0x0006;
    L_0x002a:
        r1 = M;	 Catch:{ NumberFormatException -> 0x0064 }
        r2 = 17;
        r1 = r1[r2];	 Catch:{ NumberFormatException -> 0x0064 }
        com.whatsapp.util.Log.i(r1);	 Catch:{ NumberFormatException -> 0x0064 }
        if (r0 == 0) goto L_0x0006;
    L_0x0035:
        if (r7 != r4) goto L_0x0043;
    L_0x0037:
        r1 = com.whatsapp.App.as;	 Catch:{ NumberFormatException -> 0x0068 }
        r2 = r5.x;	 Catch:{ NumberFormatException -> 0x0068 }
        r1.n(r2);	 Catch:{ NumberFormatException -> 0x0068 }
        r5.m();	 Catch:{ NumberFormatException -> 0x0068 }
        if (r0 == 0) goto L_0x0006;
    L_0x0043:
        r1 = M;	 Catch:{ NumberFormatException -> 0x006a }
        r2 = 19;
        r1 = r1[r2];	 Catch:{ NumberFormatException -> 0x006a }
        com.whatsapp.util.Log.i(r1);	 Catch:{ NumberFormatException -> 0x006a }
        if (r0 == 0) goto L_0x0006;
    L_0x004e:
        if (r7 != r4) goto L_0x0006;
    L_0x0050:
        r0 = M;
        r1 = 18;
        r0 = r0[r1];
        r0 = r8.getStringExtra(r0);
        r5.e(r0);
        goto L_0x0006;
    L_0x005e:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0060 }
    L_0x0060:
        r0 = move-exception;
        throw r0;
    L_0x0062:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0064 }
    L_0x0064:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0066 }
    L_0x0066:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0068 }
    L_0x0068:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x006a }
    L_0x006a:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ListChatInfo.onActivityResult(int, int, android.content.Intent):void");
    }

    public void a(Collection collection) {
    }

    static ChatInfoLayout c(ListChatInfo listChatInfo) {
        return listChatInfo.B;
    }

    private void b() {
        try {
            if (TextUtils.isEmpty(this.y.q)) {
                this.B.setTitleText(String.format(App.az.a(2131296262, this.F.size()), new Object[]{Integer.valueOf(this.F.size())}));
                if (!DialogToastActivity.f) {
                    return;
                }
            }
            this.B.setTitleText(this.y.a((Context) this));
        } catch (NumberFormatException e) {
            throw e;
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    static void e(ListChatInfo listChatInfo) {
        listChatInfo.b();
    }

    static l5 b(ListChatInfo listChatInfo, l5 l5Var) {
        listChatInfo.x = l5Var;
        return l5Var;
    }

    public void m462a() {
        boolean z = DialogToastActivity.f;
        this.F.clear();
        for (String b : qm.c(this.y.p).l()) {
            l5 b2 = App.as.b(b);
            try {
                if (!this.F.contains(b2)) {
                    this.F.add(b2);
                    continue;
                }
                if (z) {
                    break;
                }
            } catch (NumberFormatException e) {
                throw e;
            }
        }
        k();
        m();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r10) {
        /*
        r9 = this;
        r2 = 1;
        r8 = 0;
        r7 = 8;
        r1 = 0;
        r3 = com.whatsapp.DialogToastActivity.f;
        r0 = M;
        r4 = 7;
        r0 = r0[r4];
        com.whatsapp.util.Log.i(r0);
        r0 = 5;
        r9.supportRequestWindowFeature(r0);
        r0 = M;
        r0 = r0[r7];
        r0 = com.whatsapp.tp.a(r0);
        r9.z = r0;
        r0 = r9.z;
        r0.e();
        r0 = r9.z;
        r4 = com.whatsapp.t4.ON_CREATE;
        r0.b(r4);
        super.onCreate(r10);
        r9.supportPostponeEnterTransition();
        r0 = r9.getLayoutInflater();
        r4 = 2130903193; // 0x7f030099 float:1.7413197E38 double:1.0528060623E-314;
        r0 = com.whatsapp.aam.a(r0, r4, r8, r1);
        r0 = (com.whatsapp.ChatInfoLayout) r0;
        r9.B = r0;
        r0 = r9.B;
        r9.setContentView(r0);
        r0 = 2131755438; // 0x7f1001ae float:1.9141755E38 double:1.0532271273E-314;
        r0 = r9.findViewById(r0);
        r0 = (android.support.v7.widget.Toolbar) r0;
        r4 = "";
        r0.setTitle(r4);
        r0.setContentInsetsAbsolute(r1, r1);
        r9.setSupportActionBar(r0);
        r4 = r9.getSupportActionBar();
        r4.setDisplayHomeAsUpEnabled(r2);
        r4 = new com.whatsapp.util.bz;
        r5 = 2130839456; // 0x7f0207a0 float:1.7283923E38 double:1.052774572E-314;
        r5 = android.support.v4.content.ContextCompat.getDrawable(r9, r5);
        r4.<init>(r5);
        r0.setNavigationIcon(r4);
        r0 = r9.a();
        r9.G = r0;
        r0 = r9.getLayoutInflater();
        r4 = 2130903195; // 0x7f03009b float:1.7413201E38 double:1.0528060633E-314;
        r5 = r9.G;
        r0 = com.whatsapp.aam.a(r0, r4, r5, r1);
        r9.K = r0;
        r0 = r9.G;
        r4 = r9.K;
        r0.addHeaderView(r4, r8, r1);
        r0 = 2131755330; // 0x7f100142 float:1.9141536E38 double:1.053227074E-314;
        r0 = r9.findViewById(r0);
        r9.v = r0;
        r0 = r9.B;
        r0.c();
        r0 = r9.B;
        r4 = 2131624053; // 0x7f0e0075 float:1.8875275E38 double:1.0531622144E-314;
        r4 = android.support.v4.content.ContextCompat.getColor(r9, r4);
        r0.setColor(r4);
        r0 = r9.B;
        r4 = r9.getResources();
        r5 = 2131427368; // 0x7f0b0028 float:1.847635E38 double:1.053065039E-314;
        r4 = r4.getDimensionPixelSize(r5);
        r5 = r9.getResources();
        r6 = 2131427368; // 0x7f0b0028 float:1.847635E38 double:1.053065039E-314;
        r5 = r5.getDimensionPixelSize(r6);
        r0.setCollapsedPadding(r4, r5);
        r0 = r9.getLayoutInflater();
        r4 = 2130903194; // 0x7f03009a float:1.74132E38 double:1.052806063E-314;
        r5 = r9.G;
        r0 = com.whatsapp.aam.a(r0, r4, r5, r1);
        r9.E = r0;
        r0 = r9.G;
        r4 = r9.E;
        r0.addFooterView(r4, r8, r1);
        r0 = new android.widget.LinearLayout;
        r0.<init>(r9);
        r9.J = r0;
        r0 = r9.getWindowManager();
        r0 = r0.getDefaultDisplay();
        r0 = r0.getHeight();
        r4 = r9.J;
        r4.setPadding(r1, r1, r1, r0);
        r0 = r9.G;
        r4 = r9.J;
        r0.addFooterView(r4, r8, r1);
        r0 = com.whatsapp.App.as;
        r4 = r9.getIntent();
        r5 = M;
        r6 = 9;
        r5 = r5[r6];
        r4 = r4.getStringExtra(r5);
        r0 = r0.b(r4);
        r9.y = r0;
        r0 = new com.whatsapp.ll;
        r4 = 2130903247; // 0x7f0300cf float:1.7413307E38 double:1.052806089E-314;
        r5 = r9.F;
        r0.<init>(r9, r9, r4, r5);
        r9.H = r0;
        r0 = 2131755330; // 0x7f100142 float:1.9141536E38 double:1.053227074E-314;
        r0 = r9.findViewById(r0);
        r9.v = r0;
        r0 = r9.G;
        r4 = new com.whatsapp.az_;
        r4.<init>(r9);
        r0.setOnScrollListener(r4);
        r0 = r9.G;
        r0 = r0.getViewTreeObserver();
        r4 = new com.whatsapp.a_0;
        r4.<init>(r9);
        r0.addOnGlobalLayoutListener(r4);
        r0 = r9.G;
        r4 = new com.whatsapp.fy;
        r4.<init>(r9);
        r0.setOnItemClickListener(r4);
        r0 = 2131755687; // 0x7f1002a7 float:1.914226E38 double:1.0532272503E-314;
        r4 = r9.findViewById(r0);
        r0 = 2131755689; // 0x7f1002a9 float:1.9142264E38 double:1.0532272513E-314;
        r0 = r4.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r5 = 2131230784; // 0x7f080040 float:1.807763E38 double:1.0529679137E-314;
        r0.setText(r5);
        r4.setVisibility(r1);
        r0 = new com.whatsapp.aku;
        r0.<init>(r9);
        r4.setOnClickListener(r0);
        r0 = 2131755748; // 0x7f1002e4 float:1.9142384E38 double:1.0532272804E-314;
        r0 = r9.findViewById(r0);
        r0.setVisibility(r7);
        r0 = 2131755182; // 0x7f1000ae float:1.9141236E38 double:1.053227001E-314;
        r0 = r9.findViewById(r0);
        r0.setVisibility(r7);
        r0 = 2131755186; // 0x7f1000b2 float:1.9141244E38 double:1.0532270027E-314;
        r0 = r9.findViewById(r0);
        r0.setVisibility(r7);
        r0 = 2131755185; // 0x7f1000b1 float:1.9141242E38 double:1.0532270023E-314;
        r0 = r9.findViewById(r0);
        r0.setVisibility(r7);
        r0 = 2131755429; // 0x7f1001a5 float:1.9141737E38 double:1.053227123E-314;
        r0 = r9.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r9.D = r0;
        r0 = 2131755685; // 0x7f1002a5 float:1.9142256E38 double:1.0532272493E-314;
        r0 = r9.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r4 = 2131231726; // 0x7f0803ee float:1.8079541E38 double:1.052968379E-314;
        r0.setText(r4);
        r0 = new com.whatsapp.akn;
        r0.<init>(r9);
        r4 = 2131755757; // 0x7f1002ed float:1.9142402E38 double:1.053227285E-314;
        r4 = r9.findViewById(r4);
        r4.setOnClickListener(r0);
        r4 = 2131755758; // 0x7f1002ee float:1.9142404E38 double:1.0532272854E-314;
        r4 = r9.findViewById(r4);
        r4.setOnClickListener(r0);
        r0 = r9.G;
        r4 = r9.H;
        r0.setAdapter(r4);
        r0 = r9.G;
        r9.registerForContextMenu(r0);
        r0 = 2131755679; // 0x7f10029f float:1.9142244E38 double:1.0532272463E-314;
        r0 = r9.findViewById(r0);
        r0 = (android.widget.ImageButton) r0;
        r9.w = r0;
        r0 = r9.w;
        r4 = new com.whatsapp.aei;
        r4.<init>(r9);
        r0.setOnClickListener(r4);
        r0 = 2131755686; // 0x7f1002a6 float:1.9142258E38 double:1.05322725E-314;
        r0 = r9.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r9.A = r0;
        r0 = r9.A;
        r4 = 2131231591; // 0x7f080367 float:1.8079267E38 double:1.0529683124E-314;
        r5 = 2;
        r5 = new java.lang.Object[r5];
        r6 = r9.F;
        r6 = r6.size();
        r6 = java.lang.Integer.valueOf(r6);
        r5[r1] = r6;
        r6 = com.whatsapp.a59.j;
        r6 = java.lang.Integer.valueOf(r6);
        r5[r2] = r6;
        r4 = r9.getString(r4, r5);
        r0.setText(r4);
        r0 = 2130837610; // 0x7f02006a float:1.7280179E38 double:1.05277366E-314;
        r4 = 2131623951; // 0x7f0e000f float:1.8875068E38 double:1.053162164E-314;
        r9.a(r8, r0, r4);
        r0 = 2131755683; // 0x7f1002a3 float:1.9142252E38 double:1.0532272483E-314;
        r0 = r9.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r4 = 2131231057; // 0x7f080151 float:1.8078184E38 double:1.0529680486E-314;
        r0.setText(r4);
        r0 = 2131755682; // 0x7f1002a2 float:1.914225E38 double:1.053227248E-314;
        r0 = r9.findViewById(r0);
        r0 = (android.widget.ImageView) r0;
        r4 = 2130839433; // 0x7f020789 float:1.7283876E38 double:1.0527745606E-314;
        r0.setImageResource(r4);
        r0 = 2131755681; // 0x7f1002a1 float:1.9142248E38 double:1.0532272473E-314;
        r0 = r9.findViewById(r0);
        r4 = new com.whatsapp.ok;
        r4.<init>(r9);
        r0.setOnClickListener(r4);
        r0 = r9.y;
        r0 = r0.p;
        r0 = com.whatsapp.qm.c(r0);
        r0 = r0.l();
        r4 = r0.iterator();
    L_0x0252:
        r0 = r4.hasNext();
        if (r0 == 0) goto L_0x0273;
    L_0x0258:
        r0 = r4.next();
        r0 = (java.lang.String) r0;
        r5 = com.whatsapp.App.as;
        r0 = r5.b(r0);
        r5 = r9.F;	 Catch:{ NumberFormatException -> 0x030a }
        r5 = r5.contains(r0);	 Catch:{ NumberFormatException -> 0x030a }
        if (r5 != 0) goto L_0x0271;
    L_0x026c:
        r5 = r9.F;	 Catch:{ NumberFormatException -> 0x030a }
        r5.add(r0);	 Catch:{ NumberFormatException -> 0x030a }
    L_0x0271:
        if (r3 == 0) goto L_0x0252;
    L_0x0273:
        r9.b();
        r9.n();
        r9.m();
        r9.k();
        r0 = 2131755189; // 0x7f1000b5 float:1.914125E38 double:1.053227004E-314;
        r0 = r9.findViewById(r0);
        r4 = new com.whatsapp.anb;
        r4.<init>(r9);
        r0.setOnClickListener(r4);
        r0 = com.whatsapp.App.aK;
        r4 = r9.I;
        r0.b(r4);
        com.whatsapp.App.b(r9);
        if (r10 == 0) goto L_0x02ae;
    L_0x029a:
        r0 = M;
        r4 = 10;
        r0 = r0[r4];
        r0 = r10.getString(r0);
        if (r0 == 0) goto L_0x02ae;
    L_0x02a6:
        r4 = com.whatsapp.App.as;	 Catch:{ NumberFormatException -> 0x030c }
        r0 = r4.b(r0);	 Catch:{ NumberFormatException -> 0x030c }
        r9.x = r0;	 Catch:{ NumberFormatException -> 0x030c }
    L_0x02ae:
        r0 = android.os.Build.VERSION.SDK_INT;	 Catch:{ NumberFormatException -> 0x030e }
        r4 = 21;
        if (r0 < r4) goto L_0x02e3;
    L_0x02b4:
        r0 = r9.getIntent();	 Catch:{ NumberFormatException -> 0x0310 }
        r4 = M;	 Catch:{ NumberFormatException -> 0x0310 }
        r5 = 6;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x0310 }
        r5 = 0;
        r0 = r0.getBooleanExtra(r4, r5);	 Catch:{ NumberFormatException -> 0x0310 }
        if (r0 == 0) goto L_0x02d2;
    L_0x02c4:
        r0 = r9.v;	 Catch:{ NumberFormatException -> 0x0312 }
        r4 = 2131232335; // 0x7f08064f float:1.8080776E38 double:1.05296868E-314;
        r4 = r9.getString(r4);	 Catch:{ NumberFormatException -> 0x0312 }
        r0.setTransitionName(r4);	 Catch:{ NumberFormatException -> 0x0312 }
        if (r3 == 0) goto L_0x02e3;
    L_0x02d2:
        r0 = 2131755434; // 0x7f1001aa float:1.9141747E38 double:1.0532271253E-314;
        r0 = r9.findViewById(r0);	 Catch:{ NumberFormatException -> 0x0312 }
        r4 = 2131232335; // 0x7f08064f float:1.8080776E38 double:1.05296868E-314;
        r4 = r9.getString(r4);	 Catch:{ NumberFormatException -> 0x0312 }
        r0.setTransitionName(r4);	 Catch:{ NumberFormatException -> 0x0312 }
    L_0x02e3:
        r0 = r9.B;	 Catch:{ NumberFormatException -> 0x0314 }
        r4 = r9.K;	 Catch:{ NumberFormatException -> 0x0314 }
        r5 = r9.E;	 Catch:{ NumberFormatException -> 0x0314 }
        r6 = r9.J;	 Catch:{ NumberFormatException -> 0x0314 }
        r7 = r9.H;	 Catch:{ NumberFormatException -> 0x0314 }
        r0.a(r4, r5, r6, r7);	 Catch:{ NumberFormatException -> 0x0314 }
        r0 = r9.a();	 Catch:{ NumberFormatException -> 0x0314 }
        r4 = r9.z;	 Catch:{ NumberFormatException -> 0x0314 }
        com.whatsapp.a2c.b(r0, r4);	 Catch:{ NumberFormatException -> 0x0314 }
        r0 = r9.z;	 Catch:{ NumberFormatException -> 0x0314 }
        r4 = com.whatsapp.t4.ON_CREATE;	 Catch:{ NumberFormatException -> 0x0314 }
        r0.a(r4);	 Catch:{ NumberFormatException -> 0x0314 }
        r0 = com.whatsapp.WAAppCompatActivity.c;	 Catch:{ NumberFormatException -> 0x0314 }
        if (r0 == 0) goto L_0x0309;
    L_0x0304:
        if (r3 == 0) goto L_0x0318;
    L_0x0306:
        r0 = r1;
    L_0x0307:
        com.whatsapp.DialogToastActivity.f = r0;
    L_0x0309:
        return;
    L_0x030a:
        r0 = move-exception;
        throw r0;
    L_0x030c:
        r0 = move-exception;
        throw r0;
    L_0x030e:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0310 }
    L_0x0310:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0312 }
    L_0x0312:
        r0 = move-exception;
        throw r0;
    L_0x0314:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0316 }
    L_0x0316:
        r0 = move-exception;
        throw r0;
    L_0x0318:
        r0 = r2;
        goto L_0x0307;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ListChatInfo.onCreate(android.os.Bundle):void");
    }

    static l5 f(ListChatInfo listChatInfo) {
        return listChatInfo.y;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void j() {
        /*
        r4 = this;
        r1 = com.whatsapp.DialogToastActivity.f;
        r0 = r4.G;
        r2 = 0;
        r0 = r0.getChildAt(r2);
        if (r0 == 0) goto L_0x0052;
    L_0x000b:
        r2 = r4.G;	 Catch:{ NumberFormatException -> 0x0053 }
        r2 = r2.getWidth();	 Catch:{ NumberFormatException -> 0x0053 }
        r3 = r4.G;	 Catch:{ NumberFormatException -> 0x0053 }
        r3 = r3.getHeight();	 Catch:{ NumberFormatException -> 0x0053 }
        if (r2 <= r3) goto L_0x003e;
    L_0x0019:
        r2 = r4.G;	 Catch:{ NumberFormatException -> 0x0053 }
        r2 = r2.getFirstVisiblePosition();	 Catch:{ NumberFormatException -> 0x0053 }
        if (r2 != 0) goto L_0x0027;
    L_0x0021:
        r0 = r0.getTop();
        if (r1 == 0) goto L_0x0030;
    L_0x0027:
        r0 = r4.v;
        r0 = r0.getHeight();
        r0 = -r0;
        r0 = r0 + 1;
    L_0x0030:
        r2 = r4.v;	 Catch:{ NumberFormatException -> 0x0055 }
        r3 = r4.v;	 Catch:{ NumberFormatException -> 0x0055 }
        r3 = r3.getTop();	 Catch:{ NumberFormatException -> 0x0055 }
        r0 = r0 - r3;
        r2.offsetTopAndBottom(r0);	 Catch:{ NumberFormatException -> 0x0055 }
        if (r1 == 0) goto L_0x0052;
    L_0x003e:
        r0 = r4.v;	 Catch:{ NumberFormatException -> 0x0057 }
        r0 = r0.getTop();	 Catch:{ NumberFormatException -> 0x0057 }
        if (r0 == 0) goto L_0x0052;
    L_0x0046:
        r0 = r4.v;	 Catch:{ NumberFormatException -> 0x0057 }
        r1 = r4.v;	 Catch:{ NumberFormatException -> 0x0057 }
        r1 = r1.getTop();	 Catch:{ NumberFormatException -> 0x0057 }
        r1 = -r1;
        r0.offsetTopAndBottom(r1);	 Catch:{ NumberFormatException -> 0x0057 }
    L_0x0052:
        return;
    L_0x0053:
        r0 = move-exception;
        throw r0;
    L_0x0055:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0057 }
    L_0x0057:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ListChatInfo.j():void");
    }

    private void e(String str) {
        qm.d(this.y.p, str);
        this.F.add(App.as.b(str));
        m();
    }

    static void d(ListChatInfo listChatInfo) {
        listChatInfo.n();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        try {
            switch (menuItem.getItemId()) {
                case at.g /*1*/:
                    l();
                    return true;
                case 16908332:
                    ActivityCompat.finishAfterTransition(this);
                    return true;
                default:
                    return super.onOptionsItemSelected(menuItem);
            }
        } catch (NumberFormatException e) {
            throw e;
        }
        throw e;
    }

    public void onPause() {
        super.onPause();
        this.z.b();
    }
}
