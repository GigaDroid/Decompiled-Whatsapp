package com.whatsapp;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.Animator.AnimatorPauseListener;
import android.animation.TimeInterpolator;
import java.util.ArrayList;
import java.util.List;

public class aou extends Animator implements AnimatorListener {
    private ArrayList a;
    private Animator b;

    public void removeListener(AnimatorListener animatorListener) {
        if (this.a != null) {
            this.a.remove(animatorListener);
            if (this.a.isEmpty()) {
                this.a = null;
            }
        }
    }

    public void onAnimationEnd(Animator animator) {
        int i = ama.a;
        for (AnimatorListener onAnimationEnd : (ArrayList) this.a.clone()) {
            onAnimationEnd.onAnimationEnd(this);
            if (i != 0) {
                return;
            }
        }
    }

    public void resume() {
    }

    public void removeAllListeners() {
        if (this.a != null) {
            this.a.clear();
            this.a = null;
        }
    }

    public Animator setDuration(long j) {
        this.b.setDuration(j);
        return this;
    }

    public void onAnimationCancel(Animator animator) {
        int i = ama.a;
        for (AnimatorListener onAnimationCancel : (ArrayList) this.a.clone()) {
            onAnimationCancel.onAnimationCancel(this);
            if (i != 0) {
                return;
            }
        }
    }

    public aou a() {
        int i = ama.a;
        aou com_whatsapp_aou = (aou) super.clone();
        if (this.a != null) {
            List<AnimatorListener> list = this.a;
            com_whatsapp_aou.a = new ArrayList();
            for (AnimatorListener add : list) {
                com_whatsapp_aou.a.add(add);
                if (i != 0) {
                    break;
                }
            }
        }
        return com_whatsapp_aou;
    }

    public void setStartDelay(long j) {
        this.b.setStartDelay(j);
    }

    public void setTarget(Object obj) {
        this.b.setTarget(obj);
    }

    public ArrayList getListeners() {
        return this.a;
    }

    public void addPauseListener(AnimatorPauseListener animatorPauseListener) {
    }

    public Object m726clone() {
        return a();
    }

    public void cancel() {
        this.b.cancel();
    }

    public void setupStartValues() {
        this.b.setupStartValues();
    }

    public void end() {
        this.b.end();
    }

    public boolean isRunning() {
        return this.b.isRunning();
    }

    public void onAnimationRepeat(Animator animator) {
        int i = ama.a;
        for (AnimatorListener onAnimationRepeat : (ArrayList) this.a.clone()) {
            onAnimationRepeat.onAnimationRepeat(this);
            if (i != 0) {
                return;
            }
        }
    }

    public long getDuration() {
        return this.b.getDuration();
    }

    public void onAnimationStart(Animator animator) {
        int i = ama.a;
        for (AnimatorListener onAnimationStart : (ArrayList) this.a.clone()) {
            onAnimationStart.onAnimationStart(this);
            if (i != 0) {
                break;
            }
        }
        if (WAAppCompatActivity.c != 0) {
            ama.a = i + 1;
        }
    }

    public long getStartDelay() {
        return this.b.getStartDelay();
    }

    public aou(Animator animator) {
        this.b = animator;
        this.b.addListener(this);
    }

    public void pause() {
    }

    public Animator clone() {
        return a();
    }

    public void setupEndValues() {
        this.b.setupEndValues();
    }

    public void start() {
        this.b.start();
    }

    public void setInterpolator(TimeInterpolator timeInterpolator) {
        this.b.setInterpolator(timeInterpolator);
    }

    public boolean isStarted() {
        return this.b.isStarted();
    }

    public void removePauseListener(AnimatorPauseListener animatorPauseListener) {
    }

    public boolean isPaused() {
        return this.b.isPaused();
    }

    public TimeInterpolator getInterpolator() {
        return this.b.getInterpolator();
    }

    public void addListener(AnimatorListener animatorListener) {
        if (this.a == null) {
            this.a = new ArrayList();
        }
        this.a.add(animatorListener);
    }
}
