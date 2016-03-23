package com.whatsapp;

import android.view.animation.Animation;
import android.view.animation.Transformation;

class af extends Animation {
    final AnswerCallView a;

    private af(AnswerCallView answerCallView) {
        this.a = answerCallView;
    }

    af(AnswerCallView answerCallView, an2 com_whatsapp_an2) {
        this(answerCallView);
    }

    protected void applyTransformation(float f, Transformation transformation) {
        AnswerCallView.a(this.a, f);
        this.a.invalidate();
    }
}
