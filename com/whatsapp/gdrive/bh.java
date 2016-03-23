package com.whatsapp.gdrive;

import android.view.animation.Animation;
import android.view.animation.Transformation;

class bh extends Animation {
    final GoogleDriveRestoreAnimationView a;

    protected void applyTransformation(float f, Transformation transformation) {
        GoogleDriveRestoreAnimationView.a(this.a, f);
        this.a.invalidate();
    }

    bh(GoogleDriveRestoreAnimationView googleDriveRestoreAnimationView, cc ccVar) {
        this(googleDriveRestoreAnimationView);
    }

    private bh(GoogleDriveRestoreAnimationView googleDriveRestoreAnimationView) {
        this.a = googleDriveRestoreAnimationView;
    }
}
