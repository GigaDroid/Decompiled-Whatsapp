package com.whatsapp;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.whatsapp.protocol.co;
import com.whatsapp.util.ac;
import com.whatsapp.util.bw;
import java.util.ArrayList;
import org.v;
import org.whispersystems.at;

public class ConversationRowText extends ConversationRow {
    private static final String S;
    private View Q;
    private final TextEmojiLabel R;

    static {
        char[] toCharArray = "(/\f(?\"/+>&1\u001c\u0016>)e,\u0010)~&%\u0011-;79\u001e/7*$-4)e#\f{00&\u0013w~7#\u00183*\t+\u00064+1w".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 69;
                    break;
                case at.g /*1*/:
                    i2 = 74;
                    break;
                case at.i /*2*/:
                    i2 = 127;
                    break;
                case at.o /*3*/:
                    i2 = 91;
                    break;
                default:
                    i2 = 94;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        S = new String(cArr).intern();
    }

    protected int h() {
        return 2130903136;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(android.view.View r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, byte[] r13, java.util.ArrayList r14, com.whatsapp.util.bw r15) {
        /*
        r4 = 0;
        r2 = 0;
        r5 = com.whatsapp.DialogToastActivity.f;
        r0 = 2131755127; // 0x7f100077 float:1.9141124E38 double:1.0532269736E-314;
        r0 = r9.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r3 = new android.text.SpannableStringBuilder;	 Catch:{ MalformedURLException -> 0x00cf }
        r6 = new java.lang.StringBuilder;	 Catch:{ MalformedURLException -> 0x00cf }
        r6.<init>();	 Catch:{ MalformedURLException -> 0x00cf }
        if (r10 != 0) goto L_0x00d1;
    L_0x0016:
        r1 = "";
    L_0x0019:
        r6 = r6.append(r1);
        r1 = android.text.TextUtils.isEmpty(r11);
        if (r1 == 0) goto L_0x00d4;
    L_0x0023:
        r1 = "";
    L_0x0026:
        r1 = r6.append(r1);
        r1 = r1.toString();
        r3.<init>(r1);
        r1 = android.text.TextUtils.isEmpty(r10);	 Catch:{ MalformedURLException -> 0x00ea }
        if (r1 != 0) goto L_0x0045;
    L_0x0037:
        r1 = new com.whatsapp.a_z;	 Catch:{ MalformedURLException -> 0x00ea }
        r1.<init>();	 Catch:{ MalformedURLException -> 0x00ea }
        r6 = 0;
        r7 = r10.length();	 Catch:{ MalformedURLException -> 0x00ea }
        r8 = 0;
        r3.setSpan(r1, r6, r7, r8);	 Catch:{ MalformedURLException -> 0x00ea }
    L_0x0045:
        r1 = android.text.TextUtils.isEmpty(r11);	 Catch:{ MalformedURLException -> 0x00ec }
        if (r1 != 0) goto L_0x005c;
    L_0x004b:
        r6 = new android.text.style.ForegroundColorSpan;	 Catch:{ MalformedURLException -> 0x00ec }
        r1 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        r6.<init>(r1);	 Catch:{ MalformedURLException -> 0x00ec }
        if (r10 != 0) goto L_0x00f0;
    L_0x0054:
        r1 = r2;
    L_0x0055:
        r7 = r3.length();
        r3.setSpan(r6, r1, r7, r2);
    L_0x005c:
        if (r15 == 0) goto L_0x010a;
    L_0x005e:
        if (r14 == 0) goto L_0x010a;
    L_0x0060:
        r1 = r9.getContext();
        r6 = r3.toString();
        r1 = com.whatsapp.util.bw.a(r1, r3, r6, r14, r15);
        r1 = (android.text.SpannableStringBuilder) r1;
    L_0x006e:
        r0.setText(r1);
        r0 = 2131755454; // 0x7f1001be float:1.9141788E38 double:1.053227135E-314;
        r0 = r9.findViewById(r0);
        r0 = (android.widget.ImageView) r0;
        if (r13 == 0) goto L_0x0107;
    L_0x007c:
        r1 = r13.length;
        r1 = android.graphics.BitmapFactory.decodeByteArray(r13, r2, r1);
    L_0x0081:
        if (r1 == 0) goto L_0x0098;
    L_0x0083:
        r2 = r1.getHeight();	 Catch:{ MalformedURLException -> 0x00f6 }
        if (r2 == 0) goto L_0x0098;
    L_0x0089:
        r2 = r1.getWidth();	 Catch:{ MalformedURLException -> 0x00f8 }
        if (r2 == 0) goto L_0x0098;
    L_0x008f:
        r0.setImageBitmap(r1);	 Catch:{ MalformedURLException -> 0x00fa }
        r1 = 0;
        r0.setVisibility(r1);	 Catch:{ MalformedURLException -> 0x00fa }
        if (r5 == 0) goto L_0x00a1;
    L_0x0098:
        r1 = 0;
        r0.setImageDrawable(r1);	 Catch:{ MalformedURLException -> 0x00fc }
        r1 = 8;
        r0.setVisibility(r1);	 Catch:{ MalformedURLException -> 0x00fc }
    L_0x00a1:
        r0 = android.text.TextUtils.isEmpty(r12);
        if (r0 != 0) goto L_0x0105;
    L_0x00a7:
        r0 = new java.net.URL;	 Catch:{ MalformedURLException -> 0x00fe }
        r0.<init>(r12);	 Catch:{ MalformedURLException -> 0x00fe }
        r0 = r0.getHost();	 Catch:{ MalformedURLException -> 0x00fe }
        r1 = r0;
    L_0x00b1:
        r0 = 2131755987; // 0x7f1003d3 float:1.9142869E38 double:1.0532273985E-314;
        r0 = r9.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r2 = android.text.TextUtils.isEmpty(r1);	 Catch:{ MalformedURLException -> 0x0101 }
        if (r2 != 0) goto L_0x00c9;
    L_0x00c0:
        r0.setText(r1);	 Catch:{ MalformedURLException -> 0x0103 }
        r1 = 0;
        r0.setVisibility(r1);	 Catch:{ MalformedURLException -> 0x0103 }
        if (r5 == 0) goto L_0x00ce;
    L_0x00c9:
        r1 = 8;
        r0.setVisibility(r1);	 Catch:{ MalformedURLException -> 0x0103 }
    L_0x00ce:
        return;
    L_0x00cf:
        r0 = move-exception;
        throw r0;
    L_0x00d1:
        r1 = r10;
        goto L_0x0019;
    L_0x00d4:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r7 = "\n";
        r1 = r1.append(r7);
        r1 = r1.append(r11);
        r1 = r1.toString();
        goto L_0x0026;
    L_0x00ea:
        r0 = move-exception;
        throw r0;
    L_0x00ec:
        r0 = move-exception;
        throw r0;	 Catch:{ MalformedURLException -> 0x00ee }
    L_0x00ee:
        r0 = move-exception;
        throw r0;
    L_0x00f0:
        r1 = r10.length();
        goto L_0x0055;
    L_0x00f6:
        r0 = move-exception;
        throw r0;	 Catch:{ MalformedURLException -> 0x00f8 }
    L_0x00f8:
        r0 = move-exception;
        throw r0;	 Catch:{ MalformedURLException -> 0x00fa }
    L_0x00fa:
        r0 = move-exception;
        throw r0;	 Catch:{ MalformedURLException -> 0x00fc }
    L_0x00fc:
        r0 = move-exception;
        throw r0;
    L_0x00fe:
        r0 = move-exception;
        r1 = r4;
        goto L_0x00b1;
    L_0x0101:
        r0 = move-exception;
        throw r0;	 Catch:{ MalformedURLException -> 0x0103 }
    L_0x0103:
        r0 = move-exception;
        throw r0;
    L_0x0105:
        r1 = r4;
        goto L_0x00b1;
    L_0x0107:
        r1 = r4;
        goto L_0x0081;
    L_0x010a:
        r1 = r3;
        goto L_0x006e;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ConversationRowText.a(android.view.View, java.lang.String, java.lang.String, java.lang.String, byte[], java.util.ArrayList, com.whatsapp.util.bw):void");
    }

    ConversationRowText(Context context, co coVar) {
        super(context, coVar);
        this.R = (TextEmojiLabel) findViewById(2131755564);
        if (this.R == null) {
            throw new RuntimeException(S + coVar.k.a);
        }
        this.R.setLinkHandler(new vi());
        this.R.setAutoLinkMask(0);
        this.R.setLinksClickable(false);
        this.R.setFocusable(false);
        this.R.setClickable(false);
        this.R.setLongClickable(false);
        c(coVar);
    }

    public void q() {
        try {
            super.q();
            if (App.a1()) {
                this.R.setPadding(this.R.getPaddingLeft(), this.R.getPaddingTop(), this.R.getPaddingRight() * 4, this.R.getPaddingBottom());
            }
        } catch (RuntimeException e) {
            throw e;
        }
    }

    private void a(co coVar) {
        Object obj;
        String str;
        ArrayList arrayList = null;
        ViewGroup viewGroup = (ViewGroup) findViewById(2131755506);
        if (App.h(coVar)) {
            String d = ac.d(coVar.c());
            if (d != null) {
                CharSequence charSequence = coVar.q;
                if (TextUtils.isEmpty(charSequence)) {
                    obj = d;
                } else {
                    CharSequence charSequence2 = charSequence;
                    String str2 = d;
                    CharSequence charSequence3 = charSequence2;
                }
            } else {
                d = null;
                obj = null;
            }
            str = d;
        } else {
            str = null;
            obj = null;
        }
        try {
            if (!TextUtils.isEmpty(obj)) {
                if (a(coVar)) {
                    try {
                        viewGroup.setVisibility(0);
                        if (this.Q == null) {
                            this.Q = aam.a(LayoutInflater.from(getContext()), 2130903296, null, false);
                            viewGroup.addView(this.Q, -1, -2);
                            this.Q.setOnLongClickListener(this.K);
                        }
                        try {
                            Context context;
                            int i;
                            this.Q.setOnClickListener(new yc(this, obj));
                            View view = this.Q;
                            str2 = coVar.a;
                            String str3 = coVar.A;
                            byte[] bArr = (byte[]) coVar.Q;
                            if (k() != null) {
                                arrayList = k().d();
                            }
                            a(view, str2, str3, str, bArr, arrayList, bw.b);
                            FrameLayout frameLayout = (FrameLayout) this.Q.findViewById(2131755985);
                            try {
                                context = getContext();
                                if (coVar.k.a) {
                                    i = 2130837624;
                                } else {
                                    i = 2130837618;
                                }
                            } catch (RuntimeException e) {
                                throw e;
                            }
                            try {
                                frameLayout.setForeground(ContextCompat.getDrawable(context, i));
                                if (!DialogToastActivity.f) {
                                    return;
                                }
                            } catch (RuntimeException e2) {
                                throw e2;
                            } catch (RuntimeException e22) {
                                throw e22;
                            }
                        } catch (RuntimeException e222) {
                            throw e222;
                        }
                    } catch (RuntimeException e2222) {
                        throw e2222;
                    }
                }
            }
            if (this.Q != null) {
                viewGroup.removeView(this.Q);
                this.Q = null;
            }
            viewGroup.setVisibility(8);
        } catch (RuntimeException e22222) {
            throw e22222;
        } catch (RuntimeException e222222) {
            throw e222222;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void c(com.whatsapp.protocol.co r12) {
        /*
        r11 = this;
        r1 = 1062836634; // 0x3f59999a float:0.85 double:5.25111068E-315;
        r2 = 1061997773; // 0x3f4ccccd float:0.8 double:5.246966156E-315;
        r6 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        r5 = 1;
        r10 = 0;
        r0 = r12.c();
        r11.a(r12);
        r3 = 2131755563; // 0x7f10022b float:1.9142009E38 double:1.053227189E-314;
        r3 = r11.findViewById(r3);
        r4 = r11.Q;	 Catch:{ RuntimeException -> 0x00a9 }
        if (r4 != 0) goto L_0x0027;
    L_0x001c:
        r4 = r3.getLayoutParams();	 Catch:{ RuntimeException -> 0x00ab }
        r7 = -2;
        r4.width = r7;	 Catch:{ RuntimeException -> 0x00ab }
        r4 = com.whatsapp.DialogToastActivity.f;	 Catch:{ RuntimeException -> 0x00ab }
        if (r4 == 0) goto L_0x002e;
    L_0x0027:
        r3 = r3.getLayoutParams();	 Catch:{ RuntimeException -> 0x00ab }
        r4 = -1;
        r3.width = r4;	 Catch:{ RuntimeException -> 0x00ab }
    L_0x002e:
        r3 = r11.R;	 Catch:{ RuntimeException -> 0x00ad }
        r4 = 0;
        r11.setMessageText(r0, r3, r4, r12);	 Catch:{ RuntimeException -> 0x00ad }
        r3 = r11.R;	 Catch:{ RuntimeException -> 0x00ad }
        r4 = 0;
        r7 = 0;
        r8 = 0;
        r9 = 0;
        r3.setCompoundDrawablesWithIntrinsicBounds(r4, r7, r8, r9);	 Catch:{ RuntimeException -> 0x00ad }
        r3 = r11.R;	 Catch:{ RuntimeException -> 0x00ad }
        r3.clearAnimation();	 Catch:{ RuntimeException -> 0x00ad }
        r3 = r0.length();	 Catch:{ RuntimeException -> 0x00ad }
        if (r3 != r5) goto L_0x005b;
    L_0x0048:
        r3 = 0;
        r3 = r0.charAt(r3);	 Catch:{ RuntimeException -> 0x00af }
        r4 = 57378; // 0xe022 float:8.0404E-41 double:2.83485E-319;
        if (r3 == r4) goto L_0x0075;
    L_0x0052:
        r3 = 0;
        r3 = r0.charAt(r3);	 Catch:{ RuntimeException -> 0x00b1 }
        r4 = 10084; // 0x2764 float:1.413E-41 double:4.982E-320;
        if (r3 == r4) goto L_0x0075;
    L_0x005b:
        r3 = r0.length();	 Catch:{ RuntimeException -> 0x00b3 }
        r4 = 2;
        if (r3 != r4) goto L_0x00a8;
    L_0x0062:
        r3 = 0;
        r3 = r0.charAt(r3);	 Catch:{ RuntimeException -> 0x00b5 }
        r4 = 10084; // 0x2764 float:1.413E-41 double:4.982E-320;
        if (r3 != r4) goto L_0x00a8;
    L_0x006b:
        r3 = 1;
        r0 = r0.charAt(r3);	 Catch:{ RuntimeException -> 0x00b5 }
        r3 = 65039; // 0xfe0f float:9.1139E-41 double:3.21335E-319;
        if (r0 != r3) goto L_0x00a8;
    L_0x0075:
        r0 = r11.R;
        r3 = 2130839612; // 0x7f02083c float:1.728424E38 double:1.052774649E-314;
        r0.setCompoundDrawablesWithIntrinsicBounds(r3, r10, r10, r10);
        r0 = new android.view.animation.ScaleAnimation;
        r3 = r1;
        r4 = r2;
        r7 = r5;
        r8 = r6;
        r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8);
        r1 = new android.view.animation.DecelerateInterpolator;
        r1.<init>();
        r0.setInterpolator(r1);
        r2 = 500; // 0x1f4 float:7.0E-43 double:2.47E-321;
        r0.setDuration(r2);
        r1 = 2;
        r0.setRepeatMode(r1);
        r1 = -1;
        r0.setRepeatCount(r1);
        r1 = r11.R;
        r1.startAnimation(r0);
        r0 = r11.R;
        r1 = "";
        r0.setText(r1);
    L_0x00a8:
        return;
    L_0x00a9:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x00ab }
    L_0x00ab:
        r0 = move-exception;
        throw r0;
    L_0x00ad:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x00af }
    L_0x00af:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x00b1 }
    L_0x00b1:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x00b3 }
    L_0x00b3:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x00b5 }
    L_0x00b5:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ConversationRowText.c(com.whatsapp.protocol.co):void");
    }

    public void i() {
        c(this.e);
        super.i();
    }

    public void a(co coVar, boolean z) {
        try {
            int i;
            if (coVar != this.e) {
                i = 1;
            } else {
                i = 0;
            }
            boolean z2 = i | z;
            try {
                super.a(coVar, z2);
                if (z2) {
                    c(coVar);
                }
            } catch (RuntimeException e) {
                throw e;
            }
        } catch (RuntimeException e2) {
            throw e2;
        }
    }

    protected int g() {
        return 2130903135;
    }
}
