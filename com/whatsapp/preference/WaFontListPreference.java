package com.whatsapp.preference;

import android.app.AlertDialog.Builder;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ListAdapter;
import com.whatsapp.WAAppCompatActivity;

public class WaFontListPreference extends WaListPreference {
    public static int b;
    private int c;

    static {
        b = 0;
    }

    public boolean persistString(String str) {
        b = Integer.parseInt(str);
        return super.persistString(str);
    }

    protected void onPrepareDialogBuilder(Builder builder) {
        int i = WaListPreference.a;
        super.onPrepareDialogBuilder(builder);
        ListAdapter bVar = new b(this, getEntries(), getEntryValues());
        this.c = findIndexOfValue(getValue());
        builder.setSingleChoiceItems(bVar, this.c, new c(this));
        builder.setPositiveButton(null, null);
        if (WAAppCompatActivity.c != 0) {
            WaListPreference.a = i + 1;
        }
    }

    public WaFontListPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    static int a(WaFontListPreference waFontListPreference, int i) {
        waFontListPreference.c = i;
        return i;
    }

    protected void onDialogClosed(boolean z) {
        super.onDialogClosed(z);
        CharSequence[] entryValues = getEntryValues();
        if (z && this.c >= 0 && entryValues != null) {
            String charSequence = entryValues[this.c].toString();
            if (callChangeListener(charSequence)) {
                setValue(charSequence);
            }
        }
    }

    public WaFontListPreference(Context context) {
        super(context);
    }
}
