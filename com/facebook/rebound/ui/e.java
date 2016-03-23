package com.facebook.rebound.ui;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import com.facebook.rebound.o;

class e implements OnItemSelectedListener {
    final SpringConfiguratorView a;

    e(SpringConfiguratorView springConfiguratorView, d dVar) {
        this(springConfiguratorView);
    }

    private e(SpringConfiguratorView springConfiguratorView) {
        this.a = springConfiguratorView;
    }

    public void onNothingSelected(AdapterView adapterView) {
    }

    public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        SpringConfiguratorView.a(this.a, (o) SpringConfiguratorView.d(this.a).get(i));
        SpringConfiguratorView.b(this.a, SpringConfiguratorView.g(this.a));
    }
}
