package com.whatsapp;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint.Align;
import android.os.Build.VERSION;
import android.provider.Settings.Secure;
import android.support.v7.widget.AppCompatEditText;
import android.text.Editable.Factory;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import org.v;
import org.whispersystems.at;

public class ConversationTextEntry extends AppCompatEditText {
    private static final Factory b;
    private static boolean c;
    private static final String[] z;
    private float a;
    private TextPaint d;
    private int e;
    private String f;
    private String g;
    private float h;

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (this.e != 0) {
            int i = editorInfo.imeOptions & 255;
            try {
                if ((this.e & i) != 0) {
                    editorInfo.imeOptions = i ^ editorInfo.imeOptions;
                    editorInfo.imeOptions |= this.e;
                }
                try {
                    if ((editorInfo.imeOptions & 1073741824) != 0) {
                        editorInfo.imeOptions &= -1073741825;
                    }
                } catch (SecurityException e) {
                    throw e;
                }
            } catch (SecurityException e2) {
                throw e2;
            }
        }
        return onCreateInputConnection;
    }

    public ConversationTextEntry(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (VERSION.SDK_INT < 11) {
            try {
                if (!c) {
                    return;
                }
            } catch (SecurityException e) {
                throw e;
            }
        }
        setEditableFactory(b);
    }

    static {
        String[] strArr = new String[2];
        String str = "x_J fpNs(}lOX\u001e~yND.w";
        boolean z = true;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        int i = 0;
        while (true) {
            int i2;
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i3 = 0; length > i3; i3++) {
                char c = cArr[i3];
                switch (i3 % 5) {
                    case v.m /*0*/:
                        i2 = 28;
                        break;
                    case at.g /*1*/:
                        i2 = 58;
                        break;
                    case at.i /*2*/:
                        i2 = 44;
                        break;
                    case at.o /*3*/:
                        i2 = 65;
                        break;
                    default:
                        i2 = 19;
                        break;
                }
                cArr[i3] = (char) (i2 ^ c);
            }
            str = new String(cArr).intern();
            switch (z) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    z = strArr3;
                    c = false;
                    try {
                        Class cls = Layout.class;
                        char[] toCharArray2 = "lHC\"voIx.@iJ\\.ah\u007fA.yu".toCharArray();
                        i2 = toCharArray2.length;
                        char[] cArr2 = toCharArray2;
                        for (i = 0; i2 > i; i++) {
                            int i4;
                            char c2 = cArr2[i];
                            switch (i % 5) {
                                case v.m /*0*/:
                                    i4 = 28;
                                    break;
                                case at.g /*1*/:
                                    i4 = 58;
                                    break;
                                case at.i /*2*/:
                                    i4 = 44;
                                    break;
                                case at.o /*3*/:
                                    i4 = 65;
                                    break;
                                default:
                                    i4 = 19;
                                    break;
                            }
                            cArr2[i] = (char) (i4 ^ c2);
                        }
                        String intern = new String(cArr2).intern();
                        cls.getDeclaredMethod(intern, new Class[]{CharSequence.class, Integer.TYPE, Integer.TYPE});
                        c = true;
                    } catch (SecurityException e) {
                    } catch (NoSuchMethodException e2) {
                    }
                    b = new ar0();
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u007fUAo{hY\u0002 }xHC(w2RX\"zq_\u0003o[Hye\fVO_^7z\u007f_";
                    i = 1;
                    strArr2 = strArr3;
                    z = false;
            }
        }
    }

    public void setHint(String str) {
        this.f = str;
        this.g = null;
        requestLayout();
    }

    public void setInputEnterAction(int i) {
        this.e = i;
        setRawInputType(180225);
        int i2 = 4;
        if (i == 0) {
            i2 = 1073741828;
        }
        try {
            if (VERSION.SDK_INT >= 14 && z[1].equals(Secure.getString(App.at, z[0]))) {
                i2 |= 268435456;
            }
            setImeOptions(i2);
        } catch (SecurityException e) {
            throw e;
        }
    }

    public void setInputEnterDone(boolean z) {
        setInputEnterAction(z ? 6 : 0);
    }

    public void setInputEnterSend(boolean z) {
        int i;
        if (z) {
            i = 4;
        } else {
            i = 0;
        }
        setInputEnterAction(i);
    }

    protected void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
            if (!TextUtils.isEmpty(this.g)) {
                if (TextUtils.isEmpty(getText())) {
                    try {
                        if (App.a1()) {
                            try {
                                canvas.drawText(this.g, (float) getPaddingLeft(), ((float) getPaddingTop()) - this.h, this.d);
                                if (!DialogToastActivity.f) {
                                    return;
                                }
                            } catch (SecurityException e) {
                                throw e;
                            }
                        }
                        this.d.setTextAlign(Align.RIGHT);
                        canvas.drawText(this.g, (float) (getWidth() - getPaddingRight()), ((float) getPaddingTop()) - this.h, this.d);
                    } catch (SecurityException e2) {
                        throw e2;
                    }
                }
            }
        } catch (SecurityException e22) {
            throw e22;
        } catch (SecurityException e222) {
            throw e222;
        }
    }

    public ConversationTextEntry(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (VERSION.SDK_INT < 11) {
            try {
                if (!c) {
                    return;
                }
            } catch (SecurityException e) {
                throw e;
            }
        }
        setEditableFactory(b);
    }

    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f != null) {
            int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            try {
                if (this.d == null) {
                    this.d = new TextPaint(1);
                    this.d.setColor(getHintTextColors().getDefaultColor());
                    this.d.setTextSize(getTextSize());
                    this.d.setTextAlign(Align.LEFT);
                }
                this.g = TextUtils.ellipsize(this.f, this.d, (float) measuredWidth, TruncateAt.END).toString();
                this.h = this.d.getFontMetrics().top;
                this.a = this.d.measureText(this.g);
            } catch (SecurityException e) {
                throw e;
            }
        }
    }

    public ConversationTextEntry(Context context) {
        super(context);
        if (VERSION.SDK_INT < 11) {
            try {
                if (!c) {
                    return;
                }
            } catch (SecurityException e) {
                throw e;
            }
        }
        setEditableFactory(b);
    }
}
