package com.whatsapp;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.annotation.TargetApi;
import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.at;

@TargetApi(21)
public class alj extends Transition {
    private static final String[] a;
    private static final String[] z;

    public String[] getTransitionProperties() {
        return a;
    }

    private void a(TransitionValues transitionValues) {
        View view = transitionValues.view;
        transitionValues.values.put(z[4], new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        Object obj = new int[2];
        transitionValues.view.getLocationInWindow(obj);
        transitionValues.values.put(z[5], obj);
    }

    public void captureEndValues(TransitionValues transitionValues) {
        View view = transitionValues.view;
        if (view.getWidth() > 0 && view.getHeight() > 0) {
            a(transitionValues);
        }
    }

    public void captureStartValues(TransitionValues transitionValues) {
        View view = transitionValues.view;
        if (view.getWidth() > 0 && view.getHeight() > 0) {
            a(transitionValues);
        }
    }

    public Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues == null || transitionValues2 == null) {
            return null;
        }
        Rect rect = (Rect) transitionValues.values.get(z[1]);
        Rect rect2 = (Rect) transitionValues2.values.get(z[2]);
        if (rect == null || rect2 == null || rect.equals(rect2)) {
            return null;
        }
        viewGroup.getLocationInWindow(new int[2]);
        transitionValues.values.get(z[3]);
        int width = (rect.left + (rect.width() / 2)) - (rect2.width() / 2);
        int height = (rect.top + (rect.height() / 2)) - (rect2.height() / 2);
        transitionValues2.values.get(z[0]);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(transitionValues2.view, View.TRANSLATION_X, View.TRANSLATION_Y, getPathMotion().getPath((float) width, (float) height, (float) 0, (float) 0));
        transitionValues2.view.setTranslationX((float) width);
        transitionValues2.view.setTranslationY((float) height);
        float min = Math.min(((float) rect.width()) / ((float) rect2.width()), ((float) rect.height()) / ((float) rect2.width()));
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(transitionValues2.view, View.SCALE_X, new float[]{min, 1.0f});
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(transitionValues2.view, View.SCALE_Y, new float[]{min, 1.0f});
        Animator com_whatsapp_aou = new aou(ViewAnimationUtils.createCircularReveal(transitionValues2.view, rect2.centerX(), rect2.centerY(), 0.0f, (float) (Math.sqrt((double) ((rect2.height() * rect2.height()) + (rect2.width() * rect2.width()))) / 2.0d)));
        transitionValues2.view.setAlpha(0.0f);
        com_whatsapp_aou.addListener(new t0(this, transitionValues2));
        Animator animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{ofFloat, com_whatsapp_aou, ofFloat2, ofFloat3});
        animatorSet.setInterpolator(getInterpolator());
        return animatorSet;
    }

    static {
        String[] strArr = new String[6];
        String str = "[\u007f\u0002Y\u0015]B\u0002[\u0017K\u007f\u0004S\u0016V,\u0000U\nQb\u0019U\u0017";
        int i = -1;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        int i2 = 0;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i3 = 0; length > i3; i3++) {
                int i4;
                char c = cArr[i3];
                switch (i3 % 5) {
                    case v.m /*0*/:
                        i4 = 56;
                        break;
                    case at.g /*1*/:
                        i4 = 22;
                        break;
                    case at.i /*2*/:
                        i4 = 112;
                        break;
                    case at.o /*3*/:
                        i4 = 58;
                        break;
                    default:
                        i4 = 121;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "[\u007f\u0002Y\u0015]B\u0002[\u0017K\u007f\u0004S\u0016V,\u0012U\fVr\u0003";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    str = "[\u007f\u0002Y\u0015]B\u0002[\u0017K\u007f\u0004S\u0016V,\u0000U\nQb\u0019U\u0017";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    str = "[\u007f\u0002Y\u0015]B\u0002[\u0017K\u007f\u0004S\u0016V,\u0012U\fVr\u0003";
                    i2 = 4;
                    strArr2 = strArr3;
                    i = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    strArr2 = strArr3;
                    str = "[\u007f\u0002Y\u0015]B\u0002[\u0017K\u007f\u0004S\u0016V,\u0000U\nQb\u0019U\u0017";
                    i = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    strArr = new String[2];
                    str = "[\u007f\u0002Y\u0015]B\u0002[\u0017K\u007f\u0004S\u0016V,\u0012U\fVr\u0003";
                    i = 5;
                    strArr2 = strArr;
                    strArr3 = strArr;
                    i2 = 0;
                    break;
                case at.m /*5*/:
                    strArr2[i2] = str;
                    str = "[\u007f\u0002Y\u0015]B\u0002[\u0017K\u007f\u0004S\u0016V,\u0000U\nQb\u0019U\u0017";
                    i = 6;
                    i2 = 1;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i2] = str;
                    a = strArr3;
                    return;
                default:
                    strArr2[i2] = str;
                    str = "[\u007f\u0002Y\u0015]B\u0002[\u0017K\u007f\u0004S\u0016V,\u0012U\fVr\u0003";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }
}
