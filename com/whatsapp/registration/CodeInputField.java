package com.whatsapp.registration;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Typeface;
import android.support.annotation.NonNull;
import android.util.AttributeSet;
import android.widget.EditText;
import com.whatsapp.App;
import com.whatsapp.VerifySms;
import com.whatsapp.WAAppCompatActivity;
import com.whatsapp.arj;
import org.v;
import org.whispersystems.at;

public final class CodeInputField extends EditText {
    private static int a;
    public static int b;
    private static Typeface c;
    private static final String z;

    @NonNull
    public String b() {
        return a(getText());
    }

    public void a(@NonNull VerifySms verifySms) {
        int i = b;
        addTextChangedListener(new c(verifySms, this, null));
        setText("");
        a();
        if (WAAppCompatActivity.c != 0) {
            b = i + 1;
        }
    }

    static int c() {
        return a;
    }

    private void a() {
        if (c == null) {
            c = Typeface.createFromAsset(App.z().getAssets(), z);
        }
        setTypeface(c);
    }

    @TargetApi(21)
    public CodeInputField(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public CodeInputField(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    static {
        char[] toCharArray = ".[i7\u0018gfh!\u0004<[J,\u0005'\u0019U&\f=Xf1E<@a".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 72;
                    break;
                case at.g /*1*/:
                    i2 = 52;
                    break;
                case at.i /*2*/:
                    i2 = 7;
                    break;
                case at.o /*3*/:
                    i2 = 67;
                    break;
                default:
                    i2 = arj.Theme_seekBarStyle;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
        c = null;
        a = 6;
    }

    public CodeInputField(Context context) {
        super(context);
    }

    @NonNull
    public static String a(@NonNull CharSequence charSequence) {
        return charSequence.toString().replace(Character.toString('\u2013'), "").replace(Character.toString('\u00a0'), "");
    }

    public static void setRegistrationVoiceCodeLength(int i) {
        a = i;
    }

    protected void onSelectionChanged(int i, int i2) {
        if (i == i2) {
            int indexOf = getText().toString().indexOf(8211);
            if (indexOf > -1 && i > indexOf) {
                setSelection(indexOf);
            }
        }
        super.onSelectionChanged(i, i2);
    }

    public CodeInputField(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
