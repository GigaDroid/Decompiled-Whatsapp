package android.support.v7.widget;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.support.v4.view.ActionProvider;
import android.support.v7.appcompat.R;
import android.support.v7.widget.ActivityChooserModel.ActivityChooserModelClient;
import android.support.v7.widget.ListPopupWindow.ForwardingListener;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow.OnDismissListener;
import org.v;
import org.whispersystems.at;

public class ActivityChooserView extends ViewGroup implements ActivityChooserModelClient {
    private static final String z;
    private final LinearLayoutCompat mActivityChooserContent;
    private final Drawable mActivityChooserContentBackground;
    private final ActivityChooserViewAdapter mAdapter;
    private final Callbacks mCallbacks;
    private int mDefaultActionButtonContentDescription;
    private final FrameLayout mDefaultActivityButton;
    private final ImageView mDefaultActivityButtonImage;
    private final FrameLayout mExpandActivityOverflowButton;
    private final ImageView mExpandActivityOverflowButtonImage;
    private int mInitialActivityCount;
    private boolean mIsAttachedToWindow;
    private boolean mIsSelectingDefaultActivity;
    private final int mListPopupMaxWidth;
    private ListPopupWindow mListPopupWindow;
    private final DataSetObserver mModelDataSetOberver;
    private OnDismissListener mOnDismissListener;
    private final OnGlobalLayoutListener mOnGlobalLayoutListener;
    ActionProvider mProvider;

    class 1 extends DataSetObserver {
        final ActivityChooserView this$0;

        1(ActivityChooserView activityChooserView) {
            this.this$0 = activityChooserView;
        }

        public void onChanged() {
            super.onChanged();
            ActivityChooserView.access$000(this.this$0).notifyDataSetChanged();
        }

        public void onInvalidated() {
            super.onInvalidated();
            ActivityChooserView.access$000(this.this$0).notifyDataSetInvalidated();
        }
    }

    class 2 implements OnGlobalLayoutListener {
        final ActivityChooserView this$0;

        2(ActivityChooserView activityChooserView) {
            this.this$0 = activityChooserView;
        }

        public void onGlobalLayout() {
            if (this.this$0.isShowingPopup()) {
                if (!this.this$0.isShown()) {
                    ActivityChooserView.access$100(this.this$0).dismiss();
                    if (!LinearLayoutCompat.a) {
                        return;
                    }
                }
                ActivityChooserView.access$100(this.this$0).show();
                if (this.this$0.mProvider != null) {
                    this.this$0.mProvider.subUiVisibilityChanged(true);
                }
            }
        }
    }

    class 3 extends ForwardingListener {
        final ActivityChooserView this$0;

        3(ActivityChooserView activityChooserView, View view) {
            this.this$0 = activityChooserView;
            super(view);
        }

        protected boolean onForwardingStarted() {
            this.this$0.showPopup();
            return true;
        }

        public ListPopupWindow getPopup() {
            return ActivityChooserView.access$100(this.this$0);
        }

        protected boolean onForwardingStopped() {
            this.this$0.dismissPopup();
            return true;
        }
    }

    class 4 extends DataSetObserver {
        final ActivityChooserView this$0;

        public void onChanged() {
            super.onChanged();
            ActivityChooserView.access$400(this.this$0);
        }

        4(ActivityChooserView activityChooserView) {
            this.this$0 = activityChooserView;
        }
    }

    class ActivityChooserViewAdapter extends BaseAdapter {
        private ActivityChooserModel mDataModel;
        private boolean mHighlightDefaultActivity;
        private int mMaxActivityCount;
        private boolean mShowDefaultActivity;
        private boolean mShowFooterView;
        final ActivityChooserView this$0;

        public int getActivityCount() {
            return this.mDataModel.getActivityCount();
        }

        public int getViewTypeCount() {
            return 3;
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.view.View getView(int r5, android.view.View r6, android.view.ViewGroup r7) {
            /*
            r4 = this;
            r3 = 1;
            r2 = 0;
            r0 = r4.getItemViewType(r5);
            switch(r0) {
                case 0: goto L_0x0044;
                case 1: goto L_0x000f;
                default: goto L_0x0009;
            };
        L_0x0009:
            r0 = new java.lang.IllegalArgumentException;
            r0.<init>();
            throw r0;
        L_0x000f:
            if (r6 == 0) goto L_0x0017;
        L_0x0011:
            r0 = r6.getId();	 Catch:{ IllegalArgumentException -> 0x0042 }
            if (r0 == r3) goto L_0x0041;
        L_0x0017:
            r0 = r4.this$0;
            r0 = r0.getContext();
            r0 = android.view.LayoutInflater.from(r0);
            r1 = android.support.v7.appcompat.R.layout.abc_activity_chooser_view_list_item;
            r6 = r0.inflate(r1, r7, r2);
            r6.setId(r3);
            r0 = android.support.v7.appcompat.R.id.title;
            r0 = r6.findViewById(r0);
            r0 = (android.widget.TextView) r0;
            r1 = r4.this$0;
            r1 = r1.getContext();
            r2 = android.support.v7.appcompat.R.string.abc_activity_chooser_view_see_all;
            r1 = r1.getString(r2);
            r0.setText(r1);
        L_0x0041:
            return r6;
        L_0x0042:
            r0 = move-exception;
            throw r0;
        L_0x0044:
            if (r6 == 0) goto L_0x004e;
        L_0x0046:
            r0 = r6.getId();	 Catch:{ IllegalArgumentException -> 0x00a5 }
            r1 = android.support.v7.appcompat.R.id.list_item;	 Catch:{ IllegalArgumentException -> 0x00a5 }
            if (r0 == r1) goto L_0x005e;
        L_0x004e:
            r0 = r4.this$0;
            r0 = r0.getContext();
            r0 = android.view.LayoutInflater.from(r0);
            r1 = android.support.v7.appcompat.R.layout.abc_activity_chooser_view_list_item;
            r6 = r0.inflate(r1, r7, r2);
        L_0x005e:
            r0 = r4.this$0;
            r0 = r0.getContext();
            r2 = r0.getPackageManager();
            r0 = android.support.v7.appcompat.R.id.icon;
            r0 = r6.findViewById(r0);
            r0 = (android.widget.ImageView) r0;
            r1 = r4.getItem(r5);
            r1 = (android.content.pm.ResolveInfo) r1;
            r3 = r1.loadIcon(r2);
            r0.setImageDrawable(r3);
            r0 = android.support.v7.appcompat.R.id.title;
            r0 = r6.findViewById(r0);
            r0 = (android.widget.TextView) r0;
            r1 = r1.loadLabel(r2);	 Catch:{ IllegalArgumentException -> 0x00a7 }
            r0.setText(r1);	 Catch:{ IllegalArgumentException -> 0x00a7 }
            r0 = r4.mShowDefaultActivity;	 Catch:{ IllegalArgumentException -> 0x00a7 }
            if (r0 == 0) goto L_0x009e;
        L_0x0090:
            if (r5 != 0) goto L_0x009e;
        L_0x0092:
            r0 = r4.mHighlightDefaultActivity;	 Catch:{ IllegalArgumentException -> 0x00ab }
            if (r0 == 0) goto L_0x009e;
        L_0x0096:
            r0 = 1;
            android.support.v4.view.ViewCompat.setActivated(r6, r0);	 Catch:{ IllegalArgumentException -> 0x00a3 }
            r0 = android.support.v7.widget.LinearLayoutCompat.a;	 Catch:{ IllegalArgumentException -> 0x00a3 }
            if (r0 == 0) goto L_0x0041;
        L_0x009e:
            r0 = 0;
            android.support.v4.view.ViewCompat.setActivated(r6, r0);	 Catch:{ IllegalArgumentException -> 0x00a3 }
            goto L_0x0041;
        L_0x00a3:
            r0 = move-exception;
            throw r0;
        L_0x00a5:
            r0 = move-exception;
            throw r0;
        L_0x00a7:
            r0 = move-exception;
            throw r0;	 Catch:{ IllegalArgumentException -> 0x00a9 }
        L_0x00a9:
            r0 = move-exception;
            throw r0;	 Catch:{ IllegalArgumentException -> 0x00ab }
        L_0x00ab:
            r0 = move-exception;
            throw r0;	 Catch:{ IllegalArgumentException -> 0x00a3 }
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ActivityChooserView.ActivityChooserViewAdapter.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
        }

        public int getHistorySize() {
            return this.mDataModel.getHistorySize();
        }

        ActivityChooserViewAdapter(ActivityChooserView activityChooserView, 1 1) {
            this(activityChooserView);
        }

        public ActivityChooserModel getDataModel() {
            return this.mDataModel;
        }

        public Object getItem(int i) {
            switch (getItemViewType(i)) {
                case v.m /*0*/:
                    try {
                        if (!this.mShowDefaultActivity) {
                            if (this.mDataModel.getDefaultActivity() != null) {
                                i++;
                            }
                        }
                        return this.mDataModel.getActivity(i);
                    } catch (IllegalArgumentException e) {
                        throw e;
                    } catch (IllegalArgumentException e2) {
                        throw e2;
                    }
                case at.g /*1*/:
                    return null;
                default:
                    throw new IllegalArgumentException();
            }
        }

        public boolean getShowDefaultActivity() {
            return this.mShowDefaultActivity;
        }

        private ActivityChooserViewAdapter(ActivityChooserView activityChooserView) {
            this.this$0 = activityChooserView;
            this.mMaxActivityCount = 4;
        }

        public ResolveInfo getDefaultActivity() {
            return this.mDataModel.getDefaultActivity();
        }

        public void setShowFooterView(boolean z) {
            try {
                if (this.mShowFooterView != z) {
                    this.mShowFooterView = z;
                    notifyDataSetChanged();
                }
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }

        public int getItemViewType(int i) {
            try {
                if (this.mShowFooterView) {
                    if (i == getCount() - 1) {
                        return 1;
                    }
                }
                return 0;
            } catch (IllegalArgumentException e) {
                throw e;
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        }

        public void setMaxActivityCount(int i) {
            try {
                if (this.mMaxActivityCount != i) {
                    this.mMaxActivityCount = i;
                    notifyDataSetChanged();
                }
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }

        public void setShowDefaultActivity(boolean z, boolean z2) {
            try {
                if (this.mShowDefaultActivity == z) {
                    if (this.mHighlightDefaultActivity == z2) {
                        return;
                    }
                }
                this.mShowDefaultActivity = z;
                this.mHighlightDefaultActivity = z2;
                notifyDataSetChanged();
            } catch (IllegalArgumentException e) {
                throw e;
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        }

        public int measureContentWidth() {
            int i = 0;
            boolean z = LinearLayoutCompat.a;
            int i2 = this.mMaxActivityCount;
            this.mMaxActivityCount = Integer.MAX_VALUE;
            int makeMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
            int makeMeasureSpec2 = MeasureSpec.makeMeasureSpec(0, 0);
            int count = getCount();
            int i3 = 0;
            View view = null;
            while (i3 < count) {
                view = getView(i3, view, null);
                view.measure(makeMeasureSpec, makeMeasureSpec2);
                i = Math.max(i, view.getMeasuredWidth());
                i3++;
                if (z) {
                    break;
                }
            }
            this.mMaxActivityCount = i2;
            return i;
        }

        public int getCount() {
            int activityCount = this.mDataModel.getActivityCount();
            try {
                if (!this.mShowDefaultActivity) {
                    if (this.mDataModel.getDefaultActivity() != null) {
                        activityCount--;
                    }
                }
                activityCount = Math.min(activityCount, this.mMaxActivityCount);
                try {
                    if (this.mShowFooterView) {
                        return activityCount + 1;
                    }
                    return activityCount;
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            } catch (IllegalArgumentException e2) {
                throw e2;
            } catch (IllegalArgumentException e22) {
                throw e22;
            }
        }

        public long getItemId(int i) {
            return (long) i;
        }
    }

    class Callbacks implements OnItemClickListener, OnClickListener, OnLongClickListener, OnDismissListener {
        final ActivityChooserView this$0;

        public void onDismiss() {
            try {
                notifyOnDismissListener();
                if (this.this$0.mProvider != null) {
                    this.this$0.mProvider.subUiVisibilityChanged(false);
                }
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }

        private Callbacks(ActivityChooserView activityChooserView) {
            this.this$0 = activityChooserView;
        }

        private void notifyOnDismissListener() {
            try {
                if (ActivityChooserView.access$1000(this.this$0) != null) {
                    ActivityChooserView.access$1000(this.this$0).onDismiss();
                }
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }

        Callbacks(ActivityChooserView activityChooserView, 1 1) {
            this(activityChooserView);
        }

        public void onClick(View view) {
            boolean z = LinearLayoutCompat.a;
            if (view == ActivityChooserView.access$700(this.this$0)) {
                this.this$0.dismissPopup();
                Intent chooseActivity = ActivityChooserView.access$000(this.this$0).getDataModel().chooseActivity(ActivityChooserView.access$000(this.this$0).getDataModel().getActivityIndex(ActivityChooserView.access$000(this.this$0).getDefaultActivity()));
                if (chooseActivity != null) {
                    try {
                        chooseActivity.addFlags(524288);
                        this.this$0.getContext().startActivity(chooseActivity);
                    } catch (IllegalArgumentException e) {
                        throw e;
                    }
                }
                if (!z) {
                    return;
                }
            }
            try {
                if (view == ActivityChooserView.access$800(this.this$0)) {
                    ActivityChooserView.access$602(this.this$0, false);
                    ActivityChooserView.access$500(this.this$0, ActivityChooserView.access$900(this.this$0));
                    if (!z) {
                        return;
                    }
                }
                throw new IllegalArgumentException();
            } catch (IllegalArgumentException e2) {
                throw e2;
            } catch (IllegalArgumentException e22) {
                throw e22;
            }
        }

        public void onItemClick(AdapterView adapterView, View view, int i, long j) {
            boolean z = LinearLayoutCompat.a;
            switch (((ActivityChooserViewAdapter) adapterView.getAdapter()).getItemViewType(i)) {
                case at.g /*1*/:
                    try {
                        ActivityChooserView.access$500(this.this$0, Integer.MAX_VALUE);
                        if (!z) {
                            return;
                        }
                    } catch (IllegalArgumentException e) {
                        throw e;
                    } catch (IllegalArgumentException e2) {
                        try {
                            throw e2;
                        } catch (IllegalArgumentException e22) {
                            throw e22;
                        }
                    }
                case v.m /*0*/:
                    this.this$0.dismissPopup();
                    if (ActivityChooserView.access$600(this.this$0)) {
                        if (i > 0) {
                            try {
                                ActivityChooserView.access$000(this.this$0).getDataModel().setDefaultActivity(i);
                                if (!z) {
                                    return;
                                }
                            } catch (IllegalArgumentException e222) {
                                throw e222;
                            }
                        } else {
                            return;
                        }
                    }
                    try {
                        if (!ActivityChooserView.access$000(this.this$0).getShowDefaultActivity()) {
                            i++;
                        }
                        Intent chooseActivity = ActivityChooserView.access$000(this.this$0).getDataModel().chooseActivity(i);
                        if (chooseActivity != null) {
                            try {
                                chooseActivity.addFlags(524288);
                                this.this$0.getContext().startActivity(chooseActivity);
                            } catch (IllegalArgumentException e2222) {
                                throw e2222;
                            }
                        }
                        if (!z) {
                            return;
                        }
                    } catch (IllegalArgumentException e22222) {
                        throw e22222;
                    }
                    break;
            }
            try {
                throw new IllegalArgumentException();
            } catch (IllegalArgumentException e222222) {
                throw e222222;
            }
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onLongClick(android.view.View r4) {
            /*
            r3 = this;
            r2 = 1;
            r0 = r3.this$0;	 Catch:{ IllegalArgumentException -> 0x0032 }
            r0 = android.support.v7.widget.ActivityChooserView.access$700(r0);	 Catch:{ IllegalArgumentException -> 0x0032 }
            if (r4 != r0) goto L_0x002a;
        L_0x0009:
            r0 = r3.this$0;	 Catch:{ IllegalArgumentException -> 0x0034 }
            r0 = android.support.v7.widget.ActivityChooserView.access$000(r0);	 Catch:{ IllegalArgumentException -> 0x0034 }
            r0 = r0.getCount();	 Catch:{ IllegalArgumentException -> 0x0034 }
            if (r0 <= 0) goto L_0x0036;
        L_0x0015:
            r0 = r3.this$0;	 Catch:{ IllegalArgumentException -> 0x0030 }
            r1 = 1;
            android.support.v7.widget.ActivityChooserView.access$602(r0, r1);	 Catch:{ IllegalArgumentException -> 0x0030 }
            r0 = r3.this$0;	 Catch:{ IllegalArgumentException -> 0x0030 }
            r1 = r3.this$0;	 Catch:{ IllegalArgumentException -> 0x0030 }
            r1 = android.support.v7.widget.ActivityChooserView.access$900(r1);	 Catch:{ IllegalArgumentException -> 0x0030 }
            android.support.v7.widget.ActivityChooserView.access$500(r0, r1);	 Catch:{ IllegalArgumentException -> 0x0030 }
            r0 = android.support.v7.widget.LinearLayoutCompat.a;	 Catch:{ IllegalArgumentException -> 0x0030 }
            if (r0 == 0) goto L_0x0036;
        L_0x002a:
            r0 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0030 }
            r0.<init>();	 Catch:{ IllegalArgumentException -> 0x0030 }
            throw r0;	 Catch:{ IllegalArgumentException -> 0x0030 }
        L_0x0030:
            r0 = move-exception;
            throw r0;
        L_0x0032:
            r0 = move-exception;
            throw r0;	 Catch:{ IllegalArgumentException -> 0x0034 }
        L_0x0034:
            r0 = move-exception;
            throw r0;	 Catch:{ IllegalArgumentException -> 0x0030 }
        L_0x0036:
            return r2;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ActivityChooserView.Callbacks.onLongClick(android.view.View):boolean");
        }
    }

    public class InnerLayout extends LinearLayoutCompat {
        private static final int[] TINT_ATTRS;

        static {
            TINT_ATTRS = new int[]{16842964};
        }

        public InnerLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, TINT_ATTRS);
            setBackgroundDrawable(obtainStyledAttributes.getDrawable(0));
            obtainStyledAttributes.recycle();
        }
    }

    static {
        char[] toCharArray = " \u001bPJq\u001a\u0015PC\u007f\n\u0011\u001c\u00000*\u001d\u0014\u000ei\u0001\u0001PMq\u0002\u0018P\rc\u000b\u00004Od\u000f9\u001fJu\u0002K".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 110;
                    break;
                case at.g /*1*/:
                    i2 = 116;
                    break;
                case at.i /*2*/:
                    i2 = 112;
                    break;
                case at.o /*3*/:
                    i2 = 46;
                    break;
                default:
                    i2 = 16;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    static FrameLayout access$800(ActivityChooserView activityChooserView) {
        return activityChooserView.mExpandActivityOverflowButton;
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ActivityChooserModel dataModel = this.mAdapter.getDataModel();
        if (dataModel != null) {
            try {
                dataModel.unregisterObserver(this.mModelDataSetOberver);
            } catch (IllegalStateException e) {
                throw e;
            }
        }
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        try {
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeGlobalOnLayoutListener(this.mOnGlobalLayoutListener);
            }
            try {
                if (isShowingPopup()) {
                    dismissPopup();
                }
                this.mIsAttachedToWindow = false;
            } catch (IllegalStateException e2) {
                throw e2;
            }
        } catch (IllegalStateException e22) {
            throw e22;
        }
    }

    static void access$400(ActivityChooserView activityChooserView) {
        activityChooserView.updateAppearance();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void showPopupUnchecked(int r6) {
        /*
        r5 = this;
        r1 = 1;
        r2 = 0;
        r3 = android.support.v7.widget.LinearLayoutCompat.a;
        r0 = r5.mAdapter;	 Catch:{ IllegalStateException -> 0x0014 }
        r0 = r0.getDataModel();	 Catch:{ IllegalStateException -> 0x0014 }
        if (r0 != 0) goto L_0x0016;
    L_0x000c:
        r0 = new java.lang.IllegalStateException;	 Catch:{ IllegalStateException -> 0x0014 }
        r1 = z;	 Catch:{ IllegalStateException -> 0x0014 }
        r0.<init>(r1);	 Catch:{ IllegalStateException -> 0x0014 }
        throw r0;	 Catch:{ IllegalStateException -> 0x0014 }
    L_0x0014:
        r0 = move-exception;
        throw r0;
    L_0x0016:
        r0 = r5.getViewTreeObserver();	 Catch:{ IllegalStateException -> 0x009f }
        r4 = r5.mOnGlobalLayoutListener;	 Catch:{ IllegalStateException -> 0x009f }
        r0.addOnGlobalLayoutListener(r4);	 Catch:{ IllegalStateException -> 0x009f }
        r0 = r5.mDefaultActivityButton;	 Catch:{ IllegalStateException -> 0x009f }
        r0 = r0.getVisibility();	 Catch:{ IllegalStateException -> 0x009f }
        if (r0 != 0) goto L_0x00a1;
    L_0x0027:
        r0 = r1;
    L_0x0028:
        r4 = r5.mAdapter;
        r4 = r4.getActivityCount();
        if (r0 == 0) goto L_0x00a3;
    L_0x0030:
        r2 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        if (r6 == r2) goto L_0x0047;
    L_0x0035:
        r1 = r1 + r6;
        if (r4 <= r1) goto L_0x0047;
    L_0x0038:
        r1 = r5.mAdapter;	 Catch:{ IllegalStateException -> 0x00a5 }
        r2 = 1;
        r1.setShowFooterView(r2);	 Catch:{ IllegalStateException -> 0x00a5 }
        r1 = r5.mAdapter;	 Catch:{ IllegalStateException -> 0x00a5 }
        r2 = r6 + -1;
        r1.setMaxActivityCount(r2);	 Catch:{ IllegalStateException -> 0x00a5 }
        if (r3 == 0) goto L_0x0052;
    L_0x0047:
        r1 = r5.mAdapter;	 Catch:{ IllegalStateException -> 0x00a5 }
        r2 = 0;
        r1.setShowFooterView(r2);	 Catch:{ IllegalStateException -> 0x00a5 }
        r1 = r5.mAdapter;	 Catch:{ IllegalStateException -> 0x00a5 }
        r1.setMaxActivityCount(r6);	 Catch:{ IllegalStateException -> 0x00a5 }
    L_0x0052:
        r1 = r5.getListPopupWindow();
        r2 = r1.isShowing();	 Catch:{ IllegalStateException -> 0x00a7 }
        if (r2 != 0) goto L_0x009e;
    L_0x005c:
        r2 = r5.mIsSelectingDefaultActivity;	 Catch:{ IllegalStateException -> 0x00a9 }
        if (r2 != 0) goto L_0x0062;
    L_0x0060:
        if (r0 != 0) goto L_0x006a;
    L_0x0062:
        r2 = r5.mAdapter;	 Catch:{ IllegalStateException -> 0x00ad }
        r4 = 1;
        r2.setShowDefaultActivity(r4, r0);	 Catch:{ IllegalStateException -> 0x00ad }
        if (r3 == 0) goto L_0x0071;
    L_0x006a:
        r0 = r5.mAdapter;	 Catch:{ IllegalStateException -> 0x00ad }
        r2 = 0;
        r3 = 0;
        r0.setShowDefaultActivity(r2, r3);	 Catch:{ IllegalStateException -> 0x00ad }
    L_0x0071:
        r0 = r5.mAdapter;
        r0 = r0.measureContentWidth();
        r2 = r5.mListPopupMaxWidth;
        r0 = java.lang.Math.min(r0, r2);
        r1.setContentWidth(r0);	 Catch:{ IllegalStateException -> 0x00af }
        r1.show();	 Catch:{ IllegalStateException -> 0x00af }
        r0 = r5.mProvider;	 Catch:{ IllegalStateException -> 0x00af }
        if (r0 == 0) goto L_0x008d;
    L_0x0087:
        r0 = r5.mProvider;	 Catch:{ IllegalStateException -> 0x00af }
        r2 = 1;
        r0.subUiVisibilityChanged(r2);	 Catch:{ IllegalStateException -> 0x00af }
    L_0x008d:
        r0 = r1.getListView();
        r1 = r5.getContext();
        r2 = android.support.v7.appcompat.R.string.abc_activitychooserview_choose_application;
        r1 = r1.getString(r2);
        r0.setContentDescription(r1);
    L_0x009e:
        return;
    L_0x009f:
        r0 = move-exception;
        throw r0;
    L_0x00a1:
        r0 = r2;
        goto L_0x0028;
    L_0x00a3:
        r1 = r2;
        goto L_0x0030;
    L_0x00a5:
        r0 = move-exception;
        throw r0;
    L_0x00a7:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00a9 }
    L_0x00a9:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00ab }
    L_0x00ab:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00ad }
    L_0x00ad:
        r0 = move-exception;
        throw r0;
    L_0x00af:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ActivityChooserView.showPopupUnchecked(int):void");
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        try {
            this.mActivityChooserContent.layout(0, 0, i3 - i, i4 - i2);
            if (!isShowingPopup()) {
                dismissPopup();
            }
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    static void access$500(ActivityChooserView activityChooserView, int i) {
        activityChooserView.showPopupUnchecked(i);
    }

    public ActivityChooserView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public boolean showPopup() {
        try {
            if (isShowingPopup()) {
                return false;
            }
            if (!this.mIsAttachedToWindow) {
                return false;
            }
            this.mIsSelectingDefaultActivity = false;
            showPopupUnchecked(this.mInitialActivityCount);
            return true;
        } catch (IllegalStateException e) {
            throw e;
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    protected void onMeasure(int i, int i2) {
        View view = this.mActivityChooserContent;
        if (this.mDefaultActivityButton.getVisibility() != 0) {
            i2 = MeasureSpec.makeMeasureSpec(MeasureSpec.getSize(i2), 1073741824);
        }
        measureChild(view, i, i2);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    public ActivityChooserView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mModelDataSetOberver = new 1(this);
        this.mOnGlobalLayoutListener = new 2(this);
        this.mInitialActivityCount = 4;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ActivityChooserView, i, 0);
        this.mInitialActivityCount = obtainStyledAttributes.getInt(R.styleable.ActivityChooserView_initialActivityCount, 4);
        Drawable drawable = obtainStyledAttributes.getDrawable(R.styleable.ActivityChooserView_expandActivityOverflowButtonDrawable);
        obtainStyledAttributes.recycle();
        LayoutInflater.from(getContext()).inflate(R.layout.abc_activity_chooser_view, this, true);
        this.mCallbacks = new Callbacks(this, null);
        this.mActivityChooserContent = (LinearLayoutCompat) findViewById(R.id.activity_chooser_view_content);
        this.mActivityChooserContentBackground = this.mActivityChooserContent.getBackground();
        this.mDefaultActivityButton = (FrameLayout) findViewById(R.id.default_activity_button);
        this.mDefaultActivityButton.setOnClickListener(this.mCallbacks);
        this.mDefaultActivityButton.setOnLongClickListener(this.mCallbacks);
        this.mDefaultActivityButtonImage = (ImageView) this.mDefaultActivityButton.findViewById(R.id.image);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.expand_activities_button);
        frameLayout.setOnClickListener(this.mCallbacks);
        frameLayout.setOnTouchListener(new 3(this, frameLayout));
        this.mExpandActivityOverflowButton = frameLayout;
        this.mExpandActivityOverflowButtonImage = (ImageView) frameLayout.findViewById(R.id.image);
        this.mExpandActivityOverflowButtonImage.setImageDrawable(drawable);
        this.mAdapter = new ActivityChooserViewAdapter(this, null);
        this.mAdapter.registerDataSetObserver(new 4(this));
        Resources resources = context.getResources();
        this.mListPopupMaxWidth = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
    }

    static OnDismissListener access$1000(ActivityChooserView activityChooserView) {
        return activityChooserView.mOnDismissListener;
    }

    private ListPopupWindow getListPopupWindow() {
        try {
            if (this.mListPopupWindow == null) {
                this.mListPopupWindow = new ListPopupWindow(getContext());
                this.mListPopupWindow.setAdapter(this.mAdapter);
                this.mListPopupWindow.setAnchorView(this);
                this.mListPopupWindow.setModal(true);
                this.mListPopupWindow.setOnItemClickListener(this.mCallbacks);
                this.mListPopupWindow.setOnDismissListener(this.mCallbacks);
            }
            return this.mListPopupWindow;
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public ActivityChooserView(Context context) {
        this(context, null);
    }

    static ActivityChooserViewAdapter access$000(ActivityChooserView activityChooserView) {
        return activityChooserView.mAdapter;
    }

    static int access$900(ActivityChooserView activityChooserView) {
        return activityChooserView.mInitialActivityCount;
    }

    static boolean access$600(ActivityChooserView activityChooserView) {
        return activityChooserView.mIsSelectingDefaultActivity;
    }

    static ListPopupWindow access$100(ActivityChooserView activityChooserView) {
        return activityChooserView.getListPopupWindow();
    }

    static boolean access$602(ActivityChooserView activityChooserView, boolean z) {
        activityChooserView.mIsSelectingDefaultActivity = z;
        return z;
    }

    static FrameLayout access$700(ActivityChooserView activityChooserView) {
        return activityChooserView.mDefaultActivityButton;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void updateAppearance() {
        /*
        r7 = this;
        r6 = 0;
        r5 = 1;
        r0 = android.support.v7.widget.LinearLayoutCompat.a;
        r1 = r7.mAdapter;	 Catch:{ IllegalStateException -> 0x0084 }
        r1 = r1.getCount();	 Catch:{ IllegalStateException -> 0x0084 }
        if (r1 <= 0) goto L_0x0014;
    L_0x000c:
        r1 = r7.mExpandActivityOverflowButton;	 Catch:{ IllegalStateException -> 0x0086 }
        r2 = 1;
        r1.setEnabled(r2);	 Catch:{ IllegalStateException -> 0x0086 }
        if (r0 == 0) goto L_0x001a;
    L_0x0014:
        r1 = r7.mExpandActivityOverflowButton;	 Catch:{ IllegalStateException -> 0x0086 }
        r2 = 0;
        r1.setEnabled(r2);	 Catch:{ IllegalStateException -> 0x0086 }
    L_0x001a:
        r1 = r7.mAdapter;
        r1 = r1.getActivityCount();
        r2 = r7.mAdapter;
        r2 = r2.getHistorySize();
        if (r1 == r5) goto L_0x002c;
    L_0x0028:
        if (r1 <= r5) goto L_0x0065;
    L_0x002a:
        if (r2 <= 0) goto L_0x0065;
    L_0x002c:
        r1 = r7.mDefaultActivityButton;
        r1.setVisibility(r6);
        r1 = r7.mAdapter;
        r1 = r1.getDefaultActivity();
        r2 = r7.getContext();
        r2 = r2.getPackageManager();
        r3 = r7.mDefaultActivityButtonImage;
        r4 = r1.loadIcon(r2);
        r3.setImageDrawable(r4);
        r3 = r7.mDefaultActionButtonContentDescription;
        if (r3 == 0) goto L_0x0063;
    L_0x004c:
        r1 = r1.loadLabel(r2);
        r2 = r7.getContext();
        r3 = r7.mDefaultActionButtonContentDescription;
        r4 = new java.lang.Object[r5];
        r4[r6] = r1;
        r1 = r2.getString(r3, r4);
        r2 = r7.mDefaultActivityButton;
        r2.setContentDescription(r1);
    L_0x0063:
        if (r0 == 0) goto L_0x006c;
    L_0x0065:
        r1 = r7.mDefaultActivityButton;	 Catch:{ IllegalStateException -> 0x0088 }
        r2 = 8;
        r1.setVisibility(r2);	 Catch:{ IllegalStateException -> 0x0088 }
    L_0x006c:
        r1 = r7.mDefaultActivityButton;	 Catch:{ IllegalStateException -> 0x008a }
        r1 = r1.getVisibility();	 Catch:{ IllegalStateException -> 0x008a }
        if (r1 != 0) goto L_0x007d;
    L_0x0074:
        r1 = r7.mActivityChooserContent;	 Catch:{ IllegalStateException -> 0x008c }
        r2 = r7.mActivityChooserContentBackground;	 Catch:{ IllegalStateException -> 0x008c }
        r1.setBackgroundDrawable(r2);	 Catch:{ IllegalStateException -> 0x008c }
        if (r0 == 0) goto L_0x0083;
    L_0x007d:
        r0 = r7.mActivityChooserContent;	 Catch:{ IllegalStateException -> 0x008c }
        r1 = 0;
        r0.setBackgroundDrawable(r1);	 Catch:{ IllegalStateException -> 0x008c }
    L_0x0083:
        return;
    L_0x0084:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0086 }
    L_0x0086:
        r0 = move-exception;
        throw r0;
    L_0x0088:
        r0 = move-exception;
        throw r0;
    L_0x008a:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x008c }
    L_0x008c:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ActivityChooserView.updateAppearance():void");
    }

    public boolean isShowingPopup() {
        return getListPopupWindow().isShowing();
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ActivityChooserModel dataModel = this.mAdapter.getDataModel();
        if (dataModel != null) {
            try {
                dataModel.registerObserver(this.mModelDataSetOberver);
            } catch (IllegalStateException e) {
                throw e;
            }
        }
        this.mIsAttachedToWindow = true;
    }

    public boolean dismissPopup() {
        if (isShowingPopup()) {
            getListPopupWindow().dismiss();
            ViewTreeObserver viewTreeObserver = getViewTreeObserver();
            try {
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.mOnGlobalLayoutListener);
                }
            } catch (IllegalStateException e) {
                throw e;
            }
        }
        return true;
    }
}
