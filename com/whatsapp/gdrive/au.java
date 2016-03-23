package com.whatsapp.gdrive;

import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.widget.TextView;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

class au implements Runnable {
    private static final String[] z;
    final b7 a;

    static {
        String[] strArr = new String[3];
        String str = "-8\u001d:[/q\u000e0Y#*\u0006'Te3\u00016\u0000>5\u00026\u000099\u001b&]e(\u000e8D$;B'B%q\u0003<C-";
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
                        i3 = 74;
                        break;
                    case at.g /*1*/:
                        i3 = 92;
                        break;
                    case at.i /*2*/:
                        i3 = 111;
                        break;
                    case at.o /*3*/:
                        i3 = 83;
                        break;
                    default:
                        i3 = 45;
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
                    str = "97\u0006#\u0000&3\u00008D$;B5B8q\r2N!)\u001f ";
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "-8\u001d:[/q\u000e0Y#*\u0006'Te3\u00016\u0000>5\u00026\u000099\u001b&]e(\u000e8D$;B'B%q\u0003<C-s\u000e?A%+B&^/.B'Bg/\u0004:]g0\u0000<F#2\b~K%.B1L)7\u001a#^";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void run() {
        int i = 0;
        boolean z = GoogleDriveService.c;
        Log.i(z[0]);
        CharSequence spannableStringBuilder = new SpannableStringBuilder(Html.fromHtml(this.a.a.getString(2131231230)));
        URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class);
        if (uRLSpanArr != null) {
            int length = uRLSpanArr.length;
            while (i < length) {
                URLSpan uRLSpan = uRLSpanArr[i];
                if (z[2].equals(uRLSpan.getURL())) {
                    Log.i(z[1]);
                    int spanStart = spannableStringBuilder.getSpanStart(uRLSpan);
                    int spanEnd = spannableStringBuilder.getSpanEnd(uRLSpan);
                    int spanFlags = spannableStringBuilder.getSpanFlags(uRLSpan);
                    spannableStringBuilder.removeSpan(uRLSpan);
                    spannableStringBuilder.setSpan(new e7(this), spanStart, spanEnd, spanFlags);
                }
                i++;
                if (z) {
                    break;
                }
            }
        }
        TextView textView = (TextView) this.a.a.findViewById(2131755208);
        textView.setText(spannableStringBuilder);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    au(b7 b7Var) {
        this.a = b7Var;
    }
}
