package com.whatsapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import java.util.ArrayList;
import java.util.List;

class c0 extends FragmentPagerAdapter {
    private final List a;
    private final List b;

    public int getCount() {
        return this.a.size();
    }

    public void a(Fragment fragment, String str) {
        this.a.add(fragment);
        this.b.add(str);
    }

    public c0(FragmentManager fragmentManager) {
        super(fragmentManager);
        this.a = new ArrayList();
        this.b = new ArrayList();
    }

    public Fragment getItem(int i) {
        return (Fragment) this.a.get(i);
    }

    public CharSequence getPageTitle(int i) {
        return (CharSequence) this.b.get(i);
    }
}
