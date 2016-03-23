package com.whatsapp;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

public class CorruptInstallationActivity extends DialogToastActivity {
    private static final String[] z;

    static {
        String[] strArr = new String[5];
        String str = "wU0kM%\u000eklIh\u000f3s_kR%kN1B+v";
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
                        i3 = 31;
                        break;
                    case at.g /*1*/:
                        i3 = 33;
                        break;
                    case at.i /*2*/:
                        i3 = 68;
                        break;
                    case at.o /*3*/:
                        i3 = 27;
                        break;
                    default:
                        i3 = 62;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "|N)5Iw@0h_oQj_[lB6r\\zq6t\\sD)Z]kH2rJf\u000f\"iQr";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "|N6iKoUirPlU%wR";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "|N*o_|UihKoQ+iJ?M-uU?G+nP{";
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "|N*o_|UihKoQ+iJ";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    protected void onCreate(Bundle bundle) {
        boolean z = DialogToastActivity.f;
        super.onCreate(bundle);
        setContentView(2130903069);
        TextView textView = (TextView) findViewById(2131755206);
        Spanned fromHtml = Html.fromHtml(getString(2131231006));
        CharSequence spannableStringBuilder = new SpannableStringBuilder(fromHtml);
        URLSpan[] uRLSpanArr = (URLSpan[]) fromHtml.getSpans(0, fromHtml.length(), URLSpan.class);
        if (uRLSpanArr != null) {
            int length = uRLSpanArr.length;
            int i = 0;
            while (i < length) {
                URLSpan uRLSpan = uRLSpanArr[i];
                if (z[1].equals(uRLSpan.getURL())) {
                    Log.i(z[4]);
                    int spanStart = spannableStringBuilder.getSpanStart(uRLSpan);
                    int spanEnd = spannableStringBuilder.getSpanEnd(uRLSpan);
                    int spanFlags = spannableStringBuilder.getSpanFlags(uRLSpan);
                    spannableStringBuilder.removeSpan(uRLSpan);
                    Intent intent = new Intent(null, null, this, DescribeProblemActivity.class);
                    intent.putExtra(z[2], z[3]);
                    spannableStringBuilder.setSpan(new n4(intent), spanStart, spanEnd, spanFlags);
                }
                i++;
                if (z) {
                    break;
                }
            }
        }
        textView.setText(spannableStringBuilder);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        ((Button) findViewById(2131755202)).setOnClickListener(new xg(this));
        ((Button) findViewById(2131755205)).setOnClickListener(new a22(this));
        View findViewById = findViewById(2131755201);
        View findViewById2 = findViewById(2131755203);
        switch (App.j) {
            case at.g /*1*/:
                textView = (TextView) findViewById(2131755204);
                textView.setMovementMethod(LinkMovementMethod.getInstance());
                textView.setText(Html.fromHtml(String.format(getString(2131231008), new Object[]{z[0]})));
                findViewById.setVisibility(8);
                if (z) {
                    break;
                }
                return;
        }
        findViewById2.setVisibility(8);
    }
}
