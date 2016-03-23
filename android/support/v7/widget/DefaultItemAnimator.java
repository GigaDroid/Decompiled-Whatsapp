package android.support.v7.widget;

import android.support.v4.animation.AnimatorCompatHelper;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPropertyAnimatorCompat;
import android.support.v4.view.ViewPropertyAnimatorListener;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.v;
import org.whispersystems.at;

public class DefaultItemAnimator extends SimpleItemAnimator {
    private ArrayList mAddAnimations;
    private ArrayList mAdditionsList;
    private ArrayList mChangeAnimations;
    private ArrayList mChangesList;
    private ArrayList mMoveAnimations;
    private ArrayList mMovesList;
    private ArrayList mPendingAdditions;
    private ArrayList mPendingChanges;
    private ArrayList mPendingMoves;
    private ArrayList mPendingRemovals;
    private ArrayList mRemoveAnimations;

    class 1 implements Runnable {
        final DefaultItemAnimator this$0;
        final ArrayList val$moves;

        1(DefaultItemAnimator defaultItemAnimator, ArrayList arrayList) {
            this.this$0 = defaultItemAnimator;
            this.val$moves = arrayList;
        }

        public void run() {
            int i = ViewHolder.a;
            Iterator it = this.val$moves.iterator();
            while (it.hasNext()) {
                MoveInfo moveInfo = (MoveInfo) it.next();
                DefaultItemAnimator.access$000(this.this$0, moveInfo.holder, moveInfo.fromX, moveInfo.fromY, moveInfo.toX, moveInfo.toY);
                if (i != 0) {
                    break;
                }
            }
            this.val$moves.clear();
            DefaultItemAnimator.access$100(this.this$0).remove(this.val$moves);
        }
    }

    class 2 implements Runnable {
        final DefaultItemAnimator this$0;
        final ArrayList val$changes;

        public void run() {
            int i = ViewHolder.a;
            Iterator it = this.val$changes.iterator();
            while (it.hasNext()) {
                DefaultItemAnimator.access$200(this.this$0, (ChangeInfo) it.next());
                if (i != 0) {
                    break;
                }
            }
            this.val$changes.clear();
            DefaultItemAnimator.access$300(this.this$0).remove(this.val$changes);
        }

        2(DefaultItemAnimator defaultItemAnimator, ArrayList arrayList) {
            this.this$0 = defaultItemAnimator;
            this.val$changes = arrayList;
        }
    }

    class 3 implements Runnable {
        final DefaultItemAnimator this$0;
        final ArrayList val$additions;

        3(DefaultItemAnimator defaultItemAnimator, ArrayList arrayList) {
            this.this$0 = defaultItemAnimator;
            this.val$additions = arrayList;
        }

        public void run() {
            int i = ViewHolder.a;
            Iterator it = this.val$additions.iterator();
            while (it.hasNext()) {
                DefaultItemAnimator.access$400(this.this$0, (ViewHolder) it.next());
                if (i != 0) {
                    break;
                }
            }
            this.val$additions.clear();
            DefaultItemAnimator.access$500(this.this$0).remove(this.val$additions);
        }
    }

    class VpaListenerAdapter implements ViewPropertyAnimatorListener {
        VpaListenerAdapter(1 1) {
            this();
        }

        public void onAnimationStart(View view) {
        }

        private VpaListenerAdapter() {
        }

        public void onAnimationEnd(View view) {
        }

        public void onAnimationCancel(View view) {
        }
    }

    class 4 extends VpaListenerAdapter {
        final DefaultItemAnimator this$0;
        final ViewPropertyAnimatorCompat val$animation;
        final ViewHolder val$holder;

        public void onAnimationEnd(View view) {
            this.val$animation.setListener(null);
            ViewCompat.setAlpha(view, 1.0f);
            this.this$0.dispatchRemoveFinished(this.val$holder);
            DefaultItemAnimator.access$700(this.this$0).remove(this.val$holder);
            DefaultItemAnimator.access$800(this.this$0);
        }

        public void onAnimationStart(View view) {
            this.this$0.dispatchRemoveStarting(this.val$holder);
        }

        4(DefaultItemAnimator defaultItemAnimator, ViewHolder viewHolder, ViewPropertyAnimatorCompat viewPropertyAnimatorCompat) {
            this.this$0 = defaultItemAnimator;
            this.val$holder = viewHolder;
            this.val$animation = viewPropertyAnimatorCompat;
            super(null);
        }
    }

    class 5 extends VpaListenerAdapter {
        final DefaultItemAnimator this$0;
        final ViewPropertyAnimatorCompat val$animation;
        final ViewHolder val$holder;

        public void onAnimationEnd(View view) {
            this.val$animation.setListener(null);
            this.this$0.dispatchAddFinished(this.val$holder);
            DefaultItemAnimator.access$900(this.this$0).remove(this.val$holder);
            DefaultItemAnimator.access$800(this.this$0);
        }

        public void onAnimationStart(View view) {
            this.this$0.dispatchAddStarting(this.val$holder);
        }

        5(DefaultItemAnimator defaultItemAnimator, ViewHolder viewHolder, ViewPropertyAnimatorCompat viewPropertyAnimatorCompat) {
            this.this$0 = defaultItemAnimator;
            this.val$holder = viewHolder;
            this.val$animation = viewPropertyAnimatorCompat;
            super(null);
        }

        public void onAnimationCancel(View view) {
            ViewCompat.setAlpha(view, 1.0f);
        }
    }

    class 6 extends VpaListenerAdapter {
        final DefaultItemAnimator this$0;
        final ViewPropertyAnimatorCompat val$animation;
        final int val$deltaX;
        final int val$deltaY;
        final ViewHolder val$holder;

        6(DefaultItemAnimator defaultItemAnimator, ViewHolder viewHolder, int i, int i2, ViewPropertyAnimatorCompat viewPropertyAnimatorCompat) {
            this.this$0 = defaultItemAnimator;
            this.val$holder = viewHolder;
            this.val$deltaX = i;
            this.val$deltaY = i2;
            this.val$animation = viewPropertyAnimatorCompat;
            super(null);
        }

        public void onAnimationCancel(View view) {
            if (this.val$deltaX != 0) {
                ViewCompat.setTranslationX(view, 0.0f);
            }
            if (this.val$deltaY != 0) {
                ViewCompat.setTranslationY(view, 0.0f);
            }
        }

        public void onAnimationEnd(View view) {
            this.val$animation.setListener(null);
            this.this$0.dispatchMoveFinished(this.val$holder);
            DefaultItemAnimator.access$1100(this.this$0).remove(this.val$holder);
            DefaultItemAnimator.access$800(this.this$0);
        }

        public void onAnimationStart(View view) {
            this.this$0.dispatchMoveStarting(this.val$holder);
        }
    }

    class 7 extends VpaListenerAdapter {
        final DefaultItemAnimator this$0;
        final ChangeInfo val$changeInfo;
        final ViewPropertyAnimatorCompat val$oldViewAnim;

        7(DefaultItemAnimator defaultItemAnimator, ChangeInfo changeInfo, ViewPropertyAnimatorCompat viewPropertyAnimatorCompat) {
            this.this$0 = defaultItemAnimator;
            this.val$changeInfo = changeInfo;
            this.val$oldViewAnim = viewPropertyAnimatorCompat;
            super(null);
        }

        public void onAnimationEnd(View view) {
            this.val$oldViewAnim.setListener(null);
            ViewCompat.setAlpha(view, 1.0f);
            ViewCompat.setTranslationX(view, 0.0f);
            ViewCompat.setTranslationY(view, 0.0f);
            this.this$0.dispatchChangeFinished(this.val$changeInfo.oldHolder, true);
            DefaultItemAnimator.access$1300(this.this$0).remove(this.val$changeInfo.oldHolder);
            DefaultItemAnimator.access$800(this.this$0);
        }

        public void onAnimationStart(View view) {
            this.this$0.dispatchChangeStarting(this.val$changeInfo.oldHolder, true);
        }
    }

    class 8 extends VpaListenerAdapter {
        final DefaultItemAnimator this$0;
        final ChangeInfo val$changeInfo;
        final View val$newView;
        final ViewPropertyAnimatorCompat val$newViewAnimation;

        8(DefaultItemAnimator defaultItemAnimator, ChangeInfo changeInfo, ViewPropertyAnimatorCompat viewPropertyAnimatorCompat, View view) {
            this.this$0 = defaultItemAnimator;
            this.val$changeInfo = changeInfo;
            this.val$newViewAnimation = viewPropertyAnimatorCompat;
            this.val$newView = view;
            super(null);
        }

        public void onAnimationEnd(View view) {
            this.val$newViewAnimation.setListener(null);
            ViewCompat.setAlpha(this.val$newView, 1.0f);
            ViewCompat.setTranslationX(this.val$newView, 0.0f);
            ViewCompat.setTranslationY(this.val$newView, 0.0f);
            this.this$0.dispatchChangeFinished(this.val$changeInfo.newHolder, false);
            DefaultItemAnimator.access$1300(this.this$0).remove(this.val$changeInfo.newHolder);
            DefaultItemAnimator.access$800(this.this$0);
        }

        public void onAnimationStart(View view) {
            this.this$0.dispatchChangeStarting(this.val$changeInfo.newHolder, false);
        }
    }

    class ChangeInfo {
        private static final String[] z;
        public int fromX;
        public int fromY;
        public ViewHolder newHolder;
        public ViewHolder oldHolder;
        public int toX;
        public int toY;

        static {
            String[] strArr = new String[6];
            String str = "B\flJP\u0003u7";
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
                            i3 = 110;
                            break;
                        case at.g /*1*/:
                            i3 = 44;
                            break;
                        case at.i /*2*/:
                            i3 = 10;
                            break;
                        case at.o /*3*/:
                            i3 = 56;
                            break;
                        default:
                            i3 = 63;
                            break;
                    }
                    cArr[i2] = (char) (i3 ^ c);
                }
                str = new String(cArr).intern();
                switch (obj) {
                    case v.m /*0*/:
                        strArr2[i] = str;
                        str = "B\fd]H&Cf\\Z\u001c\u0011";
                        i = 2;
                        strArr2 = strArr3;
                        obj = 1;
                        break;
                    case at.g /*1*/:
                        strArr2[i] = str;
                        str = "B\f~WfS";
                        i = 3;
                        strArr2 = strArr3;
                        obj = 2;
                        break;
                    case at.i /*2*/:
                        strArr2[i] = str;
                        str = "B\flJP\u0003t7";
                        i = 4;
                        strArr2 = strArr3;
                        obj = 3;
                        break;
                    case at.o /*3*/:
                        strArr2[i] = str;
                        i = 5;
                        strArr2 = strArr3;
                        str = "B\f~WgS";
                        obj = 4;
                        break;
                    case at.p /*4*/:
                        strArr2[i] = str;
                        z = strArr3;
                        return;
                    default:
                        strArr2[i] = str;
                        str = "-DkVX\u000bed^P\u0015Cf\\w\u0001@n]MS";
                        i = 1;
                        strArr2 = strArr3;
                        obj = null;
                        break;
                }
            }
        }

        public String toString() {
            return z[1] + this.oldHolder + z[2] + this.newHolder + z[4] + this.fromX + z[0] + this.fromY + z[5] + this.toX + z[3] + this.toY + '}';
        }

        private ChangeInfo(ViewHolder viewHolder, ViewHolder viewHolder2) {
            this.oldHolder = viewHolder;
            this.newHolder = viewHolder2;
        }

        private ChangeInfo(ViewHolder viewHolder, ViewHolder viewHolder2, int i, int i2, int i3, int i4) {
            this(viewHolder, viewHolder2);
            this.fromX = i;
            this.fromY = i2;
            this.toX = i3;
            this.toY = i4;
        }

        ChangeInfo(ViewHolder viewHolder, ViewHolder viewHolder2, int i, int i2, int i3, int i4, 1 1) {
            this(viewHolder, viewHolder2, i, i2, i3, i4);
        }
    }

    class MoveInfo {
        public int fromX;
        public int fromY;
        public ViewHolder holder;
        public int toX;
        public int toY;

        private MoveInfo(ViewHolder viewHolder, int i, int i2, int i3, int i4) {
            this.holder = viewHolder;
            this.fromX = i;
            this.fromY = i2;
            this.toX = i3;
            this.toY = i4;
        }

        MoveInfo(ViewHolder viewHolder, int i, int i2, int i3, int i4, 1 1) {
            this(viewHolder, i, i2, i3, i4);
        }
    }

    private void endChangeAnimation(List list, ViewHolder viewHolder) {
        int i = ViewHolder.a;
        int size = list.size() - 1;
        while (size >= 0) {
            ChangeInfo changeInfo = (ChangeInfo) list.get(size);
            if (endChangeAnimationIfNecessary(changeInfo, viewHolder) && changeInfo.oldHolder == null && changeInfo.newHolder == null) {
                list.remove(changeInfo);
            }
            int i2 = size - 1;
            if (i == 0) {
                size = i2;
            } else {
                return;
            }
        }
    }

    static void access$400(DefaultItemAnimator defaultItemAnimator, ViewHolder viewHolder) {
        defaultItemAnimator.animateAddImpl(viewHolder);
    }

    static ArrayList access$900(DefaultItemAnimator defaultItemAnimator) {
        return defaultItemAnimator.mAddAnimations;
    }

    public void endAnimation(ViewHolder viewHolder) {
        int i = ViewHolder.a;
        View view = viewHolder.itemView;
        ViewCompat.animate(view).cancel();
        int size = this.mPendingMoves.size() - 1;
        while (size >= 0) {
            if (((MoveInfo) this.mPendingMoves.get(size)).holder == viewHolder) {
                ViewCompat.setTranslationY(view, 0.0f);
                ViewCompat.setTranslationX(view, 0.0f);
                dispatchMoveFinished(viewHolder);
                this.mPendingMoves.remove(size);
            }
            int i2 = size - 1;
            if (i != 0) {
                break;
            }
            size = i2;
        }
        endChangeAnimation(this.mPendingChanges, viewHolder);
        if (this.mPendingRemovals.remove(viewHolder)) {
            ViewCompat.setAlpha(view, 1.0f);
            dispatchRemoveFinished(viewHolder);
        }
        if (this.mPendingAdditions.remove(viewHolder)) {
            ViewCompat.setAlpha(view, 1.0f);
            dispatchAddFinished(viewHolder);
        }
        size = this.mChangesList.size() - 1;
        while (size >= 0) {
            ArrayList arrayList = (ArrayList) this.mChangesList.get(size);
            endChangeAnimation(arrayList, viewHolder);
            if (arrayList.isEmpty()) {
                this.mChangesList.remove(size);
            }
            i2 = size - 1;
            if (i != 0) {
                break;
            }
            size = i2;
        }
        int size2 = this.mMovesList.size() - 1;
        while (size2 >= 0) {
            arrayList = (ArrayList) this.mMovesList.get(size2);
            int size3 = arrayList.size() - 1;
            while (size3 >= 0) {
                if (((MoveInfo) arrayList.get(size3)).holder == viewHolder) {
                    ViewCompat.setTranslationY(view, 0.0f);
                    ViewCompat.setTranslationX(view, 0.0f);
                    dispatchMoveFinished(viewHolder);
                    arrayList.remove(size3);
                    if (!arrayList.isEmpty()) {
                        break;
                    }
                    this.mMovesList.remove(size2);
                    if (i == 0) {
                        break;
                    }
                }
                size = size3 - 1;
                if (i != 0) {
                    break;
                }
                size3 = size;
            }
            i2 = size2 - 1;
            if (i != 0) {
                break;
            }
            size2 = i2;
        }
        size = this.mAdditionsList.size() - 1;
        while (size >= 0) {
            arrayList = (ArrayList) this.mAdditionsList.get(size);
            if (arrayList.remove(viewHolder)) {
                ViewCompat.setAlpha(view, 1.0f);
                dispatchAddFinished(viewHolder);
                if (arrayList.isEmpty()) {
                    this.mAdditionsList.remove(size);
                }
            }
            i2 = size - 1;
            if (i != 0) {
                break;
            }
            size = i2;
        }
        if (this.mRemoveAnimations.remove(viewHolder)) {
        }
        if (this.mAddAnimations.remove(viewHolder)) {
        }
        if (this.mChangeAnimations.remove(viewHolder)) {
        }
        if (this.mMoveAnimations.remove(viewHolder)) {
            dispatchFinishedWhenDone();
        } else {
            dispatchFinishedWhenDone();
        }
    }

    public boolean animateMove(ViewHolder viewHolder, int i, int i2, int i3, int i4) {
        View view = viewHolder.itemView;
        int translationX = (int) (((float) i) + ViewCompat.getTranslationX(viewHolder.itemView));
        int translationY = (int) (((float) i2) + ViewCompat.getTranslationY(viewHolder.itemView));
        resetAnimation(viewHolder);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            dispatchMoveFinished(viewHolder);
            return false;
        }
        if (i5 != 0) {
            ViewCompat.setTranslationX(view, (float) (-i5));
        }
        if (i6 != 0) {
            ViewCompat.setTranslationY(view, (float) (-i6));
        }
        this.mPendingMoves.add(new MoveInfo(viewHolder, translationX, translationY, i3, i4, null));
        return true;
    }

    static ArrayList access$100(DefaultItemAnimator defaultItemAnimator) {
        return defaultItemAnimator.mMovesList;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void runPendingAnimations() {
        /*
        r14 = this;
        r6 = 0;
        r0 = 1;
        r2 = 0;
        r12 = android.support.v7.widget.RecyclerView.ViewHolder.a;
        r1 = r14.mPendingRemovals;
        r1 = r1.isEmpty();
        if (r1 != 0) goto L_0x0033;
    L_0x000e:
        r1 = r0;
    L_0x000f:
        r3 = r14.mPendingMoves;
        r3 = r3.isEmpty();
        if (r3 != 0) goto L_0x0035;
    L_0x0017:
        r3 = r0;
    L_0x0018:
        r4 = r14.mPendingChanges;
        r4 = r4.isEmpty();
        if (r4 != 0) goto L_0x0037;
    L_0x0020:
        r4 = r0;
    L_0x0021:
        r5 = r14.mPendingAdditions;
        r5 = r5.isEmpty();
        if (r5 != 0) goto L_0x0039;
    L_0x0029:
        r5 = r0;
    L_0x002a:
        if (r1 != 0) goto L_0x003b;
    L_0x002c:
        if (r3 != 0) goto L_0x003b;
    L_0x002e:
        if (r5 != 0) goto L_0x003b;
    L_0x0030:
        if (r4 != 0) goto L_0x003b;
    L_0x0032:
        return;
    L_0x0033:
        r1 = r2;
        goto L_0x000f;
    L_0x0035:
        r3 = r2;
        goto L_0x0018;
    L_0x0037:
        r4 = r2;
        goto L_0x0021;
    L_0x0039:
        r5 = r2;
        goto L_0x002a;
    L_0x003b:
        r0 = r14.mPendingRemovals;
        r8 = r0.iterator();
    L_0x0041:
        r0 = r8.hasNext();
        if (r0 == 0) goto L_0x0052;
    L_0x0047:
        r0 = r8.next();
        r0 = (android.support.v7.widget.RecyclerView.ViewHolder) r0;
        r14.animateRemoveImpl(r0);
        if (r12 == 0) goto L_0x0041;
    L_0x0052:
        r0 = r14.mPendingRemovals;
        r0.clear();
        if (r3 == 0) goto L_0x008a;
    L_0x0059:
        r0 = new java.util.ArrayList;
        r0.<init>();
        r8 = r14.mPendingMoves;
        r0.addAll(r8);
        r8 = r14.mMovesList;
        r8.add(r0);
        r8 = r14.mPendingMoves;
        r8.clear();
        r8 = new android.support.v7.widget.DefaultItemAnimator$1;
        r8.<init>(r14, r0);
        if (r1 == 0) goto L_0x0087;
    L_0x0074:
        r0 = r0.get(r2);
        r0 = (android.support.v7.widget.DefaultItemAnimator.MoveInfo) r0;
        r0 = r0.holder;
        r0 = r0.itemView;
        r10 = r14.getRemoveDuration();
        android.support.v4.view.ViewCompat.postOnAnimationDelayed(r0, r8, r10);
        if (r12 == 0) goto L_0x008a;
    L_0x0087:
        r8.run();
    L_0x008a:
        if (r4 == 0) goto L_0x00bd;
    L_0x008c:
        r0 = new java.util.ArrayList;
        r0.<init>();
        r8 = r14.mPendingChanges;
        r0.addAll(r8);
        r8 = r14.mChangesList;
        r8.add(r0);
        r8 = r14.mPendingChanges;
        r8.clear();
        r8 = new android.support.v7.widget.DefaultItemAnimator$2;
        r8.<init>(r14, r0);
        if (r1 == 0) goto L_0x00ba;
    L_0x00a7:
        r0 = r0.get(r2);
        r0 = (android.support.v7.widget.DefaultItemAnimator.ChangeInfo) r0;
        r0 = r0.oldHolder;
        r0 = r0.itemView;
        r10 = r14.getRemoveDuration();
        android.support.v4.view.ViewCompat.postOnAnimationDelayed(r0, r8, r10);
        if (r12 == 0) goto L_0x00bd;
    L_0x00ba:
        r8.run();
    L_0x00bd:
        if (r5 == 0) goto L_0x0032;
    L_0x00bf:
        r5 = new java.util.ArrayList;
        r5.<init>();
        r0 = r14.mPendingAdditions;
        r5.addAll(r0);
        r0 = r14.mAdditionsList;
        r0.add(r5);
        r0 = r14.mPendingAdditions;
        r0.clear();
        r13 = new android.support.v7.widget.DefaultItemAnimator$3;
        r13.<init>(r14, r5);
        if (r1 != 0) goto L_0x00de;
    L_0x00da:
        if (r3 != 0) goto L_0x00de;
    L_0x00dc:
        if (r4 == 0) goto L_0x0105;
    L_0x00de:
        if (r1 == 0) goto L_0x010a;
    L_0x00e0:
        r0 = r14.getRemoveDuration();
        r10 = r0;
    L_0x00e5:
        if (r3 == 0) goto L_0x010c;
    L_0x00e7:
        r0 = r14.getMoveDuration();
        r8 = r0;
    L_0x00ec:
        if (r4 == 0) goto L_0x010e;
    L_0x00ee:
        r0 = r14.getChangeDuration();
    L_0x00f2:
        r0 = java.lang.Math.max(r8, r0);
        r6 = r10 + r0;
        r0 = r5.get(r2);
        r0 = (android.support.v7.widget.RecyclerView.ViewHolder) r0;
        r0 = r0.itemView;
        android.support.v4.view.ViewCompat.postOnAnimationDelayed(r0, r13, r6);
        if (r12 == 0) goto L_0x0032;
    L_0x0105:
        r13.run();
        goto L_0x0032;
    L_0x010a:
        r10 = r6;
        goto L_0x00e5;
    L_0x010c:
        r8 = r6;
        goto L_0x00ec;
    L_0x010e:
        r0 = r6;
        goto L_0x00f2;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.DefaultItemAnimator.runPendingAnimations():void");
    }

    static void access$200(DefaultItemAnimator defaultItemAnimator, ChangeInfo changeInfo) {
        defaultItemAnimator.animateChangeImpl(changeInfo);
    }

    private void animateRemoveImpl(ViewHolder viewHolder) {
        ViewPropertyAnimatorCompat animate = ViewCompat.animate(viewHolder.itemView);
        this.mRemoveAnimations.add(viewHolder);
        animate.setDuration(getRemoveDuration()).alpha(0.0f).setListener(new 4(this, viewHolder, animate)).start();
    }

    public boolean animateRemove(ViewHolder viewHolder) {
        resetAnimation(viewHolder);
        this.mPendingRemovals.add(viewHolder);
        return true;
    }

    private void resetAnimation(ViewHolder viewHolder) {
        AnimatorCompatHelper.clearInterpolator(viewHolder.itemView);
        endAnimation(viewHolder);
    }

    public boolean animateAdd(ViewHolder viewHolder) {
        resetAnimation(viewHolder);
        ViewCompat.setAlpha(viewHolder.itemView, 0.0f);
        this.mPendingAdditions.add(viewHolder);
        return true;
    }

    public void endAnimations() {
        int i = ViewHolder.a;
        int size = this.mPendingMoves.size() - 1;
        while (size >= 0) {
            MoveInfo moveInfo = (MoveInfo) this.mPendingMoves.get(size);
            View view = moveInfo.holder.itemView;
            ViewCompat.setTranslationY(view, 0.0f);
            ViewCompat.setTranslationX(view, 0.0f);
            dispatchMoveFinished(moveInfo.holder);
            this.mPendingMoves.remove(size);
            int i2 = size - 1;
            if (i != 0) {
                break;
            }
            size = i2;
        }
        size = this.mPendingRemovals.size() - 1;
        while (size >= 0) {
            dispatchRemoveFinished((ViewHolder) this.mPendingRemovals.get(size));
            this.mPendingRemovals.remove(size);
            i2 = size - 1;
            if (i != 0) {
                break;
            }
            size = i2;
        }
        size = this.mPendingAdditions.size() - 1;
        while (size >= 0) {
            ViewHolder viewHolder = (ViewHolder) this.mPendingAdditions.get(size);
            ViewCompat.setAlpha(viewHolder.itemView, 1.0f);
            dispatchAddFinished(viewHolder);
            this.mPendingAdditions.remove(size);
            i2 = size - 1;
            if (i != 0) {
                break;
            }
            size = i2;
        }
        size = this.mPendingChanges.size() - 1;
        while (size >= 0) {
            endChangeAnimationIfNecessary((ChangeInfo) this.mPendingChanges.get(size));
            i2 = size - 1;
            if (i != 0) {
                break;
            }
            size = i2;
        }
        this.mPendingChanges.clear();
        if (isRunning()) {
            ArrayList arrayList;
            int size2;
            int size3 = this.mMovesList.size() - 1;
            while (size3 >= 0) {
                arrayList = (ArrayList) this.mMovesList.get(size3);
                size2 = arrayList.size() - 1;
                while (size2 >= 0) {
                    MoveInfo moveInfo2 = (MoveInfo) arrayList.get(size2);
                    View view2 = moveInfo2.holder.itemView;
                    ViewCompat.setTranslationY(view2, 0.0f);
                    ViewCompat.setTranslationX(view2, 0.0f);
                    dispatchMoveFinished(moveInfo2.holder);
                    arrayList.remove(size2);
                    if (arrayList.isEmpty()) {
                        this.mMovesList.remove(arrayList);
                    }
                    size = size2 - 1;
                    if (i != 0) {
                        break;
                    }
                    size2 = size;
                }
                i2 = size3 - 1;
                if (i != 0) {
                    break;
                }
                size3 = i2;
            }
            size3 = this.mAdditionsList.size() - 1;
            while (size3 >= 0) {
                arrayList = (ArrayList) this.mAdditionsList.get(size3);
                size2 = arrayList.size() - 1;
                while (size2 >= 0) {
                    ViewHolder viewHolder2 = (ViewHolder) arrayList.get(size2);
                    ViewCompat.setAlpha(viewHolder2.itemView, 1.0f);
                    dispatchAddFinished(viewHolder2);
                    arrayList.remove(size2);
                    if (arrayList.isEmpty()) {
                        this.mAdditionsList.remove(arrayList);
                    }
                    size = size2 - 1;
                    if (i != 0) {
                        break;
                    }
                    size2 = size;
                }
                i2 = size3 - 1;
                if (i != 0) {
                    break;
                }
                size3 = i2;
            }
            size3 = this.mChangesList.size() - 1;
            while (size3 >= 0) {
                arrayList = (ArrayList) this.mChangesList.get(size3);
                size2 = arrayList.size() - 1;
                while (size2 >= 0) {
                    endChangeAnimationIfNecessary((ChangeInfo) arrayList.get(size2));
                    if (arrayList.isEmpty()) {
                        this.mChangesList.remove(arrayList);
                    }
                    size = size2 - 1;
                    if (i != 0) {
                        break;
                    }
                    size2 = size;
                }
                i2 = size3 - 1;
                if (i != 0) {
                    break;
                }
                size3 = i2;
            }
            cancelAll(this.mRemoveAnimations);
            cancelAll(this.mMoveAnimations);
            cancelAll(this.mAddAnimations);
            cancelAll(this.mChangeAnimations);
            dispatchAnimationsFinished();
        }
    }

    private void animateAddImpl(ViewHolder viewHolder) {
        ViewPropertyAnimatorCompat animate = ViewCompat.animate(viewHolder.itemView);
        this.mAddAnimations.add(viewHolder);
        animate.alpha(1.0f).setDuration(getAddDuration()).setListener(new 5(this, viewHolder, animate)).start();
    }

    void cancelAll(List list) {
        int i = ViewHolder.a;
        int size = list.size() - 1;
        while (size >= 0) {
            ViewCompat.animate(((ViewHolder) list.get(size)).itemView).cancel();
            int i2 = size - 1;
            if (i == 0) {
                size = i2;
            } else {
                return;
            }
        }
    }

    static ArrayList access$300(DefaultItemAnimator defaultItemAnimator) {
        return defaultItemAnimator.mChangesList;
    }

    public boolean isRunning() {
        return (this.mPendingAdditions.isEmpty() && this.mPendingChanges.isEmpty() && this.mPendingMoves.isEmpty() && this.mPendingRemovals.isEmpty() && this.mMoveAnimations.isEmpty() && this.mRemoveAnimations.isEmpty() && this.mAddAnimations.isEmpty() && this.mChangeAnimations.isEmpty() && this.mMovesList.isEmpty() && this.mAdditionsList.isEmpty() && this.mChangesList.isEmpty()) ? false : true;
    }

    static ArrayList access$700(DefaultItemAnimator defaultItemAnimator) {
        return defaultItemAnimator.mRemoveAnimations;
    }

    static void access$800(DefaultItemAnimator defaultItemAnimator) {
        defaultItemAnimator.dispatchFinishedWhenDone();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean endChangeAnimationIfNecessary(android.support.v7.widget.DefaultItemAnimator.ChangeInfo r7, android.support.v7.widget.RecyclerView.ViewHolder r8) {
        /*
        r6 = this;
        r5 = 0;
        r1 = 1;
        r0 = 0;
        r4 = 0;
        r2 = android.support.v7.widget.RecyclerView.ViewHolder.a;
        r3 = r7.newHolder;
        if (r3 != r8) goto L_0x000e;
    L_0x000a:
        r7.newHolder = r5;
        if (r2 == 0) goto L_0x0018;
    L_0x000e:
        r3 = r7.oldHolder;
        if (r3 != r8) goto L_0x0016;
    L_0x0012:
        r7.oldHolder = r5;
        if (r2 == 0) goto L_0x0017;
    L_0x0016:
        return r0;
    L_0x0017:
        r0 = r1;
    L_0x0018:
        r2 = r8.itemView;
        r3 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        android.support.v4.view.ViewCompat.setAlpha(r2, r3);
        r2 = r8.itemView;
        android.support.v4.view.ViewCompat.setTranslationX(r2, r4);
        r2 = r8.itemView;
        android.support.v4.view.ViewCompat.setTranslationY(r2, r4);
        r6.dispatchChangeFinished(r8, r0);
        r0 = r1;
        goto L_0x0016;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.DefaultItemAnimator.endChangeAnimationIfNecessary(android.support.v7.widget.DefaultItemAnimator$ChangeInfo, android.support.v7.widget.RecyclerView$ViewHolder):boolean");
    }

    private void animateMoveImpl(ViewHolder viewHolder, int i, int i2, int i3, int i4) {
        View view = viewHolder.itemView;
        int i5 = i3 - i;
        int i6 = i4 - i2;
        if (i5 != 0) {
            ViewCompat.animate(view).translationX(0.0f);
        }
        if (i6 != 0) {
            ViewCompat.animate(view).translationY(0.0f);
        }
        ViewPropertyAnimatorCompat animate = ViewCompat.animate(view);
        this.mMoveAnimations.add(viewHolder);
        animate.setDuration(getMoveDuration()).setListener(new 6(this, viewHolder, i5, i6, animate)).start();
    }

    private void endChangeAnimationIfNecessary(ChangeInfo changeInfo) {
        if (changeInfo.oldHolder != null) {
            endChangeAnimationIfNecessary(changeInfo, changeInfo.oldHolder);
        }
        if (changeInfo.newHolder != null) {
            endChangeAnimationIfNecessary(changeInfo, changeInfo.newHolder);
        }
    }

    public boolean animateChange(ViewHolder viewHolder, ViewHolder viewHolder2, int i, int i2, int i3, int i4) {
        if (viewHolder == viewHolder2) {
            return animateMove(viewHolder, i, i2, i3, i4);
        }
        float translationX = ViewCompat.getTranslationX(viewHolder.itemView);
        float translationY = ViewCompat.getTranslationY(viewHolder.itemView);
        float alpha = ViewCompat.getAlpha(viewHolder.itemView);
        resetAnimation(viewHolder);
        int i5 = (int) (((float) (i3 - i)) - translationX);
        int i6 = (int) (((float) (i4 - i2)) - translationY);
        ViewCompat.setTranslationX(viewHolder.itemView, translationX);
        ViewCompat.setTranslationY(viewHolder.itemView, translationY);
        ViewCompat.setAlpha(viewHolder.itemView, alpha);
        if (viewHolder2 != null) {
            resetAnimation(viewHolder2);
            ViewCompat.setTranslationX(viewHolder2.itemView, (float) (-i5));
            ViewCompat.setTranslationY(viewHolder2.itemView, (float) (-i6));
            ViewCompat.setAlpha(viewHolder2.itemView, 0.0f);
        }
        this.mPendingChanges.add(new ChangeInfo(viewHolder, viewHolder2, i, i2, i3, i4, null));
        return true;
    }

    private void dispatchFinishedWhenDone() {
        if (!isRunning()) {
            dispatchAnimationsFinished();
        }
    }

    static ArrayList access$1100(DefaultItemAnimator defaultItemAnimator) {
        return defaultItemAnimator.mMoveAnimations;
    }

    static void access$000(DefaultItemAnimator defaultItemAnimator, ViewHolder viewHolder, int i, int i2, int i3, int i4) {
        defaultItemAnimator.animateMoveImpl(viewHolder, i, i2, i3, i4);
    }

    static ArrayList access$1300(DefaultItemAnimator defaultItemAnimator) {
        return defaultItemAnimator.mChangeAnimations;
    }

    public DefaultItemAnimator() {
        this.mPendingRemovals = new ArrayList();
        this.mPendingAdditions = new ArrayList();
        this.mPendingMoves = new ArrayList();
        this.mPendingChanges = new ArrayList();
        this.mAdditionsList = new ArrayList();
        this.mMovesList = new ArrayList();
        this.mChangesList = new ArrayList();
        this.mAddAnimations = new ArrayList();
        this.mMoveAnimations = new ArrayList();
        this.mRemoveAnimations = new ArrayList();
        this.mChangeAnimations = new ArrayList();
    }

    private void animateChangeImpl(ChangeInfo changeInfo) {
        View view;
        View view2 = null;
        ViewHolder viewHolder = changeInfo.oldHolder;
        if (viewHolder == null) {
            view = null;
        } else {
            view = viewHolder.itemView;
        }
        ViewHolder viewHolder2 = changeInfo.newHolder;
        if (viewHolder2 != null) {
            view2 = viewHolder2.itemView;
        }
        if (view != null) {
            ViewPropertyAnimatorCompat duration = ViewCompat.animate(view).setDuration(getChangeDuration());
            this.mChangeAnimations.add(changeInfo.oldHolder);
            duration.translationX((float) (changeInfo.toX - changeInfo.fromX));
            duration.translationY((float) (changeInfo.toY - changeInfo.fromY));
            duration.alpha(0.0f).setListener(new 7(this, changeInfo, duration)).start();
        }
        if (view2 != null) {
            duration = ViewCompat.animate(view2);
            this.mChangeAnimations.add(changeInfo.newHolder);
            duration.translationX(0.0f).translationY(0.0f).setDuration(getChangeDuration()).alpha(1.0f).setListener(new 8(this, changeInfo, duration, view2)).start();
        }
    }

    static ArrayList access$500(DefaultItemAnimator defaultItemAnimator) {
        return defaultItemAnimator.mAdditionsList;
    }
}
