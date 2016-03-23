package android.support.v4.app;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import org.v;
import org.whispersystems.at;

public class ListFragment extends Fragment {
    private static final String[] z;
    ListAdapter mAdapter;
    CharSequence mEmptyText;
    View mEmptyView;
    private final Handler mHandler;
    ListView mList;
    View mListContainer;
    boolean mListShown;
    private final OnItemClickListener mOnClickListener;
    View mProgressContainer;
    private final Runnable mRequestFocus;
    TextView mStandardEmptyView;

    class 1 implements Runnable {
        final ListFragment this$0;

        public void run() {
            this.this$0.mList.focusableViewAvailable(this.this$0.mList);
        }

        1(ListFragment listFragment) {
            this.this$0 = listFragment;
        }
    }

    class 2 implements OnItemClickListener {
        final ListFragment this$0;

        2(ListFragment listFragment) {
            this.this$0 = listFragment;
        }

        public void onItemClick(AdapterView adapterView, View view, int i, long j) {
            this.this$0.onListItemClick((ListView) adapterView, view, i, j);
        }
    }

    static {
        String[] strArr = new String[4];
        String str = ")u\u0014F\t\u0013u\u000f@L\u001enAY\\\u0003nA\\H\u0006\u007fAU\t<s\u0012@\u007f\u0019\u007f\u0016\u0014^\u0018u\u0012Q\t\u0019~AU]\u0004h\bV\\\u0004\u007fA]ZP=\u0000ZM\u0002u\bP\u0007\"4\bP\u0007\u001cs\u0012@\u000e";
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
                        i3 = 112;
                        break;
                    case at.g /*1*/:
                        i3 = 26;
                        break;
                    case at.i /*2*/:
                        i3 = 97;
                        break;
                    case at.o /*3*/:
                        i3 = 52;
                        break;
                    default:
                        i3 = 41;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "3u\u000f@L\u001enA\\H\u0003:\u0017]L\u0007:\u0016]]\u0018:\bP\t\u0011n\u0015F@\u0012o\u0015Q\tW{\u000fP[\u001fs\u0005\u001a{^s\u0005\u001aE\u0019i\u0015\u0013\t\u0004r\u0000@\t\u0019iAZF\u0004:\u0000\u0014e\u0019i\u0015b@\u0015mAWE\u0011i\u0012";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "3{\u000f\u0013]Px\u0004\u0014\\\u0003\u007f\u0005\u0014^\u0019n\t\u0014HPy\u0014G]\u001fwAWF\u001en\u0004Z]Pl\bQ^";
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "3u\u000f@L\u001enAB@\u0015mAZF\u0004:\u0018Q]Py\u0013QH\u0004\u007f\u0005";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public ListFragment() {
        this.mHandler = new Handler();
        this.mRequestFocus = new 1(this);
        this.mOnClickListener = new 2(this);
    }

    public void onDestroyView() {
        this.mHandler.removeCallbacks(this.mRequestFocus);
        this.mList = null;
        this.mListShown = false;
        this.mListContainer = null;
        this.mProgressContainer = null;
        this.mEmptyView = null;
        this.mStandardEmptyView = null;
        super.onDestroyView();
    }

    public void setListAdapter(ListAdapter listAdapter) {
        boolean z = false;
        try {
            boolean z2;
            if (this.mAdapter != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            try {
                this.mAdapter = listAdapter;
                if (this.mList != null) {
                    this.mList.setAdapter(listAdapter);
                    if (!this.mListShown && !r0) {
                        try {
                            if (getView().getWindowToken() != null) {
                                z = true;
                            }
                            setListShown(true, z);
                        } catch (IllegalStateException e) {
                            throw e;
                        }
                    }
                }
            } catch (IllegalStateException e2) {
                throw e2;
            } catch (IllegalStateException e22) {
                try {
                    throw e22;
                } catch (IllegalStateException e222) {
                    throw e222;
                }
            }
        } catch (IllegalStateException e2222) {
            throw e2222;
        }
    }

    public ListView getListView() {
        ensureList();
        return this.mList;
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ensureList();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void setListShown(boolean r7, boolean r8) {
        /*
        r6 = this;
        r5 = 8;
        r4 = 0;
        r0 = android.support.v4.app.Fragment.a;
        r6.ensureList();	 Catch:{ IllegalStateException -> 0x0017 }
        r1 = r6.mProgressContainer;	 Catch:{ IllegalStateException -> 0x0017 }
        if (r1 != 0) goto L_0x0019;
    L_0x000c:
        r0 = new java.lang.IllegalStateException;	 Catch:{ IllegalStateException -> 0x0017 }
        r1 = z;	 Catch:{ IllegalStateException -> 0x0017 }
        r2 = 3;
        r1 = r1[r2];	 Catch:{ IllegalStateException -> 0x0017 }
        r0.<init>(r1);	 Catch:{ IllegalStateException -> 0x0017 }
        throw r0;	 Catch:{ IllegalStateException -> 0x0017 }
    L_0x0017:
        r0 = move-exception;
        throw r0;
    L_0x0019:
        r1 = r6.mListShown;	 Catch:{ IllegalStateException -> 0x001e }
        if (r1 != r7) goto L_0x0020;
    L_0x001d:
        return;
    L_0x001e:
        r0 = move-exception;
        throw r0;
    L_0x0020:
        r6.mListShown = r7;	 Catch:{ IllegalStateException -> 0x0098 }
        if (r7 == 0) goto L_0x0060;
    L_0x0024:
        if (r8 == 0) goto L_0x0047;
    L_0x0026:
        r1 = r6.mProgressContainer;	 Catch:{ IllegalStateException -> 0x009c }
        r2 = r6.getActivity();	 Catch:{ IllegalStateException -> 0x009c }
        r3 = 17432577; // 0x10a0001 float:2.53466E-38 double:8.6128374E-317;
        r2 = android.view.animation.AnimationUtils.loadAnimation(r2, r3);	 Catch:{ IllegalStateException -> 0x009c }
        r1.startAnimation(r2);	 Catch:{ IllegalStateException -> 0x009c }
        r1 = r6.mListContainer;	 Catch:{ IllegalStateException -> 0x009c }
        r2 = r6.getActivity();	 Catch:{ IllegalStateException -> 0x009c }
        r3 = 17432576; // 0x10a0000 float:2.5346597E-38 double:8.612837E-317;
        r2 = android.view.animation.AnimationUtils.loadAnimation(r2, r3);	 Catch:{ IllegalStateException -> 0x009c }
        r1.startAnimation(r2);	 Catch:{ IllegalStateException -> 0x009c }
        if (r0 == 0) goto L_0x0051;
    L_0x0047:
        r1 = r6.mProgressContainer;	 Catch:{ IllegalStateException -> 0x009c }
        r1.clearAnimation();	 Catch:{ IllegalStateException -> 0x009c }
        r1 = r6.mListContainer;	 Catch:{ IllegalStateException -> 0x009c }
        r1.clearAnimation();	 Catch:{ IllegalStateException -> 0x009c }
    L_0x0051:
        r1 = r6.mProgressContainer;	 Catch:{ IllegalStateException -> 0x009e }
        r2 = 8;
        r1.setVisibility(r2);	 Catch:{ IllegalStateException -> 0x009e }
        r1 = r6.mListContainer;	 Catch:{ IllegalStateException -> 0x009e }
        r2 = 0;
        r1.setVisibility(r2);	 Catch:{ IllegalStateException -> 0x009e }
        if (r0 == 0) goto L_0x001d;
    L_0x0060:
        if (r8 == 0) goto L_0x0083;
    L_0x0062:
        r1 = r6.mProgressContainer;	 Catch:{ IllegalStateException -> 0x00a2 }
        r2 = r6.getActivity();	 Catch:{ IllegalStateException -> 0x00a2 }
        r3 = 17432576; // 0x10a0000 float:2.5346597E-38 double:8.612837E-317;
        r2 = android.view.animation.AnimationUtils.loadAnimation(r2, r3);	 Catch:{ IllegalStateException -> 0x00a2 }
        r1.startAnimation(r2);	 Catch:{ IllegalStateException -> 0x00a2 }
        r1 = r6.mListContainer;	 Catch:{ IllegalStateException -> 0x00a2 }
        r2 = r6.getActivity();	 Catch:{ IllegalStateException -> 0x00a2 }
        r3 = 17432577; // 0x10a0001 float:2.53466E-38 double:8.6128374E-317;
        r2 = android.view.animation.AnimationUtils.loadAnimation(r2, r3);	 Catch:{ IllegalStateException -> 0x00a2 }
        r1.startAnimation(r2);	 Catch:{ IllegalStateException -> 0x00a2 }
        if (r0 == 0) goto L_0x008d;
    L_0x0083:
        r0 = r6.mProgressContainer;	 Catch:{ IllegalStateException -> 0x00a2 }
        r0.clearAnimation();	 Catch:{ IllegalStateException -> 0x00a2 }
        r0 = r6.mListContainer;	 Catch:{ IllegalStateException -> 0x00a2 }
        r0.clearAnimation();	 Catch:{ IllegalStateException -> 0x00a2 }
    L_0x008d:
        r0 = r6.mProgressContainer;
        r0.setVisibility(r4);
        r0 = r6.mListContainer;
        r0.setVisibility(r5);
        goto L_0x001d;
    L_0x0098:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x009a }
    L_0x009a:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x009c }
    L_0x009c:
        r0 = move-exception;
        throw r0;
    L_0x009e:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00a0 }
    L_0x00a0:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00a2 }
    L_0x00a2:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.ListFragment.setListShown(boolean, boolean):void");
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z = false;
        boolean z2 = Fragment.a;
        Context activity = getActivity();
        View frameLayout = new FrameLayout(activity);
        View linearLayout = new LinearLayout(activity);
        linearLayout.setId(16711682);
        linearLayout.setOrientation(1);
        linearLayout.setVisibility(8);
        linearLayout.setGravity(17);
        linearLayout.addView(new ProgressBar(activity, null, 16842874), new LayoutParams(-2, -2));
        frameLayout.addView(linearLayout, new LayoutParams(-1, -1));
        linearLayout = new FrameLayout(activity);
        linearLayout.setId(16711683);
        View textView = new TextView(getActivity());
        textView.setId(16711681);
        textView.setGravity(17);
        linearLayout.addView(textView, new LayoutParams(-1, -1));
        textView = new ListView(getActivity());
        try {
            textView.setId(16908298);
            textView.setDrawSelectorOnTop(false);
            linearLayout.addView(textView, new LayoutParams(-1, -1));
            frameLayout.addView(linearLayout, new LayoutParams(-1, -1));
            frameLayout.setLayoutParams(new LayoutParams(-1, -1));
            if (FragmentActivity.a != 0) {
                if (!z2) {
                    z = true;
                }
                Fragment.a = z;
            }
            return frameLayout;
        } catch (IllegalStateException e) {
            throw e;
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    public void onListItemClick(ListView listView, View view, int i, long j) {
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void ensureList() {
        /*
        r6 = this;
        r5 = 1;
        r3 = android.support.v4.app.Fragment.a;
        r1 = r6.mList;	 Catch:{ IllegalStateException -> 0x0008 }
        if (r1 == 0) goto L_0x000a;
    L_0x0007:
        return;
    L_0x0008:
        r1 = move-exception;
        throw r1;
    L_0x000a:
        r2 = r6.getView();
        if (r2 != 0) goto L_0x001d;
    L_0x0010:
        r1 = new java.lang.IllegalStateException;	 Catch:{ IllegalStateException -> 0x001b }
        r2 = z;	 Catch:{ IllegalStateException -> 0x001b }
        r3 = 1;
        r2 = r2[r3];	 Catch:{ IllegalStateException -> 0x001b }
        r1.<init>(r2);	 Catch:{ IllegalStateException -> 0x001b }
        throw r1;	 Catch:{ IllegalStateException -> 0x001b }
    L_0x001b:
        r1 = move-exception;
        throw r1;
    L_0x001d:
        r1 = r2 instanceof android.widget.ListView;	 Catch:{ IllegalStateException -> 0x0076 }
        if (r1 == 0) goto L_0x0029;
    L_0x0021:
        r0 = r2;
        r0 = (android.widget.ListView) r0;	 Catch:{ IllegalStateException -> 0x0078 }
        r1 = r0;
        r6.mList = r1;	 Catch:{ IllegalStateException -> 0x0078 }
        if (r3 == 0) goto L_0x00ae;
    L_0x0029:
        r1 = 16711681; // 0xff0001 float:2.3418053E-38 double:8.2566675E-317;
        r1 = r2.findViewById(r1);	 Catch:{ IllegalStateException -> 0x007a }
        r1 = (android.widget.TextView) r1;	 Catch:{ IllegalStateException -> 0x007a }
        r6.mStandardEmptyView = r1;	 Catch:{ IllegalStateException -> 0x007a }
        r1 = r6.mStandardEmptyView;	 Catch:{ IllegalStateException -> 0x007a }
        if (r1 != 0) goto L_0x0043;
    L_0x0038:
        r1 = 16908292; // 0x1020004 float:2.387724E-38 double:8.353806E-317;
        r1 = r2.findViewById(r1);	 Catch:{ IllegalStateException -> 0x007c }
        r6.mEmptyView = r1;	 Catch:{ IllegalStateException -> 0x007c }
        if (r3 == 0) goto L_0x004a;
    L_0x0043:
        r1 = r6.mStandardEmptyView;	 Catch:{ IllegalStateException -> 0x007c }
        r4 = 8;
        r1.setVisibility(r4);	 Catch:{ IllegalStateException -> 0x007c }
    L_0x004a:
        r1 = 16711682; // 0xff0002 float:2.3418054E-38 double:8.256668E-317;
        r1 = r2.findViewById(r1);
        r6.mProgressContainer = r1;
        r1 = 16711683; // 0xff0003 float:2.3418056E-38 double:8.2566685E-317;
        r1 = r2.findViewById(r1);
        r6.mListContainer = r1;
        r1 = 16908298; // 0x102000a float:2.3877257E-38 double:8.353809E-317;
        r1 = r2.findViewById(r1);
        r2 = r1 instanceof android.widget.ListView;	 Catch:{ IllegalStateException -> 0x007e }
        if (r2 != 0) goto L_0x008b;
    L_0x0067:
        if (r1 != 0) goto L_0x0080;
    L_0x0069:
        r1 = new java.lang.RuntimeException;	 Catch:{ IllegalStateException -> 0x0074 }
        r2 = z;	 Catch:{ IllegalStateException -> 0x0074 }
        r3 = 0;
        r2 = r2[r3];	 Catch:{ IllegalStateException -> 0x0074 }
        r1.<init>(r2);	 Catch:{ IllegalStateException -> 0x0074 }
        throw r1;	 Catch:{ IllegalStateException -> 0x0074 }
    L_0x0074:
        r1 = move-exception;
        throw r1;
    L_0x0076:
        r1 = move-exception;
        throw r1;	 Catch:{ IllegalStateException -> 0x0078 }
    L_0x0078:
        r1 = move-exception;
        throw r1;	 Catch:{ IllegalStateException -> 0x007a }
    L_0x007a:
        r1 = move-exception;
        throw r1;	 Catch:{ IllegalStateException -> 0x007c }
    L_0x007c:
        r1 = move-exception;
        throw r1;
    L_0x007e:
        r1 = move-exception;
        throw r1;	 Catch:{ IllegalStateException -> 0x0074 }
    L_0x0080:
        r1 = new java.lang.RuntimeException;
        r2 = z;
        r3 = 2;
        r2 = r2[r3];
        r1.<init>(r2);
        throw r1;
    L_0x008b:
        r1 = (android.widget.ListView) r1;	 Catch:{ IllegalStateException -> 0x00d7 }
        r6.mList = r1;	 Catch:{ IllegalStateException -> 0x00d7 }
        r1 = r6.mEmptyView;	 Catch:{ IllegalStateException -> 0x00d7 }
        if (r1 == 0) goto L_0x009c;
    L_0x0093:
        r1 = r6.mList;	 Catch:{ IllegalStateException -> 0x00d9 }
        r2 = r6.mEmptyView;	 Catch:{ IllegalStateException -> 0x00d9 }
        r1.setEmptyView(r2);	 Catch:{ IllegalStateException -> 0x00d9 }
        if (r3 == 0) goto L_0x00ae;
    L_0x009c:
        r1 = r6.mEmptyText;	 Catch:{ IllegalStateException -> 0x00db }
        if (r1 == 0) goto L_0x00ae;
    L_0x00a0:
        r1 = r6.mStandardEmptyView;	 Catch:{ IllegalStateException -> 0x00db }
        r2 = r6.mEmptyText;	 Catch:{ IllegalStateException -> 0x00db }
        r1.setText(r2);	 Catch:{ IllegalStateException -> 0x00db }
        r1 = r6.mList;	 Catch:{ IllegalStateException -> 0x00db }
        r2 = r6.mStandardEmptyView;	 Catch:{ IllegalStateException -> 0x00db }
        r1.setEmptyView(r2);	 Catch:{ IllegalStateException -> 0x00db }
    L_0x00ae:
        r6.mListShown = r5;
        r1 = r6.mList;
        r2 = r6.mOnClickListener;
        r1.setOnItemClickListener(r2);
        r1 = r6.mAdapter;
        if (r1 == 0) goto L_0x00c5;
    L_0x00bb:
        r1 = r6.mAdapter;
        r2 = 0;
        r6.mAdapter = r2;	 Catch:{ IllegalStateException -> 0x00dd }
        r6.setListAdapter(r1);	 Catch:{ IllegalStateException -> 0x00dd }
        if (r3 == 0) goto L_0x00ce;
    L_0x00c5:
        r1 = r6.mProgressContainer;	 Catch:{ IllegalStateException -> 0x00df }
        if (r1 == 0) goto L_0x00ce;
    L_0x00c9:
        r1 = 0;
        r2 = 0;
        r6.setListShown(r1, r2);	 Catch:{ IllegalStateException -> 0x00df }
    L_0x00ce:
        r1 = r6.mHandler;
        r2 = r6.mRequestFocus;
        r1.post(r2);
        goto L_0x0007;
    L_0x00d7:
        r1 = move-exception;
        throw r1;	 Catch:{ IllegalStateException -> 0x00d9 }
    L_0x00d9:
        r1 = move-exception;
        throw r1;	 Catch:{ IllegalStateException -> 0x00db }
    L_0x00db:
        r1 = move-exception;
        throw r1;
    L_0x00dd:
        r1 = move-exception;
        throw r1;	 Catch:{ IllegalStateException -> 0x00df }
    L_0x00df:
        r1 = move-exception;
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.ListFragment.ensureList():void");
    }
}
