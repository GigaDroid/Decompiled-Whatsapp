package com.facebook.rebound.ui;

import com.facebook.rebound.f;
import com.facebook.rebound.m;

class c implements f {
    final SpringConfiguratorView a;

    public void c(m mVar) {
        float f = (float) mVar.f();
        float i = SpringConfiguratorView.i(this.a);
        this.a.setTranslationY((f * (SpringConfiguratorView.f(this.a) - i)) + i);
    }

    public void d(m mVar) {
    }

    public void a(m mVar) {
    }

    public void b(m mVar) {
    }

    private c(SpringConfiguratorView springConfiguratorView) {
        this.a = springConfiguratorView;
    }

    c(SpringConfiguratorView springConfiguratorView, d dVar) {
        this(springConfiguratorView);
    }
}
