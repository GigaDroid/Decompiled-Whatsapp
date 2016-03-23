package com.whatsapp.preference;

import android.content.Context;
import android.preference.ListPreference;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

public class WaListPreference extends ListPreference {
    public static int a;

    public WaListPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public WaListPreference(Context context) {
        super(context);
    }

    protected View onCreateView(ViewGroup viewGroup) {
        return WaPreference.b(WaPreference.a(super.onCreateView(viewGroup)));
    }
}
