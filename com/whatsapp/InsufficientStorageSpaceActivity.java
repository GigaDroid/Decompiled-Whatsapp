package com.whatsapp;

import android.content.Intent;
import android.os.Bundle;
import android.text.format.Formatter;
import android.widget.Button;
import android.widget.TextView;
import org.v;
import org.whispersystems.at;

public class InsufficientStorageSpaceActivity extends DialogToastActivity {
    private static final String[] z;
    private long n;

    static {
        String[] strArr = new String[3];
        String str = "\u001c\tt2Q\u0014\u0003>)P\t\u0002~4\u0010\u001e\u0006d%Y\u0012\u0015inv2*U";
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
                        i3 = 125;
                        break;
                    case at.g /*1*/:
                        i3 = arj.Theme_checkedTextViewStyle;
                        break;
                    case at.i /*2*/:
                        i3 = 16;
                        break;
                    case at.o /*3*/:
                        i3 = 64;
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
                    i = 2;
                    strArr2 = strArr3;
                    str = "\u000e\u0017q#[3\u0002u$[\u0019.~\u0002G\t\u0002c";
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u001c\tt2Q\u0014\u0003>)P\t\u0002~4\u0010\u001c\u0004d)Q\u0013I]\u0001w3";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    protected void onResume() {
        super.onResume();
        if (App.ak() > this.n) {
            finish();
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2130903073);
        Button button = (Button) findViewById(2131755232);
        TextView textView = (TextView) findViewById(2131755231);
        this.n = getIntent().getLongExtra(z[2], -1);
        String string = getString(2131231375);
        String formatShortFileSize = Formatter.formatShortFileSize(this, this.n);
        textView.setText(String.format(string, new Object[]{formatShortFileSize}));
        button.setOnClickListener(new ie(this));
    }

    public void onBackPressed() {
        Intent intent = new Intent(z[1]);
        intent.addCategory(z[0]);
        intent.setFlags(268435456);
        startActivity(intent);
    }
}
