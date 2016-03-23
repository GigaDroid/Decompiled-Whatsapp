package com.whatsapp;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build.VERSION;
import android.text.Layout;
import android.text.Spannable;
import android.text.Spannable.Factory;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.TextView;
import android.widget.TextView.BufferType;
import com.whatsapp.util.Log;
import com.whatsapp.util.bw;
import java.util.List;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class TextEmojiLabel extends TextView {
    private static final Factory c;
    private static boolean f;
    private static final String[] z;
    private BufferType a;
    private vi b;
    private int d;
    private CharSequence e;

    public void a(String str, List list) {
        setText(bw.a(getContext(), a28.b(str, getContext(), getPaint()), str, list));
    }

    public void setContact(l5 l5Var, List list) {
        a(l5Var.a(getContext()), list);
    }

    public TextEmojiLabel(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (VERSION.SDK_INT < 11) {
            try {
                if (!f) {
                    return;
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                throw e;
            }
        }
        setSpannableFactory(c);
    }

    protected void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (Throwable e) {
            Log.a(e);
            a();
            throw new RuntimeException(e);
        }
    }

    public TextEmojiLabel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (VERSION.SDK_INT < 11) {
            try {
                if (!f) {
                    return;
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                throw e;
            }
        }
        setSpannableFactory(c);
    }

    static {
        String[] strArr = new String[13];
        String str = "Zd!\txCn3\u0014qOc<\u00112Cd8\u000eh\\dh]";
        boolean z = true;
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
                        i3 = 46;
                        break;
                    case at.g /*1*/:
                        i3 = 1;
                        break;
                    case at.i /*2*/:
                        i3 = 89;
                        break;
                    case at.o /*3*/:
                        i3 = 125;
                        break;
                    default:
                        i3 = 29;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (z) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "Zd!\txCn3\u0014qOc<\u00112Cd8\u000eh\\dy";
                    i = 2;
                    strArr2 = strArr3;
                    z = true;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "Bh7\u0018=";
                    i = 3;
                    strArr2 = strArr3;
                    z = true;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "Zd!\t'\u000e";
                    i = 4;
                    strArr2 = strArr3;
                    z = true;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "Bh7\u0018=";
                    z = true;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "Bh7\u0018BMn,\u0013i\u0014!";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\u000e)";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "\u000e)";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "\u0007;y";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "Cd8\u000eh\\d=\ntJu1G=";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "\u001ey";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "\u0002!";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    z = strArr3;
                    f = false;
                    try {
                        Class cls = Layout.class;
                        char[] toCharArray2 = "^s6\u001ex]r\r\u0012N[q)\u0012oZD4\u0012wG".toCharArray();
                        int length2 = toCharArray2.length;
                        char[] cArr2 = toCharArray2;
                        for (int i4 = 0; length2 > i4; i4++) {
                            int i5;
                            char c2 = cArr2[i4];
                            switch (i4 % 5) {
                                case v.m /*0*/:
                                    i5 = 46;
                                    break;
                                case at.g /*1*/:
                                    i5 = 1;
                                    break;
                                case at.i /*2*/:
                                    i5 = 89;
                                    break;
                                case at.o /*3*/:
                                    i5 = 125;
                                    break;
                                default:
                                    i5 = 29;
                                    break;
                            }
                            cArr2[i4] = (char) (i5 ^ c2);
                        }
                        String intern = new String(cArr2).intern();
                        cls.getDeclaredMethod(intern, new Class[]{CharSequence.class, Integer.TYPE, Integer.TYPE});
                        f = true;
                    } catch (SecurityException e) {
                    } catch (NoSuchMethodException e2) {
                    }
                    c = new aix();
                    return;
                default:
                    strArr2[i] = str;
                    str = "Zd!\txCn3\u0014qOc<\u00112Cd8\u000eh\\dy";
                    i = 1;
                    strArr2 = strArr3;
                    z = false;
                    break;
            }
        }
    }

    public void setContact(l5 l5Var) {
        a(l5Var.a(getContext()));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setText(java.lang.CharSequence r7, android.widget.TextView.BufferType r8) {
        /*
        r6 = this;
        r0 = 0;
        r3 = com.whatsapp.DialogToastActivity.f;
        r1 = f;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x005c }
        if (r1 == 0) goto L_0x003c;
    L_0x0007:
        if (r7 == 0) goto L_0x003c;
    L_0x0009:
        r1 = "\u25a1";
        r1 = 0;
        r5 = r0;
        r0 = r1;
        r1 = r5;
    L_0x0010:
        r2 = r7.length();
        if (r1 >= r2) goto L_0x0039;
    L_0x0016:
        r2 = r7.charAt(r1);
        r4 = 55296; // 0xd800 float:7.7486E-41 double:2.732E-319;
        if (r2 < r4) goto L_0x0033;
    L_0x001f:
        r4 = 57343; // 0xdfff float:8.0355E-41 double:2.8331E-319;
        if (r2 > r4) goto L_0x0033;
    L_0x0024:
        if (r0 != 0) goto L_0x002b;
    L_0x0026:
        r0 = new android.text.SpannableStringBuilder;
        r0.<init>(r7);
    L_0x002b:
        r2 = r1 + 1;
        r4 = "\u25a1";
        r0.replace(r1, r2, r4);
    L_0x0033:
        r2 = r0;
        r0 = r1 + 1;
        if (r3 == 0) goto L_0x0066;
    L_0x0038:
        r0 = r2;
    L_0x0039:
        if (r0 == 0) goto L_0x003c;
    L_0x003b:
        r7 = r0;
    L_0x003c:
        r6.e = r7;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x005e }
        r6.a = r8;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x005e }
        r0 = 0;
        r6.d = r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x005e }
        r0 = android.os.Build.VERSION.SDK_INT;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x005e }
        r1 = 11;
        if (r0 >= r1) goto L_0x004d;
    L_0x0049:
        r0 = f;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0060 }
        if (r0 == 0) goto L_0x0058;
    L_0x004d:
        r0 = r7 instanceof android.text.Spanned;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0062 }
        if (r0 == 0) goto L_0x0058;
    L_0x0051:
        r0 = android.widget.TextView.BufferType.SPANNABLE;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0064 }
        super.setText(r7, r0);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0064 }
        if (r3 == 0) goto L_0x005b;
    L_0x0058:
        super.setText(r7, r8);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0064 }
    L_0x005b:
        return;
    L_0x005c:
        r0 = move-exception;
        throw r0;
    L_0x005e:
        r0 = move-exception;
        throw r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0060 }
    L_0x0060:
        r0 = move-exception;
        throw r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0062 }
    L_0x0062:
        r0 = move-exception;
        throw r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0064 }
    L_0x0064:
        r0 = move-exception;
        throw r0;
    L_0x0066:
        r1 = r0;
        r0 = r2;
        goto L_0x0010;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.TextEmojiLabel.setText(java.lang.CharSequence, android.widget.TextView$BufferType):void");
    }

    public void setLinkHandler(vi viVar) {
        this.b = viVar;
    }

    public TextEmojiLabel(Context context) {
        super(context);
        if (VERSION.SDK_INT < 11) {
            try {
                if (!f) {
                    return;
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                throw e;
            }
        }
        setSpannableFactory(c);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (this.b != null) {
            CharSequence text = getText();
            try {
                if ((text instanceof Spannable) && getLayout() != null) {
                    return this.b.onTouchEvent(this, (Spannable) text, motionEvent) | onTouchEvent;
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                throw e;
            }
        }
        return onTouchEvent;
    }

    public void a(String str) {
        setText(a28.a(str, getContext(), getPaint()));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @android.annotation.SuppressLint({"WrongCall"})
    private void a(int r9, int r10) {
        /*
        r8 = this;
        r6 = 10;
        r5 = 0;
        r2 = com.whatsapp.DialogToastActivity.f;
        r1 = new android.text.SpannableStringBuilder;
        r0 = r8.e;
        r1.<init>(r0);
        r0 = r1.length();
        r3 = android.text.style.MetricAffectingSpan.class;
        r0 = r1.nextSpanTransition(r5, r0, r3);
    L_0x0016:
        if (r0 < 0) goto L_0x0032;
    L_0x0018:
        r3 = r1.length();
        if (r0 >= r3) goto L_0x0032;
    L_0x001e:
        r3 = " ";
        r1.insert(r0, r3);
        r0 = r0 + 1;
        r3 = r1.length();
        r4 = android.text.style.MetricAffectingSpan.class;
        r0 = r1.nextSpanTransition(r0, r3, r4);
        if (r2 == 0) goto L_0x0016;
    L_0x0032:
        r8.e = r1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x003b }
        super.setText(r1);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x003b }
        super.onMeasure(r9, r10);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x003b }
    L_0x003a:
        return;
    L_0x003b:
        r0 = move-exception;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r3 = z;
        r3 = r3[r5];
        r1 = r1.append(r3);
        r0 = r0.toString();
        r0 = r1.append(r0);
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
        r1 = new android.text.SpannableStringBuilder;
        r0 = r8.e;
        r1.<init>(r0);
        r0 = android.text.TextUtils.indexOf(r1, r6, r5);
        r7 = r0;
        r0 = r1;
        r1 = r7;
    L_0x0066:
        if (r1 < 0) goto L_0x0079;
    L_0x0068:
        r3 = r1 + 1;
        r4 = " ";
        r0 = r0.replace(r1, r3, r4);
        r1 = r1 + 1;
        r1 = android.text.TextUtils.indexOf(r0, r6, r1);
        if (r2 == 0) goto L_0x0066;
    L_0x0079:
        r8.e = r0;
        super.setText(r0);
        super.onMeasure(r9, r10);
        goto L_0x003a;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.TextEmojiLabel.a(int, int):void");
    }

    private String a(CharSequence charSequence) {
        boolean z = DialogToastActivity.f;
        String str = "";
        int i = 0;
        while (i < charSequence.length()) {
            str = str + z[11] + Integer.toHexString(charSequence.charAt(i)) + z[12];
            i++;
            if (z) {
                break;
            }
        }
        return str;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onMeasure(int r5, int r6) {
        /*
        r4 = this;
        r0 = android.os.Build.VERSION.SDK_INT;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0050 }
        r1 = 16;
        if (r0 == r1) goto L_0x000c;
    L_0x0006:
        r0 = android.os.Build.VERSION.SDK_INT;	 Catch:{ SecurityException -> 0x0052 }
        r1 = 17;
        if (r0 != r1) goto L_0x009b;
    L_0x000c:
        super.onMeasure(r5, r6);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0054, IndexOutOfBoundsException -> 0x0076 }
    L_0x000f:
        r0 = r4.getMeasuredWidth();
        r1 = r4.getPaddingLeft();
        r0 = r0 - r1;
        r1 = r4.getPaddingRight();
        r0 = r0 - r1;
        r1 = r4.d;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00a2 }
        if (r1 == r0) goto L_0x004f;
    L_0x0021:
        r1 = r4.e;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00a4 }
        r1 = r1 instanceof android.text.Spanned;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00a4 }
        if (r1 == 0) goto L_0x004f;
    L_0x0027:
        r1 = r4.getEllipsize();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00a4 }
        if (r1 == 0) goto L_0x004f;
    L_0x002d:
        r4.d = r0;
        r1 = r4.e;
        r2 = r4.getPaint();
        r0 = (float) r0;
        r3 = r4.getEllipsize();
        r0 = android.text.TextUtils.ellipsize(r1, r2, r0, r3);
        if (r0 == 0) goto L_0x004f;
    L_0x0040:
        r1 = r4.getText();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00a6 }
        r1 = r0.equals(r1);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00a6 }
        if (r1 != 0) goto L_0x004f;
    L_0x004a:
        r1 = r4.a;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00a6 }
        super.setText(r0, r1);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00a6 }
    L_0x004f:
        return;
    L_0x0050:
        r0 = move-exception;
        throw r0;	 Catch:{  }
    L_0x0052:
        r0 = move-exception;
        throw r0;
    L_0x0054:
        r0 = move-exception;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r3 = 1;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r0 = r0.toString();
        r0 = r1.append(r0);
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
        r4.a(r5, r6);
        goto L_0x000f;
    L_0x0076:
        r0 = move-exception;
        r1 = new java.lang.StringBuilder;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00a0 }
        r1.<init>();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00a0 }
        r2 = z;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00a0 }
        r3 = 2;
        r2 = r2[r3];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00a0 }
        r1 = r1.append(r2);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00a0 }
        r0 = r0.toString();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00a0 }
        r0 = r1.append(r0);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00a0 }
        r0 = r0.toString();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00a0 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00a0 }
        r4.a(r5, r6);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00a0 }
        r0 = com.whatsapp.DialogToastActivity.f;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00a0 }
        if (r0 == 0) goto L_0x000f;
    L_0x009b:
        super.onMeasure(r5, r6);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00a0 }
        goto L_0x000f;
    L_0x00a0:
        r0 = move-exception;
        throw r0;
    L_0x00a2:
        r0 = move-exception;
        throw r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00a4 }
    L_0x00a4:
        r0 = move-exception;
        throw r0;
    L_0x00a6:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.TextEmojiLabel.onMeasure(int, int):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a() {
        /*
        r9 = this;
        r2 = com.whatsapp.DialogToastActivity.f;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = z;
        r3 = 10;
        r1 = r1[r3];
        r0 = r0.append(r1);
        r1 = r9.getMeasuredWidth();
        r0 = r0.append(r1);
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
        r3 = r9.getText();
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = z;
        r4 = 4;
        r1 = r1[r4];
        r0 = r0.append(r1);
        r1 = r9.a(r3);
        r0 = r0.append(r1);
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
        r4 = r9.getLayout();
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = z;
        r5 = 6;
        r1 = r1[r5];
        r0 = r0.append(r1);
        r1 = r4.getLineCount();
        r0 = r0.append(r1);
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
        r0 = 0;
    L_0x0063:
        r1 = r4.getLineCount();
        if (r0 >= r1) goto L_0x0109;
    L_0x0069:
        r5 = r4.getLineStart(r0);
        r1 = r4.getLineCount();
        r1 = r1 + -1;
        if (r0 != r1) goto L_0x007b;
    L_0x0075:
        r1 = r3.length();
        if (r2 == 0) goto L_0x0081;
    L_0x007b:
        r1 = r0 + 1;
        r1 = r4.getLineStart(r1);
    L_0x0081:
        if (r5 > r1) goto L_0x00cd;
    L_0x0083:
        r6 = new java.lang.StringBuilder;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x010a }
        r6.<init>();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x010a }
        r7 = z;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x010a }
        r8 = 5;
        r7 = r7[r8];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x010a }
        r6 = r6.append(r7);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x010a }
        r6 = r6.append(r0);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x010a }
        r7 = z;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x010a }
        r8 = 8;
        r7 = r7[r8];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x010a }
        r6 = r6.append(r7);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x010a }
        r6 = r6.append(r5);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x010a }
        r7 = "-";
        r6 = r6.append(r7);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x010a }
        r6 = r6.append(r1);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x010a }
        r7 = z;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x010a }
        r8 = 9;
        r7 = r7[r8];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x010a }
        r6 = r6.append(r7);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x010a }
        r7 = r3.subSequence(r5, r1);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x010a }
        r7 = r9.a(r7);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x010a }
        r6 = r6.append(r7);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x010a }
        r6 = r6.toString();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x010a }
        com.whatsapp.util.Log.e(r6);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x010a }
        if (r2 == 0) goto L_0x0105;
    L_0x00cd:
        r6 = new java.lang.StringBuilder;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x010a }
        r6.<init>();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x010a }
        r7 = z;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x010a }
        r8 = 3;
        r7 = r7[r8];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x010a }
        r6 = r6.append(r7);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x010a }
        r6 = r6.append(r0);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x010a }
        r7 = z;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x010a }
        r8 = 7;
        r7 = r7[r8];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x010a }
        r6 = r6.append(r7);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x010a }
        r5 = r6.append(r5);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x010a }
        r6 = "-";
        r5 = r5.append(r6);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x010a }
        r1 = r5.append(r1);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x010a }
        r5 = ")";
        r1 = r1.append(r5);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x010a }
        r1 = r1.toString();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x010a }
        com.whatsapp.util.Log.e(r1);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x010a }
    L_0x0105:
        r0 = r0 + 1;
        if (r2 == 0) goto L_0x0063;
    L_0x0109:
        return;
    L_0x010a:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.TextEmojiLabel.a():void");
    }
}
