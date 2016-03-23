package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v4.text.TextUtilsCompat;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPropertyAnimatorCompat;
import android.support.v4.widget.ListViewAutoScrollHelper;
import android.support.v7.appcompat.R;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.PopupWindow.OnDismissListener;
import java.lang.reflect.Method;
import org.v;
import org.whispersystems.at;

public class ListPopupWindow {
    private static Method sClipToWindowEnabledMethod;
    private static Method sGetMaxAvailableHeightMethod;
    private static final String[] z;
    private ListAdapter mAdapter;
    private Context mContext;
    private boolean mDropDownAlwaysVisible;
    private View mDropDownAnchorView;
    private int mDropDownGravity;
    private int mDropDownHeight;
    private int mDropDownHorizontalOffset;
    private DropDownListView mDropDownList;
    private Drawable mDropDownListHighlight;
    private int mDropDownVerticalOffset;
    private boolean mDropDownVerticalOffsetSet;
    private int mDropDownWidth;
    private int mDropDownWindowLayoutType;
    private boolean mForceIgnoreOutsideTouch;
    private final Handler mHandler;
    private final ListSelectorHider mHideSelector;
    private OnItemClickListener mItemClickListener;
    private OnItemSelectedListener mItemSelectedListener;
    private int mLayoutDirection;
    int mListItemExpandMaximum;
    private boolean mModal;
    private DataSetObserver mObserver;
    private PopupWindow mPopup;
    private int mPromptPosition;
    private View mPromptView;
    private final ResizePopupRunnable mResizePopupRunnable;
    private final PopupScrollListener mScrollListener;
    private Runnable mShowDropDownRunnable;
    private Rect mTempRect;
    private final PopupTouchInterceptor mTouchInterceptor;

    public abstract class ForwardingListener implements OnTouchListener {
        private int mActivePointerId;
        private Runnable mDisallowIntercept;
        private boolean mForwarding;
        private final int mLongPressTimeout;
        private final float mScaledTouchSlop;
        private final View mSrc;
        private final int mTapTimeout;
        private final int[] mTmpLocation;
        private Runnable mTriggerLongPress;
        private boolean mWasLongPress;

        class DisallowIntercept implements Runnable {
            final ForwardingListener this$0;

            public void run() {
                ForwardingListener.access$900(this.this$0).getParent().requestDisallowInterceptTouchEvent(true);
            }

            private DisallowIntercept(ForwardingListener forwardingListener) {
                this.this$0 = forwardingListener;
            }

            DisallowIntercept(ForwardingListener forwardingListener, 1 1) {
                this(forwardingListener);
            }
        }

        class TriggerLongPress implements Runnable {
            final ForwardingListener this$0;

            private TriggerLongPress(ForwardingListener forwardingListener) {
                this.this$0 = forwardingListener;
            }

            public void run() {
                ForwardingListener.access$1000(this.this$0);
            }

            TriggerLongPress(ForwardingListener forwardingListener, 1 1) {
                this(forwardingListener);
            }
        }

        public abstract ListPopupWindow getPopup();

        private void onLongPress() {
            clearCallbacks();
            View view = this.mSrc;
            if (view.isEnabled() && !view.isLongClickable() && onForwardingStarted()) {
                view.getParent().requestDisallowInterceptTouchEvent(true);
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                view.onTouchEvent(obtain);
                obtain.recycle();
                this.mForwarding = true;
                this.mWasLongPress = true;
            }
        }

        private static boolean pointInView(View view, float f, float f2, float f3) {
            return f >= (-f3) && f2 >= (-f3) && f < ((float) (view.getRight() - view.getLeft())) + f3 && f2 < ((float) (view.getBottom() - view.getTop())) + f3;
        }

        protected boolean onForwardingStarted() {
            ListPopupWindow popup = getPopup();
            if (!(popup == null || popup.isShowing())) {
                popup.show();
            }
            return true;
        }

        static View access$900(ForwardingListener forwardingListener) {
            return forwardingListener.mSrc;
        }

        private boolean onTouchObserved(MotionEvent motionEvent) {
            boolean z = LinearLayoutCompat.a;
            View view = this.mSrc;
            if (!view.isEnabled()) {
                return false;
            }
            switch (MotionEventCompat.getActionMasked(motionEvent)) {
                case v.m /*0*/:
                    this.mActivePointerId = motionEvent.getPointerId(0);
                    this.mWasLongPress = false;
                    if (this.mDisallowIntercept == null) {
                        this.mDisallowIntercept = new DisallowIntercept(this, null);
                    }
                    view.postDelayed(this.mDisallowIntercept, (long) this.mTapTimeout);
                    if (this.mTriggerLongPress == null) {
                        this.mTriggerLongPress = new TriggerLongPress(this, null);
                    }
                    view.postDelayed(this.mTriggerLongPress, (long) this.mLongPressTimeout);
                    if (!z) {
                        return false;
                    }
                    break;
                case at.g /*1*/:
                case at.o /*3*/:
                    break;
                case at.i /*2*/:
                    break;
                default:
                    return false;
            }
            int findPointerIndex = motionEvent.findPointerIndex(this.mActivePointerId);
            if (findPointerIndex < 0) {
                return false;
            }
            if (pointInView(view, motionEvent.getX(findPointerIndex), motionEvent.getY(findPointerIndex), this.mScaledTouchSlop)) {
                if (!z) {
                    return false;
                }
                clearCallbacks();
                return false;
            }
            clearCallbacks();
            view.getParent().requestDisallowInterceptTouchEvent(true);
            return true;
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTouch(android.view.View r12, android.view.MotionEvent r13) {
            /*
            r11 = this;
            r5 = 0;
            r9 = 1;
            r7 = 0;
            r1 = android.support.v7.widget.LinearLayoutCompat.a;
            r10 = r11.mForwarding;
            if (r10 == 0) goto L_0x0022;
        L_0x0009:
            r0 = r11.mWasLongPress;
            if (r0 == 0) goto L_0x0013;
        L_0x000d:
            r0 = r11.onTouchForwarded(r13);
            if (r1 == 0) goto L_0x0045;
        L_0x0013:
            r0 = r11.onTouchForwarded(r13);
            if (r0 != 0) goto L_0x001f;
        L_0x0019:
            r0 = r11.onForwardingStopped();
            if (r0 != 0) goto L_0x004d;
        L_0x001f:
            r0 = r9;
        L_0x0020:
            if (r1 == 0) goto L_0x0045;
        L_0x0022:
            r0 = r11.onTouchObserved(r13);
            if (r0 == 0) goto L_0x004f;
        L_0x0028:
            r0 = r11.onForwardingStarted();
            if (r0 == 0) goto L_0x004f;
        L_0x002e:
            r8 = r9;
        L_0x002f:
            if (r8 == 0) goto L_0x0044;
        L_0x0031:
            r0 = android.os.SystemClock.uptimeMillis();
            r4 = 3;
            r2 = r0;
            r6 = r5;
            r0 = android.view.MotionEvent.obtain(r0, r2, r4, r5, r6, r7);
            r1 = r11.mSrc;
            r1.onTouchEvent(r0);
            r0.recycle();
        L_0x0044:
            r0 = r8;
        L_0x0045:
            r11.mForwarding = r0;
            if (r0 != 0) goto L_0x004b;
        L_0x0049:
            if (r10 == 0) goto L_0x004c;
        L_0x004b:
            r7 = r9;
        L_0x004c:
            return r7;
        L_0x004d:
            r0 = r7;
            goto L_0x0020;
        L_0x004f:
            r8 = r7;
            goto L_0x002f;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ListPopupWindow.ForwardingListener.onTouch(android.view.View, android.view.MotionEvent):boolean");
        }

        private void clearCallbacks() {
            if (this.mTriggerLongPress != null) {
                this.mSrc.removeCallbacks(this.mTriggerLongPress);
            }
            if (this.mDisallowIntercept != null) {
                this.mSrc.removeCallbacks(this.mDisallowIntercept);
            }
        }

        private boolean toGlobalMotionEvent(View view, MotionEvent motionEvent) {
            int[] iArr = this.mTmpLocation;
            view.getLocationOnScreen(iArr);
            motionEvent.offsetLocation((float) iArr[0], (float) iArr[1]);
            return true;
        }

        public ForwardingListener(View view) {
            this.mTmpLocation = new int[2];
            this.mSrc = view;
            this.mScaledTouchSlop = (float) ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            this.mTapTimeout = ViewConfiguration.getTapTimeout();
            this.mLongPressTimeout = (this.mTapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
        }

        protected boolean onForwardingStopped() {
            ListPopupWindow popup = getPopup();
            if (popup != null && popup.isShowing()) {
                popup.dismiss();
            }
            return true;
        }

        static void access$1000(ForwardingListener forwardingListener) {
            forwardingListener.onLongPress();
        }

        private boolean onTouchForwarded(MotionEvent motionEvent) {
            boolean z = true;
            View view = this.mSrc;
            ListPopupWindow popup = getPopup();
            if (popup == null || !popup.isShowing()) {
                return false;
            }
            View access$600 = ListPopupWindow.access$600(popup);
            if (access$600 == null || !access$600.isShown()) {
                return false;
            }
            MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
            toGlobalMotionEvent(view, obtainNoHistory);
            toLocalMotionEvent(access$600, obtainNoHistory);
            boolean onForwardedEvent = access$600.onForwardedEvent(obtainNoHistory, this.mActivePointerId);
            obtainNoHistory.recycle();
            int actionMasked = MotionEventCompat.getActionMasked(motionEvent);
            boolean z2;
            if (actionMasked == 1 || actionMasked == 3) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (!(onForwardedEvent && r2)) {
                z = false;
            }
            return z;
        }

        private boolean toLocalMotionEvent(View view, MotionEvent motionEvent) {
            int[] iArr = this.mTmpLocation;
            view.getLocationOnScreen(iArr);
            motionEvent.offsetLocation((float) (-iArr[0]), (float) (-iArr[1]));
            return true;
        }
    }

    class 1 extends ForwardingListener {
        final ListPopupWindow this$0;

        public ListPopupWindow getPopup() {
            return this.this$0;
        }
    }

    class 2 implements Runnable {
        final ListPopupWindow this$0;

        public void run() {
            View anchorView = this.this$0.getAnchorView();
            if (anchorView != null && anchorView.getWindowToken() != null) {
                this.this$0.show();
            }
        }

        2(ListPopupWindow listPopupWindow) {
            this.this$0 = listPopupWindow;
        }
    }

    class 3 implements OnItemSelectedListener {
        final ListPopupWindow this$0;

        public void onNothingSelected(AdapterView adapterView) {
        }

        3(ListPopupWindow listPopupWindow) {
            this.this$0 = listPopupWindow;
        }

        public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
            if (i != -1) {
                DropDownListView access$600 = ListPopupWindow.access$600(this.this$0);
                if (access$600 != null) {
                    DropDownListView.access$502(access$600, false);
                }
            }
        }
    }

    class DropDownListView extends ListViewCompat {
        private ViewPropertyAnimatorCompat mClickAnimation;
        private boolean mDrawsInPressedState;
        private boolean mHijackFocus;
        private boolean mListSelectionHidden;
        private ListViewAutoScrollHelper mScrollHelper;

        public boolean isFocused() {
            return this.mHijackFocus || super.isFocused();
        }

        protected boolean touchModeDrawsInPressedStateCompat() {
            return this.mDrawsInPressedState || super.touchModeDrawsInPressedStateCompat();
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onForwardedEvent(android.view.MotionEvent r10, int r11) {
            /*
            r9 = this;
            r2 = 1;
            r1 = 0;
            r4 = android.support.v7.widget.LinearLayoutCompat.a;
            r3 = android.support.v4.view.MotionEventCompat.getActionMasked(r10);
            switch(r3) {
                case 1: goto L_0x0039;
                case 2: goto L_0x0075;
                case 3: goto L_0x0037;
                default: goto L_0x000b;
            };
        L_0x000b:
            r0 = r1;
            r3 = r2;
        L_0x000d:
            if (r3 == 0) goto L_0x0011;
        L_0x000f:
            if (r0 == 0) goto L_0x0014;
        L_0x0011:
            r9.clearPressedItem();
        L_0x0014:
            if (r3 == 0) goto L_0x002d;
        L_0x0016:
            r0 = r9.mScrollHelper;
            if (r0 != 0) goto L_0x0021;
        L_0x001a:
            r0 = new android.support.v4.widget.ListViewAutoScrollHelper;
            r0.<init>(r9);
            r9.mScrollHelper = r0;
        L_0x0021:
            r0 = r9.mScrollHelper;
            r0.setEnabled(r2);
            r0 = r9.mScrollHelper;
            r0.onTouch(r9, r10);
            if (r4 == 0) goto L_0x0036;
        L_0x002d:
            r0 = r9.mScrollHelper;
            if (r0 == 0) goto L_0x0036;
        L_0x0031:
            r0 = r9.mScrollHelper;
            r0.setEnabled(r1);
        L_0x0036:
            return r3;
        L_0x0037:
            if (r4 == 0) goto L_0x0072;
        L_0x0039:
            r0 = r1;
        L_0x003a:
            r5 = r10.findPointerIndex(r11);
            if (r5 >= 0) goto L_0x0043;
        L_0x0040:
            if (r4 == 0) goto L_0x0072;
        L_0x0042:
            r0 = r1;
        L_0x0043:
            r6 = r10.getX(r5);
            r6 = (int) r6;
            r5 = r10.getY(r5);
            r5 = (int) r5;
            r7 = r9.pointToPosition(r6, r5);
            r8 = -1;
            if (r7 != r8) goto L_0x0070;
        L_0x0054:
            if (r4 == 0) goto L_0x006d;
        L_0x0056:
            r0 = r2;
        L_0x0057:
            r8 = r9.getFirstVisiblePosition();
            r8 = r7 - r8;
            r8 = r9.getChildAt(r8);
            r6 = (float) r6;
            r5 = (float) r5;
            r9.setPressedItem(r8, r7, r6, r5);
            if (r3 != r2) goto L_0x006b;
        L_0x0068:
            r9.clickPressedItem(r8, r7);
        L_0x006b:
            r3 = r2;
            goto L_0x000d;
        L_0x006d:
            r3 = r0;
            r0 = r2;
            goto L_0x000d;
        L_0x0070:
            r0 = r1;
            goto L_0x0057;
        L_0x0072:
            r0 = r1;
            r3 = r1;
            goto L_0x000d;
        L_0x0075:
            r0 = r2;
            goto L_0x003a;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ListPopupWindow.DropDownListView.onForwardedEvent(android.view.MotionEvent, int):boolean");
        }

        static boolean access$502(DropDownListView dropDownListView, boolean z) {
            dropDownListView.mListSelectionHidden = z;
            return z;
        }

        private void clearPressedItem() {
            this.mDrawsInPressedState = false;
            setPressed(false);
            drawableStateChanged();
            View childAt = getChildAt(this.mMotionPosition - getFirstVisiblePosition());
            if (childAt != null) {
                childAt.setPressed(false);
            }
            if (this.mClickAnimation != null) {
                this.mClickAnimation.cancel();
                this.mClickAnimation = null;
            }
        }

        private void clickPressedItem(View view, int i) {
            performItemClick(view, i, getItemIdAtPosition(i));
        }

        private void setPressedItem(View view, int i, float f, float f2) {
            this.mDrawsInPressedState = true;
            if (VERSION.SDK_INT >= 21) {
                drawableHotspotChanged(f, f2);
            }
            if (!isPressed()) {
                setPressed(true);
            }
            layoutChildren();
            if (this.mMotionPosition != -1) {
                View childAt = getChildAt(this.mMotionPosition - getFirstVisiblePosition());
                if (!(childAt == null || childAt == view || !childAt.isPressed())) {
                    childAt.setPressed(false);
                }
            }
            this.mMotionPosition = i;
            float left = f - ((float) view.getLeft());
            float top = f2 - ((float) view.getTop());
            if (VERSION.SDK_INT >= 21) {
                view.drawableHotspotChanged(left, top);
            }
            if (!view.isPressed()) {
                view.setPressed(true);
            }
            setSelection(i);
            positionSelectorLikeTouchCompat(i, view, f, f2);
            setSelectorEnabled(false);
            refreshDrawableState();
        }

        public boolean hasFocus() {
            return this.mHijackFocus || super.hasFocus();
        }

        public boolean hasWindowFocus() {
            return this.mHijackFocus || super.hasWindowFocus();
        }

        public boolean isInTouchMode() {
            return (this.mHijackFocus && this.mListSelectionHidden) || super.isInTouchMode();
        }

        public DropDownListView(Context context, boolean z) {
            super(context, null, R.attr.dropDownListViewStyle);
            this.mHijackFocus = z;
            setCacheColorHint(0);
        }
    }

    class ListSelectorHider implements Runnable {
        final ListPopupWindow this$0;

        private ListSelectorHider(ListPopupWindow listPopupWindow) {
            this.this$0 = listPopupWindow;
        }

        public void run() {
            this.this$0.clearListSelection();
        }

        ListSelectorHider(ListPopupWindow listPopupWindow, 1 1) {
            this(listPopupWindow);
        }
    }

    class PopupDataSetObserver extends DataSetObserver {
        final ListPopupWindow this$0;

        PopupDataSetObserver(ListPopupWindow listPopupWindow, 1 1) {
            this(listPopupWindow);
        }

        public void onInvalidated() {
            this.this$0.dismiss();
        }

        public void onChanged() {
            if (this.this$0.isShowing()) {
                this.this$0.show();
            }
        }

        private PopupDataSetObserver(ListPopupWindow listPopupWindow) {
            this.this$0 = listPopupWindow;
        }
    }

    class PopupScrollListener implements OnScrollListener {
        final ListPopupWindow this$0;

        public void onScrollStateChanged(AbsListView absListView, int i) {
            if (i == 1 && !this.this$0.isInputMethodNotNeeded() && ListPopupWindow.access$1100(this.this$0).getContentView() != null) {
                ListPopupWindow.access$1300(this.this$0).removeCallbacks(ListPopupWindow.access$1200(this.this$0));
                ListPopupWindow.access$1200(this.this$0).run();
            }
        }

        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        }

        private PopupScrollListener(ListPopupWindow listPopupWindow) {
            this.this$0 = listPopupWindow;
        }

        PopupScrollListener(ListPopupWindow listPopupWindow, 1 1) {
            this(listPopupWindow);
        }
    }

    class PopupTouchInterceptor implements OnTouchListener {
        final ListPopupWindow this$0;

        PopupTouchInterceptor(ListPopupWindow listPopupWindow, 1 1) {
            this(listPopupWindow);
        }

        private PopupTouchInterceptor(ListPopupWindow listPopupWindow) {
            this.this$0 = listPopupWindow;
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTouch(android.view.View r7, android.view.MotionEvent r8) {
            /*
            r6 = this;
            r0 = r8.getAction();
            r1 = r8.getX();
            r1 = (int) r1;
            r2 = r8.getY();
            r2 = (int) r2;
            if (r0 != 0) goto L_0x0055;
        L_0x0010:
            r3 = r6.this$0;
            r3 = android.support.v7.widget.ListPopupWindow.access$1100(r3);
            if (r3 == 0) goto L_0x0055;
        L_0x0018:
            r3 = r6.this$0;
            r3 = android.support.v7.widget.ListPopupWindow.access$1100(r3);
            r3 = r3.isShowing();
            if (r3 == 0) goto L_0x0055;
        L_0x0024:
            if (r1 < 0) goto L_0x0055;
        L_0x0026:
            r3 = r6.this$0;
            r3 = android.support.v7.widget.ListPopupWindow.access$1100(r3);
            r3 = r3.getWidth();
            if (r1 >= r3) goto L_0x0055;
        L_0x0032:
            if (r2 < 0) goto L_0x0055;
        L_0x0034:
            r1 = r6.this$0;
            r1 = android.support.v7.widget.ListPopupWindow.access$1100(r1);
            r1 = r1.getHeight();
            if (r2 >= r1) goto L_0x0055;
        L_0x0040:
            r1 = r6.this$0;
            r1 = android.support.v7.widget.ListPopupWindow.access$1300(r1);
            r2 = r6.this$0;
            r2 = android.support.v7.widget.ListPopupWindow.access$1200(r2);
            r4 = 250; // 0xfa float:3.5E-43 double:1.235E-321;
            r1.postDelayed(r2, r4);
            r1 = android.support.v7.widget.LinearLayoutCompat.a;
            if (r1 == 0) goto L_0x0067;
        L_0x0055:
            r1 = 1;
            if (r0 != r1) goto L_0x0067;
        L_0x0058:
            r0 = r6.this$0;
            r0 = android.support.v7.widget.ListPopupWindow.access$1300(r0);
            r1 = r6.this$0;
            r1 = android.support.v7.widget.ListPopupWindow.access$1200(r1);
            r0.removeCallbacks(r1);
        L_0x0067:
            r0 = 0;
            return r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ListPopupWindow.PopupTouchInterceptor.onTouch(android.view.View, android.view.MotionEvent):boolean");
        }
    }

    class ResizePopupRunnable implements Runnable {
        final ListPopupWindow this$0;

        private ResizePopupRunnable(ListPopupWindow listPopupWindow) {
            this.this$0 = listPopupWindow;
        }

        ResizePopupRunnable(ListPopupWindow listPopupWindow, 1 1) {
            this(listPopupWindow);
        }

        public void run() {
            if (ListPopupWindow.access$600(this.this$0) != null && ViewCompat.isAttachedToWindow(ListPopupWindow.access$600(this.this$0)) && ListPopupWindow.access$600(this.this$0).getCount() > ListPopupWindow.access$600(this.this$0).getChildCount() && ListPopupWindow.access$600(this.this$0).getChildCount() <= this.this$0.mListItemExpandMaximum) {
                ListPopupWindow.access$1100(this.this$0).setInputMethodMode(2);
                this.this$0.show();
            }
        }
    }

    private static String z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 99;
                    break;
                case at.g /*1*/:
                    i2 = 38;
                    break;
                case at.i /*2*/:
                    i2 = 22;
                    break;
                case at.o /*3*/:
                    i2 = 125;
                    break;
                default:
                    i2 = 77;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    private static char[] z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 77);
        }
        return toCharArray;
    }

    public void setInputMethodMode(int i) {
        this.mPopup.setInputMethodMode(i);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        this.mPopup.setBackgroundDrawable(drawable);
    }

    public Drawable getBackground() {
        return this.mPopup.getBackground();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int buildDropDown() {
        /*
        r11 = this;
        r10 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r4 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        r3 = -1;
        r1 = 1;
        r2 = 0;
        r8 = android.support.v7.widget.LinearLayoutCompat.a;
        r0 = r11.mDropDownList;
        if (r0 != 0) goto L_0x01a1;
    L_0x000d:
        r5 = r11.mContext;
        r0 = new android.support.v7.widget.ListPopupWindow$2;
        r0.<init>(r11);
        r11.mShowDropDownRunnable = r0;
        r6 = new android.support.v7.widget.ListPopupWindow$DropDownListView;
        r0 = r11.mModal;
        if (r0 != 0) goto L_0x0127;
    L_0x001c:
        r0 = r1;
    L_0x001d:
        r6.<init>(r5, r0);
        r11.mDropDownList = r6;
        r0 = r11.mDropDownListHighlight;
        if (r0 == 0) goto L_0x002d;
    L_0x0026:
        r0 = r11.mDropDownList;
        r6 = r11.mDropDownListHighlight;
        r0.setSelector(r6);
    L_0x002d:
        r0 = r11.mDropDownList;
        r6 = r11.mAdapter;
        r0.setAdapter(r6);
        r0 = r11.mDropDownList;
        r6 = r11.mItemClickListener;
        r0.setOnItemClickListener(r6);
        r0 = r11.mDropDownList;
        r0.setFocusable(r1);
        r0 = r11.mDropDownList;
        r0.setFocusableInTouchMode(r1);
        r0 = r11.mDropDownList;
        r6 = new android.support.v7.widget.ListPopupWindow$3;
        r6.<init>(r11);
        r0.setOnItemSelectedListener(r6);
        r0 = r11.mDropDownList;
        r6 = r11.mScrollListener;
        r0.setOnScrollListener(r6);
        r0 = r11.mItemSelectedListener;
        if (r0 == 0) goto L_0x0061;
    L_0x005a:
        r0 = r11.mDropDownList;
        r6 = r11.mItemSelectedListener;
        r0.setOnItemSelectedListener(r6);
    L_0x0061:
        r0 = r11.mDropDownList;
        r7 = r11.mPromptView;
        if (r7 == 0) goto L_0x019d;
    L_0x0067:
        r6 = new android.widget.LinearLayout;
        r6.<init>(r5);
        r6.setOrientation(r1);
        r5 = new android.widget.LinearLayout$LayoutParams;
        r9 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r5.<init>(r3, r2, r9);
        r9 = r11.mPromptPosition;
        switch(r9) {
            case 0: goto L_0x0132;
            case 1: goto L_0x012a;
            default: goto L_0x007b;
        };
    L_0x007b:
        r0 = z;
        r0 = r0[r2];
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r9 = z;
        r9 = r9[r1];
        r5 = r5.append(r9);
        r9 = r11.mPromptPosition;
        r5 = r5.append(r9);
        r5 = r5.toString();
        android.util.Log.e(r0, r5);
    L_0x0099:
        r0 = r11.mDropDownWidth;
        if (r0 < 0) goto L_0x00a1;
    L_0x009d:
        r0 = r11.mDropDownWidth;
        if (r8 == 0) goto L_0x0199;
    L_0x00a1:
        r0 = r2;
        r5 = r2;
    L_0x00a3:
        r0 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r0);
        r7.measure(r0, r2);
        r0 = r7.getLayoutParams();
        r0 = (android.widget.LinearLayout.LayoutParams) r0;
        r5 = r7.getMeasuredHeight();
        r7 = r0.topMargin;
        r5 = r5 + r7;
        r0 = r0.bottomMargin;
        r0 = r0 + r5;
        r5 = r6;
    L_0x00bb:
        r6 = r11.mPopup;
        r6.setContentView(r5);
        if (r8 == 0) goto L_0x0196;
    L_0x00c2:
        r5 = r0;
    L_0x00c3:
        r0 = r11.mPopup;
        r0 = r0.getContentView();
        r0 = (android.view.ViewGroup) r0;
        r6 = r11.mPromptView;
        if (r6 == 0) goto L_0x0193;
    L_0x00cf:
        r0 = r6.getLayoutParams();
        r0 = (android.widget.LinearLayout.LayoutParams) r0;
        r5 = r6.getMeasuredHeight();
        r6 = r0.topMargin;
        r5 = r5 + r6;
        r0 = r0.bottomMargin;
        r0 = r0 + r5;
        r6 = r0;
    L_0x00e0:
        r0 = r11.mPopup;
        r0 = r0.getBackground();
        if (r0 == 0) goto L_0x0190;
    L_0x00e8:
        r5 = r11.mTempRect;
        r0.getPadding(r5);
        r0 = r11.mTempRect;
        r0 = r0.top;
        r5 = r11.mTempRect;
        r5 = r5.bottom;
        r0 = r0 + r5;
        r5 = r11.mDropDownVerticalOffsetSet;
        if (r5 != 0) goto L_0x0108;
    L_0x00fa:
        r5 = r11.mTempRect;
        r5 = r5.top;
        r5 = -r5;
        r11.mDropDownVerticalOffset = r5;
        if (r8 == 0) goto L_0x0108;
    L_0x0103:
        r5 = r11.mTempRect;
        r5.setEmpty();
    L_0x0108:
        r7 = r0;
        r0 = r11.mPopup;
        r0 = r0.getInputMethodMode();
        r5 = 2;
        if (r0 != r5) goto L_0x013c;
    L_0x0112:
        r0 = r11.getAnchorView();
        r5 = r11.mDropDownVerticalOffset;
        r5 = r11.getMaxAvailableHeight(r0, r5, r1);
        r0 = r11.mDropDownAlwaysVisible;
        if (r0 != 0) goto L_0x0124;
    L_0x0120:
        r0 = r11.mDropDownHeight;
        if (r0 != r3) goto L_0x013e;
    L_0x0124:
        r0 = r5 + r7;
    L_0x0126:
        return r0;
    L_0x0127:
        r0 = r2;
        goto L_0x001d;
    L_0x012a:
        r6.addView(r0, r5);
        r6.addView(r7);
        if (r8 == 0) goto L_0x0099;
    L_0x0132:
        r6.addView(r7);
        r6.addView(r0, r5);
        if (r8 == 0) goto L_0x0099;
    L_0x013a:
        goto L_0x007b;
    L_0x013c:
        r1 = r2;
        goto L_0x0112;
    L_0x013e:
        r0 = r11.mDropDownWidth;
        switch(r0) {
            case -2: goto L_0x0157;
            case -1: goto L_0x0173;
            default: goto L_0x0143;
        };
    L_0x0143:
        r0 = r11.mDropDownWidth;
        r1 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r10);
    L_0x0149:
        r0 = r11.mDropDownList;
        r4 = r5 - r6;
        r5 = r3;
        r0 = r0.measureHeightOfChildrenCompat(r1, r2, r3, r4, r5);
        if (r0 <= 0) goto L_0x0155;
    L_0x0154:
        r6 = r6 + r7;
    L_0x0155:
        r0 = r0 + r6;
        goto L_0x0126;
    L_0x0157:
        r0 = r11.mContext;
        r0 = r0.getResources();
        r0 = r0.getDisplayMetrics();
        r0 = r0.widthPixels;
        r1 = r11.mTempRect;
        r1 = r1.left;
        r9 = r11.mTempRect;
        r9 = r9.right;
        r1 = r1 + r9;
        r0 = r0 - r1;
        r1 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r4);
        if (r8 == 0) goto L_0x0149;
    L_0x0173:
        r0 = r11.mContext;
        r0 = r0.getResources();
        r0 = r0.getDisplayMetrics();
        r0 = r0.widthPixels;
        r1 = r11.mTempRect;
        r1 = r1.left;
        r4 = r11.mTempRect;
        r4 = r4.right;
        r1 = r1 + r4;
        r0 = r0 - r1;
        r1 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r10);
        if (r8 == 0) goto L_0x0149;
    L_0x018f:
        goto L_0x0143;
    L_0x0190:
        r0 = r2;
        goto L_0x0103;
    L_0x0193:
        r6 = r5;
        goto L_0x00e0;
    L_0x0196:
        r6 = r0;
        goto L_0x00e0;
    L_0x0199:
        r5 = r0;
        r0 = r4;
        goto L_0x00a3;
    L_0x019d:
        r5 = r0;
        r0 = r2;
        goto L_0x00bb;
    L_0x01a1:
        r5 = r2;
        goto L_0x00c3;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ListPopupWindow.buildDropDown():int");
    }

    public void setWidth(int i) {
        this.mDropDownWidth = i;
    }

    public boolean isShowing() {
        return this.mPopup.isShowing();
    }

    public ListPopupWindow(Context context) {
        this(context, null, R.attr.listPopupWindowStyle);
    }

    public void setVerticalOffset(int i) {
        this.mDropDownVerticalOffset = i;
        this.mDropDownVerticalOffsetSet = true;
    }

    public ListView getListView() {
        return this.mDropDownList;
    }

    public ListPopupWindow(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public int getWidth() {
        return this.mDropDownWidth;
    }

    public void setOnDismissListener(OnDismissListener onDismissListener) {
        this.mPopup.setOnDismissListener(onDismissListener);
    }

    public void setSelection(int i) {
        DropDownListView dropDownListView = this.mDropDownList;
        if (isShowing() && dropDownListView != null) {
            DropDownListView.access$502(dropDownListView, false);
            dropDownListView.setSelection(i);
            if (VERSION.SDK_INT >= 11 && dropDownListView.getChoiceMode() != 0) {
                dropDownListView.setItemChecked(i, true);
            }
        }
    }

    public boolean isInputMethodNotNeeded() {
        return this.mPopup.getInputMethodMode() == 2;
    }

    public void setContentWidth(int i) {
        Drawable background = this.mPopup.getBackground();
        if (background != null) {
            background.getPadding(this.mTempRect);
            this.mDropDownWidth = (this.mTempRect.left + this.mTempRect.right) + i;
            if (!LinearLayoutCompat.a) {
                return;
            }
        }
        setWidth(i);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void show() {
        /*
        r12 = this;
        r9 = 1;
        r11 = -2;
        r7 = 0;
        r6 = -1;
        r10 = android.support.v7.widget.LinearLayoutCompat.a;
        r8 = r12.buildDropDown();
        r2 = r12.isInputMethodNotNeeded();
        r0 = r12.mPopup;
        r1 = r12.mDropDownWindowLayoutType;
        android.support.v4.widget.PopupWindowCompat.setWindowLayoutType(r0, r1);
        r0 = r12.mPopup;
        r0 = r0.isShowing();
        if (r0 == 0) goto L_0x008b;
    L_0x001d:
        r0 = r12.mDropDownWidth;
        if (r0 != r6) goto L_0x0023;
    L_0x0021:
        if (r10 == 0) goto L_0x011a;
    L_0x0023:
        r0 = r12.mDropDownWidth;
        if (r0 != r11) goto L_0x0031;
    L_0x0027:
        r0 = r12.getAnchorView();
        r0 = r0.getWidth();
        if (r10 == 0) goto L_0x0117;
    L_0x0031:
        r0 = r12.mDropDownWidth;
        r4 = r0;
    L_0x0034:
        r0 = r12.mDropDownHeight;
        if (r0 != r6) goto L_0x005f;
    L_0x0038:
        if (r2 == 0) goto L_0x00ff;
    L_0x003a:
        r1 = r8;
    L_0x003b:
        if (r2 == 0) goto L_0x004e;
    L_0x003d:
        r2 = r12.mPopup;
        r0 = r12.mDropDownWidth;
        if (r0 != r6) goto L_0x0102;
    L_0x0043:
        r0 = r6;
    L_0x0044:
        r2.setWidth(r0);
        r0 = r12.mPopup;
        r0.setHeight(r7);
        if (r10 == 0) goto L_0x0114;
    L_0x004e:
        r2 = r12.mPopup;
        r0 = r12.mDropDownWidth;
        if (r0 != r6) goto L_0x0105;
    L_0x0054:
        r0 = r6;
    L_0x0055:
        r2.setWidth(r0);
        r0 = r12.mPopup;
        r0.setHeight(r6);
        if (r10 == 0) goto L_0x0114;
    L_0x005f:
        r0 = r12.mDropDownHeight;
        if (r0 != r11) goto L_0x0065;
    L_0x0063:
        if (r10 == 0) goto L_0x0111;
    L_0x0065:
        r0 = r12.mDropDownHeight;
        r5 = r0;
    L_0x0068:
        r1 = r12.mPopup;
        r0 = r12.mForceIgnoreOutsideTouch;
        if (r0 != 0) goto L_0x0108;
    L_0x006e:
        r0 = r12.mDropDownAlwaysVisible;
        if (r0 != 0) goto L_0x0108;
    L_0x0072:
        r0 = r9;
    L_0x0073:
        r1.setOutsideTouchable(r0);
        r0 = r12.mPopup;
        r1 = r12.getAnchorView();
        r2 = r12.mDropDownHorizontalOffset;
        r3 = r12.mDropDownVerticalOffset;
        if (r4 >= 0) goto L_0x0083;
    L_0x0082:
        r4 = r6;
    L_0x0083:
        if (r5 >= 0) goto L_0x0086;
    L_0x0085:
        r5 = r6;
    L_0x0086:
        r0.update(r1, r2, r3, r4, r5);
        if (r10 == 0) goto L_0x00fe;
    L_0x008b:
        r0 = r12.mDropDownWidth;
        if (r0 != r6) goto L_0x0091;
    L_0x008f:
        if (r10 == 0) goto L_0x010f;
    L_0x0091:
        r0 = r12.mDropDownWidth;
        if (r0 != r11) goto L_0x009f;
    L_0x0095:
        r0 = r12.getAnchorView();
        r0 = r0.getWidth();
        if (r10 == 0) goto L_0x00a1;
    L_0x009f:
        r0 = r12.mDropDownWidth;
    L_0x00a1:
        r1 = r12.mDropDownHeight;
        if (r1 != r6) goto L_0x00a7;
    L_0x00a5:
        if (r10 == 0) goto L_0x010d;
    L_0x00a7:
        r1 = r12.mDropDownHeight;
        if (r1 != r11) goto L_0x00ad;
    L_0x00ab:
        if (r10 == 0) goto L_0x00af;
    L_0x00ad:
        r8 = r12.mDropDownHeight;
    L_0x00af:
        r1 = r12.mPopup;
        r1.setWidth(r0);
        r0 = r12.mPopup;
        r0.setHeight(r8);
        r12.setPopupClipToScreenEnabled(r9);
        r0 = r12.mPopup;
        r1 = r12.mForceIgnoreOutsideTouch;
        if (r1 != 0) goto L_0x010b;
    L_0x00c2:
        r1 = r12.mDropDownAlwaysVisible;
        if (r1 != 0) goto L_0x010b;
    L_0x00c6:
        r0.setOutsideTouchable(r9);
        r0 = r12.mPopup;
        r1 = r12.mTouchInterceptor;
        r0.setTouchInterceptor(r1);
        r0 = r12.mPopup;
        r1 = r12.getAnchorView();
        r2 = r12.mDropDownHorizontalOffset;
        r3 = r12.mDropDownVerticalOffset;
        r4 = r12.mDropDownGravity;
        android.support.v4.widget.PopupWindowCompat.showAsDropDown(r0, r1, r2, r3, r4);
        r0 = r12.mDropDownList;
        r0.setSelection(r6);
        r0 = r12.mModal;
        if (r0 == 0) goto L_0x00f0;
    L_0x00e8:
        r0 = r12.mDropDownList;
        r0 = r0.isInTouchMode();
        if (r0 == 0) goto L_0x00f3;
    L_0x00f0:
        r12.clearListSelection();
    L_0x00f3:
        r0 = r12.mModal;
        if (r0 != 0) goto L_0x00fe;
    L_0x00f7:
        r0 = r12.mHandler;
        r1 = r12.mHideSelector;
        r0.post(r1);
    L_0x00fe:
        return;
    L_0x00ff:
        r1 = r6;
        goto L_0x003b;
    L_0x0102:
        r0 = r7;
        goto L_0x0044;
    L_0x0105:
        r0 = r7;
        goto L_0x0055;
    L_0x0108:
        r0 = r7;
        goto L_0x0073;
    L_0x010b:
        r9 = r7;
        goto L_0x00c6;
    L_0x010d:
        r8 = r6;
        goto L_0x00af;
    L_0x010f:
        r0 = r6;
        goto L_0x00a1;
    L_0x0111:
        r5 = r8;
        goto L_0x0068;
    L_0x0114:
        r5 = r1;
        goto L_0x0068;
    L_0x0117:
        r4 = r0;
        goto L_0x0034;
    L_0x011a:
        r4 = r6;
        goto L_0x0034;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ListPopupWindow.show():void");
    }

    public int getHorizontalOffset() {
        return this.mDropDownHorizontalOffset;
    }

    static ResizePopupRunnable access$1200(ListPopupWindow listPopupWindow) {
        return listPopupWindow.mResizePopupRunnable;
    }

    private void removePromptView() {
        if (this.mPromptView != null) {
            ViewParent parent = this.mPromptView.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.mPromptView);
            }
        }
    }

    private int getMaxAvailableHeight(View view, int i, boolean z) {
        if (sGetMaxAvailableHeightMethod != null) {
            try {
                return ((Integer) sGetMaxAvailableHeightMethod.invoke(this.mPopup, new Object[]{view, Integer.valueOf(i), Boolean.valueOf(z)})).intValue();
            } catch (Exception e) {
                Log.i(z[2], z[3]);
            }
        }
        return this.mPopup.getMaxAvailableHeight(view, i);
    }

    public int getVerticalOffset() {
        if (this.mDropDownVerticalOffsetSet) {
            return this.mDropDownVerticalOffset;
        }
        return 0;
    }

    static DropDownListView access$600(ListPopupWindow listPopupWindow) {
        return listPopupWindow.mDropDownList;
    }

    public View getAnchorView() {
        return this.mDropDownAnchorView;
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.mItemClickListener = onItemClickListener;
    }

    public void clearListSelection() {
        DropDownListView dropDownListView = this.mDropDownList;
        if (dropDownListView != null) {
            DropDownListView.access$502(dropDownListView, true);
            dropDownListView.requestLayout();
        }
    }

    public void setHorizontalOffset(int i) {
        this.mDropDownHorizontalOffset = i;
    }

    public ListPopupWindow(Context context, AttributeSet attributeSet, int i, int i2) {
        this.mDropDownHeight = -2;
        this.mDropDownWidth = -2;
        this.mDropDownWindowLayoutType = 1002;
        this.mDropDownGravity = 0;
        this.mDropDownAlwaysVisible = false;
        this.mForceIgnoreOutsideTouch = false;
        this.mListItemExpandMaximum = Integer.MAX_VALUE;
        this.mPromptPosition = 0;
        this.mResizePopupRunnable = new ResizePopupRunnable(this, null);
        this.mTouchInterceptor = new PopupTouchInterceptor(this, null);
        this.mScrollListener = new PopupScrollListener(this, null);
        this.mHideSelector = new ListSelectorHider(this, null);
        this.mTempRect = new Rect();
        this.mContext = context;
        this.mHandler = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ListPopupWindow, i, i2);
        this.mDropDownHorizontalOffset = obtainStyledAttributes.getDimensionPixelOffset(R.styleable.ListPopupWindow_android_dropDownHorizontalOffset, 0);
        this.mDropDownVerticalOffset = obtainStyledAttributes.getDimensionPixelOffset(R.styleable.ListPopupWindow_android_dropDownVerticalOffset, 0);
        if (this.mDropDownVerticalOffset != 0) {
            this.mDropDownVerticalOffsetSet = true;
        }
        obtainStyledAttributes.recycle();
        this.mPopup = new AppCompatPopupWindow(context, attributeSet, i);
        this.mPopup.setInputMethodMode(1);
        this.mLayoutDirection = TextUtilsCompat.getLayoutDirectionFromLocale(this.mContext.getResources().getConfiguration().locale);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setAdapter(android.widget.ListAdapter r3) {
        /*
        r2 = this;
        r0 = r2.mObserver;
        if (r0 != 0) goto L_0x0010;
    L_0x0004:
        r0 = new android.support.v7.widget.ListPopupWindow$PopupDataSetObserver;
        r1 = 0;
        r0.<init>(r2, r1);
        r2.mObserver = r0;
        r0 = android.support.v7.widget.LinearLayoutCompat.a;
        if (r0 == 0) goto L_0x001b;
    L_0x0010:
        r0 = r2.mAdapter;
        if (r0 == 0) goto L_0x001b;
    L_0x0014:
        r0 = r2.mAdapter;
        r1 = r2.mObserver;
        r0.unregisterDataSetObserver(r1);
    L_0x001b:
        r2.mAdapter = r3;
        r0 = r2.mAdapter;
        if (r0 == 0) goto L_0x0026;
    L_0x0021:
        r0 = r2.mObserver;
        r3.registerDataSetObserver(r0);
    L_0x0026:
        r0 = r2.mDropDownList;
        if (r0 == 0) goto L_0x0031;
    L_0x002a:
        r0 = r2.mDropDownList;
        r1 = r2.mAdapter;
        r0.setAdapter(r1);
    L_0x0031:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ListPopupWindow.setAdapter(android.widget.ListAdapter):void");
    }

    public void dismiss() {
        this.mPopup.dismiss();
        removePromptView();
        this.mPopup.setContentView(null);
        this.mDropDownList = null;
        this.mHandler.removeCallbacks(this.mResizePopupRunnable);
    }

    public void setDropDownGravity(int i) {
        this.mDropDownGravity = i;
    }

    public void setPromptPosition(int i) {
        this.mPromptPosition = i;
    }

    public void setModal(boolean z) {
        this.mModal = z;
        this.mPopup.setFocusable(z);
    }

    static {
        /* JADX: method processing error */
/*
        Error: jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:42)
	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:66)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:33)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:281)
	at jadx.api.JavaClass.decompile(JavaClass.java:59)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:161)
*/
        /*
        r5 = 3;
        r4 = 2;
        r3 = 1;
        r1 = -1;
        r2 = 0;
        r0 = 6;
        r6 = new java.lang.String[r0];
        r0 = "/Oe\t\u001d\fVc\r\u001a\nHr\u0012:";
        r7 = r2;
        r8 = r6;
        r9 = r6;
        r6 = r0;
        r0 = r1;
    L_0x0010:
        r6 = z(r6);
        r6 = z(r6);
        switch(r0) {
            case 0: goto L_0x0025;
            case 1: goto L_0x002f;
            case 2: goto L_0x0039;
            case 3: goto L_0x0044;
            case 4: goto L_0x004d;
            default: goto L_0x001b;
        };
    L_0x001b:
        r8[r7] = r6;
        r0 = "*H`\u001c!\nB6\u0015$\rR6\r\"\u0010Ob\u0014\"\r\u0006";
        r6 = r0;
        r7 = r3;
        r8 = r9;
        r0 = r2;
        goto L_0x0010;
    L_0x0025:
        r8[r7] = r6;
        r0 = "/Oe\t\u001d\fVc\r\u001a\nHr\u0012:";
        r6 = r0;
        r7 = r4;
        r8 = r9;
        r0 = r3;
        goto L_0x0010;
    L_0x002f:
        r8[r7] = r6;
        r0 = " Ic\u0011)CHy\tm\u0000Gz\u0011m\u0004Cb0,\u001bg`\u001c$\u000fGt\u0011(+C\u007f\u001a%\u0017ks\t%\fB>+$\u0006Q:]$\rR:]/\fIz\u0018,\r\u000f6\u0012#Cvy\r8\u0013q\u007f\u0013)\fQ8]\u0018\u0010Ox\u001am\u0017Ns]=\u0016Dz\u0014.CPs\u000f>\nIxS";
        r6 = r0;
        r7 = r5;
        r8 = r9;
        r0 = r4;
        goto L_0x0010;
    L_0x0039:
        r8[r7] = r6;
        r6 = 4;
        r0 = "/Oe\t\u001d\fVc\r\u001a\nHr\u0012:";
        r7 = r6;
        r8 = r9;
        r6 = r0;
        r0 = r5;
        goto L_0x0010;
    L_0x0044:
        r8[r7] = r6;
        r7 = 5;
        r6 = " Ic\u0011)CHy\tm\u0000Gz\u0011m\u0010Cb>!\nVB\u0012\u001e\u0000Ts\u0018#&Hw\u001f!\u0006B>Tm\fH6-\"\u0013Sf*$\rBy\ncCi~]:\u0006JzS";
        r0 = 4;
        r8 = r9;
        goto L_0x0010;
    L_0x004d:
        r8[r7] = r6;
        z = r9;
        r3 = android.widget.PopupWindow.class;	 Catch:{ NoSuchMethodException -> 0x007b }
        r0 = "\u0010Cb>!\nVB\u0012\u001e\u0000Ts\u0018#&Hw\u001f!\u0006B";	 Catch:{ NoSuchMethodException -> 0x007b }
        r4 = r3;
        r3 = r0;
        r0 = r1;
    L_0x0059:
        r3 = z(r3);
        r3 = z(r3);
        switch(r0) {
            case 0: goto L_0x00a0;
            default: goto L_0x0064;
        };
    L_0x0064:
        r0 = 1;
        r0 = new java.lang.Class[r0];	 Catch:{ NoSuchMethodException -> 0x007b }
        r5 = 0;	 Catch:{ NoSuchMethodException -> 0x007b }
        r6 = java.lang.Boolean.TYPE;	 Catch:{ NoSuchMethodException -> 0x007b }
        r0[r5] = r6;	 Catch:{ NoSuchMethodException -> 0x007b }
        r0 = r4.getDeclaredMethod(r3, r0);	 Catch:{ NoSuchMethodException -> 0x007b }
        sClipToWindowEnabledMethod = r0;	 Catch:{ NoSuchMethodException -> 0x007b }
    L_0x0072:
        r3 = android.widget.PopupWindow.class;	 Catch:{ NoSuchMethodException -> 0x00b9 }
        r0 = "\u0004Cb0,\u001bg`\u001c$\u000fGt\u0011(+C\u007f\u001a%\u0017";	 Catch:{ NoSuchMethodException -> 0x00b9 }
        r4 = r3;
        r3 = r0;
        r0 = r2;
        goto L_0x0059;
    L_0x007b:
        r0 = move-exception;
        r0 = "/Oe\t\u001d\fVc\r\u001a\nHr\u0012:";
        r3 = r0;
        r0 = r1;
    L_0x0081:
        r3 = z(r3);
        r4 = z(r3);
        switch(r0) {
            case 0: goto L_0x00c0;
            default: goto L_0x008c;
        };
    L_0x008c:
        r0 = " Ic\u0011)CHy\tm\u0005Ox\u0019m\u000eCb\u0015\"\u0007\u0006e\u00189 J\u007f\r\u0019\fuu\u000f(\u0006HS\u0013,\u0001Js\u0019eJ\u0006y\u0013m3If\b=4Ox\u0019\"\u0014\b62%CQs\u0011!M";
        r3 = r0;
        r0 = r1;
    L_0x0091:
        r3 = z(r3);
        r3 = z(r3);
        switch(r0) {
            case 0: goto L_0x00c6;
            default: goto L_0x009c;
        };
    L_0x009c:
        android.util.Log.i(r4, r3);
        goto L_0x0072;
    L_0x00a0:
        r0 = 3;
        r0 = new java.lang.Class[r0];	 Catch:{ NoSuchMethodException -> 0x00b9 }
        r5 = 0;	 Catch:{ NoSuchMethodException -> 0x00b9 }
        r6 = android.view.View.class;	 Catch:{ NoSuchMethodException -> 0x00b9 }
        r0[r5] = r6;	 Catch:{ NoSuchMethodException -> 0x00b9 }
        r5 = 1;	 Catch:{ NoSuchMethodException -> 0x00b9 }
        r6 = java.lang.Integer.TYPE;	 Catch:{ NoSuchMethodException -> 0x00b9 }
        r0[r5] = r6;	 Catch:{ NoSuchMethodException -> 0x00b9 }
        r5 = 2;	 Catch:{ NoSuchMethodException -> 0x00b9 }
        r6 = java.lang.Boolean.TYPE;	 Catch:{ NoSuchMethodException -> 0x00b9 }
        r0[r5] = r6;	 Catch:{ NoSuchMethodException -> 0x00b9 }
        r0 = r4.getDeclaredMethod(r3, r0);	 Catch:{ NoSuchMethodException -> 0x00b9 }
        sGetMaxAvailableHeightMethod = r0;	 Catch:{ NoSuchMethodException -> 0x00b9 }
    L_0x00b8:
        return;
    L_0x00b9:
        r0 = move-exception;
        r0 = "/Oe\t\u001d\fVc\r\u001a\nHr\u0012:";
        r3 = r0;
        r0 = r2;
        goto L_0x0081;
    L_0x00c0:
        r0 = " Ic\u0011)CHy\tm\u0005Ox\u0019m\u000eCb\u0015\"\u0007\u0006q\u00189.Gn<;\u0002Oz\u001c/\u000fC^\u0018$\u0004NbU\u001b\nCaQm\nHbQm\u0001Iy\u0011(\u0002H?]\"\r\u0006F\u0012=\u0016VA\u0014#\u0007IaSm,N6\n(\u000fJ8";
        r3 = r0;
        r0 = r2;
        goto L_0x0091;
    L_0x00c6:
        android.util.Log.i(r4, r3);
        goto L_0x00b8;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ListPopupWindow.<clinit>():void");
    }

    static Handler access$1300(ListPopupWindow listPopupWindow) {
        return listPopupWindow.mHandler;
    }

    private void setPopupClipToScreenEnabled(boolean z) {
        if (sClipToWindowEnabledMethod != null) {
            try {
                sClipToWindowEnabledMethod.invoke(this.mPopup, new Object[]{Boolean.valueOf(z)});
            } catch (Exception e) {
                Log.i(z[4], z[5]);
            }
        }
    }

    static PopupWindow access$1100(ListPopupWindow listPopupWindow) {
        return listPopupWindow.mPopup;
    }

    public void setAnchorView(View view) {
        this.mDropDownAnchorView = view;
    }
}
