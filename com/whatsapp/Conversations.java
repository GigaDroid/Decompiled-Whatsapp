package com.whatsapp;

import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.res.Resources;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AlertDialog.Builder;
import android.support.v7.appcompat.R;
import android.support.v7.widget.SearchView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import com.whatsapp.util.Log;
import com.whatsapp.util.ab;
import com.whatsapp.util.bq;
import com.whatsapp.util.undobar.UndoBarController;
import java.util.List;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class Conversations extends DialogToastActivity {
    private static final String[] z;
    private MenuItem n;
    String o;

    static {
        String[] strArr = new String[25];
        String str = "\u0012\u0002qf(\u0003\u001e~d$\u001e\u0003lq.\u0005\u0004iy9\bBoq8\u0002\b";
        Object obj = -1;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        int i = 0;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i2 = 0; length > i2; i2++) {
                int i3;
                char c = cArr[i2];
                switch (i2 % 5) {
                    case v.m /*0*/:
                        i3 = 113;
                        break;
                    case at.g /*1*/:
                        i3 = arj.Theme_switchStyle;
                        break;
                    case at.i /*2*/:
                        i3 = 31;
                        break;
                    case at.o /*3*/:
                        i3 = 16;
                        break;
                    default:
                        i3 = 77;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "\u0012\u0002qf(\u0003\u001e~d$\u001e\u0003lq.\u0005\u0004iy9\bB{y,\u001d\u0002x0>\u001e\u000bkg,\u0003\b2q/\u001e\u0018k=9\u001e@zh=\u0018\u001fz";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "\u0010\u0003{b\"\u0018\t1y#\u0005\bqdc\u0010\u000eky\"\u001fCIY\b&";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "\u0012\u0002r>:\u0019\fkc,\u0001\u001d1Q)\u0007\fqs(\u0015";
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "\u0012\u0002qf(\u0003\u001e~d$\u001e\u0003lq.\u0005\u0004iy9\bBp`9\u0018\u0002qcb\u001f\u0002v~9\u0014\u0003k?>\b\u001eku \\\u000ep~9\u0010\u000ekc`\u0010\u001do=#\u001e\u00192v\"\u0004\u0003{";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\u0012\u0002r>,\u001f\tm\u007f$\u0015C|\u007f#\u0005\f|d>";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\u0012\u0002qf(\u0003\u001e~d$\u001e\u0003lq.\u0005\u0004iy9\bBp`9\u0018\u0002qcb\u0002\u0014ld(\u001c@|\u007f#\u0005\f|d>\\\fo``\u001f\u0002k=+\u001e\u0018qt";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "\u0012\u0002qf(\u0003\u001e~d$\u001e\u0003l0/\u001e\u0018qs(Q\u0019p0 \u0010\u0004q";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "\u0012\u0002qf(\u0003\u001e~d$\u001e\u0003lq.\u0005\u0004iy9\bB{u;\u0018\u000ez=#\u001e\u00192c8\u0001\u001dpb9\u0014\t";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "\u0012\u0002qf(\u0003\u001e~d$\u001e\u0003lq.\u0005\u0004iy9\bB|b(\u0010\u0019z";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "\u0012\u0002qf(\u0003\u001e~d$\u001e\u0003lq.\u0005\u0004iy9\bB|b(\u0010\u0019z?#\u001e@ru`\u001e\u001f2}>\u0016\u001ek\u007f?\u0014@{r";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "\u0012\u0002r>:\u0019\fkc,\u0001\u001d1y#\u0005\bqdc\u0010\u000eky\"\u001fC\\Q\u0001=>";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "\u0012\u0002qf(\u0003\u001e~d$\u001e\u0003lq.\u0005\u0004iy9\bBlg`\u0014\u0015oy?\u0014\t";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "\u0012\u0002qf(\u0003\u001e~d$\u001e\u0003lq.\u0005\u0004iy9\bB|b(\u0010\u0019z";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "\u0012\u0002qf(\u0003\u001e~d$\u001e\u0003lq.\u0005\u0004iy9\bB||\"\u0012\u00062g?\u001e\u0003x";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    str = "\u0012\u0002qf(\u0003\u001e~d$\u001e\u0003lq.\u0005\u0004iy9\bB{u>\u0005\u001fpi";
                    obj = 15;
                    i = 16;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    strArr2 = strArr3;
                    str = "\u0012\u0002qd,\u0012\u0019";
                    obj = 16;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "\u0012\u0002qf(\u0003\u001e~d$\u001e\u0003lq.\u0005\u0004iy9\bBmu>\u0004\u0000z?;\u001e\u0004o=(\u001f\f}|(\u0015";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "\u0012\u0002qf(\u0003\u001e~d$\u001e\u0003lq.\u0005\u0004iy9\bBmu>\u0004\u0000z?#\u001e@ru`\u001e\u001f2}>\u0016\u001ek\u007f?\u0014@{r";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "\u0012\u0002qf(\u0003\u001e~d$\u001e\u0003lq.\u0005\u0004iy9\bBmu>\u0004\u0000z";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "\u0012\u0002qf(\u0003\u001e~d$\u001e\u0003l0/\u001e\u0018qs(Q\u0019p0 \u0010\u0004q";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "\u0014\u0003{O*\u0003\u0002j`\u0012\u001b\u0004{";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "\u0014\u0015vd\u0012\u0016\u001fpe=.\u0007vt";
                    obj = 22;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "\u0012\u0002r>:\u0019\fkc,\u0001\u001d1y#\u0005\bqdc\u0010\u000eky\"\u001fC\\Q\u0001=>";
                    obj = 23;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleTextColor /*23*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u0012\u0002qf(\u0003\u001e~d$\u001e\u0003lq.\u0005\u0004iy9\bBoq8\u0002\b";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onResume() {
        /*
        r2 = this;
        r0 = z;	 Catch:{ IllegalArgumentException -> 0x0048 }
        r1 = 20;
        r0 = r0[r1];	 Catch:{ IllegalArgumentException -> 0x0048 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ IllegalArgumentException -> 0x0048 }
        super.onResume();	 Catch:{ IllegalArgumentException -> 0x0048 }
        r0 = com.whatsapp.App.ay;	 Catch:{ IllegalArgumentException -> 0x0048 }
        if (r0 == 0) goto L_0x001f;
    L_0x0010:
        r0 = com.whatsapp.App.aK;	 Catch:{ IllegalArgumentException -> 0x004a }
        r0 = r0.E();	 Catch:{ IllegalArgumentException -> 0x004a }
        if (r0 == 0) goto L_0x001f;
    L_0x0018:
        r0 = com.whatsapp.App.t(r2);	 Catch:{ IllegalArgumentException -> 0x004c }
        r1 = 3;
        if (r0 == r1) goto L_0x0031;
    L_0x001f:
        r0 = z;	 Catch:{ IllegalArgumentException -> 0x004c }
        r1 = 19;
        r0 = r0[r1];	 Catch:{ IllegalArgumentException -> 0x004c }
        com.whatsapp.util.Log.i(r0);	 Catch:{ IllegalArgumentException -> 0x004c }
        r0 = z;	 Catch:{ IllegalArgumentException -> 0x004c }
        r1 = 21;
        r0 = r0[r1];	 Catch:{ IllegalArgumentException -> 0x004c }
        com.whatsapp.App.v(r0);	 Catch:{ IllegalArgumentException -> 0x004c }
    L_0x0031:
        r0 = z;
        r1 = 18;
        r0 = r0[r1];
        com.whatsapp.util.Log.i(r0);
        r0 = new android.content.Intent;
        r1 = com.whatsapp.Main.class;
        r0.<init>(r2, r1);
        r2.startActivity(r0);
        r2.finish();
        return;
    L_0x0048:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x004a }
    L_0x004a:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x004c }
    L_0x004c:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.Conversations.onResume():void");
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        return super.onPrepareOptionsMenu(menu);
    }

    static void b(Conversations conversations) {
        conversations.b();
    }

    protected void onStop() {
        super.onStop();
    }

    public void onDestroy() {
        Log.i(z[16]);
        super.onDestroy();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        Resources resources = getResources();
        if (qa.d() != 0) {
            View searchView = new SearchView(getSupportActionBar().getThemedContext());
            ((TextView) searchView.findViewById(R.id.search_src_text)).setTextColor(getResources().getColor(R.color.primary_text_default_material_dark));
            searchView.setOnQueryTextListener(new tt(this));
            this.n = menu.add(0, 7, 0, 2131231845).setIcon(2130839445);
            MenuItemCompat.setActionView(this.n, searchView);
            MenuItemCompat.setShowAsAction(this.n, 10);
            MenuItemCompat.setOnActionExpandListener(this.n, new xi(this));
        }
        try {
            MenuItemCompat.setShowAsAction(menu.add(0, 0, 0, 2131231433).setIcon(2130839430).setAlphabeticShortcut('n'), 2);
            menu.add(0, 10, 0, 2131231429).setIcon(2130839513).setAlphabeticShortcut('g');
            menu.add(0, 9, 0, 2131231430).setIcon(2130839507).setAlphabeticShortcut('b');
            menu.add(0, 11, 0, 2131231441).setIcon(2130839523).setAlphabeticShortcut('q');
            menu.add(0, 4, 0, 2131231427).setIcon(2130839510).setAlphabeticShortcut('c');
            menu.add(0, 2, 0, 2131231438).setIcon(2130839520).setAlphabeticShortcut('o');
            menu.add(0, 1, 0, 2131231440).setIcon(2130839522).setAlphabeticShortcut('s');
            if (App.am == 3) {
                menu.add(0, 3, 0, 2131231428).setIcon(resources.getDrawable(2130839640));
            }
            return super.onCreateOptionsMenu(menu);
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    protected void onStart() {
        super.onStart();
    }

    public void onPause() {
        Log.i(z[1]);
        ab abVar = new ab(z[0]);
        super.onPause();
        UndoBarController.c(this);
        abVar.b();
    }

    private void b() {
        zb.g();
        bq.a(new ary(this, null), new Void[0]);
    }

    private void c(boolean z) {
        if (z) {
            try {
                if (!App.as.e().r().exists()) {
                    if (!ProfilePhotoReminder.p) {
                        try {
                            if (App.Q()) {
                                try {
                                    if (ProfilePhotoReminder.g()) {
                                        ProfilePhotoReminder.c();
                                        startActivity(new Intent(this, ProfilePhotoReminder.class));
                                    }
                                } catch (IllegalArgumentException e) {
                                    throw e;
                                }
                            }
                        } catch (IllegalArgumentException e2) {
                            throw e2;
                        }
                    }
                }
            } catch (IllegalArgumentException e22) {
                throw e22;
            } catch (IllegalArgumentException e222) {
                throw e222;
            }
        } else {
            try {
                if (!isFinishing()) {
                    showDialog(0);
                }
            } catch (IllegalArgumentException e2222) {
                throw e2222;
            }
        }
    }

    static o3 a(Conversations conversations) {
        return conversations.c();
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        try {
            return super.dispatchTouchEvent(motionEvent);
        } catch (IllegalArgumentException e) {
            return false;
        }
    }

    private void a(DialogFragment dialogFragment) {
        App.ac = true;
        App.p.R();
        b(dialogFragment);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onActivityResult(int r3, int r4, android.content.Intent r5) {
        /*
        r2 = this;
        switch(r3) {
            case 1: goto L_0x0007;
            default: goto L_0x0003;
        };
    L_0x0003:
        super.onActivityResult(r3, r4, r5);	 Catch:{ IllegalArgumentException -> 0x0026 }
    L_0x0006:
        return;
    L_0x0007:
        r0 = -1;
        if (r4 != r0) goto L_0x0006;
    L_0x000a:
        r0 = z;
        r1 = 17;
        r0 = r0[r1];
        r0 = r5.getStringExtra(r0);
        r1 = com.whatsapp.App.as;
        r0 = r1.b(r0);
        r0 = com.whatsapp.Conversation.a(r0);	 Catch:{ IllegalArgumentException -> 0x0026 }
        r2.startActivity(r0);	 Catch:{ IllegalArgumentException -> 0x0026 }
        r0 = com.whatsapp.DialogToastActivity.f;	 Catch:{ IllegalArgumentException -> 0x0026 }
        if (r0 == 0) goto L_0x0006;
    L_0x0025:
        goto L_0x0003;
    L_0x0026:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.Conversations.onActivityResult(int, int, android.content.Intent):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onNewIntent(android.content.Intent r3) {
        /*
        r2 = this;
        super.onNewIntent(r3);
        r0 = z;
        r1 = 23;
        r0 = r0[r1];
        r0 = r3.getStringExtra(r0);
        r1 = android.text.TextUtils.isEmpty(r0);	 Catch:{ IllegalArgumentException -> 0x0060 }
        if (r1 != 0) goto L_0x002c;
    L_0x0013:
        r1 = com.whatsapp.qm.h(r0);	 Catch:{ IllegalArgumentException -> 0x0062 }
        if (r1 != 0) goto L_0x0020;
    L_0x0019:
        com.whatsapp.App.k(r0);	 Catch:{ IllegalArgumentException -> 0x0064 }
        r1 = com.whatsapp.DialogToastActivity.f;	 Catch:{ IllegalArgumentException -> 0x0064 }
        if (r1 == 0) goto L_0x002c;
    L_0x0020:
        r1 = 1;
        com.whatsapp.App.c(r0, r1);	 Catch:{ IllegalArgumentException -> 0x0064 }
        r1 = new com.whatsapp.a93;	 Catch:{ IllegalArgumentException -> 0x0064 }
        r1.<init>(r2, r0);	 Catch:{ IllegalArgumentException -> 0x0064 }
        com.whatsapp.util.bq.a(r1);	 Catch:{ IllegalArgumentException -> 0x0064 }
    L_0x002c:
        r0 = z;
        r1 = 22;
        r0 = r0[r1];
        r0 = r3.getStringExtra(r0);
        r1 = android.text.TextUtils.isEmpty(r0);	 Catch:{ IllegalArgumentException -> 0x0066 }
        if (r1 != 0) goto L_0x0048;
    L_0x003c:
        r1 = 1;
        com.whatsapp.App.c(r0, r1);	 Catch:{ IllegalArgumentException -> 0x0066 }
        r1 = new com.whatsapp.kn;	 Catch:{ IllegalArgumentException -> 0x0066 }
        r1.<init>(r2, r0);	 Catch:{ IllegalArgumentException -> 0x0066 }
        com.whatsapp.util.bq.a(r1);	 Catch:{ IllegalArgumentException -> 0x0066 }
    L_0x0048:
        r0 = z;	 Catch:{ IllegalArgumentException -> 0x0068 }
        r1 = 24;
        r0 = r0[r1];	 Catch:{ IllegalArgumentException -> 0x0068 }
        r1 = r3.getAction();	 Catch:{ IllegalArgumentException -> 0x0068 }
        r0 = r0.equals(r1);	 Catch:{ IllegalArgumentException -> 0x0068 }
        if (r0 == 0) goto L_0x005f;
    L_0x0058:
        r0 = com.whatsapp.notification.aw.a();	 Catch:{ IllegalArgumentException -> 0x0068 }
        r0.b();	 Catch:{ IllegalArgumentException -> 0x0068 }
    L_0x005f:
        return;
    L_0x0060:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0062 }
    L_0x0062:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0064 }
    L_0x0064:
        r0 = move-exception;
        throw r0;
    L_0x0066:
        r0 = move-exception;
        throw r0;
    L_0x0068:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.Conversations.onNewIntent(android.content.Intent):void");
    }

    public boolean onSearchRequested() {
        try {
            if (this.n != null) {
                MenuItemCompat.expandActionView(this.n);
            }
            return false;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onOptionsItemSelected(android.view.MenuItem r7) {
        /*
        r6 = this;
        r5 = 11;
        r0 = 0;
        r2 = 1;
        r3 = com.whatsapp.DialogToastActivity.f;
        r1 = r7.getItemId();
        switch(r1) {
            case 0: goto L_0x000e;
            case 1: goto L_0x001a;
            case 2: goto L_0x0026;
            case 3: goto L_0x0032;
            case 4: goto L_0x0045;
            case 5: goto L_0x000d;
            case 6: goto L_0x000d;
            case 7: goto L_0x009d;
            case 8: goto L_0x000d;
            case 9: goto L_0x00a3;
            case 10: goto L_0x00b0;
            case 11: goto L_0x010e;
            default: goto L_0x000d;
        };
    L_0x000d:
        return r0;
    L_0x000e:
        r0 = new android.content.Intent;
        r1 = com.whatsapp.ContactPicker.class;
        r0.<init>(r6, r1);
        r6.startActivityForResult(r0, r2);
        r0 = r2;
        goto L_0x000d;
    L_0x001a:
        r0 = new android.content.Intent;
        r1 = com.whatsapp.SetStatus.class;
        r0.<init>(r6, r1);
        r6.startActivity(r0);
        r0 = r2;
        goto L_0x000d;
    L_0x0026:
        r0 = new android.content.Intent;
        r1 = com.whatsapp.Settings.class;
        r0.<init>(r6, r1);
        r6.startActivity(r0);
        r0 = r2;
        goto L_0x000d;
    L_0x0032:
        r0 = new android.content.Intent;	 Catch:{ ClassNotFoundException -> 0x0148 }
        r1 = z;	 Catch:{ ClassNotFoundException -> 0x0148 }
        r3 = 4;
        r1 = r1[r3];	 Catch:{ ClassNotFoundException -> 0x0148 }
        r1 = java.lang.Class.forName(r1);	 Catch:{ ClassNotFoundException -> 0x0148 }
        r0.<init>(r6, r1);	 Catch:{ ClassNotFoundException -> 0x0148 }
        r6.startActivity(r0);	 Catch:{ ClassNotFoundException -> 0x0148 }
    L_0x0043:
        r0 = r2;
        goto L_0x000d;
    L_0x0045:
        r0 = new android.content.Intent;
        r1 = z;
        r4 = 3;
        r1 = r1[r4];
        r4 = android.provider.ContactsContract.Contacts.CONTENT_URI;
        r0.<init>(r1, r4);
        r1 = r6.getPackageManager();	 Catch:{ ClassNotFoundException -> 0x008a }
        r1 = r0.resolveActivity(r1);	 Catch:{ ClassNotFoundException -> 0x008a }
        r0.setComponent(r1);	 Catch:{ ClassNotFoundException -> 0x008a }
        r1 = r0.getComponent();	 Catch:{ ClassNotFoundException -> 0x008a }
        if (r1 == 0) goto L_0x0067;
    L_0x0062:
        r6.startActivity(r0);	 Catch:{ ClassNotFoundException -> 0x008a }
        if (r3 == 0) goto L_0x0088;
    L_0x0067:
        r0 = r6.getPackageManager();	 Catch:{ ActivityNotFoundException -> 0x0090 }
        r1 = z;	 Catch:{ ActivityNotFoundException -> 0x0090 }
        r4 = 6;
        r1 = r1[r4];	 Catch:{ ActivityNotFoundException -> 0x0090 }
        r0 = r0.getLaunchIntentForPackage(r1);	 Catch:{ ActivityNotFoundException -> 0x0090 }
        if (r0 != 0) goto L_0x0085;
    L_0x0076:
        r1 = z;	 Catch:{ ClassNotFoundException -> 0x008c }
        r4 = 5;
        r1 = r1[r4];	 Catch:{ ClassNotFoundException -> 0x008c }
        com.whatsapp.util.Log.w(r1);	 Catch:{ ClassNotFoundException -> 0x008c }
        r1 = 11;
        r6.showDialog(r1);	 Catch:{ ClassNotFoundException -> 0x008c }
        if (r3 == 0) goto L_0x0088;
    L_0x0085:
        r6.startActivity(r0);	 Catch:{ ClassNotFoundException -> 0x008e }
    L_0x0088:
        r0 = r2;
        goto L_0x000d;
    L_0x008a:
        r0 = move-exception;
        throw r0;
    L_0x008c:
        r0 = move-exception;
        throw r0;	 Catch:{ ClassNotFoundException -> 0x008e }
    L_0x008e:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x0090 }
    L_0x0090:
        r0 = move-exception;
        r0 = z;
        r1 = 7;
        r0 = r0[r1];
        com.whatsapp.util.Log.w(r0);
        r6.showDialog(r5);
        goto L_0x0088;
    L_0x009d:
        r6.onSearchRequested();
        r0 = r2;
        goto L_0x000d;
    L_0x00a3:
        r0 = new android.content.Intent;
        r1 = com.whatsapp.ListMembersSelector.class;
        r0.<init>(r6, r1);
        r6.startActivity(r0);
        r0 = r2;
        goto L_0x000d;
    L_0x00b0:
        r1 = com.whatsapp.qa.g();
        r4 = r1.iterator();
        r1 = r0;
    L_0x00b9:
        r0 = r4.hasNext();
        if (r0 == 0) goto L_0x0150;
    L_0x00bf:
        r0 = r4.next();
        r0 = (java.lang.String) r0;
        r5 = com.whatsapp.qm.i(r0);	 Catch:{ ClassNotFoundException -> 0x00fd }
        if (r5 == 0) goto L_0x014e;
    L_0x00cb:
        r5 = com.whatsapp.App.ad();	 Catch:{ ClassNotFoundException -> 0x00ff }
        r5 = r0.contains(r5);	 Catch:{ ClassNotFoundException -> 0x00ff }
        if (r5 == 0) goto L_0x014e;
    L_0x00d5:
        r0 = com.whatsapp.l5.b(r0);	 Catch:{ ClassNotFoundException -> 0x0101 }
        if (r0 != 0) goto L_0x014e;
    L_0x00db:
        r1 = r1 + 1;
        r0 = r1;
    L_0x00de:
        if (r3 == 0) goto L_0x014b;
    L_0x00e0:
        r1 = com.whatsapp.a59.n;	 Catch:{ ClassNotFoundException -> 0x0103 }
        if (r0 < r1) goto L_0x0105;
    L_0x00e4:
        r0 = 2131231283; // 0x7f080233 float:1.8078643E38 double:1.0529681603E-314;
        r1 = 1;
        r1 = new java.lang.Object[r1];	 Catch:{ ClassNotFoundException -> 0x0103 }
        r3 = 0;
        r4 = com.whatsapp.a59.n;	 Catch:{ ClassNotFoundException -> 0x0103 }
        r4 = java.lang.Integer.valueOf(r4);	 Catch:{ ClassNotFoundException -> 0x0103 }
        r1[r3] = r4;	 Catch:{ ClassNotFoundException -> 0x0103 }
        r0 = r6.getString(r0, r1);	 Catch:{ ClassNotFoundException -> 0x0103 }
        r6.f(r0);	 Catch:{ ClassNotFoundException -> 0x0103 }
        r0 = r2;
        goto L_0x000d;
    L_0x00fd:
        r0 = move-exception;
        throw r0;	 Catch:{ ClassNotFoundException -> 0x00ff }
    L_0x00ff:
        r0 = move-exception;
        throw r0;	 Catch:{ ClassNotFoundException -> 0x0101 }
    L_0x0101:
        r0 = move-exception;
        throw r0;
    L_0x0103:
        r0 = move-exception;
        throw r0;
    L_0x0105:
        r0 = com.whatsapp.fieldstats.co.MENU;
        r1 = 0;
        com.whatsapp.NewGroup.a(r6, r0, r1);
        r0 = r2;
        goto L_0x000d;
    L_0x010e:
        r0 = com.whatsapp.wn.z();	 Catch:{ ClassNotFoundException -> 0x0140 }
        if (r0 == 0) goto L_0x0120;
    L_0x0114:
        r0 = new android.content.Intent;	 Catch:{ ClassNotFoundException -> 0x0142 }
        r1 = com.whatsapp.WebSessionsActivity.class;
        r0.<init>(r6, r1);	 Catch:{ ClassNotFoundException -> 0x0142 }
        r6.startActivity(r0);	 Catch:{ ClassNotFoundException -> 0x0142 }
        if (r3 == 0) goto L_0x013d;
    L_0x0120:
        r0 = com.whatsapp.App.Q();	 Catch:{ ClassNotFoundException -> 0x0144 }
        if (r0 == 0) goto L_0x0132;
    L_0x0126:
        r0 = new android.content.Intent;	 Catch:{ ClassNotFoundException -> 0x0146 }
        r1 = com.whatsapp.qrcode.QrCodeActivity.class;
        r0.<init>(r6, r1);	 Catch:{ ClassNotFoundException -> 0x0146 }
        r6.startActivity(r0);	 Catch:{ ClassNotFoundException -> 0x0146 }
        if (r3 == 0) goto L_0x013d;
    L_0x0132:
        r0 = r6.getBaseContext();	 Catch:{ ClassNotFoundException -> 0x0146 }
        r1 = 2131231518; // 0x7f08031e float:1.807912E38 double:1.0529682764E-314;
        r3 = 0;
        com.whatsapp.App.a(r0, r1, r3);	 Catch:{ ClassNotFoundException -> 0x0146 }
    L_0x013d:
        r0 = r2;
        goto L_0x000d;
    L_0x0140:
        r0 = move-exception;
        throw r0;	 Catch:{ ClassNotFoundException -> 0x0142 }
    L_0x0142:
        r0 = move-exception;
        throw r0;	 Catch:{ ClassNotFoundException -> 0x0144 }
    L_0x0144:
        r0 = move-exception;
        throw r0;	 Catch:{ ClassNotFoundException -> 0x0146 }
    L_0x0146:
        r0 = move-exception;
        throw r0;
    L_0x0148:
        r0 = move-exception;
        goto L_0x0043;
    L_0x014b:
        r1 = r0;
        goto L_0x00b9;
    L_0x014e:
        r0 = r1;
        goto L_0x00de;
    L_0x0150:
        r0 = r1;
        goto L_0x00e0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.Conversations.onOptionsItemSelected(android.view.MenuItem):boolean");
    }

    public Conversations() {
        this.o = null;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r6) {
        /*
        r5 = this;
        r4 = 3;
        r0 = com.whatsapp.DialogToastActivity.f;
        r1 = new com.whatsapp.util.ab;
        r2 = z;
        r3 = 14;
        r2 = r2[r3];
        r1.<init>(r2);
        r2 = com.whatsapp.App.j;	 Catch:{ IllegalArgumentException -> 0x004a }
        if (r2 != r4) goto L_0x0015;
    L_0x0012:
        com.whatsapp.util.u.a(r5);	 Catch:{ IllegalArgumentException -> 0x004a }
    L_0x0015:
        super.onCreate(r6);	 Catch:{ IllegalArgumentException -> 0x004c }
        r2 = com.whatsapp.App.ay;	 Catch:{ IllegalArgumentException -> 0x004c }
        if (r2 == 0) goto L_0x002a;
    L_0x001c:
        r2 = com.whatsapp.App.aK;	 Catch:{ IllegalArgumentException -> 0x004e }
        r2 = r2.E();	 Catch:{ IllegalArgumentException -> 0x004e }
        if (r2 == 0) goto L_0x002a;
    L_0x0024:
        r2 = com.whatsapp.App.t(r5);	 Catch:{ IllegalArgumentException -> 0x004e }
        if (r2 == r4) goto L_0x0050;
    L_0x002a:
        r0 = z;
        r1 = 11;
        r0 = r0[r1];
        com.whatsapp.util.Log.i(r0);
        r0 = z;
        r1 = 8;
        r0 = r0[r1];
        com.whatsapp.App.v(r0);
        r0 = new android.content.Intent;
        r1 = com.whatsapp.Main.class;
        r0.<init>(r5, r1);
        r5.startActivity(r0);
        r5.finish();
    L_0x0049:
        return;
    L_0x004a:
        r0 = move-exception;
        throw r0;
    L_0x004c:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x004e }
    L_0x004e:
        r0 = move-exception;
        throw r0;
    L_0x0050:
        r2 = com.whatsapp.App.g;	 Catch:{ IllegalArgumentException -> 0x010a }
        r2.stop();	 Catch:{ IllegalArgumentException -> 0x010a }
        r2 = z;	 Catch:{ IllegalArgumentException -> 0x010a }
        r3 = 10;
        r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x010a }
        com.whatsapp.util.Log.i(r2);	 Catch:{ IllegalArgumentException -> 0x010a }
        r2 = r5.getApplicationContext();	 Catch:{ IllegalArgumentException -> 0x010a }
        com.whatsapp.App.w(r2);	 Catch:{ IllegalArgumentException -> 0x010a }
        r2 = 2130903077; // 0x7f030025 float:1.7412962E38 double:1.052806005E-314;
        r5.setContentView(r2);	 Catch:{ IllegalArgumentException -> 0x010a }
        r2 = r5.getSupportActionBar();	 Catch:{ IllegalArgumentException -> 0x010a }
        r3 = 0;
        r2.setDisplayHomeAsUpEnabled(r3);	 Catch:{ IllegalArgumentException -> 0x010a }
        if (r6 != 0) goto L_0x008c;
    L_0x0075:
        r2 = r5.getSupportFragmentManager();	 Catch:{ IllegalArgumentException -> 0x010a }
        r2 = r2.beginTransaction();	 Catch:{ IllegalArgumentException -> 0x010a }
        r3 = 2131755308; // 0x7f10012c float:1.9141492E38 double:1.053227063E-314;
        r4 = new com.whatsapp.ConversationsFragment;	 Catch:{ IllegalArgumentException -> 0x010a }
        r4.<init>();	 Catch:{ IllegalArgumentException -> 0x010a }
        r2 = r2.add(r3, r4);	 Catch:{ IllegalArgumentException -> 0x010a }
        r2.commit();	 Catch:{ IllegalArgumentException -> 0x010a }
    L_0x008c:
        r2 = com.whatsapp.App.U();	 Catch:{ IllegalArgumentException -> 0x010c }
        if (r2 == 0) goto L_0x00a5;
    L_0x0092:
        r2 = z;	 Catch:{ IllegalArgumentException -> 0x010e }
        r3 = 9;
        r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x010e }
        com.whatsapp.util.Log.w(r2);	 Catch:{ IllegalArgumentException -> 0x010e }
        r2 = new com.whatsapp.DialogToastActivity$UnsupportedDeviceDialogFragment;	 Catch:{ IllegalArgumentException -> 0x010e }
        r2.<init>();	 Catch:{ IllegalArgumentException -> 0x010e }
        r5.a(r2);	 Catch:{ IllegalArgumentException -> 0x010e }
        if (r0 == 0) goto L_0x00e7;
    L_0x00a5:
        r2 = com.whatsapp.App.p;	 Catch:{ IllegalArgumentException -> 0x0110 }
        r2 = r2.F();	 Catch:{ IllegalArgumentException -> 0x0110 }
        if (r2 == 0) goto L_0x00c0;
    L_0x00ad:
        r2 = z;	 Catch:{ IllegalArgumentException -> 0x0112 }
        r3 = 15;
        r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x0112 }
        com.whatsapp.util.Log.w(r2);	 Catch:{ IllegalArgumentException -> 0x0112 }
        r2 = new com.whatsapp.DialogToastActivity$ClockWrongDialogFragment;	 Catch:{ IllegalArgumentException -> 0x0112 }
        r2.<init>();	 Catch:{ IllegalArgumentException -> 0x0112 }
        r5.a(r2);	 Catch:{ IllegalArgumentException -> 0x0112 }
        if (r0 == 0) goto L_0x00e7;
    L_0x00c0:
        r2 = com.whatsapp.App.a4();	 Catch:{ IllegalArgumentException -> 0x0114 }
        if (r2 == 0) goto L_0x00d9;
    L_0x00c6:
        r2 = z;	 Catch:{ IllegalArgumentException -> 0x0116 }
        r3 = 13;
        r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x0116 }
        com.whatsapp.util.Log.w(r2);	 Catch:{ IllegalArgumentException -> 0x0116 }
        r2 = new com.whatsapp.DialogToastActivity$SoftwareExpiredDialogFragment;	 Catch:{ IllegalArgumentException -> 0x0116 }
        r2.<init>();	 Catch:{ IllegalArgumentException -> 0x0116 }
        r5.a(r2);	 Catch:{ IllegalArgumentException -> 0x0116 }
        if (r0 == 0) goto L_0x00e7;
    L_0x00d9:
        r0 = com.whatsapp.App.aC();	 Catch:{ IllegalArgumentException -> 0x0118 }
        if (r0 == 0) goto L_0x00e7;
    L_0x00df:
        r0 = new com.whatsapp.DialogToastActivity$SoftwareAboutToExpireDialogFragment;	 Catch:{ IllegalArgumentException -> 0x0118 }
        r0.<init>();	 Catch:{ IllegalArgumentException -> 0x0118 }
        r5.b(r0);	 Catch:{ IllegalArgumentException -> 0x0118 }
    L_0x00e7:
        r0 = z;	 Catch:{ IllegalArgumentException -> 0x011a }
        r2 = 12;
        r0 = r0[r2];	 Catch:{ IllegalArgumentException -> 0x011a }
        r2 = r5.getIntent();	 Catch:{ IllegalArgumentException -> 0x011a }
        r2 = r2.getAction();	 Catch:{ IllegalArgumentException -> 0x011a }
        r0 = r0.equals(r2);	 Catch:{ IllegalArgumentException -> 0x011a }
        if (r0 == 0) goto L_0x0102;
    L_0x00fb:
        r0 = com.whatsapp.notification.aw.a();	 Catch:{ IllegalArgumentException -> 0x011a }
        r0.b();	 Catch:{ IllegalArgumentException -> 0x011a }
    L_0x0102:
        r5.a();
        r1.b();
        goto L_0x0049;
    L_0x010a:
        r0 = move-exception;
        throw r0;
    L_0x010c:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x010e }
    L_0x010e:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0110 }
    L_0x0110:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0112 }
    L_0x0112:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0114 }
    L_0x0114:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0116 }
    L_0x0116:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0118 }
    L_0x0118:
        r0 = move-exception;
        throw r0;
    L_0x011a:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.Conversations.onCreate(android.os.Bundle):void");
    }

    protected Dialog onCreateDialog(int i) {
        switch (i) {
            case v.m /*0*/:
                return new Builder(this).setTitle(2131231372).setMessage(getString(2131231370, new Object[]{getString(2131230939)})).setCancelable(false).setPositiveButton(2131231371, new v_(this)).create();
            case at.g /*1*/:
                Dialog progressDialog = new ProgressDialog(this);
                progressDialog.setTitle(getString(2131231814));
                progressDialog.setMessage(getString(2131231813));
                progressDialog.setIndeterminate(true);
                progressDialog.setCancelable(false);
                return progressDialog;
            case Y.j /*11*/:
                return new Builder(this).setMessage(2131232229).setPositiveButton(2131231580, new a_o(this)).create();
            case 115:
                Log.i(z[2]);
                return pg.a((Activity) this);
            default:
                return super.onCreateDialog(i);
        }
    }

    static void a(Conversations conversations, boolean z) {
        conversations.c(z);
    }

    private o3 c() {
        boolean z = DialogToastActivity.f;
        List<Fragment> fragments = getSupportFragmentManager().getFragments();
        if (fragments != null) {
            for (Fragment fragment : fragments) {
                try {
                    if (!(fragment instanceof ConversationsFragment)) {
                        if (z) {
                            break;
                        }
                    }
                    return (o3) fragment;
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            }
        }
        return null;
    }

    private void a() {
        try {
            if (!(zb.b() || zb.c())) {
                try {
                    bq.a(new ary(this, null), new Void[0]);
                    if (!DialogToastActivity.f) {
                        return;
                    }
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            }
            try {
                c(zb.d());
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
                c(false);
            }
        } catch (InterruptedException e3) {
            throw e3;
        } catch (InterruptedException e32) {
            throw e32;
        }
    }
}
