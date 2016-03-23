package com.whatsapp.preference;

import android.content.Context;
import android.support.v4.util.Pair;
import android.util.AttributeSet;
import com.whatsapp.aqu;

public class WaLanguageListPreference extends WaListPreference {
    public void a() {
        Pair e = aqu.e();
        setEntries((CharSequence[]) e.first);
        setEntryValues((CharSequence[]) e.second);
    }

    public WaLanguageListPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public WaLanguageListPreference(Context context) {
        super(context);
    }
}
