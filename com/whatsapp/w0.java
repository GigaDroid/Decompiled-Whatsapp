package com.whatsapp;

import android.content.Context;
import android.database.Cursor;
import android.support.v4.widget.CursorAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tonicartos.widget.stickygridheaders.r;
import com.whatsapp.gallerypicker.a7;
import org.v;
import org.whispersystems.at;

class w0 extends CursorAdapter implements r {
    private static final String z;
    final LinksGalleryFragment b;

    static {
        char[] toCharArray = "X[h#j]\\b-M".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 52;
                    break;
                case at.g /*1*/:
                    i2 = 50;
                    break;
                case at.i /*2*/:
                    i2 = 6;
                    break;
                case at.o /*3*/:
                    i2 = 72;
                    break;
                default:
                    i2 = 53;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public View a(int i, View view, ViewGroup viewGroup) {
        TextView textView;
        if (view != null) {
            view = (ViewGroup) view;
            TextView textView2 = (TextView) view.getChildAt(0);
            if (!DialogToastActivity.f) {
                textView = textView2;
                textView.setText(((a7) LinksGalleryFragment.a(this.b).get(i)).toString());
                return view;
            }
        }
        View view2 = (ViewGroup) this.b.getLayoutInflater(null).inflate(2130903219, viewGroup, false);
        view2.setClickable(false);
        textView = (TextView) view2.findViewById(2131755765);
        view = view2;
        textView.setText(((a7) LinksGalleryFragment.a(this.b).get(i)).toString());
        return view;
    }

    public void bindView(View view, Context context, Cursor cursor) {
        throw new AssertionError();
    }

    public w0(LinksGalleryFragment linksGalleryFragment) {
        this.b = linksGalleryFragment;
        super(linksGalleryFragment.getContext(), null, 0);
    }

    public int a(int i) {
        return ((a7) LinksGalleryFragment.a(this.b).get(i)).b;
    }

    public int a() {
        return LinksGalleryFragment.a(this.b).size();
    }

    public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
        throw new AssertionError();
    }

    public d8 m480a(int i) {
        Cursor cursor = getCursor();
        if (cursor == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return new d8(App.aK.a(cursor, LinksGalleryFragment.f(this.b)), cursor.getInt(cursor.getColumnIndex(z)));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r16, android.view.View r17, android.view.ViewGroup r18) {
        /*
        r15 = this;
        r9 = com.whatsapp.DialogToastActivity.f;
        r5 = r15.a(r16);
        r10 = r5.b;
        if (r17 == 0) goto L_0x0012;
    L_0x000a:
        r1 = r17.getTag();
        r1 = (com.whatsapp.anh) r1;
        if (r9 == 0) goto L_0x02cc;
    L_0x0012:
        r1 = r15.b;
        r2 = 0;
        r1 = r1.getLayoutInflater(r2);
        r2 = 2130903208; // 0x7f0300a8 float:1.7413227E38 double:1.0528060697E-314;
        r3 = 0;
        r4 = 0;
        r17 = com.whatsapp.aam.a(r1, r2, r3, r4);
        r2 = new com.whatsapp.anh;
        r1 = 0;
        r2.<init>(r1);
        r1 = 2131755564; // 0x7f10022c float:1.914201E38 double:1.0532271895E-314;
        r0 = r17;
        r1 = r0.findViewById(r1);
        r1 = (android.widget.TextView) r1;
        r2.e = r1;
        r1 = 2131755722; // 0x7f1002ca float:1.9142331E38 double:1.0532272676E-314;
        r0 = r17;
        r1 = r0.findViewById(r1);
        r2.d = r1;
        r1 = 2131755619; // 0x7f100263 float:1.9142122E38 double:1.0532272167E-314;
        r0 = r17;
        r1 = r0.findViewById(r1);
        r2.a = r1;
        r1 = 2131755506; // 0x7f1001f2 float:1.9141893E38 double:1.053227161E-314;
        r0 = r17;
        r1 = r0.findViewById(r1);
        r2.b = r1;
        r1 = 2131755454; // 0x7f1001be float:1.9141788E38 double:1.053227135E-314;
        r0 = r17;
        r1 = r0.findViewById(r1);
        r1 = (android.widget.ImageView) r1;
        r2.c = r1;
        r1 = 2131755127; // 0x7f100077 float:1.9141124E38 double:1.0532269736E-314;
        r0 = r17;
        r1 = r0.findViewById(r1);
        r1 = (android.widget.TextView) r1;
        r2.f = r1;
        r1 = 2131755987; // 0x7f1003d3 float:1.9142869E38 double:1.0532273985E-314;
        r0 = r17;
        r1 = r0.findViewById(r1);
        r1 = (android.widget.TextView) r1;
        r2.g = r1;
        r1 = 2131755986; // 0x7f1003d2 float:1.9142867E38 double:1.053227398E-314;
        r0 = r17;
        r1 = r0.findViewById(r1);
        r3 = -1184275; // 0xffffffffffededed float:NaN double:NaN;
        r1.setBackgroundColor(r3);
        r1 = 2131755985; // 0x7f1003d1 float:1.9142865E38 double:1.0532273975E-314;
        r0 = r17;
        r1 = r0.findViewById(r1);
        r1 = (android.widget.FrameLayout) r1;
        r3 = 0;
        r1.setForeground(r3);
        r1 = 2131755723; // 0x7f1002cb float:1.9142333E38 double:1.053227268E-314;
        r0 = r17;
        r1 = r0.findViewById(r1);
        r1 = (android.widget.ImageView) r1;
        r3 = new com.whatsapp.util.bz;
        r4 = r15.b;
        r4 = r4.getContext();
        r6 = 2130837713; // 0x7f0200d1 float:1.7280388E38 double:1.052773711E-314;
        r4 = android.support.v4.content.ContextCompat.getDrawable(r4, r6);
        r3.<init>(r4);
        r1.setImageDrawable(r3);
        r0 = r17;
        r0.setTag(r2);
        r8 = r2;
    L_0x00c1:
        r1 = r10.c;	 Catch:{ MalformedURLException -> 0x025a }
        if (r1 != 0) goto L_0x025c;
    L_0x00c5:
        r1 = r10.c();	 Catch:{ MalformedURLException -> 0x025a }
        r2 = r1;
    L_0x00ca:
        r4 = com.whatsapp.util.ac.d(r2);
        r6 = com.whatsapp.util.ac.g(r2);
        r1 = r10.q;	 Catch:{ MalformedURLException -> 0x0261 }
        r1 = android.text.TextUtils.isEmpty(r1);	 Catch:{ MalformedURLException -> 0x0261 }
        if (r1 == 0) goto L_0x0263;
    L_0x00da:
        r3 = r4;
    L_0x00db:
        if (r6 == 0) goto L_0x026c;
    L_0x00dd:
        r1 = r6.size();	 Catch:{ MalformedURLException -> 0x0268 }
        r7 = r5.a;	 Catch:{ MalformedURLException -> 0x0268 }
        if (r1 <= r7) goto L_0x026c;
    L_0x00e5:
        r1 = r5.a;	 Catch:{ MalformedURLException -> 0x026a }
        r1 = r6.get(r1);	 Catch:{ MalformedURLException -> 0x026a }
        r1 = (java.lang.String) r1;	 Catch:{ MalformedURLException -> 0x026a }
        r5 = r1;
    L_0x00ee:
        r7 = r10.a;
        r6 = r10.A;
        r1 = r10.c;	 Catch:{ MalformedURLException -> 0x026f }
        if (r1 != 0) goto L_0x0271;
    L_0x00f6:
        r1 = r10.Q;	 Catch:{ MalformedURLException -> 0x026f }
        r1 = (byte[]) r1;	 Catch:{ MalformedURLException -> 0x026f }
        r1 = (byte[]) r1;	 Catch:{ MalformedURLException -> 0x026f }
    L_0x00fc:
        r11 = r2.equals(r4);	 Catch:{ MalformedURLException -> 0x0277 }
        if (r11 == 0) goto L_0x0118;
    L_0x0102:
        r11 = android.text.TextUtils.isEmpty(r7);	 Catch:{ MalformedURLException -> 0x0277 }
        if (r11 == 0) goto L_0x0118;
    L_0x0108:
        r11 = android.text.TextUtils.isEmpty(r6);	 Catch:{ MalformedURLException -> 0x0279 }
        if (r11 == 0) goto L_0x0118;
    L_0x010e:
        r11 = r8.e;	 Catch:{ MalformedURLException -> 0x027b }
        r12 = 2131232235; // 0x7f0805eb float:1.8080574E38 double:1.0529686306E-314;
        r11.setText(r12);	 Catch:{ MalformedURLException -> 0x027b }
        if (r9 == 0) goto L_0x0141;
    L_0x0118:
        r11 = r8.e;	 Catch:{ MalformedURLException -> 0x027d }
        r12 = r15.b;	 Catch:{ MalformedURLException -> 0x027d }
        r12 = r12.getContext();	 Catch:{ MalformedURLException -> 0x027d }
        r13 = r15.b;	 Catch:{ MalformedURLException -> 0x027d }
        r13 = r13.getContext();	 Catch:{ MalformedURLException -> 0x027d }
        r14 = r8.e;	 Catch:{ MalformedURLException -> 0x027d }
        r14 = r14.getPaint();	 Catch:{ MalformedURLException -> 0x027d }
        r2 = com.whatsapp.a28.a(r2, r13, r14);	 Catch:{ MalformedURLException -> 0x027d }
        r13 = r15.b;	 Catch:{ MalformedURLException -> 0x027d }
        r13 = com.whatsapp.LinksGalleryFragment.e(r13);	 Catch:{ MalformedURLException -> 0x027d }
        r13 = r13.d();	 Catch:{ MalformedURLException -> 0x027d }
        r2 = com.whatsapp.util.bw.a(r12, r2, r13);	 Catch:{ MalformedURLException -> 0x027d }
        r11.setText(r2);	 Catch:{ MalformedURLException -> 0x027d }
    L_0x0141:
        r2 = android.text.TextUtils.equals(r4, r5);	 Catch:{ MalformedURLException -> 0x027f }
        if (r2 == 0) goto L_0x0153;
    L_0x0147:
        r2 = android.text.TextUtils.isEmpty(r7);	 Catch:{ MalformedURLException -> 0x027f }
        if (r2 == 0) goto L_0x02c6;
    L_0x014d:
        r2 = android.text.TextUtils.isEmpty(r6);	 Catch:{ MalformedURLException -> 0x0281 }
        if (r2 == 0) goto L_0x02c6;
    L_0x0153:
        r2 = 0;
        r3 = r10.c;
        if (r3 != 0) goto L_0x02c1;
    L_0x0158:
        r1 = 0;
        r3 = r1;
        r4 = r2;
        r2 = r5;
    L_0x015c:
        r6 = new android.text.SpannableStringBuilder;	 Catch:{ MalformedURLException -> 0x0283 }
        r7 = new java.lang.StringBuilder;	 Catch:{ MalformedURLException -> 0x0283 }
        r7.<init>();	 Catch:{ MalformedURLException -> 0x0283 }
        if (r2 != 0) goto L_0x0285;
    L_0x0165:
        r1 = "";
    L_0x0168:
        r7 = r7.append(r1);
        r1 = android.text.TextUtils.isEmpty(r4);
        if (r1 == 0) goto L_0x0288;
    L_0x0172:
        r1 = "";
    L_0x0175:
        r1 = r7.append(r1);
        r1 = r1.toString();
        r6.<init>(r1);
        r1 = android.text.TextUtils.isEmpty(r4);	 Catch:{ MalformedURLException -> 0x029e }
        if (r1 != 0) goto L_0x0198;
    L_0x0186:
        r4 = new android.text.style.ForegroundColorSpan;	 Catch:{ MalformedURLException -> 0x029e }
        r1 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        r4.<init>(r1);	 Catch:{ MalformedURLException -> 0x029e }
        if (r2 != 0) goto L_0x02a2;
    L_0x018f:
        r1 = 0;
    L_0x0190:
        r2 = r6.length();
        r7 = 0;
        r6.setSpan(r4, r1, r2, r7);
    L_0x0198:
        r1 = r15.b;
        r1 = r1.getContext();
        r2 = r15.b;
        r2 = com.whatsapp.LinksGalleryFragment.e(r2);
        r2 = r2.d();
        r1 = com.whatsapp.util.bw.a(r1, r6, r2);
        r1 = (android.text.SpannableStringBuilder) r1;
        r2 = r8.f;
        r2.setText(r1);
        r1 = 0;
        if (r3 == 0) goto L_0x01bc;
    L_0x01b6:
        r1 = 0;
        r2 = r3.length;
        r1 = android.graphics.BitmapFactory.decodeByteArray(r3, r1, r2);
    L_0x01bc:
        if (r1 == 0) goto L_0x01d8;
    L_0x01be:
        r2 = r1.getHeight();	 Catch:{ MalformedURLException -> 0x02a8 }
        if (r2 == 0) goto L_0x01d8;
    L_0x01c4:
        r2 = r1.getWidth();	 Catch:{ MalformedURLException -> 0x02aa }
        if (r2 == 0) goto L_0x01d8;
    L_0x01ca:
        r2 = r8.c;	 Catch:{ MalformedURLException -> 0x02ac }
        r3 = android.widget.ImageView.ScaleType.CENTER_CROP;	 Catch:{ MalformedURLException -> 0x02ac }
        r2.setScaleType(r3);	 Catch:{ MalformedURLException -> 0x02ac }
        r2 = r8.c;	 Catch:{ MalformedURLException -> 0x02ac }
        r2.setImageBitmap(r1);	 Catch:{ MalformedURLException -> 0x02ac }
        if (r9 == 0) goto L_0x01f5;
    L_0x01d8:
        r1 = r8.c;	 Catch:{ MalformedURLException -> 0x02ae }
        r2 = 0;
        r1.setVisibility(r2);	 Catch:{ MalformedURLException -> 0x02ae }
        r1 = r8.c;	 Catch:{ MalformedURLException -> 0x02ae }
        r2 = 2130839505; // 0x7f0207d1 float:1.7284022E38 double:1.052774596E-314;
        r1.setImageResource(r2);	 Catch:{ MalformedURLException -> 0x02ae }
        r1 = r8.c;	 Catch:{ MalformedURLException -> 0x02ae }
        r2 = -3155748; // 0xffffffffffcfd8dc float:NaN double:NaN;
        r1.setBackgroundColor(r2);	 Catch:{ MalformedURLException -> 0x02ae }
        r1 = r8.c;	 Catch:{ MalformedURLException -> 0x02ae }
        r2 = android.widget.ImageView.ScaleType.CENTER;	 Catch:{ MalformedURLException -> 0x02ae }
        r1.setScaleType(r2);	 Catch:{ MalformedURLException -> 0x02ae }
    L_0x01f5:
        r1 = 0;
        r2 = android.text.TextUtils.isEmpty(r5);
        if (r2 != 0) goto L_0x0205;
    L_0x01fc:
        r2 = new java.net.URL;	 Catch:{ MalformedURLException -> 0x02be }
        r2.<init>(r5);	 Catch:{ MalformedURLException -> 0x02be }
        r1 = r2.getHost();	 Catch:{ MalformedURLException -> 0x02be }
    L_0x0205:
        r2 = android.text.TextUtils.isEmpty(r1);	 Catch:{ MalformedURLException -> 0x02b0 }
        if (r2 != 0) goto L_0x0218;
    L_0x020b:
        r2 = r8.g;	 Catch:{ MalformedURLException -> 0x02b2 }
        r2.setText(r1);	 Catch:{ MalformedURLException -> 0x02b2 }
        r1 = r8.g;	 Catch:{ MalformedURLException -> 0x02b2 }
        r2 = 0;
        r1.setVisibility(r2);	 Catch:{ MalformedURLException -> 0x02b2 }
        if (r9 == 0) goto L_0x021f;
    L_0x0218:
        r1 = r8.g;	 Catch:{ MalformedURLException -> 0x02b2 }
        r2 = 8;
        r1.setVisibility(r2);	 Catch:{ MalformedURLException -> 0x02b2 }
    L_0x021f:
        r1 = r8.d;	 Catch:{ MalformedURLException -> 0x02b4 }
        r2 = new com.whatsapp.uh;	 Catch:{ MalformedURLException -> 0x02b4 }
        r2.<init>(r15, r10);	 Catch:{ MalformedURLException -> 0x02b4 }
        r1.setOnClickListener(r2);	 Catch:{ MalformedURLException -> 0x02b4 }
        r2 = r8.a;	 Catch:{ MalformedURLException -> 0x02b4 }
        r1 = r10.P;	 Catch:{ MalformedURLException -> 0x02b4 }
        if (r1 == 0) goto L_0x02b6;
    L_0x022f:
        r1 = 0;
    L_0x0230:
        r2.setVisibility(r1);	 Catch:{ MalformedURLException -> 0x02ba }
        r1 = r15.b;	 Catch:{ MalformedURLException -> 0x02ba }
        r1 = com.whatsapp.LinksGalleryFragment.e(r1);	 Catch:{ MalformedURLException -> 0x02ba }
        r1 = r1.b(r10);	 Catch:{ MalformedURLException -> 0x02ba }
        if (r1 == 0) goto L_0x0253;
    L_0x023f:
        r1 = r8.b;	 Catch:{ MalformedURLException -> 0x02bc }
        r2 = r15.b;	 Catch:{ MalformedURLException -> 0x02bc }
        r2 = r2.getContext();	 Catch:{ MalformedURLException -> 0x02bc }
        r3 = 2131624048; // 0x7f0e0070 float:1.8875265E38 double:1.053162212E-314;
        r2 = android.support.v4.content.ContextCompat.getColor(r2, r3);	 Catch:{ MalformedURLException -> 0x02bc }
        r1.setBackgroundColor(r2);	 Catch:{ MalformedURLException -> 0x02bc }
        if (r9 == 0) goto L_0x0259;
    L_0x0253:
        r1 = r8.b;	 Catch:{ MalformedURLException -> 0x02bc }
        r2 = 0;
        r1.setBackgroundDrawable(r2);	 Catch:{ MalformedURLException -> 0x02bc }
    L_0x0259:
        return r17;
    L_0x025a:
        r1 = move-exception;
        throw r1;
    L_0x025c:
        r1 = r10.a;
        r2 = r1;
        goto L_0x00ca;
    L_0x0261:
        r1 = move-exception;
        throw r1;
    L_0x0263:
        r1 = r10.q;
        r3 = r1;
        goto L_0x00db;
    L_0x0268:
        r1 = move-exception;
        throw r1;	 Catch:{ MalformedURLException -> 0x026a }
    L_0x026a:
        r1 = move-exception;
        throw r1;
    L_0x026c:
        r5 = r4;
        goto L_0x00ee;
    L_0x026f:
        r1 = move-exception;
        throw r1;
    L_0x0271:
        r1 = r10.e();
        goto L_0x00fc;
    L_0x0277:
        r1 = move-exception;
        throw r1;	 Catch:{ MalformedURLException -> 0x0279 }
    L_0x0279:
        r1 = move-exception;
        throw r1;	 Catch:{ MalformedURLException -> 0x027b }
    L_0x027b:
        r1 = move-exception;
        throw r1;	 Catch:{ MalformedURLException -> 0x027d }
    L_0x027d:
        r1 = move-exception;
        throw r1;
    L_0x027f:
        r1 = move-exception;
        throw r1;	 Catch:{ MalformedURLException -> 0x0281 }
    L_0x0281:
        r1 = move-exception;
        throw r1;
    L_0x0283:
        r1 = move-exception;
        throw r1;
    L_0x0285:
        r1 = r2;
        goto L_0x0168;
    L_0x0288:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r11 = "\n";
        r1 = r1.append(r11);
        r1 = r1.append(r4);
        r1 = r1.toString();
        goto L_0x0175;
    L_0x029e:
        r1 = move-exception;
        throw r1;	 Catch:{ MalformedURLException -> 0x02a0 }
    L_0x02a0:
        r1 = move-exception;
        throw r1;
    L_0x02a2:
        r1 = r2.length();
        goto L_0x0190;
    L_0x02a8:
        r1 = move-exception;
        throw r1;	 Catch:{ MalformedURLException -> 0x02aa }
    L_0x02aa:
        r1 = move-exception;
        throw r1;	 Catch:{ MalformedURLException -> 0x02ac }
    L_0x02ac:
        r1 = move-exception;
        throw r1;	 Catch:{ MalformedURLException -> 0x02ae }
    L_0x02ae:
        r1 = move-exception;
        throw r1;
    L_0x02b0:
        r1 = move-exception;
        throw r1;	 Catch:{ MalformedURLException -> 0x02b2 }
    L_0x02b2:
        r1 = move-exception;
        throw r1;
    L_0x02b4:
        r1 = move-exception;
        throw r1;
    L_0x02b6:
        r1 = 8;
        goto L_0x0230;
    L_0x02ba:
        r1 = move-exception;
        throw r1;	 Catch:{ MalformedURLException -> 0x02bc }
    L_0x02bc:
        r1 = move-exception;
        throw r1;
    L_0x02be:
        r2 = move-exception;
        goto L_0x0205;
    L_0x02c1:
        r3 = r1;
        r4 = r2;
        r2 = r5;
        goto L_0x015c;
    L_0x02c6:
        r4 = r6;
        r2 = r7;
        r5 = r3;
        r3 = r1;
        goto L_0x015c;
    L_0x02cc:
        r8 = r1;
        goto L_0x00c1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.w0.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public Object getItem(int i) {
        return a(i);
    }
}
