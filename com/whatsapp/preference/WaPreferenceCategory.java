package com.whatsapp.preference;

import android.content.Context;
import android.preference.PreferenceCategory;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

public class WaPreferenceCategory extends PreferenceCategory {
    public WaPreferenceCategory(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    protected View onCreateView(ViewGroup viewGroup) {
        return WaPreference.a(super.onCreateView(viewGroup));
    }

    public WaPreferenceCategory(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public WaPreferenceCategory(Context context) {
        super(context);
    }
}
