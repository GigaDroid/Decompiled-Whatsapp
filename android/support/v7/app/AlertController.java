package android.support.v7.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnKeyListener;
import android.content.DialogInterface.OnMultiChoiceClickListener;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewCompat;
import android.support.v4.widget.NestedScrollView;
import android.support.v4.widget.NestedScrollView.OnScrollChangeListener;
import android.support.v7.appcompat.R;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import org.v;
import org.whispersystems.at;

class AlertController {
    private static final String z;
    private ListAdapter mAdapter;
    private int mAlertDialogLayout;
    private final OnClickListener mButtonHandler;
    private Button mButtonNegative;
    private Message mButtonNegativeMessage;
    private CharSequence mButtonNegativeText;
    private Button mButtonNeutral;
    private Message mButtonNeutralMessage;
    private CharSequence mButtonNeutralText;
    private int mButtonPanelLayoutHint;
    private int mButtonPanelSideLayout;
    private Button mButtonPositive;
    private Message mButtonPositiveMessage;
    private CharSequence mButtonPositiveText;
    private int mCheckedItem;
    private final Context mContext;
    private View mCustomTitleView;
    private final AppCompatDialog mDialog;
    private Handler mHandler;
    private Drawable mIcon;
    private int mIconId;
    private ImageView mIconView;
    private int mListItemLayout;
    private int mListLayout;
    private ListView mListView;
    private CharSequence mMessage;
    private TextView mMessageView;
    private int mMultiChoiceItemLayout;
    private NestedScrollView mScrollView;
    private int mSingleChoiceItemLayout;
    private CharSequence mTitle;
    private TextView mTitleView;
    private View mView;
    private int mViewLayoutResId;
    private int mViewSpacingBottom;
    private int mViewSpacingLeft;
    private int mViewSpacingRight;
    private boolean mViewSpacingSpecified;
    private int mViewSpacingTop;
    private final Window mWindow;

    class 1 implements OnClickListener {
        final AlertController this$0;

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onClick(android.view.View r4) {
            /*
            r3 = this;
            r1 = android.support.v7.app.ActionBar.a;
            r0 = r3.this$0;
            r0 = android.support.v7.app.AlertController.access$000(r0);
            if (r4 != r0) goto L_0x001e;
        L_0x000a:
            r0 = r3.this$0;
            r0 = android.support.v7.app.AlertController.access$100(r0);
            if (r0 == 0) goto L_0x001e;
        L_0x0012:
            r0 = r3.this$0;
            r0 = android.support.v7.app.AlertController.access$100(r0);
            r0 = android.os.Message.obtain(r0);
            if (r1 == 0) goto L_0x0057;
        L_0x001e:
            r0 = r3.this$0;
            r0 = android.support.v7.app.AlertController.access$200(r0);
            if (r4 != r0) goto L_0x003a;
        L_0x0026:
            r0 = r3.this$0;
            r0 = android.support.v7.app.AlertController.access$300(r0);
            if (r0 == 0) goto L_0x003a;
        L_0x002e:
            r0 = r3.this$0;
            r0 = android.support.v7.app.AlertController.access$300(r0);
            r0 = android.os.Message.obtain(r0);
            if (r1 == 0) goto L_0x0057;
        L_0x003a:
            r0 = r3.this$0;
            r0 = android.support.v7.app.AlertController.access$400(r0);
            if (r4 != r0) goto L_0x0056;
        L_0x0042:
            r0 = r3.this$0;
            r0 = android.support.v7.app.AlertController.access$500(r0);
            if (r0 == 0) goto L_0x0056;
        L_0x004a:
            r0 = r3.this$0;
            r0 = android.support.v7.app.AlertController.access$500(r0);
            r0 = android.os.Message.obtain(r0);
            if (r1 == 0) goto L_0x0057;
        L_0x0056:
            r0 = 0;
        L_0x0057:
            if (r0 == 0) goto L_0x005c;
        L_0x0059:
            r0.sendToTarget();
        L_0x005c:
            r0 = r3.this$0;
            r0 = android.support.v7.app.AlertController.access$700(r0);
            r1 = 1;
            r2 = r3.this$0;
            r2 = android.support.v7.app.AlertController.access$600(r2);
            r0 = r0.obtainMessage(r1, r2);
            r0.sendToTarget();
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v7.app.AlertController.1.onClick(android.view.View):void");
        }

        1(AlertController alertController) {
            this.this$0 = alertController;
        }
    }

    class 2 implements OnScrollChangeListener {
        final AlertController this$0;
        final View val$bottom;
        final View val$top;

        public void onScrollChange(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
            AlertController.access$800(nestedScrollView, this.val$top, this.val$bottom);
        }

        2(AlertController alertController, View view, View view2) {
            this.this$0 = alertController;
            this.val$top = view;
            this.val$bottom = view2;
        }
    }

    class 3 implements Runnable {
        final AlertController this$0;
        final View val$bottom;
        final View val$top;

        3(AlertController alertController, View view, View view2) {
            this.this$0 = alertController;
            this.val$top = view;
            this.val$bottom = view2;
        }

        public void run() {
            AlertController.access$800(AlertController.access$900(this.this$0), this.val$top, this.val$bottom);
        }
    }

    class 4 implements OnScrollListener {
        final AlertController this$0;
        final View val$bottom;
        final View val$top;

        4(AlertController alertController, View view, View view2) {
            this.this$0 = alertController;
            this.val$top = view;
            this.val$bottom = view2;
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
        }

        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            AlertController.access$800(absListView, this.val$top, this.val$bottom);
        }
    }

    class 5 implements Runnable {
        final AlertController this$0;
        final View val$bottom;
        final View val$top;

        public void run() {
            AlertController.access$800(AlertController.access$1000(this.this$0), this.val$top, this.val$bottom);
        }

        5(AlertController alertController, View view, View view2) {
            this.this$0 = alertController;
            this.val$top = view;
            this.val$bottom = view2;
        }
    }

    public class AlertParams {
        private static final String z;
        public ListAdapter mAdapter;
        public boolean mCancelable;
        public int mCheckedItem;
        public boolean[] mCheckedItems;
        public final Context mContext;
        public Cursor mCursor;
        public View mCustomTitleView;
        public Drawable mIcon;
        public int mIconAttrId;
        public int mIconId;
        public final LayoutInflater mInflater;
        public String mIsCheckedColumn;
        public boolean mIsMultiChoice;
        public boolean mIsSingleChoice;
        public CharSequence[] mItems;
        public String mLabelColumn;
        public CharSequence mMessage;
        public DialogInterface.OnClickListener mNegativeButtonListener;
        public CharSequence mNegativeButtonText;
        public DialogInterface.OnClickListener mNeutralButtonListener;
        public CharSequence mNeutralButtonText;
        public OnCancelListener mOnCancelListener;
        public OnMultiChoiceClickListener mOnCheckboxClickListener;
        public DialogInterface.OnClickListener mOnClickListener;
        public OnDismissListener mOnDismissListener;
        public OnItemSelectedListener mOnItemSelectedListener;
        public OnKeyListener mOnKeyListener;
        public OnPrepareListViewListener mOnPrepareListViewListener;
        public DialogInterface.OnClickListener mPositiveButtonListener;
        public CharSequence mPositiveButtonText;
        public boolean mRecycleOnMeasure;
        public CharSequence mTitle;
        public View mView;
        public int mViewLayoutResId;
        public int mViewSpacingBottom;
        public int mViewSpacingLeft;
        public int mViewSpacingRight;
        public boolean mViewSpacingSpecified;
        public int mViewSpacingTop;

        class 1 extends ArrayAdapter {
            final AlertParams this$0;
            final ListView val$listView;

            1(AlertParams alertParams, Context context, int i, int i2, CharSequence[] charSequenceArr, ListView listView) {
                this.this$0 = alertParams;
                this.val$listView = listView;
                super(context, i, i2, charSequenceArr);
            }

            public View getView(int i, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i, view, viewGroup);
                if (this.this$0.mCheckedItems != null && this.this$0.mCheckedItems[i]) {
                    this.val$listView.setItemChecked(i, true);
                }
                return view2;
            }
        }

        class 2 extends CursorAdapter {
            private final int mIsCheckedIndex;
            private final int mLabelIndex;
            final AlertParams this$0;
            final AlertController val$dialog;
            final ListView val$listView;

            2(AlertParams alertParams, Context context, Cursor cursor, boolean z, ListView listView, AlertController alertController) {
                this.this$0 = alertParams;
                this.val$listView = listView;
                this.val$dialog = alertController;
                super(context, cursor, z);
                Cursor cursor2 = getCursor();
                this.mLabelIndex = cursor2.getColumnIndexOrThrow(this.this$0.mLabelColumn);
                this.mIsCheckedIndex = cursor2.getColumnIndexOrThrow(this.this$0.mIsCheckedColumn);
            }

            public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                return this.this$0.mInflater.inflate(AlertController.access$1200(this.val$dialog), viewGroup, false);
            }

            public void bindView(View view, Context context, Cursor cursor) {
                ((CheckedTextView) view.findViewById(16908308)).setText(cursor.getString(this.mLabelIndex));
                this.val$listView.setItemChecked(cursor.getPosition(), cursor.getInt(this.mIsCheckedIndex) == 1);
            }
        }

        class 3 implements OnItemClickListener {
            final AlertParams this$0;
            final AlertController val$dialog;

            3(AlertParams alertParams, AlertController alertController) {
                this.this$0 = alertParams;
                this.val$dialog = alertController;
            }

            public void onItemClick(AdapterView adapterView, View view, int i, long j) {
                this.this$0.mOnClickListener.onClick(AlertController.access$600(this.val$dialog), i);
                if (!this.this$0.mIsSingleChoice) {
                    AlertController.access$600(this.val$dialog).dismiss();
                }
            }
        }

        class 4 implements OnItemClickListener {
            final AlertParams this$0;
            final AlertController val$dialog;
            final ListView val$listView;

            public void onItemClick(AdapterView adapterView, View view, int i, long j) {
                if (this.this$0.mCheckedItems != null) {
                    this.this$0.mCheckedItems[i] = this.val$listView.isItemChecked(i);
                }
                this.this$0.mOnCheckboxClickListener.onClick(AlertController.access$600(this.val$dialog), i, this.val$listView.isItemChecked(i));
            }

            4(AlertParams alertParams, ListView listView, AlertController alertController) {
                this.this$0 = alertParams;
                this.val$listView = listView;
                this.val$dialog = alertController;
            }
        }

        public interface OnPrepareListViewListener {
            void onPrepareListView(ListView listView);
        }

        static {
            char[] toCharArray = "\"6)[\\:\b9ZO\"6$Q[".toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i = 0; length > i; i++) {
                int i2;
                char c = cArr[i];
                switch (i % 5) {
                    case v.m /*0*/:
                        i2 = 78;
                        break;
                    case at.g /*1*/:
                        i2 = 87;
                        break;
                    case at.i /*2*/:
                        i2 = 80;
                        break;
                    case at.o /*3*/:
                        i2 = 52;
                        break;
                    default:
                        i2 = 41;
                        break;
                }
                cArr[i] = (char) (i2 ^ c);
            }
            z = new String(cArr).intern();
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void apply(android.support.v7.app.AlertController r8) {
            /*
            r7 = this;
            r3 = 0;
            r6 = android.support.v7.app.ActionBar.a;
            r0 = r7.mCustomTitleView;
            if (r0 == 0) goto L_0x000e;
        L_0x0007:
            r0 = r7.mCustomTitleView;
            r8.setCustomTitle(r0);
            if (r6 == 0) goto L_0x0036;
        L_0x000e:
            r0 = r7.mTitle;
            if (r0 == 0) goto L_0x0017;
        L_0x0012:
            r0 = r7.mTitle;
            r8.setTitle(r0);
        L_0x0017:
            r0 = r7.mIcon;
            if (r0 == 0) goto L_0x0020;
        L_0x001b:
            r0 = r7.mIcon;
            r8.setIcon(r0);
        L_0x0020:
            r0 = r7.mIconId;
            if (r0 == 0) goto L_0x0029;
        L_0x0024:
            r0 = r7.mIconId;
            r8.setIcon(r0);
        L_0x0029:
            r0 = r7.mIconAttrId;
            if (r0 == 0) goto L_0x0036;
        L_0x002d:
            r0 = r7.mIconAttrId;
            r0 = r8.getIconAttributeResId(r0);
            r8.setIcon(r0);
        L_0x0036:
            r0 = r7.mMessage;
            if (r0 == 0) goto L_0x003f;
        L_0x003a:
            r0 = r7.mMessage;
            r8.setMessage(r0);
        L_0x003f:
            r0 = r7.mPositiveButtonText;
            if (r0 == 0) goto L_0x004b;
        L_0x0043:
            r0 = -1;
            r1 = r7.mPositiveButtonText;
            r2 = r7.mPositiveButtonListener;
            r8.setButton(r0, r1, r2, r3);
        L_0x004b:
            r0 = r7.mNegativeButtonText;
            if (r0 == 0) goto L_0x0057;
        L_0x004f:
            r0 = -2;
            r1 = r7.mNegativeButtonText;
            r2 = r7.mNegativeButtonListener;
            r8.setButton(r0, r1, r2, r3);
        L_0x0057:
            r0 = r7.mNeutralButtonText;
            if (r0 == 0) goto L_0x0063;
        L_0x005b:
            r0 = -3;
            r1 = r7.mNeutralButtonText;
            r2 = r7.mNeutralButtonListener;
            r8.setButton(r0, r1, r2, r3);
        L_0x0063:
            r0 = r7.mItems;
            if (r0 != 0) goto L_0x006f;
        L_0x0067:
            r0 = r7.mCursor;
            if (r0 != 0) goto L_0x006f;
        L_0x006b:
            r0 = r7.mAdapter;
            if (r0 == 0) goto L_0x0072;
        L_0x006f:
            r7.createListView(r8);
        L_0x0072:
            r0 = r7.mView;
            if (r0 == 0) goto L_0x0091;
        L_0x0076:
            r0 = r7.mViewSpacingSpecified;
            if (r0 == 0) goto L_0x008a;
        L_0x007a:
            r1 = r7.mView;
            r2 = r7.mViewSpacingLeft;
            r3 = r7.mViewSpacingTop;
            r4 = r7.mViewSpacingRight;
            r5 = r7.mViewSpacingBottom;
            r0 = r8;
            r0.setView(r1, r2, r3, r4, r5);
            if (r6 == 0) goto L_0x009a;
        L_0x008a:
            r0 = r7.mView;
            r8.setView(r0);
            if (r6 == 0) goto L_0x009a;
        L_0x0091:
            r0 = r7.mViewLayoutResId;
            if (r0 == 0) goto L_0x009a;
        L_0x0095:
            r0 = r7.mViewLayoutResId;
            r8.setView(r0);
        L_0x009a:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v7.app.AlertController.AlertParams.apply(android.support.v7.app.AlertController):void");
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void createListView(android.support.v7.app.AlertController r11) {
            /*
            r10 = this;
            r8 = android.support.v7.app.ActionBar.a;
            r0 = r10.mInflater;
            r1 = android.support.v7.app.AlertController.access$1100(r11);
            r2 = 0;
            r6 = r0.inflate(r1, r2);
            r6 = (android.widget.ListView) r6;
            r0 = r10.mIsMultiChoice;
            if (r0 == 0) goto L_0x0038;
        L_0x0013:
            r0 = r10.mCursor;
            if (r0 != 0) goto L_0x002a;
        L_0x0017:
            r0 = new android.support.v7.app.AlertController$AlertParams$1;
            r2 = r10.mContext;
            r3 = android.support.v7.app.AlertController.access$1200(r11);
            r4 = 16908308; // 0x1020014 float:2.3877285E-38 double:8.353814E-317;
            r5 = r10.mItems;
            r1 = r10;
            r0.<init>(r1, r2, r3, r4, r5, r6);
            if (r8 == 0) goto L_0x007a;
        L_0x002a:
            r1 = new android.support.v7.app.AlertController$AlertParams$2;
            r3 = r10.mContext;
            r4 = r10.mCursor;
            r5 = 0;
            r2 = r10;
            r7 = r11;
            r1.<init>(r2, r3, r4, r5, r6, r7);
            if (r8 == 0) goto L_0x00c4;
        L_0x0038:
            r0 = r10.mIsSingleChoice;
            if (r0 == 0) goto L_0x0042;
        L_0x003c:
            r2 = android.support.v7.app.AlertController.access$1300(r11);
            if (r8 == 0) goto L_0x0046;
        L_0x0042:
            r2 = android.support.v7.app.AlertController.access$1400(r11);
        L_0x0046:
            r0 = r10.mCursor;
            if (r0 == 0) goto L_0x0066;
        L_0x004a:
            r0 = new android.widget.SimpleCursorAdapter;
            r1 = r10.mContext;
            r3 = r10.mCursor;
            r4 = 1;
            r4 = new java.lang.String[r4];
            r5 = 0;
            r7 = r10.mLabelColumn;
            r4[r5] = r7;
            r5 = 1;
            r5 = new int[r5];
            r7 = 0;
            r9 = 16908308; // 0x1020014 float:2.3877285E-38 double:8.353814E-317;
            r5[r7] = r9;
            r0.<init>(r1, r2, r3, r4, r5);
            if (r8 == 0) goto L_0x007a;
        L_0x0066:
            r0 = r10.mAdapter;
            if (r0 == 0) goto L_0x006e;
        L_0x006a:
            r0 = r10.mAdapter;
            if (r8 == 0) goto L_0x007a;
        L_0x006e:
            r0 = new android.support.v7.app.AlertController$CheckedItemAdapter;
            r1 = r10.mContext;
            r3 = 16908308; // 0x1020014 float:2.3877285E-38 double:8.353814E-317;
            r4 = r10.mItems;
            r0.<init>(r1, r2, r3, r4);
        L_0x007a:
            r1 = r10.mOnPrepareListViewListener;
            if (r1 == 0) goto L_0x0083;
        L_0x007e:
            r1 = r10.mOnPrepareListViewListener;
            r1.onPrepareListView(r6);
        L_0x0083:
            android.support.v7.app.AlertController.access$1502(r11, r0);
            r0 = r10.mCheckedItem;
            android.support.v7.app.AlertController.access$1602(r11, r0);
            r0 = r10.mOnClickListener;
            if (r0 == 0) goto L_0x0099;
        L_0x008f:
            r0 = new android.support.v7.app.AlertController$AlertParams$3;
            r0.<init>(r10, r11);
            r6.setOnItemClickListener(r0);
            if (r8 == 0) goto L_0x00a5;
        L_0x0099:
            r0 = r10.mOnCheckboxClickListener;
            if (r0 == 0) goto L_0x00a5;
        L_0x009d:
            r0 = new android.support.v7.app.AlertController$AlertParams$4;
            r0.<init>(r10, r6, r11);
            r6.setOnItemClickListener(r0);
        L_0x00a5:
            r0 = r10.mOnItemSelectedListener;
            if (r0 == 0) goto L_0x00ae;
        L_0x00a9:
            r0 = r10.mOnItemSelectedListener;
            r6.setOnItemSelectedListener(r0);
        L_0x00ae:
            r0 = r10.mIsSingleChoice;
            if (r0 == 0) goto L_0x00b8;
        L_0x00b2:
            r0 = 1;
            r6.setChoiceMode(r0);
            if (r8 == 0) goto L_0x00c0;
        L_0x00b8:
            r0 = r10.mIsMultiChoice;
            if (r0 == 0) goto L_0x00c0;
        L_0x00bc:
            r0 = 2;
            r6.setChoiceMode(r0);
        L_0x00c0:
            android.support.v7.app.AlertController.access$1002(r11, r6);
            return;
        L_0x00c4:
            r0 = r1;
            goto L_0x007a;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v7.app.AlertController.AlertParams.createListView(android.support.v7.app.AlertController):void");
        }

        public AlertParams(Context context) {
            this.mIconId = 0;
            this.mIconAttrId = 0;
            this.mViewSpacingSpecified = false;
            this.mCheckedItem = -1;
            this.mRecycleOnMeasure = true;
            this.mContext = context;
            this.mCancelable = true;
            this.mInflater = (LayoutInflater) context.getSystemService(z);
        }
    }

    final class ButtonHandler extends Handler {
        private WeakReference mDialog;

        public ButtonHandler(DialogInterface dialogInterface) {
            this.mDialog = new WeakReference(dialogInterface);
        }

        public void handleMessage(Message message) {
            switch (message.what) {
                case -3:
                case -2:
                case -1:
                    ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.mDialog.get(), message.what);
                    if (!ActionBar.a) {
                        return;
                    }
                    break;
                case at.g /*1*/:
                    break;
                default:
                    return;
            }
            ((DialogInterface) message.obj).dismiss();
        }
    }

    class CheckedItemAdapter extends ArrayAdapter {
        public boolean hasStableIds() {
            return true;
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public CheckedItemAdapter(Context context, int i, int i2, CharSequence[] charSequenceArr) {
            super(context, i, i2, charSequenceArr);
        }
    }

    static {
        char[] toCharArray = "rjlcF^?|xLC?vx]\u0010z`~ZD".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 48;
                    break;
                case at.g /*1*/:
                    i2 = 31;
                    break;
                case at.i /*2*/:
                    i2 = 24;
                    break;
                case at.o /*3*/:
                    i2 = 23;
                    break;
                default:
                    i2 = 41;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    static void access$800(View view, View view2, View view3) {
        manageScrollIndicators(view, view2, view3);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        try {
            if (this.mScrollView != null) {
                if (this.mScrollView.executeKeyEvent(keyEvent)) {
                    return true;
                }
            }
            return false;
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    static Message access$300(AlertController alertController) {
        return alertController.mButtonNegativeMessage;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setButton(int r3, java.lang.CharSequence r4, android.content.DialogInterface.OnClickListener r5, android.os.Message r6) {
        /*
        r2 = this;
        r0 = android.support.v7.app.ActionBar.a;
        if (r6 != 0) goto L_0x000c;
    L_0x0004:
        if (r5 == 0) goto L_0x000c;
    L_0x0006:
        r1 = r2.mHandler;
        r6 = r1.obtainMessage(r3, r5);
    L_0x000c:
        switch(r3) {
            case -3: goto L_0x0025;
            case -2: goto L_0x001f;
            case -1: goto L_0x0019;
            default: goto L_0x000f;
        };
    L_0x000f:
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0017 }
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x0017 }
        r0.<init>(r1);	 Catch:{ IllegalArgumentException -> 0x0017 }
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0017 }
    L_0x0017:
        r0 = move-exception;
        throw r0;
    L_0x0019:
        r2.mButtonPositiveText = r4;	 Catch:{ IllegalArgumentException -> 0x002c }
        r2.mButtonPositiveMessage = r6;	 Catch:{ IllegalArgumentException -> 0x002c }
        if (r0 == 0) goto L_0x002b;
    L_0x001f:
        r2.mButtonNegativeText = r4;	 Catch:{ IllegalArgumentException -> 0x002e }
        r2.mButtonNegativeMessage = r6;	 Catch:{ IllegalArgumentException -> 0x002e }
        if (r0 == 0) goto L_0x002b;
    L_0x0025:
        r2.mButtonNeutralText = r4;	 Catch:{ IllegalArgumentException -> 0x0017 }
        r2.mButtonNeutralMessage = r6;	 Catch:{ IllegalArgumentException -> 0x0017 }
        if (r0 != 0) goto L_0x000f;
    L_0x002b:
        return;
    L_0x002c:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x002e }
    L_0x002e:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0017 }
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.app.AlertController.setButton(int, java.lang.CharSequence, android.content.DialogInterface$OnClickListener, android.os.Message):void");
    }

    static Button access$000(AlertController alertController) {
        return alertController.mButtonPositive;
    }

    static Button access$200(AlertController alertController) {
        return alertController.mButtonNegative;
    }

    static boolean canTextInput(View view) {
        try {
            if (view.onCheckIsTextEditor()) {
                return true;
            }
            try {
                if (!(view instanceof ViewGroup)) {
                    return false;
                }
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                while (childCount > 0) {
                    childCount--;
                    if (canTextInput(viewGroup.getChildAt(childCount))) {
                        return true;
                    }
                }
                return false;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    static AppCompatDialog access$600(AlertController alertController) {
        return alertController.mDialog;
    }

    public void setCustomTitle(View view) {
        this.mCustomTitleView = view;
    }

    static ListAdapter access$1502(AlertController alertController, ListAdapter listAdapter) {
        alertController.mAdapter = listAdapter;
        return listAdapter;
    }

    static NestedScrollView access$900(AlertController alertController) {
        return alertController.mScrollView;
    }

    private void setupView() {
        int i = 1;
        int i2 = 0;
        View findViewById = this.mWindow.findViewById(R.id.parentPanel);
        View findViewById2 = findViewById.findViewById(R.id.topPanel);
        View findViewById3 = findViewById.findViewById(R.id.contentPanel);
        View findViewById4 = findViewById.findViewById(R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) findViewById.findViewById(R.id.customPanel);
        setupCustomContent(viewGroup);
        View findViewById5 = viewGroup.findViewById(R.id.topPanel);
        View findViewById6 = viewGroup.findViewById(R.id.contentPanel);
        View findViewById7 = viewGroup.findViewById(R.id.buttonPanel);
        ViewGroup resolvePanel = resolvePanel(findViewById5, findViewById2);
        ViewGroup resolvePanel2 = resolvePanel(findViewById6, findViewById3);
        ViewGroup resolvePanel3 = resolvePanel(findViewById7, findViewById4);
        try {
            int i3;
            int i4;
            int i5;
            ListView listView;
            setupContent(resolvePanel2);
            setupButtons(resolvePanel3);
            setupTitle(resolvePanel);
            if (viewGroup != null) {
                if (viewGroup.getVisibility() != 8) {
                    i3 = 1;
                    if (resolvePanel != null) {
                        try {
                            if (resolvePanel.getVisibility() != 8) {
                                i4 = 1;
                                if (resolvePanel3 != null) {
                                    try {
                                        if (resolvePanel3.getVisibility() != 8) {
                                            i5 = 1;
                                            if (i5 == 0 && resolvePanel2 != null) {
                                                findViewById4 = resolvePanel2.findViewById(R.id.textSpacerNoButtons);
                                                if (findViewById4 != null) {
                                                    try {
                                                        findViewById4.setVisibility(0);
                                                    } catch (IllegalArgumentException e) {
                                                        throw e;
                                                    }
                                                }
                                            }
                                            if (i4 != 0) {
                                                try {
                                                    if (this.mScrollView != null) {
                                                        this.mScrollView.setClipToPadding(true);
                                                    }
                                                } catch (IllegalArgumentException e2) {
                                                    throw e2;
                                                }
                                            }
                                            if (i3 == 0) {
                                                try {
                                                    if (this.mListView == null) {
                                                        findViewById = this.mListView;
                                                    } else {
                                                        findViewById = this.mScrollView;
                                                    }
                                                    if (findViewById != null) {
                                                        if (i4 == 0) {
                                                            i = 0;
                                                        }
                                                        if (i5 != 0) {
                                                            i2 = 2;
                                                        }
                                                        setScrollIndicators(resolvePanel2, findViewById, i | i2, 3);
                                                    }
                                                } catch (IllegalArgumentException e22) {
                                                    throw e22;
                                                }
                                            }
                                            listView = this.mListView;
                                            if (listView != null) {
                                                try {
                                                    if (this.mAdapter == null) {
                                                        listView.setAdapter(this.mAdapter);
                                                        i = this.mCheckedItem;
                                                        if (i <= -1) {
                                                            try {
                                                                listView.setItemChecked(i, true);
                                                                listView.setSelection(i);
                                                            } catch (IllegalArgumentException e222) {
                                                                throw e222;
                                                            }
                                                        }
                                                    }
                                                } catch (IllegalArgumentException e2222) {
                                                    throw e2222;
                                                }
                                            }
                                        }
                                    } catch (IllegalArgumentException e22222) {
                                        throw e22222;
                                    }
                                }
                                i5 = 0;
                                findViewById4 = resolvePanel2.findViewById(R.id.textSpacerNoButtons);
                                if (findViewById4 != null) {
                                    findViewById4.setVisibility(0);
                                }
                                if (i4 != 0) {
                                    if (this.mScrollView != null) {
                                        this.mScrollView.setClipToPadding(true);
                                    }
                                }
                                if (i3 == 0) {
                                    if (this.mListView == null) {
                                        findViewById = this.mScrollView;
                                    } else {
                                        findViewById = this.mListView;
                                    }
                                    if (findViewById != null) {
                                        if (i4 == 0) {
                                            i = 0;
                                        }
                                        if (i5 != 0) {
                                            i2 = 2;
                                        }
                                        setScrollIndicators(resolvePanel2, findViewById, i | i2, 3);
                                    }
                                }
                                listView = this.mListView;
                                if (listView != null) {
                                    if (this.mAdapter == null) {
                                        listView.setAdapter(this.mAdapter);
                                        i = this.mCheckedItem;
                                        if (i <= -1) {
                                            listView.setItemChecked(i, true);
                                            listView.setSelection(i);
                                        }
                                    }
                                }
                            }
                        } catch (IllegalArgumentException e222222) {
                            throw e222222;
                        }
                    }
                    i4 = 0;
                    if (resolvePanel3 != null) {
                        if (resolvePanel3.getVisibility() != 8) {
                            i5 = 1;
                            findViewById4 = resolvePanel2.findViewById(R.id.textSpacerNoButtons);
                            if (findViewById4 != null) {
                                findViewById4.setVisibility(0);
                            }
                            if (i4 != 0) {
                                if (this.mScrollView != null) {
                                    this.mScrollView.setClipToPadding(true);
                                }
                            }
                            if (i3 == 0) {
                                if (this.mListView == null) {
                                    findViewById = this.mListView;
                                } else {
                                    findViewById = this.mScrollView;
                                }
                                if (findViewById != null) {
                                    if (i4 == 0) {
                                        i = 0;
                                    }
                                    if (i5 != 0) {
                                        i2 = 2;
                                    }
                                    setScrollIndicators(resolvePanel2, findViewById, i | i2, 3);
                                }
                            }
                            listView = this.mListView;
                            if (listView != null) {
                            }
                            if (this.mAdapter == null) {
                                listView.setAdapter(this.mAdapter);
                                i = this.mCheckedItem;
                                if (i <= -1) {
                                    listView.setItemChecked(i, true);
                                    listView.setSelection(i);
                                }
                            }
                        }
                    }
                    i5 = 0;
                    findViewById4 = resolvePanel2.findViewById(R.id.textSpacerNoButtons);
                    if (findViewById4 != null) {
                        findViewById4.setVisibility(0);
                    }
                    if (i4 != 0) {
                        if (this.mScrollView != null) {
                            this.mScrollView.setClipToPadding(true);
                        }
                    }
                    if (i3 == 0) {
                        if (this.mListView == null) {
                            findViewById = this.mScrollView;
                        } else {
                            findViewById = this.mListView;
                        }
                        if (findViewById != null) {
                            if (i4 == 0) {
                                i = 0;
                            }
                            if (i5 != 0) {
                                i2 = 2;
                            }
                            setScrollIndicators(resolvePanel2, findViewById, i | i2, 3);
                        }
                    }
                    listView = this.mListView;
                    if (listView != null) {
                        if (this.mAdapter == null) {
                            listView.setAdapter(this.mAdapter);
                            i = this.mCheckedItem;
                            if (i <= -1) {
                                listView.setItemChecked(i, true);
                                listView.setSelection(i);
                            }
                        }
                    }
                }
            }
            i3 = 0;
            if (resolvePanel != null) {
                if (resolvePanel.getVisibility() != 8) {
                    i4 = 1;
                    if (resolvePanel3 != null) {
                        if (resolvePanel3.getVisibility() != 8) {
                            i5 = 1;
                            findViewById4 = resolvePanel2.findViewById(R.id.textSpacerNoButtons);
                            if (findViewById4 != null) {
                                findViewById4.setVisibility(0);
                            }
                            if (i4 != 0) {
                                if (this.mScrollView != null) {
                                    this.mScrollView.setClipToPadding(true);
                                }
                            }
                            if (i3 == 0) {
                                if (this.mListView == null) {
                                    findViewById = this.mListView;
                                } else {
                                    findViewById = this.mScrollView;
                                }
                                if (findViewById != null) {
                                    if (i4 == 0) {
                                        i = 0;
                                    }
                                    if (i5 != 0) {
                                        i2 = 2;
                                    }
                                    setScrollIndicators(resolvePanel2, findViewById, i | i2, 3);
                                }
                            }
                            listView = this.mListView;
                            if (listView != null) {
                            }
                            if (this.mAdapter == null) {
                                listView.setAdapter(this.mAdapter);
                                i = this.mCheckedItem;
                                if (i <= -1) {
                                    listView.setItemChecked(i, true);
                                    listView.setSelection(i);
                                }
                            }
                        }
                    }
                    i5 = 0;
                    findViewById4 = resolvePanel2.findViewById(R.id.textSpacerNoButtons);
                    if (findViewById4 != null) {
                        findViewById4.setVisibility(0);
                    }
                    if (i4 != 0) {
                        if (this.mScrollView != null) {
                            this.mScrollView.setClipToPadding(true);
                        }
                    }
                    if (i3 == 0) {
                        if (this.mListView == null) {
                            findViewById = this.mScrollView;
                        } else {
                            findViewById = this.mListView;
                        }
                        if (findViewById != null) {
                            if (i4 == 0) {
                                i = 0;
                            }
                            if (i5 != 0) {
                                i2 = 2;
                            }
                            setScrollIndicators(resolvePanel2, findViewById, i | i2, 3);
                        }
                    }
                    listView = this.mListView;
                    if (listView != null) {
                        if (this.mAdapter == null) {
                            listView.setAdapter(this.mAdapter);
                            i = this.mCheckedItem;
                            if (i <= -1) {
                                listView.setItemChecked(i, true);
                                listView.setSelection(i);
                            }
                        }
                    }
                }
            }
            i4 = 0;
            if (resolvePanel3 != null) {
                if (resolvePanel3.getVisibility() != 8) {
                    i5 = 1;
                    findViewById4 = resolvePanel2.findViewById(R.id.textSpacerNoButtons);
                    if (findViewById4 != null) {
                        findViewById4.setVisibility(0);
                    }
                    if (i4 != 0) {
                        if (this.mScrollView != null) {
                            this.mScrollView.setClipToPadding(true);
                        }
                    }
                    if (i3 == 0) {
                        if (this.mListView == null) {
                            findViewById = this.mListView;
                        } else {
                            findViewById = this.mScrollView;
                        }
                        if (findViewById != null) {
                            if (i4 == 0) {
                                i = 0;
                            }
                            if (i5 != 0) {
                                i2 = 2;
                            }
                            setScrollIndicators(resolvePanel2, findViewById, i | i2, 3);
                        }
                    }
                    listView = this.mListView;
                    if (listView != null) {
                    }
                    if (this.mAdapter == null) {
                        listView.setAdapter(this.mAdapter);
                        i = this.mCheckedItem;
                        if (i <= -1) {
                            listView.setItemChecked(i, true);
                            listView.setSelection(i);
                        }
                    }
                }
            }
            i5 = 0;
            findViewById4 = resolvePanel2.findViewById(R.id.textSpacerNoButtons);
            if (findViewById4 != null) {
                findViewById4.setVisibility(0);
            }
            if (i4 != 0) {
                if (this.mScrollView != null) {
                    this.mScrollView.setClipToPadding(true);
                }
            }
            if (i3 == 0) {
                if (this.mListView == null) {
                    findViewById = this.mScrollView;
                } else {
                    findViewById = this.mListView;
                }
                if (findViewById != null) {
                    if (i4 == 0) {
                        i = 0;
                    }
                    if (i5 != 0) {
                        i2 = 2;
                    }
                    setScrollIndicators(resolvePanel2, findViewById, i | i2, 3);
                }
            }
            listView = this.mListView;
            if (listView != null) {
                if (this.mAdapter == null) {
                    listView.setAdapter(this.mAdapter);
                    i = this.mCheckedItem;
                    if (i <= -1) {
                        listView.setItemChecked(i, true);
                        listView.setSelection(i);
                    }
                }
            }
        } catch (IllegalArgumentException e2222222) {
            throw e2222222;
        } catch (IllegalArgumentException e22222222) {
            throw e22222222;
        }
    }

    public void installContent() {
        this.mDialog.supportRequestWindowFeature(1);
        this.mDialog.setContentView(selectContentView());
        setupView();
    }

    static int access$1400(AlertController alertController) {
        return alertController.mListItemLayout;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void setupCustomContent(android.view.ViewGroup r7) {
        /*
        r6 = this;
        r0 = 0;
        r2 = android.support.v7.app.ActionBar.a;
        r1 = r6.mView;
        if (r1 == 0) goto L_0x000b;
    L_0x0007:
        r1 = r6.mView;
        if (r2 == 0) goto L_0x001e;
    L_0x000b:
        r1 = r6.mViewLayoutResId;	 Catch:{ IllegalArgumentException -> 0x006c }
        if (r1 == 0) goto L_0x001d;
    L_0x000f:
        r1 = r6.mContext;
        r1 = android.view.LayoutInflater.from(r1);
        r3 = r6.mViewLayoutResId;
        r1 = r1.inflate(r3, r7, r0);
        if (r2 == 0) goto L_0x001e;
    L_0x001d:
        r1 = 0;
    L_0x001e:
        if (r1 == 0) goto L_0x0021;
    L_0x0020:
        r0 = 1;
    L_0x0021:
        if (r0 == 0) goto L_0x0029;
    L_0x0023:
        r3 = canTextInput(r1);	 Catch:{ IllegalArgumentException -> 0x006e }
        if (r3 != 0) goto L_0x0032;
    L_0x0029:
        r3 = r6.mWindow;	 Catch:{ IllegalArgumentException -> 0x006e }
        r4 = 131072; // 0x20000 float:1.83671E-40 double:6.47582E-319;
        r5 = 131072; // 0x20000 float:1.83671E-40 double:6.47582E-319;
        r3.setFlags(r4, r5);	 Catch:{ IllegalArgumentException -> 0x006e }
    L_0x0032:
        if (r0 == 0) goto L_0x0066;
    L_0x0034:
        r0 = r6.mWindow;
        r3 = android.support.v7.appcompat.R.id.custom;
        r0 = r0.findViewById(r3);
        r0 = (android.widget.FrameLayout) r0;
        r3 = new android.view.ViewGroup$LayoutParams;	 Catch:{ IllegalArgumentException -> 0x0070 }
        r4 = -1;
        r5 = -1;
        r3.<init>(r4, r5);	 Catch:{ IllegalArgumentException -> 0x0070 }
        r0.addView(r1, r3);	 Catch:{ IllegalArgumentException -> 0x0070 }
        r1 = r6.mViewSpacingSpecified;	 Catch:{ IllegalArgumentException -> 0x0070 }
        if (r1 == 0) goto L_0x0057;
    L_0x004c:
        r1 = r6.mViewSpacingLeft;	 Catch:{ IllegalArgumentException -> 0x0070 }
        r3 = r6.mViewSpacingTop;	 Catch:{ IllegalArgumentException -> 0x0070 }
        r4 = r6.mViewSpacingRight;	 Catch:{ IllegalArgumentException -> 0x0070 }
        r5 = r6.mViewSpacingBottom;	 Catch:{ IllegalArgumentException -> 0x0070 }
        r0.setPadding(r1, r3, r4, r5);	 Catch:{ IllegalArgumentException -> 0x0070 }
    L_0x0057:
        r0 = r6.mListView;	 Catch:{ IllegalArgumentException -> 0x0072 }
        if (r0 == 0) goto L_0x0064;
    L_0x005b:
        r0 = r7.getLayoutParams();	 Catch:{ IllegalArgumentException -> 0x0072 }
        r0 = (android.widget.LinearLayout.LayoutParams) r0;	 Catch:{ IllegalArgumentException -> 0x0072 }
        r1 = 0;
        r0.weight = r1;	 Catch:{ IllegalArgumentException -> 0x0072 }
    L_0x0064:
        if (r2 == 0) goto L_0x006b;
    L_0x0066:
        r0 = 8;
        r7.setVisibility(r0);	 Catch:{ IllegalArgumentException -> 0x0074 }
    L_0x006b:
        return;
    L_0x006c:
        r0 = move-exception;
        throw r0;
    L_0x006e:
        r0 = move-exception;
        throw r0;
    L_0x0070:
        r0 = move-exception;
        throw r0;
    L_0x0072:
        r0 = move-exception;
        throw r0;
    L_0x0074:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.app.AlertController.setupCustomContent(android.view.ViewGroup):void");
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        try {
            if (this.mScrollView != null) {
                if (this.mScrollView.executeKeyEvent(keyEvent)) {
                    return true;
                }
            }
            return false;
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    public void setMessage(CharSequence charSequence) {
        try {
            this.mMessage = charSequence;
            if (this.mMessageView != null) {
                this.mMessageView.setText(charSequence);
            }
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public int getIconAttributeResId(int i) {
        TypedValue typedValue = new TypedValue();
        this.mContext.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId;
    }

    public void setView(View view) {
        this.mView = view;
        this.mViewLayoutResId = 0;
        this.mViewSpacingSpecified = false;
    }

    private static void manageScrollIndicators(View view, View view2, View view3) {
        int i = 0;
        if (view2 != null) {
            try {
                int i2;
                if (ViewCompat.canScrollVertically(view, -1)) {
                    i2 = 0;
                } else {
                    i2 = 4;
                }
                view2.setVisibility(i2);
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        if (view3 != null) {
            try {
                if (!ViewCompat.canScrollVertically(view, 1)) {
                    i = 4;
                }
                view3.setVisibility(i);
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        }
    }

    public void setView(int i) {
        this.mView = null;
        this.mViewLayoutResId = i;
        this.mViewSpacingSpecified = false;
    }

    static int access$1300(AlertController alertController) {
        return alertController.mSingleChoiceItemLayout;
    }

    private void setScrollIndicators(ViewGroup viewGroup, View view, int i, int i2) {
        View view2 = null;
        boolean z = ActionBar.a;
        View findViewById = this.mWindow.findViewById(R.id.scrollIndicatorUp);
        View findViewById2 = this.mWindow.findViewById(R.id.scrollIndicatorDown);
        try {
            if (VERSION.SDK_INT >= 23) {
                ViewCompat.setScrollIndicators(view, i, i2);
                if (findViewById != null) {
                    viewGroup.removeView(findViewById);
                }
                if (findViewById2 != null) {
                    try {
                        viewGroup.removeView(findViewById2);
                        if (!z) {
                            return;
                        }
                    } catch (IllegalArgumentException e) {
                        throw e;
                    } catch (IllegalArgumentException e2) {
                        throw e2;
                    }
                }
                return;
            }
            if (findViewById != null && (i & 1) == 0) {
                viewGroup.removeView(findViewById);
                findViewById = null;
            }
            if (findViewById2 == null || (i & 2) != 0) {
                view2 = findViewById2;
            } else {
                viewGroup.removeView(findViewById2);
            }
            if (findViewById != null || view2 != null) {
                try {
                    if (this.mMessage != null) {
                        this.mScrollView.setOnScrollChangeListener(new 2(this, findViewById, view2));
                        this.mScrollView.post(new 3(this, findViewById, view2));
                        if (!z) {
                            return;
                        }
                    }
                    try {
                        if (this.mListView != null) {
                            try {
                                this.mListView.setOnScrollListener(new 4(this, findViewById, view2));
                                this.mListView.post(new 5(this, findViewById, view2));
                                if (!z) {
                                    return;
                                }
                            } catch (IllegalArgumentException e22) {
                                throw e22;
                            }
                        }
                        if (findViewById != null) {
                            try {
                                viewGroup.removeView(findViewById);
                            } catch (IllegalArgumentException e222) {
                                throw e222;
                            }
                        }
                        if (view2 != null) {
                            try {
                                viewGroup.removeView(view2);
                            } catch (IllegalArgumentException e2222) {
                                throw e2222;
                            }
                        }
                    } catch (IllegalArgumentException e22222) {
                        throw e22222;
                    }
                } catch (IllegalArgumentException e222222) {
                    throw e222222;
                } catch (IllegalArgumentException e2222222) {
                    throw e2222222;
                }
            }
        } catch (IllegalArgumentException e22222222) {
            throw e22222222;
        } catch (IllegalArgumentException e222222222) {
            throw e222222222;
        }
    }

    public AlertController(Context context, AppCompatDialog appCompatDialog, Window window) {
        boolean z = ActionBar.a;
        this.mViewSpacingSpecified = false;
        this.mIconId = 0;
        this.mCheckedItem = -1;
        this.mButtonPanelLayoutHint = 0;
        this.mButtonHandler = new 1(this);
        this.mContext = context;
        this.mDialog = appCompatDialog;
        this.mWindow = window;
        this.mHandler = new ButtonHandler(appCompatDialog);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, R.styleable.AlertDialog, R.attr.alertDialogStyle, 0);
        this.mAlertDialogLayout = obtainStyledAttributes.getResourceId(R.styleable.AlertDialog_android_layout, 0);
        this.mButtonPanelSideLayout = obtainStyledAttributes.getResourceId(R.styleable.AlertDialog_buttonPanelSideLayout, 0);
        this.mListLayout = obtainStyledAttributes.getResourceId(R.styleable.AlertDialog_listLayout, 0);
        this.mMultiChoiceItemLayout = obtainStyledAttributes.getResourceId(R.styleable.AlertDialog_multiChoiceItemLayout, 0);
        this.mSingleChoiceItemLayout = obtainStyledAttributes.getResourceId(R.styleable.AlertDialog_singleChoiceItemLayout, 0);
        this.mListItemLayout = obtainStyledAttributes.getResourceId(R.styleable.AlertDialog_listItemLayout, 0);
        obtainStyledAttributes.recycle();
        if (z) {
            AppCompatActivity.b++;
        }
    }

    private int selectContentView() {
        try {
            if (this.mButtonPanelSideLayout == 0) {
                return this.mAlertDialogLayout;
            }
            try {
                if (this.mButtonPanelLayoutHint == 1) {
                    return this.mButtonPanelSideLayout;
                }
                return this.mAlertDialogLayout;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    static Button access$400(AlertController alertController) {
        return alertController.mButtonNeutral;
    }

    @Nullable
    private ViewGroup resolvePanel(@Nullable View view, @Nullable View view2) {
        View inflate;
        if (view == null) {
            try {
                if (view2 instanceof ViewStub) {
                    inflate = ((ViewStub) view2).inflate();
                } else {
                    inflate = view2;
                }
                return (ViewGroup) inflate;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            try {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(view2);
                }
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        }
        if (view instanceof ViewStub) {
            inflate = ((ViewStub) view).inflate();
        } else {
            inflate = view;
        }
        return (ViewGroup) inflate;
    }

    static Handler access$700(AlertController alertController) {
        return alertController.mHandler;
    }

    static int access$1100(AlertController alertController) {
        return alertController.mListLayout;
    }

    static ListView access$1000(AlertController alertController) {
        return alertController.mListView;
    }

    static int access$1200(AlertController alertController) {
        return alertController.mMultiChoiceItemLayout;
    }

    public void setView(View view, int i, int i2, int i3, int i4) {
        this.mView = view;
        this.mViewLayoutResId = 0;
        this.mViewSpacingSpecified = true;
        this.mViewSpacingLeft = i;
        this.mViewSpacingTop = i2;
        this.mViewSpacingRight = i3;
        this.mViewSpacingBottom = i4;
    }

    private void setupTitle(ViewGroup viewGroup) {
        int i;
        boolean z = ActionBar.a;
        if (this.mCustomTitleView != null) {
            viewGroup.addView(this.mCustomTitleView, 0, new LayoutParams(-1, -2));
            try {
                this.mWindow.findViewById(R.id.title_template).setVisibility(8);
                if (!z) {
                    return;
                }
            } catch (IllegalArgumentException e) {
                throw e;
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        }
        this.mIconView = (ImageView) this.mWindow.findViewById(16908294);
        if (TextUtils.isEmpty(this.mTitle)) {
            i = 0;
        } else {
            i = 1;
        }
        if (i != 0) {
            try {
                this.mTitleView = (TextView) this.mWindow.findViewById(R.id.alertTitle);
                this.mTitleView.setText(this.mTitle);
                if (this.mIconId != 0) {
                    this.mIconView.setImageResource(this.mIconId);
                    if (!z) {
                        return;
                    }
                }
                try {
                    if (this.mIcon != null) {
                        try {
                            this.mIconView.setImageDrawable(this.mIcon);
                            if (!z) {
                                return;
                            }
                        } catch (IllegalArgumentException e22) {
                            throw e22;
                        }
                    }
                    this.mTitleView.setPadding(this.mIconView.getPaddingLeft(), this.mIconView.getPaddingTop(), this.mIconView.getPaddingRight(), this.mIconView.getPaddingBottom());
                    this.mIconView.setVisibility(8);
                    if (!z) {
                        return;
                    }
                } catch (IllegalArgumentException e222) {
                    throw e222;
                }
            } catch (IllegalArgumentException e2222) {
                throw e2222;
            } catch (IllegalArgumentException e22222) {
                throw e22222;
            }
        }
        this.mWindow.findViewById(R.id.title_template).setVisibility(8);
        this.mIconView.setVisibility(8);
        viewGroup.setVisibility(8);
    }

    static Message access$100(AlertController alertController) {
        return alertController.mButtonPositiveMessage;
    }

    public void setTitle(CharSequence charSequence) {
        try {
            this.mTitle = charSequence;
            if (this.mTitleView != null) {
                this.mTitleView.setText(charSequence);
            }
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    private void setupContent(ViewGroup viewGroup) {
        boolean z = ActionBar.a;
        try {
            this.mScrollView = (NestedScrollView) this.mWindow.findViewById(R.id.scrollView);
            this.mScrollView.setFocusable(false);
            this.mScrollView.setNestedScrollingEnabled(false);
            this.mMessageView = (TextView) viewGroup.findViewById(16908299);
            if (this.mMessageView != null) {
                try {
                    if (this.mMessage != null) {
                        this.mMessageView.setText(this.mMessage);
                        if (!z) {
                            return;
                        }
                    }
                    this.mMessageView.setVisibility(8);
                    this.mScrollView.removeView(this.mMessageView);
                    if (this.mListView != null) {
                        ViewGroup viewGroup2 = (ViewGroup) this.mScrollView.getParent();
                        int indexOfChild = viewGroup2.indexOfChild(this.mScrollView);
                        try {
                            viewGroup2.removeViewAt(indexOfChild);
                            viewGroup2.addView(this.mListView, indexOfChild, new LayoutParams(-1, -1));
                            if (!z) {
                                return;
                            }
                        } catch (IllegalArgumentException e) {
                            throw e;
                        }
                    }
                    viewGroup.setVisibility(8);
                } catch (IllegalArgumentException e2) {
                    throw e2;
                } catch (IllegalArgumentException e22) {
                    throw e22;
                }
            }
        } catch (IllegalArgumentException e222) {
            throw e222;
        }
    }

    static ListView access$1002(AlertController alertController, ListView listView) {
        alertController.mListView = listView;
        return listView;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void setupButtons(android.view.ViewGroup r9) {
        /*
        r8 = this;
        r1 = 1;
        r2 = 0;
        r4 = android.support.v7.app.ActionBar.a;
        r5 = 2;
        r6 = 4;
        r0 = 16908313; // 0x1020019 float:2.38773E-38 double:8.3538166E-317;
        r0 = r9.findViewById(r0);	 Catch:{ IllegalArgumentException -> 0x00a2 }
        r0 = (android.widget.Button) r0;	 Catch:{ IllegalArgumentException -> 0x00a2 }
        r8.mButtonPositive = r0;	 Catch:{ IllegalArgumentException -> 0x00a2 }
        r0 = r8.mButtonPositive;	 Catch:{ IllegalArgumentException -> 0x00a2 }
        r3 = r8.mButtonHandler;	 Catch:{ IllegalArgumentException -> 0x00a2 }
        r0.setOnClickListener(r3);	 Catch:{ IllegalArgumentException -> 0x00a2 }
        r0 = r8.mButtonPositiveText;	 Catch:{ IllegalArgumentException -> 0x00a2 }
        r0 = android.text.TextUtils.isEmpty(r0);	 Catch:{ IllegalArgumentException -> 0x00a2 }
        if (r0 == 0) goto L_0x0029;
    L_0x0020:
        r0 = r8.mButtonPositive;	 Catch:{ IllegalArgumentException -> 0x00a2 }
        r3 = 8;
        r0.setVisibility(r3);	 Catch:{ IllegalArgumentException -> 0x00a2 }
        if (r4 == 0) goto L_0x00ae;
    L_0x0029:
        r0 = r8.mButtonPositive;
        r3 = r8.mButtonPositiveText;
        r0.setText(r3);
        r0 = r8.mButtonPositive;
        r0.setVisibility(r2);
        r3 = r1;
    L_0x0036:
        r0 = 16908314; // 0x102001a float:2.3877302E-38 double:8.353817E-317;
        r0 = r9.findViewById(r0);	 Catch:{ IllegalArgumentException -> 0x00a4 }
        r0 = (android.widget.Button) r0;	 Catch:{ IllegalArgumentException -> 0x00a4 }
        r8.mButtonNegative = r0;	 Catch:{ IllegalArgumentException -> 0x00a4 }
        r0 = r8.mButtonNegative;	 Catch:{ IllegalArgumentException -> 0x00a4 }
        r7 = r8.mButtonHandler;	 Catch:{ IllegalArgumentException -> 0x00a4 }
        r0.setOnClickListener(r7);	 Catch:{ IllegalArgumentException -> 0x00a4 }
        r0 = r8.mButtonNegativeText;	 Catch:{ IllegalArgumentException -> 0x00a4 }
        r0 = android.text.TextUtils.isEmpty(r0);	 Catch:{ IllegalArgumentException -> 0x00a4 }
        if (r0 == 0) goto L_0x0059;
    L_0x0050:
        r0 = r8.mButtonNegative;	 Catch:{ IllegalArgumentException -> 0x00a4 }
        r7 = 8;
        r0.setVisibility(r7);	 Catch:{ IllegalArgumentException -> 0x00a4 }
        if (r4 == 0) goto L_0x0066;
    L_0x0059:
        r0 = r8.mButtonNegative;
        r7 = r8.mButtonNegativeText;
        r0.setText(r7);
        r0 = r8.mButtonNegative;
        r0.setVisibility(r2);
        r3 = r3 | r5;
    L_0x0066:
        r0 = 16908315; // 0x102001b float:2.3877305E-38 double:8.3538176E-317;
        r0 = r9.findViewById(r0);	 Catch:{ IllegalArgumentException -> 0x00a6 }
        r0 = (android.widget.Button) r0;	 Catch:{ IllegalArgumentException -> 0x00a6 }
        r8.mButtonNeutral = r0;	 Catch:{ IllegalArgumentException -> 0x00a6 }
        r0 = r8.mButtonNeutral;	 Catch:{ IllegalArgumentException -> 0x00a6 }
        r5 = r8.mButtonHandler;	 Catch:{ IllegalArgumentException -> 0x00a6 }
        r0.setOnClickListener(r5);	 Catch:{ IllegalArgumentException -> 0x00a6 }
        r0 = r8.mButtonNeutralText;	 Catch:{ IllegalArgumentException -> 0x00a6 }
        r0 = android.text.TextUtils.isEmpty(r0);	 Catch:{ IllegalArgumentException -> 0x00a6 }
        if (r0 == 0) goto L_0x0089;
    L_0x0080:
        r0 = r8.mButtonNeutral;	 Catch:{ IllegalArgumentException -> 0x00a6 }
        r5 = 8;
        r0.setVisibility(r5);	 Catch:{ IllegalArgumentException -> 0x00a6 }
        if (r4 == 0) goto L_0x00ac;
    L_0x0089:
        r0 = r8.mButtonNeutral;
        r4 = r8.mButtonNeutralText;
        r0.setText(r4);
        r0 = r8.mButtonNeutral;
        r0.setVisibility(r2);
        r0 = r3 | r6;
    L_0x0097:
        if (r0 == 0) goto L_0x00a8;
    L_0x0099:
        r0 = r1;
    L_0x009a:
        if (r0 != 0) goto L_0x00a1;
    L_0x009c:
        r0 = 8;
        r9.setVisibility(r0);	 Catch:{ IllegalArgumentException -> 0x00aa }
    L_0x00a1:
        return;
    L_0x00a2:
        r0 = move-exception;
        throw r0;
    L_0x00a4:
        r0 = move-exception;
        throw r0;
    L_0x00a6:
        r0 = move-exception;
        throw r0;
    L_0x00a8:
        r0 = r2;
        goto L_0x009a;
    L_0x00aa:
        r0 = move-exception;
        throw r0;
    L_0x00ac:
        r0 = r3;
        goto L_0x0097;
    L_0x00ae:
        r3 = r2;
        goto L_0x0036;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.app.AlertController.setupButtons(android.view.ViewGroup):void");
    }

    static int access$1602(AlertController alertController, int i) {
        alertController.mCheckedItem = i;
        return i;
    }

    static Message access$500(AlertController alertController) {
        return alertController.mButtonNeutralMessage;
    }

    public void setIcon(int i) {
        try {
            this.mIcon = null;
            this.mIconId = i;
            if (this.mIconView != null) {
                if (i != 0) {
                    try {
                        this.mIconView.setImageResource(this.mIconId);
                        if (!ActionBar.a) {
                            return;
                        }
                    } catch (IllegalArgumentException e) {
                        throw e;
                    }
                }
                this.mIconView.setVisibility(8);
            }
        } catch (IllegalArgumentException e2) {
            throw e2;
        } catch (IllegalArgumentException e22) {
            throw e22;
        }
    }

    public void setIcon(Drawable drawable) {
        try {
            this.mIcon = drawable;
            this.mIconId = 0;
            if (this.mIconView != null) {
                if (drawable != null) {
                    try {
                        this.mIconView.setImageDrawable(drawable);
                        if (!ActionBar.a) {
                            return;
                        }
                    } catch (IllegalArgumentException e) {
                        throw e;
                    }
                }
                this.mIconView.setVisibility(8);
            }
        } catch (IllegalArgumentException e2) {
            throw e2;
        } catch (IllegalArgumentException e22) {
            throw e22;
        }
    }
}
