package com.whatsapp;

import android.support.v4.text.TextDirectionHeuristicCompat;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import org.v;
import org.whispersystems.at;

final class atc implements TextDirectionHeuristicCompat {
    public boolean isRtl(CharSequence charSequence, int i, int i2) {
        boolean z = DialogToastActivity.f;
        int i3 = i;
        while (i3 < i + i2) {
            int codePointAt = Character.codePointAt(charSequence, i3);
            int charCount = Character.charCount(codePointAt);
            if (codePointAt < 127462 || codePointAt > 127487) {
                switch (Character.getDirectionality(codePointAt)) {
                    case v.m /*0*/:
                    case arj.Toolbar_titleMarginEnd /*14*/:
                    case arj.Toolbar_titleMarginTop /*15*/:
                        return false;
                    case at.g /*1*/:
                    case at.i /*2*/:
                    case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    case arj.Toolbar_maxButtonHeight /*17*/:
                        return true;
                }
            }
            i3 += charCount;
            if (z) {
                return false;
            }
        }
        return false;
    }

    atc() {
    }
}
