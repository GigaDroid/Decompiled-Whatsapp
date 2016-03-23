package android.support.v4.app;

import android.os.Build.VERSION;
import android.support.v4.app.FragmentManager.BackStackEntry;
import android.support.v4.app.FragmentTransitionCompat21.EpicenterView;
import android.support.v4.app.FragmentTransitionCompat21.ViewRetriever;
import android.support.v4.util.ArrayMap;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnPreDrawListener;
import com.whatsapp.arj;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Map;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

final class BackStackRecord extends FragmentTransaction implements BackStackEntry, Runnable {
    static final boolean SUPPORTS_TRANSITIONS;
    private static final String[] z;
    boolean mAddToBackStack;
    boolean mAllowAddToBackStack;
    int mBreadCrumbShortTitleRes;
    CharSequence mBreadCrumbShortTitleText;
    int mBreadCrumbTitleRes;
    CharSequence mBreadCrumbTitleText;
    boolean mCommitted;
    int mEnterAnim;
    int mExitAnim;
    Op mHead;
    int mIndex;
    final FragmentManagerImpl mManager;
    String mName;
    int mNumOp;
    int mPopEnterAnim;
    int mPopExitAnim;
    ArrayList mSharedElementSourceNames;
    ArrayList mSharedElementTargetNames;
    Op mTail;
    int mTransition;
    int mTransitionStyle;

    class 1 implements ViewRetriever {
        final BackStackRecord this$0;
        final Fragment val$inFragment;

        1(BackStackRecord backStackRecord, Fragment fragment) {
            this.this$0 = backStackRecord;
            this.val$inFragment = fragment;
        }

        public View getView() {
            return this.val$inFragment.getView();
        }
    }

    class 2 implements OnPreDrawListener {
        final BackStackRecord this$0;
        final Fragment val$inFragment;
        final boolean val$isBack;
        final Fragment val$outFragment;
        final View val$sceneRoot;
        final ArrayList val$sharedElementTargets;
        final Object val$sharedElementTransition;
        final TransitionState val$state;

        2(BackStackRecord backStackRecord, View view, Object obj, ArrayList arrayList, TransitionState transitionState, boolean z, Fragment fragment, Fragment fragment2) {
            this.this$0 = backStackRecord;
            this.val$sceneRoot = view;
            this.val$sharedElementTransition = obj;
            this.val$sharedElementTargets = arrayList;
            this.val$state = transitionState;
            this.val$isBack = z;
            this.val$inFragment = fragment;
            this.val$outFragment = fragment2;
        }

        public boolean onPreDraw() {
            this.val$sceneRoot.getViewTreeObserver().removeOnPreDrawListener(this);
            if (this.val$sharedElementTransition != null) {
                FragmentTransitionCompat21.removeTargets(this.val$sharedElementTransition, this.val$sharedElementTargets);
                this.val$sharedElementTargets.clear();
                ArrayMap access$000 = BackStackRecord.access$000(this.this$0, this.val$state, this.val$isBack, this.val$inFragment);
                FragmentTransitionCompat21.setSharedElementTargets(this.val$sharedElementTransition, this.val$state.nonExistentView, access$000, this.val$sharedElementTargets);
                BackStackRecord.access$100(this.this$0, access$000, this.val$state);
                BackStackRecord.access$200(this.this$0, this.val$state, this.val$inFragment, this.val$outFragment, this.val$isBack, access$000);
            }
            return true;
        }
    }

    class 3 implements OnPreDrawListener {
        final BackStackRecord this$0;
        final int val$containerId;
        final View val$sceneRoot;
        final TransitionState val$state;
        final Object val$transition;

        public boolean onPreDraw() {
            this.val$sceneRoot.getViewTreeObserver().removeOnPreDrawListener(this);
            BackStackRecord.access$300(this.this$0, this.val$state, this.val$containerId, this.val$transition);
            return true;
        }

        3(BackStackRecord backStackRecord, View view, TransitionState transitionState, int i, Object obj) {
            this.this$0 = backStackRecord;
            this.val$sceneRoot = view;
            this.val$state = transitionState;
            this.val$containerId = i;
            this.val$transition = obj;
        }
    }

    final class Op {
        int cmd;
        int enterAnim;
        int exitAnim;
        Fragment fragment;
        Op next;
        int popEnterAnim;
        int popExitAnim;
        Op prev;
        ArrayList removed;

        Op() {
        }
    }

    public class TransitionState {
        public EpicenterView enteringEpicenterView;
        public ArrayList hiddenFragmentViews;
        public ArrayMap nameOverrides;
        public View nonExistentView;
        final BackStackRecord this$0;

        public TransitionState(BackStackRecord backStackRecord) {
            this.this$0 = backStackRecord;
            this.nameOverrides = new ArrayMap();
            this.hiddenFragmentViews = new ArrayList();
            this.enteringEpicenterView = new EpicenterView();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.support.v4.util.ArrayMap mapEnteringSharedElements(android.support.v4.app.BackStackRecord.TransitionState r4, android.support.v4.app.Fragment r5, boolean r6) {
        /*
        r3 = this;
        r0 = new android.support.v4.util.ArrayMap;
        r0.<init>();
        r1 = r5.getView();
        if (r1 == 0) goto L_0x0025;
    L_0x000b:
        r2 = r3.mSharedElementSourceNames;	 Catch:{ IllegalStateException -> 0x0026 }
        if (r2 == 0) goto L_0x0025;
    L_0x000f:
        android.support.v4.app.FragmentTransitionCompat21.findNamedViews(r0, r1);	 Catch:{ IllegalStateException -> 0x0026 }
        if (r6 == 0) goto L_0x0020;
    L_0x0014:
        r1 = r3.mSharedElementSourceNames;
        r2 = r3.mSharedElementTargetNames;
        r0 = remapNames(r1, r2, r0);
        r1 = android.support.v4.app.Fragment.a;	 Catch:{ IllegalStateException -> 0x0028 }
        if (r1 == 0) goto L_0x0025;
    L_0x0020:
        r1 = r3.mSharedElementTargetNames;	 Catch:{ IllegalStateException -> 0x0028 }
        r0.retainAll(r1);	 Catch:{ IllegalStateException -> 0x0028 }
    L_0x0025:
        return r0;
    L_0x0026:
        r0 = move-exception;
        throw r0;
    L_0x0028:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.BackStackRecord.mapEnteringSharedElements(android.support.v4.app.BackStackRecord$TransitionState, android.support.v4.app.Fragment, boolean):android.support.v4.util.ArrayMap");
    }

    private void setLastIn(SparseArray sparseArray, Fragment fragment) {
        if (fragment != null) {
            int i = fragment.mContainerId;
            if (i != 0) {
                try {
                    sparseArray.put(i, fragment);
                } catch (IllegalStateException e) {
                    throw e;
                }
            }
        }
    }

    static ArrayMap access$000(BackStackRecord backStackRecord, TransitionState transitionState, boolean z, Fragment fragment) {
        return backStackRecord.mapSharedElementsIn(transitionState, z, fragment);
    }

    private static ArrayMap remapNames(ArrayList arrayList, ArrayList arrayList2, ArrayMap arrayMap) {
        boolean z = Fragment.a;
        try {
            if (arrayMap.isEmpty()) {
                return arrayMap;
            }
            ArrayMap arrayMap2 = new ArrayMap();
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                View view = (View) arrayMap.get(arrayList.get(i));
                if (view != null) {
                    try {
                        arrayMap2.put(arrayList2.get(i), view);
                    } catch (IllegalStateException e) {
                        throw e;
                    }
                }
                int i2 = i + 1;
                if (z) {
                    break;
                }
                i = i2;
            }
            return arrayMap2;
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    private static Object getEnterTransition(Fragment fragment, boolean z) {
        if (fragment == null) {
            return null;
        }
        Object reenterTransition;
        if (z) {
            try {
                reenterTransition = fragment.getReenterTransition();
            } catch (IllegalStateException e) {
                throw e;
            }
        }
        reenterTransition = fragment.getEnterTransition();
        return FragmentTransitionCompat21.cloneTransition(reenterTransition);
    }

    public FragmentTransaction add(int i, Fragment fragment) {
        doAddOp(i, fragment, null, 1);
        return this;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void setBackNameOverrides(android.support.v4.app.BackStackRecord.TransitionState r7, android.support.v4.util.ArrayMap r8, boolean r9) {
        /*
        r6 = this;
        r0 = 0;
        r4 = android.support.v4.app.Fragment.a;
        r1 = r6.mSharedElementTargetNames;	 Catch:{ IllegalStateException -> 0x003a }
        if (r1 != 0) goto L_0x003c;
    L_0x0007:
        r2 = r0;
    L_0x0008:
        r3 = r0;
    L_0x0009:
        if (r3 >= r2) goto L_0x0039;
    L_0x000b:
        r0 = r6.mSharedElementSourceNames;
        r0 = r0.get(r3);
        r0 = (java.lang.String) r0;
        r1 = r6.mSharedElementTargetNames;
        r1 = r1.get(r3);
        r1 = (java.lang.String) r1;
        r1 = r8.get(r1);
        r1 = (android.view.View) r1;
        if (r1 == 0) goto L_0x0035;
    L_0x0023:
        r1 = android.support.v4.app.FragmentTransitionCompat21.getTransitionName(r1);
        if (r9 == 0) goto L_0x0030;
    L_0x0029:
        r5 = r7.nameOverrides;	 Catch:{ IllegalStateException -> 0x0044 }
        setNameOverride(r5, r0, r1);	 Catch:{ IllegalStateException -> 0x0044 }
        if (r4 == 0) goto L_0x0035;
    L_0x0030:
        r5 = r7.nameOverrides;	 Catch:{ IllegalStateException -> 0x0044 }
        setNameOverride(r5, r1, r0);	 Catch:{ IllegalStateException -> 0x0044 }
    L_0x0035:
        r0 = r3 + 1;
        if (r4 == 0) goto L_0x0046;
    L_0x0039:
        return;
    L_0x003a:
        r0 = move-exception;
        throw r0;
    L_0x003c:
        r1 = r6.mSharedElementTargetNames;
        r1 = r1.size();
        r2 = r1;
        goto L_0x0008;
    L_0x0044:
        r0 = move-exception;
        throw r0;
    L_0x0046:
        r3 = r0;
        goto L_0x0009;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.BackStackRecord.setBackNameOverrides(android.support.v4.app.BackStackRecord$TransitionState, android.support.v4.util.ArrayMap, boolean):void");
    }

    private boolean configureTransitions(int i, TransitionState transitionState, boolean z, SparseArray sparseArray, SparseArray sparseArray2) {
        View view = (ViewGroup) this.mManager.mContainer.onFindViewById(i);
        if (view == null) {
            return false;
        }
        Object obj;
        ArrayList arrayList;
        Object captureExitingViews;
        View view2;
        ViewRetriever 1;
        ArrayList arrayList2;
        Map arrayMap;
        boolean z2;
        Object mergeTransitions;
        Fragment fragment = (Fragment) sparseArray2.get(i);
        Fragment fragment2 = (Fragment) sparseArray.get(i);
        Object enterTransition = getEnterTransition(fragment, z);
        Object sharedElementTransition = getSharedElementTransition(fragment, fragment2, z);
        Object exitTransition = getExitTransition(fragment2, z);
        Map map = null;
        ArrayList arrayList3 = new ArrayList();
        if (sharedElementTransition != null) {
            map = remapSharedElements(transitionState, fragment2, z);
            if (map.isEmpty()) {
                map = null;
                obj = null;
                if (enterTransition != null && obj == null && exitTransition == null) {
                    return false;
                }
                arrayList = new ArrayList();
                captureExitingViews = captureExitingViews(exitTransition, fragment2, arrayList, map, transitionState.nonExistentView);
                if (!(this.mSharedElementTargetNames == null || map == null)) {
                    view2 = (View) map.get(this.mSharedElementTargetNames.get(0));
                    if (view2 != null) {
                        if (captureExitingViews != null) {
                            try {
                                FragmentTransitionCompat21.setEpicenter(captureExitingViews, view2);
                            } catch (IllegalStateException e) {
                                throw e;
                            }
                        }
                        if (obj != null) {
                            try {
                                FragmentTransitionCompat21.setEpicenter(obj, view2);
                            } catch (IllegalStateException e2) {
                                throw e2;
                            }
                        }
                    }
                }
                1 = new 1(this, fragment);
                arrayList2 = new ArrayList();
                arrayMap = new ArrayMap();
                z2 = true;
                if (fragment != null) {
                    if (z) {
                        z2 = fragment.getAllowEnterTransitionOverlap();
                    } else {
                        try {
                            z2 = fragment.getAllowReturnTransitionOverlap();
                        } catch (IllegalStateException e22) {
                            throw e22;
                        }
                    }
                }
                mergeTransitions = FragmentTransitionCompat21.mergeTransitions(enterTransition, captureExitingViews, obj, z2);
                if (mergeTransitions != null) {
                    try {
                        View view3 = view;
                        FragmentTransitionCompat21.addTransitionTargets(enterTransition, obj, view3, 1, transitionState.nonExistentView, transitionState.enteringEpicenterView, transitionState.nameOverrides, arrayList2, map, arrayMap, arrayList3);
                        excludeHiddenFragmentsAfterEnter(view, transitionState, i, mergeTransitions);
                        FragmentTransitionCompat21.excludeTarget(mergeTransitions, transitionState.nonExistentView, true);
                        excludeHiddenFragments(transitionState, i, mergeTransitions);
                        FragmentTransitionCompat21.beginDelayedTransition(view, mergeTransitions);
                        View view4 = view;
                        Object obj2 = enterTransition;
                        ArrayList arrayList4 = arrayList2;
                        Object obj3 = obj;
                        ArrayList arrayList5 = arrayList3;
                        FragmentTransitionCompat21.cleanupTransitions(view4, transitionState.nonExistentView, obj2, arrayList4, captureExitingViews, arrayList, obj3, arrayList5, mergeTransitions, transitionState.hiddenFragmentViews, arrayMap);
                    } catch (IllegalStateException e222) {
                        throw e222;
                    }
                }
                if (mergeTransitions == null) {
                    return true;
                }
                return false;
            }
            SharedElementCallback sharedElementCallback;
            if (z) {
                try {
                    sharedElementCallback = fragment2.mEnterTransitionCallback;
                } catch (IllegalStateException e2222) {
                    throw e2222;
                }
            }
            sharedElementCallback = fragment.mEnterTransitionCallback;
            if (sharedElementCallback != null) {
                sharedElementCallback.onSharedElementStart(new ArrayList(map.keySet()), new ArrayList(map.values()), null);
            }
            prepareSharedElementTransition(transitionState, view, sharedElementTransition, fragment, fragment2, z, arrayList3);
        }
        obj = sharedElementTransition;
        if (enterTransition != null) {
        }
        arrayList = new ArrayList();
        captureExitingViews = captureExitingViews(exitTransition, fragment2, arrayList, map, transitionState.nonExistentView);
        try {
            view2 = (View) map.get(this.mSharedElementTargetNames.get(0));
            if (view2 != null) {
                if (captureExitingViews != null) {
                    FragmentTransitionCompat21.setEpicenter(captureExitingViews, view2);
                }
                if (obj != null) {
                    FragmentTransitionCompat21.setEpicenter(obj, view2);
                }
            }
            1 = new 1(this, fragment);
            arrayList2 = new ArrayList();
            arrayMap = new ArrayMap();
            z2 = true;
            if (fragment != null) {
                if (z) {
                    z2 = fragment.getAllowEnterTransitionOverlap();
                } else {
                    z2 = fragment.getAllowReturnTransitionOverlap();
                }
            }
            mergeTransitions = FragmentTransitionCompat21.mergeTransitions(enterTransition, captureExitingViews, obj, z2);
            if (mergeTransitions != null) {
                View view32 = view;
                FragmentTransitionCompat21.addTransitionTargets(enterTransition, obj, view32, 1, transitionState.nonExistentView, transitionState.enteringEpicenterView, transitionState.nameOverrides, arrayList2, map, arrayMap, arrayList3);
                excludeHiddenFragmentsAfterEnter(view, transitionState, i, mergeTransitions);
                FragmentTransitionCompat21.excludeTarget(mergeTransitions, transitionState.nonExistentView, true);
                excludeHiddenFragments(transitionState, i, mergeTransitions);
                FragmentTransitionCompat21.beginDelayedTransition(view, mergeTransitions);
                View view42 = view;
                Object obj22 = enterTransition;
                ArrayList arrayList42 = arrayList2;
                Object obj32 = obj;
                ArrayList arrayList52 = arrayList3;
                FragmentTransitionCompat21.cleanupTransitions(view42, transitionState.nonExistentView, obj22, arrayList42, captureExitingViews, arrayList, obj32, arrayList52, mergeTransitions, transitionState.hiddenFragmentViews, arrayMap);
            }
            if (mergeTransitions == null) {
                return false;
            }
            return true;
        } catch (IllegalStateException e22222) {
            throw e22222;
        }
    }

    private static Object getExitTransition(Fragment fragment, boolean z) {
        if (fragment == null) {
            return null;
        }
        Object returnTransition;
        if (z) {
            try {
                returnTransition = fragment.getReturnTransition();
            } catch (IllegalStateException e) {
                throw e;
            }
        }
        returnTransition = fragment.getExitTransition();
        return FragmentTransitionCompat21.cloneTransition(returnTransition);
    }

    public FragmentTransaction detach(Fragment fragment) {
        Op op = new Op();
        op.cmd = 6;
        op.fragment = fragment;
        addOp(op);
        return this;
    }

    void bumpBackStackNesting(int i) {
        boolean z = Fragment.a;
        try {
            if (this.mAddToBackStack) {
                try {
                    if (FragmentManagerImpl.DEBUG) {
                        Log.v(z[3], z[5] + this + z[8] + i);
                    }
                    Op op = this.mHead;
                    while (op != null) {
                        try {
                            Fragment fragment;
                            if (op.fragment != null) {
                                fragment = op.fragment;
                                fragment.mBackStackNesting += i;
                                if (FragmentManagerImpl.DEBUG) {
                                    Log.v(z[6], z[7] + op.fragment + z[4] + op.fragment.mBackStackNesting);
                                }
                            }
                            if (op.removed != null) {
                                int size = op.removed.size() - 1;
                                while (size >= 0) {
                                    fragment = (Fragment) op.removed.get(size);
                                    try {
                                        fragment.mBackStackNesting += i;
                                        if (FragmentManagerImpl.DEBUG) {
                                            Log.v(z[2], z[0] + fragment + z[1] + fragment.mBackStackNesting);
                                        }
                                        int i2 = size - 1;
                                        if (z) {
                                            break;
                                        }
                                        size = i2;
                                    } catch (IllegalStateException e) {
                                        throw e;
                                    }
                                }
                            }
                            Op op2 = op.next;
                            if (!z) {
                                op = op2;
                            } else {
                                return;
                            }
                        } catch (IllegalStateException e2) {
                            throw e2;
                        } catch (IllegalStateException e22) {
                            throw e22;
                        }
                    }
                } catch (IllegalStateException e222) {
                    throw e222;
                }
            }
        } catch (IllegalStateException e2222) {
            throw e2222;
        }
    }

    public BackStackRecord(FragmentManagerImpl fragmentManagerImpl) {
        this.mAllowAddToBackStack = true;
        this.mIndex = -1;
        this.mManager = fragmentManagerImpl;
    }

    private static void setNameOverrides(TransitionState transitionState, ArrayList arrayList, ArrayList arrayList2) {
        boolean z = Fragment.a;
        if (arrayList != null) {
            int i = 0;
            while (i < arrayList.size()) {
                setNameOverride(transitionState.nameOverrides, (String) arrayList.get(i), (String) arrayList2.get(i));
                int i2 = i + 1;
                if (!z) {
                    i = i2;
                } else {
                    return;
                }
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void setNameOverrides(android.support.v4.app.BackStackRecord.TransitionState r7, android.support.v4.util.ArrayMap r8, boolean r9) {
        /*
        r6 = this;
        r3 = android.support.v4.app.Fragment.a;
        r4 = r8.size();
        r0 = 0;
        r2 = r0;
    L_0x0008:
        if (r2 >= r4) goto L_0x002c;
    L_0x000a:
        r0 = r8.keyAt(r2);
        r0 = (java.lang.String) r0;
        r1 = r8.valueAt(r2);
        r1 = (android.view.View) r1;
        r1 = android.support.v4.app.FragmentTransitionCompat21.getTransitionName(r1);
        if (r9 == 0) goto L_0x0023;
    L_0x001c:
        r5 = r7.nameOverrides;	 Catch:{ IllegalStateException -> 0x002d }
        setNameOverride(r5, r0, r1);	 Catch:{ IllegalStateException -> 0x002d }
        if (r3 == 0) goto L_0x0028;
    L_0x0023:
        r5 = r7.nameOverrides;	 Catch:{ IllegalStateException -> 0x002d }
        setNameOverride(r5, r1, r0);	 Catch:{ IllegalStateException -> 0x002d }
    L_0x0028:
        r0 = r2 + 1;
        if (r3 == 0) goto L_0x002f;
    L_0x002c:
        return;
    L_0x002d:
        r0 = move-exception;
        throw r0;
    L_0x002f:
        r2 = r0;
        goto L_0x0008;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.BackStackRecord.setNameOverrides(android.support.v4.app.BackStackRecord$TransitionState, android.support.v4.util.ArrayMap, boolean):void");
    }

    private static void setFirstOut(SparseArray sparseArray, Fragment fragment) {
        if (fragment != null) {
            int i = fragment.mContainerId;
            if (i != 0) {
                try {
                    if (!fragment.isHidden()) {
                        if (fragment.isAdded()) {
                            try {
                                if (fragment.getView() != null) {
                                    try {
                                        if (sparseArray.get(i) == null) {
                                            sparseArray.put(i, fragment);
                                        }
                                    } catch (IllegalStateException e) {
                                        throw e;
                                    }
                                }
                            } catch (IllegalStateException e2) {
                                throw e2;
                            }
                        }
                    }
                } catch (IllegalStateException e22) {
                    throw e22;
                } catch (IllegalStateException e222) {
                    throw e222;
                }
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void excludeHiddenFragments(android.support.v4.app.BackStackRecord.TransitionState r6, int r7, java.lang.Object r8) {
        /*
        r5 = this;
        r0 = 0;
        r2 = android.support.v4.app.Fragment.a;
        r1 = r5.mManager;
        r1 = r1.mAdded;
        if (r1 == 0) goto L_0x0058;
    L_0x0009:
        r1 = r0;
    L_0x000a:
        r0 = r5.mManager;
        r0 = r0.mAdded;
        r0 = r0.size();
        if (r1 >= r0) goto L_0x0058;
    L_0x0014:
        r0 = r5.mManager;
        r0 = r0.mAdded;
        r0 = r0.get(r1);
        r0 = (android.support.v4.app.Fragment) r0;
        r3 = r0.mView;	 Catch:{ IllegalStateException -> 0x0059 }
        if (r3 == 0) goto L_0x0054;
    L_0x0022:
        r3 = r0.mContainer;	 Catch:{ IllegalStateException -> 0x005b }
        if (r3 == 0) goto L_0x0054;
    L_0x0026:
        r3 = r0.mContainerId;	 Catch:{ IllegalStateException -> 0x005d }
        if (r3 != r7) goto L_0x0054;
    L_0x002a:
        r3 = r0.mHidden;	 Catch:{ IllegalStateException -> 0x005f }
        if (r3 == 0) goto L_0x0047;
    L_0x002e:
        r3 = r6.hiddenFragmentViews;	 Catch:{ IllegalStateException -> 0x0061 }
        r4 = r0.mView;	 Catch:{ IllegalStateException -> 0x0061 }
        r3 = r3.contains(r4);	 Catch:{ IllegalStateException -> 0x0061 }
        if (r3 != 0) goto L_0x0054;
    L_0x0038:
        r3 = r0.mView;	 Catch:{ IllegalStateException -> 0x0063 }
        r4 = 1;
        android.support.v4.app.FragmentTransitionCompat21.excludeTarget(r8, r3, r4);	 Catch:{ IllegalStateException -> 0x0063 }
        r3 = r6.hiddenFragmentViews;	 Catch:{ IllegalStateException -> 0x0063 }
        r4 = r0.mView;	 Catch:{ IllegalStateException -> 0x0063 }
        r3.add(r4);	 Catch:{ IllegalStateException -> 0x0063 }
        if (r2 == 0) goto L_0x0054;
    L_0x0047:
        r3 = r0.mView;	 Catch:{ IllegalStateException -> 0x0063 }
        r4 = 0;
        android.support.v4.app.FragmentTransitionCompat21.excludeTarget(r8, r3, r4);	 Catch:{ IllegalStateException -> 0x0063 }
        r3 = r6.hiddenFragmentViews;	 Catch:{ IllegalStateException -> 0x0063 }
        r0 = r0.mView;	 Catch:{ IllegalStateException -> 0x0063 }
        r3.remove(r0);	 Catch:{ IllegalStateException -> 0x0063 }
    L_0x0054:
        r0 = r1 + 1;
        if (r2 == 0) goto L_0x0065;
    L_0x0058:
        return;
    L_0x0059:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x005b }
    L_0x005b:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x005d }
    L_0x005d:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x005f }
    L_0x005f:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0061 }
    L_0x0061:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0063 }
    L_0x0063:
        r0 = move-exception;
        throw r0;
    L_0x0065:
        r1 = r0;
        goto L_0x000a;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.BackStackRecord.excludeHiddenFragments(android.support.v4.app.BackStackRecord$TransitionState, int, java.lang.Object):void");
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        dump(str, printWriter, true);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.support.v4.util.ArrayMap mapSharedElementsIn(android.support.v4.app.BackStackRecord.TransitionState r5, boolean r6, android.support.v4.app.Fragment r7) {
        /*
        r4 = this;
        r3 = 1;
        r0 = r4.mapEnteringSharedElements(r5, r7, r6);
        if (r6 == 0) goto L_0x001a;
    L_0x0007:
        r1 = r7.mExitTransitionCallback;	 Catch:{ IllegalStateException -> 0x0029 }
        if (r1 == 0) goto L_0x0012;
    L_0x000b:
        r1 = r7.mExitTransitionCallback;	 Catch:{ IllegalStateException -> 0x0029 }
        r2 = r4.mSharedElementTargetNames;	 Catch:{ IllegalStateException -> 0x0029 }
        r1.onMapSharedElements(r2, r0);	 Catch:{ IllegalStateException -> 0x0029 }
    L_0x0012:
        r1 = 1;
        r4.setBackNameOverrides(r5, r0, r1);	 Catch:{ IllegalStateException -> 0x002b }
        r1 = android.support.v4.app.Fragment.a;	 Catch:{ IllegalStateException -> 0x002b }
        if (r1 == 0) goto L_0x0028;
    L_0x001a:
        r1 = r7.mEnterTransitionCallback;	 Catch:{ IllegalStateException -> 0x002d }
        if (r1 == 0) goto L_0x0025;
    L_0x001e:
        r1 = r7.mEnterTransitionCallback;	 Catch:{ IllegalStateException -> 0x002d }
        r2 = r4.mSharedElementTargetNames;	 Catch:{ IllegalStateException -> 0x002d }
        r1.onMapSharedElements(r2, r0);	 Catch:{ IllegalStateException -> 0x002d }
    L_0x0025:
        r4.setNameOverrides(r5, r0, r3);
    L_0x0028:
        return r0;
    L_0x0029:
        r0 = move-exception;
        throw r0;
    L_0x002b:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x002d }
    L_0x002d:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.BackStackRecord.mapSharedElementsIn(android.support.v4.app.BackStackRecord$TransitionState, boolean, android.support.v4.app.Fragment):android.support.v4.util.ArrayMap");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void dump(java.lang.String r9, java.io.PrintWriter r10, boolean r11) {
        /*
        r8 = this;
        r1 = 0;
        r4 = android.support.v4.app.Fragment.a;
        if (r11 == 0) goto L_0x0111;
    L_0x0005:
        r10.print(r9);	 Catch:{ IllegalStateException -> 0x0245 }
        r0 = z;	 Catch:{ IllegalStateException -> 0x0245 }
        r2 = 39;
        r0 = r0[r2];	 Catch:{ IllegalStateException -> 0x0245 }
        r10.print(r0);	 Catch:{ IllegalStateException -> 0x0245 }
        r0 = r8.mName;	 Catch:{ IllegalStateException -> 0x0245 }
        r10.print(r0);	 Catch:{ IllegalStateException -> 0x0245 }
        r0 = z;	 Catch:{ IllegalStateException -> 0x0245 }
        r2 = 29;
        r0 = r0[r2];	 Catch:{ IllegalStateException -> 0x0245 }
        r10.print(r0);	 Catch:{ IllegalStateException -> 0x0245 }
        r0 = r8.mIndex;	 Catch:{ IllegalStateException -> 0x0245 }
        r10.print(r0);	 Catch:{ IllegalStateException -> 0x0245 }
        r0 = z;	 Catch:{ IllegalStateException -> 0x0245 }
        r2 = 22;
        r0 = r0[r2];	 Catch:{ IllegalStateException -> 0x0245 }
        r10.print(r0);	 Catch:{ IllegalStateException -> 0x0245 }
        r0 = r8.mCommitted;	 Catch:{ IllegalStateException -> 0x0245 }
        r10.println(r0);	 Catch:{ IllegalStateException -> 0x0245 }
        r0 = r8.mTransition;	 Catch:{ IllegalStateException -> 0x0245 }
        if (r0 == 0) goto L_0x005d;
    L_0x0036:
        r10.print(r9);	 Catch:{ IllegalStateException -> 0x0245 }
        r0 = z;	 Catch:{ IllegalStateException -> 0x0245 }
        r2 = 42;
        r0 = r0[r2];	 Catch:{ IllegalStateException -> 0x0245 }
        r10.print(r0);	 Catch:{ IllegalStateException -> 0x0245 }
        r0 = r8.mTransition;	 Catch:{ IllegalStateException -> 0x0245 }
        r0 = java.lang.Integer.toHexString(r0);	 Catch:{ IllegalStateException -> 0x0245 }
        r10.print(r0);	 Catch:{ IllegalStateException -> 0x0245 }
        r0 = z;	 Catch:{ IllegalStateException -> 0x0245 }
        r2 = 44;
        r0 = r0[r2];	 Catch:{ IllegalStateException -> 0x0245 }
        r10.print(r0);	 Catch:{ IllegalStateException -> 0x0245 }
        r0 = r8.mTransitionStyle;	 Catch:{ IllegalStateException -> 0x0245 }
        r0 = java.lang.Integer.toHexString(r0);	 Catch:{ IllegalStateException -> 0x0245 }
        r10.println(r0);	 Catch:{ IllegalStateException -> 0x0245 }
    L_0x005d:
        r0 = r8.mEnterAnim;	 Catch:{ IllegalStateException -> 0x0247 }
        if (r0 != 0) goto L_0x0065;
    L_0x0061:
        r0 = r8.mExitAnim;	 Catch:{ IllegalStateException -> 0x0249 }
        if (r0 == 0) goto L_0x008c;
    L_0x0065:
        r10.print(r9);	 Catch:{ IllegalStateException -> 0x0249 }
        r0 = z;	 Catch:{ IllegalStateException -> 0x0249 }
        r2 = 46;
        r0 = r0[r2];	 Catch:{ IllegalStateException -> 0x0249 }
        r10.print(r0);	 Catch:{ IllegalStateException -> 0x0249 }
        r0 = r8.mEnterAnim;	 Catch:{ IllegalStateException -> 0x0249 }
        r0 = java.lang.Integer.toHexString(r0);	 Catch:{ IllegalStateException -> 0x0249 }
        r10.print(r0);	 Catch:{ IllegalStateException -> 0x0249 }
        r0 = z;	 Catch:{ IllegalStateException -> 0x0249 }
        r2 = 23;
        r0 = r0[r2];	 Catch:{ IllegalStateException -> 0x0249 }
        r10.print(r0);	 Catch:{ IllegalStateException -> 0x0249 }
        r0 = r8.mExitAnim;	 Catch:{ IllegalStateException -> 0x0249 }
        r0 = java.lang.Integer.toHexString(r0);	 Catch:{ IllegalStateException -> 0x0249 }
        r10.println(r0);	 Catch:{ IllegalStateException -> 0x0249 }
    L_0x008c:
        r0 = r8.mPopEnterAnim;	 Catch:{ IllegalStateException -> 0x024b }
        if (r0 != 0) goto L_0x0094;
    L_0x0090:
        r0 = r8.mPopExitAnim;	 Catch:{ IllegalStateException -> 0x024d }
        if (r0 == 0) goto L_0x00bb;
    L_0x0094:
        r10.print(r9);	 Catch:{ IllegalStateException -> 0x024d }
        r0 = z;	 Catch:{ IllegalStateException -> 0x024d }
        r2 = 30;
        r0 = r0[r2];	 Catch:{ IllegalStateException -> 0x024d }
        r10.print(r0);	 Catch:{ IllegalStateException -> 0x024d }
        r0 = r8.mPopEnterAnim;	 Catch:{ IllegalStateException -> 0x024d }
        r0 = java.lang.Integer.toHexString(r0);	 Catch:{ IllegalStateException -> 0x024d }
        r10.print(r0);	 Catch:{ IllegalStateException -> 0x024d }
        r0 = z;	 Catch:{ IllegalStateException -> 0x024d }
        r2 = 31;
        r0 = r0[r2];	 Catch:{ IllegalStateException -> 0x024d }
        r10.print(r0);	 Catch:{ IllegalStateException -> 0x024d }
        r0 = r8.mPopExitAnim;	 Catch:{ IllegalStateException -> 0x024d }
        r0 = java.lang.Integer.toHexString(r0);	 Catch:{ IllegalStateException -> 0x024d }
        r10.println(r0);	 Catch:{ IllegalStateException -> 0x024d }
    L_0x00bb:
        r0 = r8.mBreadCrumbTitleRes;	 Catch:{ IllegalStateException -> 0x024f }
        if (r0 != 0) goto L_0x00c3;
    L_0x00bf:
        r0 = r8.mBreadCrumbTitleText;	 Catch:{ IllegalStateException -> 0x0251 }
        if (r0 == 0) goto L_0x00e6;
    L_0x00c3:
        r10.print(r9);	 Catch:{ IllegalStateException -> 0x0251 }
        r0 = z;	 Catch:{ IllegalStateException -> 0x0251 }
        r2 = 45;
        r0 = r0[r2];	 Catch:{ IllegalStateException -> 0x0251 }
        r10.print(r0);	 Catch:{ IllegalStateException -> 0x0251 }
        r0 = r8.mBreadCrumbTitleRes;	 Catch:{ IllegalStateException -> 0x0251 }
        r0 = java.lang.Integer.toHexString(r0);	 Catch:{ IllegalStateException -> 0x0251 }
        r10.print(r0);	 Catch:{ IllegalStateException -> 0x0251 }
        r0 = z;	 Catch:{ IllegalStateException -> 0x0251 }
        r2 = 32;
        r0 = r0[r2];	 Catch:{ IllegalStateException -> 0x0251 }
        r10.print(r0);	 Catch:{ IllegalStateException -> 0x0251 }
        r0 = r8.mBreadCrumbTitleText;	 Catch:{ IllegalStateException -> 0x0251 }
        r10.println(r0);	 Catch:{ IllegalStateException -> 0x0251 }
    L_0x00e6:
        r0 = r8.mBreadCrumbShortTitleRes;	 Catch:{ IllegalStateException -> 0x0253 }
        if (r0 != 0) goto L_0x00ee;
    L_0x00ea:
        r0 = r8.mBreadCrumbShortTitleText;	 Catch:{ IllegalStateException -> 0x0255 }
        if (r0 == 0) goto L_0x0111;
    L_0x00ee:
        r10.print(r9);	 Catch:{ IllegalStateException -> 0x0255 }
        r0 = z;	 Catch:{ IllegalStateException -> 0x0255 }
        r2 = 25;
        r0 = r0[r2];	 Catch:{ IllegalStateException -> 0x0255 }
        r10.print(r0);	 Catch:{ IllegalStateException -> 0x0255 }
        r0 = r8.mBreadCrumbShortTitleRes;	 Catch:{ IllegalStateException -> 0x0255 }
        r0 = java.lang.Integer.toHexString(r0);	 Catch:{ IllegalStateException -> 0x0255 }
        r10.print(r0);	 Catch:{ IllegalStateException -> 0x0255 }
        r0 = z;	 Catch:{ IllegalStateException -> 0x0255 }
        r2 = 36;
        r0 = r0[r2];	 Catch:{ IllegalStateException -> 0x0255 }
        r10.print(r0);	 Catch:{ IllegalStateException -> 0x0255 }
        r0 = r8.mBreadCrumbShortTitleText;	 Catch:{ IllegalStateException -> 0x0255 }
        r10.println(r0);	 Catch:{ IllegalStateException -> 0x0255 }
    L_0x0111:
        r0 = r8.mHead;
        if (r0 == 0) goto L_0x0244;
    L_0x0115:
        r10.print(r9);
        r0 = z;
        r2 = 35;
        r0 = r0[r2];
        r10.println(r0);
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r0 = r0.append(r9);
        r2 = z;
        r3 = 37;
        r2 = r2[r3];
        r0 = r0.append(r2);
        r5 = r0.toString();
        r0 = r8.mHead;
        r2 = r1;
        r3 = r0;
    L_0x013c:
        if (r3 == 0) goto L_0x0244;
    L_0x013e:
        r0 = r3.cmd;
        switch(r0) {
            case 0: goto L_0x0257;
            case 1: goto L_0x025f;
            case 2: goto L_0x0267;
            case 3: goto L_0x026f;
            case 4: goto L_0x0277;
            case 5: goto L_0x027f;
            case 6: goto L_0x0287;
            case 7: goto L_0x028f;
            default: goto L_0x0143;
        };
    L_0x0143:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r6 = z;
        r7 = 53;
        r6 = r6[r7];
        r0 = r0.append(r6);
        r6 = r3.cmd;
        r0 = r0.append(r6);
        r0 = r0.toString();
    L_0x015c:
        r10.print(r9);	 Catch:{ IllegalStateException -> 0x0299 }
        r6 = z;	 Catch:{ IllegalStateException -> 0x0299 }
        r7 = 40;
        r6 = r6[r7];	 Catch:{ IllegalStateException -> 0x0299 }
        r10.print(r6);	 Catch:{ IllegalStateException -> 0x0299 }
        r10.print(r2);	 Catch:{ IllegalStateException -> 0x0299 }
        r6 = z;	 Catch:{ IllegalStateException -> 0x0299 }
        r7 = 24;
        r6 = r6[r7];	 Catch:{ IllegalStateException -> 0x0299 }
        r10.print(r6);	 Catch:{ IllegalStateException -> 0x0299 }
        r10.print(r0);	 Catch:{ IllegalStateException -> 0x0299 }
        r0 = " ";
        r10.print(r0);	 Catch:{ IllegalStateException -> 0x0299 }
        r0 = r3.fragment;	 Catch:{ IllegalStateException -> 0x0299 }
        r10.println(r0);	 Catch:{ IllegalStateException -> 0x0299 }
        if (r11 == 0) goto L_0x01e2;
    L_0x0184:
        r0 = r3.enterAnim;	 Catch:{ IllegalStateException -> 0x029b }
        if (r0 != 0) goto L_0x018c;
    L_0x0188:
        r0 = r3.exitAnim;	 Catch:{ IllegalStateException -> 0x029d }
        if (r0 == 0) goto L_0x01b3;
    L_0x018c:
        r10.print(r9);	 Catch:{ IllegalStateException -> 0x029d }
        r0 = z;	 Catch:{ IllegalStateException -> 0x029d }
        r6 = 47;
        r0 = r0[r6];	 Catch:{ IllegalStateException -> 0x029d }
        r10.print(r0);	 Catch:{ IllegalStateException -> 0x029d }
        r0 = r3.enterAnim;	 Catch:{ IllegalStateException -> 0x029d }
        r0 = java.lang.Integer.toHexString(r0);	 Catch:{ IllegalStateException -> 0x029d }
        r10.print(r0);	 Catch:{ IllegalStateException -> 0x029d }
        r0 = z;	 Catch:{ IllegalStateException -> 0x029d }
        r6 = 50;
        r0 = r0[r6];	 Catch:{ IllegalStateException -> 0x029d }
        r10.print(r0);	 Catch:{ IllegalStateException -> 0x029d }
        r0 = r3.exitAnim;	 Catch:{ IllegalStateException -> 0x029d }
        r0 = java.lang.Integer.toHexString(r0);	 Catch:{ IllegalStateException -> 0x029d }
        r10.println(r0);	 Catch:{ IllegalStateException -> 0x029d }
    L_0x01b3:
        r0 = r3.popEnterAnim;	 Catch:{ IllegalStateException -> 0x029f }
        if (r0 != 0) goto L_0x01bb;
    L_0x01b7:
        r0 = r3.popExitAnim;	 Catch:{ IllegalStateException -> 0x02a1 }
        if (r0 == 0) goto L_0x01e2;
    L_0x01bb:
        r10.print(r9);	 Catch:{ IllegalStateException -> 0x02a1 }
        r0 = z;	 Catch:{ IllegalStateException -> 0x02a1 }
        r6 = 33;
        r0 = r0[r6];	 Catch:{ IllegalStateException -> 0x02a1 }
        r10.print(r0);	 Catch:{ IllegalStateException -> 0x02a1 }
        r0 = r3.popEnterAnim;	 Catch:{ IllegalStateException -> 0x02a1 }
        r0 = java.lang.Integer.toHexString(r0);	 Catch:{ IllegalStateException -> 0x02a1 }
        r10.print(r0);	 Catch:{ IllegalStateException -> 0x02a1 }
        r0 = z;	 Catch:{ IllegalStateException -> 0x02a1 }
        r6 = 51;
        r0 = r0[r6];	 Catch:{ IllegalStateException -> 0x02a1 }
        r10.print(r0);	 Catch:{ IllegalStateException -> 0x02a1 }
        r0 = r3.popExitAnim;	 Catch:{ IllegalStateException -> 0x02a1 }
        r0 = java.lang.Integer.toHexString(r0);	 Catch:{ IllegalStateException -> 0x02a1 }
        r10.println(r0);	 Catch:{ IllegalStateException -> 0x02a1 }
    L_0x01e2:
        r0 = r3.removed;	 Catch:{ IllegalStateException -> 0x02a3 }
        if (r0 == 0) goto L_0x023e;
    L_0x01e6:
        r0 = r3.removed;	 Catch:{ IllegalStateException -> 0x02a3 }
        r0 = r0.size();	 Catch:{ IllegalStateException -> 0x02a3 }
        if (r0 <= 0) goto L_0x023e;
    L_0x01ee:
        r0 = r1;
    L_0x01ef:
        r6 = r3.removed;
        r6 = r6.size();
        if (r0 >= r6) goto L_0x023e;
    L_0x01f7:
        r10.print(r5);	 Catch:{ IllegalStateException -> 0x02a5 }
        r6 = r3.removed;	 Catch:{ IllegalStateException -> 0x02a5 }
        r6 = r6.size();	 Catch:{ IllegalStateException -> 0x02a5 }
        r7 = 1;
        if (r6 != r7) goto L_0x020e;
    L_0x0203:
        r6 = z;	 Catch:{ IllegalStateException -> 0x02a7 }
        r7 = 27;
        r6 = r6[r7];	 Catch:{ IllegalStateException -> 0x02a7 }
        r10.print(r6);	 Catch:{ IllegalStateException -> 0x02a7 }
        if (r4 == 0) goto L_0x0231;
    L_0x020e:
        if (r0 != 0) goto L_0x0219;
    L_0x0210:
        r6 = z;	 Catch:{ IllegalStateException -> 0x02a9 }
        r7 = 34;
        r6 = r6[r7];	 Catch:{ IllegalStateException -> 0x02a9 }
        r10.println(r6);	 Catch:{ IllegalStateException -> 0x02a9 }
    L_0x0219:
        r10.print(r5);
        r6 = z;
        r7 = 43;
        r6 = r6[r7];
        r10.print(r6);
        r10.print(r0);
        r6 = z;
        r7 = 48;
        r6 = r6[r7];
        r10.print(r6);
    L_0x0231:
        r6 = r3.removed;
        r6 = r6.get(r0);
        r10.println(r6);
        r0 = r0 + 1;
        if (r4 == 0) goto L_0x01ef;
    L_0x023e:
        r3 = r3.next;
        r0 = r2 + 1;
        if (r4 == 0) goto L_0x02ab;
    L_0x0244:
        return;
    L_0x0245:
        r0 = move-exception;
        throw r0;
    L_0x0247:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0249 }
    L_0x0249:
        r0 = move-exception;
        throw r0;
    L_0x024b:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x024d }
    L_0x024d:
        r0 = move-exception;
        throw r0;
    L_0x024f:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0251 }
    L_0x0251:
        r0 = move-exception;
        throw r0;
    L_0x0253:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0255 }
    L_0x0255:
        r0 = move-exception;
        throw r0;
    L_0x0257:
        r0 = z;
        r6 = 26;
        r0 = r0[r6];
        if (r4 == 0) goto L_0x015c;
    L_0x025f:
        r0 = z;
        r6 = 28;
        r0 = r0[r6];
        if (r4 == 0) goto L_0x015c;
    L_0x0267:
        r0 = z;
        r6 = 38;
        r0 = r0[r6];
        if (r4 == 0) goto L_0x015c;
    L_0x026f:
        r0 = z;
        r6 = 41;
        r0 = r0[r6];
        if (r4 == 0) goto L_0x015c;
    L_0x0277:
        r0 = z;
        r6 = 20;
        r0 = r0[r6];
        if (r4 == 0) goto L_0x015c;
    L_0x027f:
        r0 = z;
        r6 = 21;
        r0 = r0[r6];
        if (r4 == 0) goto L_0x015c;
    L_0x0287:
        r0 = z;
        r6 = 52;
        r0 = r0[r6];
        if (r4 == 0) goto L_0x015c;
    L_0x028f:
        r0 = z;
        r6 = 49;
        r0 = r0[r6];
        if (r4 == 0) goto L_0x015c;
    L_0x0297:
        goto L_0x0143;
    L_0x0299:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x029b }
    L_0x029b:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x029d }
    L_0x029d:
        r0 = move-exception;
        throw r0;
    L_0x029f:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x02a1 }
    L_0x02a1:
        r0 = move-exception;
        throw r0;
    L_0x02a3:
        r0 = move-exception;
        throw r0;
    L_0x02a5:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x02a7 }
    L_0x02a7:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x02a9 }
    L_0x02a9:
        r0 = move-exception;
        throw r0;
    L_0x02ab:
        r2 = r0;
        goto L_0x013c;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.BackStackRecord.dump(java.lang.String, java.io.PrintWriter, boolean):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void calculateBackFragments(android.util.SparseArray r5, android.util.SparseArray r6) {
        /*
        r4 = this;
        r3 = android.support.v4.app.Fragment.a;
        r0 = r4.mManager;	 Catch:{ IllegalStateException -> 0x000d }
        r0 = r0.mContainer;	 Catch:{ IllegalStateException -> 0x000d }
        r0 = r0.onHasView();	 Catch:{ IllegalStateException -> 0x000d }
        if (r0 != 0) goto L_0x000f;
    L_0x000c:
        return;
    L_0x000d:
        r0 = move-exception;
        throw r0;
    L_0x000f:
        r0 = r4.mHead;
        r2 = r0;
    L_0x0012:
        if (r2 == 0) goto L_0x000c;
    L_0x0014:
        r0 = r2.cmd;	 Catch:{ IllegalStateException -> 0x006f }
        switch(r0) {
            case 1: goto L_0x001f;
            case 2: goto L_0x0026;
            case 3: goto L_0x004b;
            case 4: goto L_0x0052;
            case 5: goto L_0x0059;
            case 6: goto L_0x0060;
            case 7: goto L_0x0067;
            default: goto L_0x0019;
        };
    L_0x0019:
        r0 = r2.next;
        if (r3 != 0) goto L_0x000c;
    L_0x001d:
        r2 = r0;
        goto L_0x0012;
    L_0x001f:
        r0 = r2.fragment;	 Catch:{ IllegalStateException -> 0x0071 }
        setFirstOut(r5, r0);	 Catch:{ IllegalStateException -> 0x0071 }
        if (r3 == 0) goto L_0x0019;
    L_0x0026:
        r0 = r2.removed;	 Catch:{ IllegalStateException -> 0x0071 }
        if (r0 == 0) goto L_0x0044;
    L_0x002a:
        r0 = r2.removed;
        r0 = r0.size();
        r0 = r0 + -1;
        r1 = r0;
    L_0x0033:
        if (r1 < 0) goto L_0x0044;
    L_0x0035:
        r0 = r2.removed;
        r0 = r0.get(r1);
        r0 = (android.support.v4.app.Fragment) r0;
        r4.setLastIn(r6, r0);
        r0 = r1 + -1;
        if (r3 == 0) goto L_0x007b;
    L_0x0044:
        r0 = r2.fragment;	 Catch:{ IllegalStateException -> 0x0073 }
        setFirstOut(r5, r0);	 Catch:{ IllegalStateException -> 0x0073 }
        if (r3 == 0) goto L_0x0019;
    L_0x004b:
        r0 = r2.fragment;	 Catch:{ IllegalStateException -> 0x0075 }
        r4.setLastIn(r6, r0);	 Catch:{ IllegalStateException -> 0x0075 }
        if (r3 == 0) goto L_0x0019;
    L_0x0052:
        r0 = r2.fragment;	 Catch:{ IllegalStateException -> 0x0077 }
        r4.setLastIn(r6, r0);	 Catch:{ IllegalStateException -> 0x0077 }
        if (r3 == 0) goto L_0x0019;
    L_0x0059:
        r0 = r2.fragment;	 Catch:{ IllegalStateException -> 0x0079 }
        setFirstOut(r5, r0);	 Catch:{ IllegalStateException -> 0x0079 }
        if (r3 == 0) goto L_0x0019;
    L_0x0060:
        r0 = r2.fragment;	 Catch:{ IllegalStateException -> 0x006d }
        r4.setLastIn(r6, r0);	 Catch:{ IllegalStateException -> 0x006d }
        if (r3 == 0) goto L_0x0019;
    L_0x0067:
        r0 = r2.fragment;	 Catch:{ IllegalStateException -> 0x006d }
        setFirstOut(r5, r0);	 Catch:{ IllegalStateException -> 0x006d }
        goto L_0x0019;
    L_0x006d:
        r0 = move-exception;
        throw r0;
    L_0x006f:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0071 }
    L_0x0071:
        r0 = move-exception;
        throw r0;
    L_0x0073:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0075 }
    L_0x0075:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0077 }
    L_0x0077:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0079 }
    L_0x0079:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x006d }
    L_0x007b:
        r1 = r0;
        goto L_0x0033;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.BackStackRecord.calculateBackFragments(android.util.SparseArray, android.util.SparseArray):void");
    }

    public FragmentTransaction add(Fragment fragment, String str) {
        doAddOp(0, fragment, str, 1);
        return this;
    }

    public FragmentTransaction remove(Fragment fragment) {
        Op op = new Op();
        op.cmd = 3;
        op.fragment = fragment;
        addOp(op);
        return this;
    }

    private static Object captureExitingViews(Object obj, Fragment fragment, ArrayList arrayList, ArrayMap arrayMap, View view) {
        return obj != null ? FragmentTransitionCompat21.captureExitingViews(obj, fragment.getView(), arrayList, arrayMap, view) : obj;
    }

    private static Object getSharedElementTransition(Fragment fragment, Fragment fragment2, boolean z) {
        if (fragment == null || fragment2 == null) {
            return null;
        }
        Object sharedElementReturnTransition;
        if (z) {
            try {
                sharedElementReturnTransition = fragment2.getSharedElementReturnTransition();
            } catch (IllegalStateException e) {
                throw e;
            }
        }
        sharedElementReturnTransition = fragment.getSharedElementEnterTransition();
        return FragmentTransitionCompat21.wrapSharedElementTransition(sharedElementReturnTransition);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
        r15 = this;
        r9 = android.support.v4.app.Fragment.a;
        r0 = android.support.v4.app.FragmentManagerImpl.DEBUG;	 Catch:{ IllegalStateException -> 0x003c }
        if (r0 == 0) goto L_0x0026;
    L_0x0006:
        r0 = z;	 Catch:{ IllegalStateException -> 0x003c }
        r1 = 70;
        r0 = r0[r1];	 Catch:{ IllegalStateException -> 0x003c }
        r1 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x003c }
        r1.<init>();	 Catch:{ IllegalStateException -> 0x003c }
        r2 = z;	 Catch:{ IllegalStateException -> 0x003c }
        r3 = 62;
        r2 = r2[r3];	 Catch:{ IllegalStateException -> 0x003c }
        r1 = r1.append(r2);	 Catch:{ IllegalStateException -> 0x003c }
        r1 = r1.append(r15);	 Catch:{ IllegalStateException -> 0x003c }
        r1 = r1.toString();	 Catch:{ IllegalStateException -> 0x003c }
        android.util.Log.v(r0, r1);	 Catch:{ IllegalStateException -> 0x003c }
    L_0x0026:
        r0 = r15.mAddToBackStack;	 Catch:{ IllegalStateException -> 0x003e }
        if (r0 == 0) goto L_0x0040;
    L_0x002a:
        r0 = r15.mIndex;	 Catch:{ IllegalStateException -> 0x003a }
        if (r0 >= 0) goto L_0x0040;
    L_0x002e:
        r0 = new java.lang.IllegalStateException;	 Catch:{ IllegalStateException -> 0x003a }
        r1 = z;	 Catch:{ IllegalStateException -> 0x003a }
        r2 = 67;
        r1 = r1[r2];	 Catch:{ IllegalStateException -> 0x003a }
        r0.<init>(r1);	 Catch:{ IllegalStateException -> 0x003a }
        throw r0;	 Catch:{ IllegalStateException -> 0x003a }
    L_0x003a:
        r0 = move-exception;
        throw r0;
    L_0x003c:
        r0 = move-exception;
        throw r0;
    L_0x003e:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x003a }
    L_0x0040:
        r0 = 1;
        r15.bumpBackStackNesting(r0);
        r0 = 0;
        r1 = SUPPORTS_TRANSITIONS;
        if (r1 == 0) goto L_0x01dc;
    L_0x0049:
        r0 = new android.util.SparseArray;
        r0.<init>();
        r1 = new android.util.SparseArray;
        r1.<init>();
        r15.calculateFragments(r0, r1);
        r2 = 0;
        r0 = r15.beginTransition(r0, r1, r2);
        r8 = r0;
    L_0x005c:
        if (r8 == 0) goto L_0x0097;
    L_0x005e:
        r0 = 0;
        r1 = r0;
    L_0x0060:
        if (r8 == 0) goto L_0x009b;
    L_0x0062:
        r0 = 0;
        r2 = r0;
    L_0x0064:
        r0 = r15.mHead;
        r7 = r0;
    L_0x0067:
        if (r7 == 0) goto L_0x015a;
    L_0x0069:
        if (r8 == 0) goto L_0x009f;
    L_0x006b:
        r0 = 0;
        r3 = r0;
    L_0x006d:
        if (r8 == 0) goto L_0x00a3;
    L_0x006f:
        r0 = 0;
        r4 = r0;
    L_0x0071:
        r0 = r7.cmd;
        switch(r0) {
            case 1: goto L_0x00a7;
            case 2: goto L_0x00b3;
            case 3: goto L_0x011f;
            case 4: goto L_0x012a;
            case 5: goto L_0x0135;
            case 6: goto L_0x0140;
            case 7: goto L_0x014b;
            default: goto L_0x0076;
        };
    L_0x0076:
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalStateException -> 0x0095 }
        r1 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x0095 }
        r1.<init>();	 Catch:{ IllegalStateException -> 0x0095 }
        r2 = z;	 Catch:{ IllegalStateException -> 0x0095 }
        r3 = 65;
        r2 = r2[r3];	 Catch:{ IllegalStateException -> 0x0095 }
        r1 = r1.append(r2);	 Catch:{ IllegalStateException -> 0x0095 }
        r2 = r7.cmd;	 Catch:{ IllegalStateException -> 0x0095 }
        r1 = r1.append(r2);	 Catch:{ IllegalStateException -> 0x0095 }
        r1 = r1.toString();	 Catch:{ IllegalStateException -> 0x0095 }
        r0.<init>(r1);	 Catch:{ IllegalStateException -> 0x0095 }
        throw r0;	 Catch:{ IllegalStateException -> 0x0095 }
    L_0x0095:
        r0 = move-exception;
        throw r0;
    L_0x0097:
        r0 = r15.mTransitionStyle;
        r1 = r0;
        goto L_0x0060;
    L_0x009b:
        r0 = r15.mTransition;
        r2 = r0;
        goto L_0x0064;
    L_0x009f:
        r0 = r7.enterAnim;
        r3 = r0;
        goto L_0x006d;
    L_0x00a3:
        r0 = r7.exitAnim;
        r4 = r0;
        goto L_0x0071;
    L_0x00a7:
        r0 = r7.fragment;
        r0.mNextAnim = r3;
        r5 = r15.mManager;
        r6 = 0;
        r5.addFragment(r0, r6);
        if (r9 == 0) goto L_0x0156;
    L_0x00b3:
        r5 = r7.fragment;
        r10 = r5.mContainerId;
        r0 = r15.mManager;
        r0 = r0.mAdded;
        if (r0 == 0) goto L_0x01d9;
    L_0x00bd:
        r0 = 0;
        r6 = r5;
        r5 = r0;
    L_0x00c0:
        r0 = r15.mManager;
        r0 = r0.mAdded;
        r0 = r0.size();
        if (r5 >= r0) goto L_0x0113;
    L_0x00ca:
        r0 = r15.mManager;
        r0 = r0.mAdded;
        r0 = r0.get(r5);
        r0 = (android.support.v4.app.Fragment) r0;
        r11 = android.support.v4.app.FragmentManagerImpl.DEBUG;	 Catch:{ IllegalStateException -> 0x016e }
        if (r11 == 0) goto L_0x0106;
    L_0x00d8:
        r11 = z;	 Catch:{ IllegalStateException -> 0x016e }
        r12 = 61;
        r11 = r11[r12];	 Catch:{ IllegalStateException -> 0x016e }
        r12 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x016e }
        r12.<init>();	 Catch:{ IllegalStateException -> 0x016e }
        r13 = z;	 Catch:{ IllegalStateException -> 0x016e }
        r14 = 66;
        r13 = r13[r14];	 Catch:{ IllegalStateException -> 0x016e }
        r12 = r12.append(r13);	 Catch:{ IllegalStateException -> 0x016e }
        r12 = r12.append(r6);	 Catch:{ IllegalStateException -> 0x016e }
        r13 = z;	 Catch:{ IllegalStateException -> 0x016e }
        r14 = 68;
        r13 = r13[r14];	 Catch:{ IllegalStateException -> 0x016e }
        r12 = r12.append(r13);	 Catch:{ IllegalStateException -> 0x016e }
        r12 = r12.append(r0);	 Catch:{ IllegalStateException -> 0x016e }
        r12 = r12.toString();	 Catch:{ IllegalStateException -> 0x016e }
        android.util.Log.v(r11, r12);	 Catch:{ IllegalStateException -> 0x016e }
    L_0x0106:
        r11 = r0.mContainerId;	 Catch:{ IllegalStateException -> 0x0170 }
        if (r11 != r10) goto L_0x010f;
    L_0x010a:
        if (r0 != r6) goto L_0x0172;
    L_0x010c:
        r6 = 0;
        r7.fragment = r6;
    L_0x010f:
        r0 = r5 + 1;
        if (r9 == 0) goto L_0x01d6;
    L_0x0113:
        if (r6 == 0) goto L_0x011d;
    L_0x0115:
        r6.mNextAnim = r3;	 Catch:{ IllegalStateException -> 0x01cf }
        r0 = r15.mManager;	 Catch:{ IllegalStateException -> 0x01cf }
        r5 = 0;
        r0.addFragment(r6, r5);	 Catch:{ IllegalStateException -> 0x01cf }
    L_0x011d:
        if (r9 == 0) goto L_0x0156;
    L_0x011f:
        r0 = r7.fragment;
        r0.mNextAnim = r4;
        r5 = r15.mManager;
        r5.removeFragment(r0, r2, r1);
        if (r9 == 0) goto L_0x0156;
    L_0x012a:
        r0 = r7.fragment;
        r0.mNextAnim = r4;
        r5 = r15.mManager;
        r5.hideFragment(r0, r2, r1);
        if (r9 == 0) goto L_0x0156;
    L_0x0135:
        r0 = r7.fragment;
        r0.mNextAnim = r3;
        r5 = r15.mManager;
        r5.showFragment(r0, r2, r1);
        if (r9 == 0) goto L_0x0156;
    L_0x0140:
        r0 = r7.fragment;
        r0.mNextAnim = r4;
        r4 = r15.mManager;
        r4.detachFragment(r0, r2, r1);
        if (r9 == 0) goto L_0x0156;
    L_0x014b:
        r0 = r7.fragment;
        r0.mNextAnim = r3;	 Catch:{ IllegalStateException -> 0x0095 }
        r3 = r15.mManager;	 Catch:{ IllegalStateException -> 0x0095 }
        r3.attachFragment(r0, r2, r1);	 Catch:{ IllegalStateException -> 0x0095 }
        if (r9 != 0) goto L_0x0076;
    L_0x0156:
        r0 = r7.next;
        if (r9 == 0) goto L_0x01d3;
    L_0x015a:
        r0 = r15.mManager;	 Catch:{ IllegalStateException -> 0x01d1 }
        r3 = r15.mManager;	 Catch:{ IllegalStateException -> 0x01d1 }
        r3 = r3.mCurState;	 Catch:{ IllegalStateException -> 0x01d1 }
        r4 = 1;
        r0.moveToState(r3, r2, r1, r4);	 Catch:{ IllegalStateException -> 0x01d1 }
        r0 = r15.mAddToBackStack;	 Catch:{ IllegalStateException -> 0x01d1 }
        if (r0 == 0) goto L_0x016d;
    L_0x0168:
        r0 = r15.mManager;	 Catch:{ IllegalStateException -> 0x01d1 }
        r0.addBackStackState(r15);	 Catch:{ IllegalStateException -> 0x01d1 }
    L_0x016d:
        return;
    L_0x016e:
        r0 = move-exception;
        throw r0;
    L_0x0170:
        r0 = move-exception;
        throw r0;
    L_0x0172:
        r11 = r7.removed;	 Catch:{ IllegalStateException -> 0x01c9 }
        if (r11 != 0) goto L_0x017d;
    L_0x0176:
        r11 = new java.util.ArrayList;	 Catch:{ IllegalStateException -> 0x01c9 }
        r11.<init>();	 Catch:{ IllegalStateException -> 0x01c9 }
        r7.removed = r11;	 Catch:{ IllegalStateException -> 0x01c9 }
    L_0x017d:
        r11 = r7.removed;	 Catch:{ IllegalStateException -> 0x01cb }
        r11.add(r0);	 Catch:{ IllegalStateException -> 0x01cb }
        r0.mNextAnim = r4;	 Catch:{ IllegalStateException -> 0x01cb }
        r11 = r15.mAddToBackStack;	 Catch:{ IllegalStateException -> 0x01cb }
        if (r11 == 0) goto L_0x01c2;
    L_0x0188:
        r11 = r0.mBackStackNesting;	 Catch:{ IllegalStateException -> 0x01cd }
        r11 = r11 + 1;
        r0.mBackStackNesting = r11;	 Catch:{ IllegalStateException -> 0x01cd }
        r11 = android.support.v4.app.FragmentManagerImpl.DEBUG;	 Catch:{ IllegalStateException -> 0x01cd }
        if (r11 == 0) goto L_0x01c2;
    L_0x0192:
        r11 = z;	 Catch:{ IllegalStateException -> 0x01cd }
        r12 = 63;
        r11 = r11[r12];	 Catch:{ IllegalStateException -> 0x01cd }
        r12 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x01cd }
        r12.<init>();	 Catch:{ IllegalStateException -> 0x01cd }
        r13 = z;	 Catch:{ IllegalStateException -> 0x01cd }
        r14 = 64;
        r13 = r13[r14];	 Catch:{ IllegalStateException -> 0x01cd }
        r12 = r12.append(r13);	 Catch:{ IllegalStateException -> 0x01cd }
        r12 = r12.append(r0);	 Catch:{ IllegalStateException -> 0x01cd }
        r13 = z;	 Catch:{ IllegalStateException -> 0x01cd }
        r14 = 69;
        r13 = r13[r14];	 Catch:{ IllegalStateException -> 0x01cd }
        r12 = r12.append(r13);	 Catch:{ IllegalStateException -> 0x01cd }
        r13 = r0.mBackStackNesting;	 Catch:{ IllegalStateException -> 0x01cd }
        r12 = r12.append(r13);	 Catch:{ IllegalStateException -> 0x01cd }
        r12 = r12.toString();	 Catch:{ IllegalStateException -> 0x01cd }
        android.util.Log.v(r11, r12);	 Catch:{ IllegalStateException -> 0x01cd }
    L_0x01c2:
        r11 = r15.mManager;
        r11.removeFragment(r0, r2, r1);
        goto L_0x010f;
    L_0x01c9:
        r0 = move-exception;
        throw r0;
    L_0x01cb:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x01cd }
    L_0x01cd:
        r0 = move-exception;
        throw r0;
    L_0x01cf:
        r0 = move-exception;
        throw r0;
    L_0x01d1:
        r0 = move-exception;
        throw r0;
    L_0x01d3:
        r7 = r0;
        goto L_0x0067;
    L_0x01d6:
        r5 = r0;
        goto L_0x00c0;
    L_0x01d9:
        r6 = r5;
        goto L_0x0113;
    L_0x01dc:
        r8 = r0;
        goto L_0x005c;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.BackStackRecord.run():void");
    }

    public String getName() {
        return this.mName;
    }

    public FragmentTransaction attach(Fragment fragment) {
        Op op = new Op();
        op.cmd = 7;
        op.fragment = fragment;
        addOp(op);
        return this;
    }

    private void callSharedElementEnd(TransitionState transitionState, Fragment fragment, Fragment fragment2, boolean z, ArrayMap arrayMap) {
        if (z) {
            try {
                SharedElementCallback sharedElementCallback = fragment2.mEnterTransitionCallback;
            } catch (IllegalStateException e) {
                throw e;
            }
        }
        sharedElementCallback = fragment.mEnterTransitionCallback;
        if (sharedElementCallback != null) {
            sharedElementCallback.onSharedElementEnd(new ArrayList(arrayMap.keySet()), new ArrayList(arrayMap.values()), null);
        }
    }

    static void access$100(BackStackRecord backStackRecord, ArrayMap arrayMap, TransitionState transitionState) {
        backStackRecord.setEpicenterIn(arrayMap, transitionState);
    }

    public int commit() {
        return commitInternal(false);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void calculateFragments(android.util.SparseArray r8, android.util.SparseArray r9) {
        /*
        r7 = this;
        r4 = android.support.v4.app.Fragment.a;
        r0 = r7.mManager;	 Catch:{ IllegalStateException -> 0x000d }
        r0 = r0.mContainer;	 Catch:{ IllegalStateException -> 0x000d }
        r0 = r0.onHasView();	 Catch:{ IllegalStateException -> 0x000d }
        if (r0 != 0) goto L_0x000f;
    L_0x000c:
        return;
    L_0x000d:
        r0 = move-exception;
        throw r0;
    L_0x000f:
        r0 = r7.mHead;
        r3 = r0;
    L_0x0012:
        if (r3 == 0) goto L_0x000c;
    L_0x0014:
        r0 = r3.cmd;	 Catch:{ IllegalStateException -> 0x007d }
        switch(r0) {
            case 1: goto L_0x001f;
            case 2: goto L_0x0026;
            case 3: goto L_0x0059;
            case 4: goto L_0x0060;
            case 5: goto L_0x0067;
            case 6: goto L_0x006e;
            case 7: goto L_0x0075;
            default: goto L_0x0019;
        };
    L_0x0019:
        r0 = r3.next;
        if (r4 != 0) goto L_0x000c;
    L_0x001d:
        r3 = r0;
        goto L_0x0012;
    L_0x001f:
        r0 = r3.fragment;	 Catch:{ IllegalStateException -> 0x007d }
        r7.setLastIn(r9, r0);	 Catch:{ IllegalStateException -> 0x007d }
        if (r4 == 0) goto L_0x0019;
    L_0x0026:
        r1 = r3.fragment;
        r0 = r7.mManager;
        r0 = r0.mAdded;
        if (r0 == 0) goto L_0x008f;
    L_0x002e:
        r0 = 0;
        r2 = r1;
        r1 = r0;
    L_0x0031:
        r0 = r7.mManager;
        r0 = r0.mAdded;
        r0 = r0.size();
        if (r1 >= r0) goto L_0x0054;
    L_0x003b:
        r0 = r7.mManager;
        r0 = r0.mAdded;
        r0 = r0.get(r1);
        r0 = (android.support.v4.app.Fragment) r0;
        if (r2 == 0) goto L_0x004d;
    L_0x0047:
        r5 = r0.mContainerId;	 Catch:{ IllegalStateException -> 0x007f }
        r6 = r2.mContainerId;	 Catch:{ IllegalStateException -> 0x007f }
        if (r5 != r6) goto L_0x0050;
    L_0x004d:
        if (r0 != r2) goto L_0x0081;
    L_0x004f:
        r2 = 0;
    L_0x0050:
        r0 = r1 + 1;
        if (r4 == 0) goto L_0x008d;
    L_0x0054:
        r7.setLastIn(r9, r2);	 Catch:{ IllegalStateException -> 0x0085 }
        if (r4 == 0) goto L_0x0019;
    L_0x0059:
        r0 = r3.fragment;	 Catch:{ IllegalStateException -> 0x0087 }
        setFirstOut(r8, r0);	 Catch:{ IllegalStateException -> 0x0087 }
        if (r4 == 0) goto L_0x0019;
    L_0x0060:
        r0 = r3.fragment;	 Catch:{ IllegalStateException -> 0x0089 }
        setFirstOut(r8, r0);	 Catch:{ IllegalStateException -> 0x0089 }
        if (r4 == 0) goto L_0x0019;
    L_0x0067:
        r0 = r3.fragment;	 Catch:{ IllegalStateException -> 0x008b }
        r7.setLastIn(r9, r0);	 Catch:{ IllegalStateException -> 0x008b }
        if (r4 == 0) goto L_0x0019;
    L_0x006e:
        r0 = r3.fragment;	 Catch:{ IllegalStateException -> 0x007b }
        setFirstOut(r8, r0);	 Catch:{ IllegalStateException -> 0x007b }
        if (r4 == 0) goto L_0x0019;
    L_0x0075:
        r0 = r3.fragment;	 Catch:{ IllegalStateException -> 0x007b }
        r7.setLastIn(r9, r0);	 Catch:{ IllegalStateException -> 0x007b }
        goto L_0x0019;
    L_0x007b:
        r0 = move-exception;
        throw r0;
    L_0x007d:
        r0 = move-exception;
        throw r0;
    L_0x007f:
        r0 = move-exception;
        throw r0;
    L_0x0081:
        setFirstOut(r8, r0);
        goto L_0x0050;
    L_0x0085:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0087 }
    L_0x0087:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0089 }
    L_0x0089:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x008b }
    L_0x008b:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x007b }
    L_0x008d:
        r1 = r0;
        goto L_0x0031;
    L_0x008f:
        r2 = r1;
        goto L_0x0054;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.BackStackRecord.calculateFragments(android.util.SparseArray, android.util.SparseArray):void");
    }

    private void setEpicenterIn(ArrayMap arrayMap, TransitionState transitionState) {
        try {
            if (this.mSharedElementTargetNames != null && !arrayMap.isEmpty()) {
                View view = (View) arrayMap.get(this.mSharedElementTargetNames.get(0));
                if (view != null) {
                    try {
                        transitionState.enteringEpicenterView.epicenter = view;
                    } catch (IllegalStateException e) {
                        throw e;
                    }
                }
            }
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void addOp(android.support.v4.app.BackStackRecord.Op r2) {
        /*
        r1 = this;
        r0 = r1.mHead;	 Catch:{ IllegalStateException -> 0x002d }
        if (r0 != 0) goto L_0x000c;
    L_0x0004:
        r1.mTail = r2;	 Catch:{ IllegalStateException -> 0x002f }
        r1.mHead = r2;	 Catch:{ IllegalStateException -> 0x002f }
        r0 = android.support.v4.app.Fragment.a;	 Catch:{ IllegalStateException -> 0x002f }
        if (r0 == 0) goto L_0x0016;
    L_0x000c:
        r0 = r1.mTail;	 Catch:{ IllegalStateException -> 0x002f }
        r2.prev = r0;	 Catch:{ IllegalStateException -> 0x002f }
        r0 = r1.mTail;	 Catch:{ IllegalStateException -> 0x002f }
        r0.next = r2;	 Catch:{ IllegalStateException -> 0x002f }
        r1.mTail = r2;	 Catch:{ IllegalStateException -> 0x002f }
    L_0x0016:
        r0 = r1.mEnterAnim;
        r2.enterAnim = r0;
        r0 = r1.mExitAnim;
        r2.exitAnim = r0;
        r0 = r1.mPopEnterAnim;
        r2.popEnterAnim = r0;
        r0 = r1.mPopExitAnim;
        r2.popExitAnim = r0;
        r0 = r1.mNumOp;
        r0 = r0 + 1;
        r1.mNumOp = r0;
        return;
    L_0x002d:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x002f }
    L_0x002f:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.BackStackRecord.addOp(android.support.v4.app.BackStackRecord$Op):void");
    }

    static void access$200(BackStackRecord backStackRecord, TransitionState transitionState, Fragment fragment, Fragment fragment2, boolean z, ArrayMap arrayMap) {
        backStackRecord.callSharedElementEnd(transitionState, fragment, fragment2, z, arrayMap);
    }

    private void doAddOp(int i, Fragment fragment, String str, int i2) {
        try {
            fragment.mFragmentManager = this.mManager;
            if (str != null) {
                if (fragment.mTag != null) {
                    try {
                        if (!str.equals(fragment.mTag)) {
                            throw new IllegalStateException(z[14] + fragment + z[16] + fragment.mTag + z[19] + str);
                        }
                    } catch (IllegalStateException e) {
                        throw e;
                    }
                }
                fragment.mTag = str;
            }
            if (i != 0) {
                try {
                    if (fragment.mFragmentId != 0) {
                        if (fragment.mFragmentId != i) {
                            throw new IllegalStateException(z[17] + fragment + z[18] + fragment.mFragmentId + z[15] + i);
                        }
                    }
                    fragment.mFragmentId = i;
                    fragment.mContainerId = i;
                } catch (IllegalStateException e2) {
                    throw e2;
                } catch (IllegalStateException e22) {
                    throw e22;
                }
            }
            Op op = new Op();
            op.cmd = i2;
            op.fragment = fragment;
            addOp(op);
        } catch (IllegalStateException e222) {
            throw e222;
        } catch (IllegalStateException e2222) {
            throw e2222;
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(128);
        try {
            stringBuilder.append(z[60]);
            stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
            if (this.mIndex >= 0) {
                stringBuilder.append(z[59]);
                stringBuilder.append(this.mIndex);
            }
            try {
                if (this.mName != null) {
                    stringBuilder.append(" ");
                    stringBuilder.append(this.mName);
                }
                stringBuilder.append("}");
                return stringBuilder.toString();
            } catch (IllegalStateException e) {
                throw e;
            }
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    private static void setNameOverride(ArrayMap arrayMap, String str, String str2) {
        boolean z = Fragment.a;
        if (str != null && str2 != null) {
            int i = 0;
            while (i < arrayMap.size()) {
                try {
                    if (!str.equals(arrayMap.valueAt(i))) {
                        i++;
                        if (z) {
                            break;
                        }
                    }
                    arrayMap.setValueAt(i, str2);
                    return;
                } catch (IllegalStateException e) {
                    throw e;
                }
            }
            arrayMap.put(str, str2);
        }
    }

    static void access$300(BackStackRecord backStackRecord, TransitionState transitionState, int i, Object obj) {
        backStackRecord.excludeHiddenFragments(transitionState, i, obj);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.support.v4.util.ArrayMap remapSharedElements(android.support.v4.app.BackStackRecord.TransitionState r6, android.support.v4.app.Fragment r7, boolean r8) {
        /*
        r5 = this;
        r4 = 0;
        r1 = android.support.v4.app.Fragment.a;
        r0 = new android.support.v4.util.ArrayMap;
        r0.<init>();
        r2 = r5.mSharedElementSourceNames;	 Catch:{ IllegalStateException -> 0x0046 }
        if (r2 == 0) goto L_0x0024;
    L_0x000c:
        r2 = r7.getView();	 Catch:{ IllegalStateException -> 0x0048 }
        android.support.v4.app.FragmentTransitionCompat21.findNamedViews(r0, r2);	 Catch:{ IllegalStateException -> 0x0048 }
        if (r8 == 0) goto L_0x001c;
    L_0x0015:
        r2 = r5.mSharedElementTargetNames;	 Catch:{ IllegalStateException -> 0x0048 }
        r0.retainAll(r2);	 Catch:{ IllegalStateException -> 0x0048 }
        if (r1 == 0) goto L_0x0024;
    L_0x001c:
        r2 = r5.mSharedElementSourceNames;
        r3 = r5.mSharedElementTargetNames;
        r0 = remapNames(r2, r3, r0);
    L_0x0024:
        if (r8 == 0) goto L_0x0037;
    L_0x0026:
        r2 = r7.mEnterTransitionCallback;	 Catch:{ IllegalStateException -> 0x004a }
        if (r2 == 0) goto L_0x0031;
    L_0x002a:
        r2 = r7.mEnterTransitionCallback;	 Catch:{ IllegalStateException -> 0x004a }
        r3 = r5.mSharedElementTargetNames;	 Catch:{ IllegalStateException -> 0x004a }
        r2.onMapSharedElements(r3, r0);	 Catch:{ IllegalStateException -> 0x004a }
    L_0x0031:
        r2 = 0;
        r5.setBackNameOverrides(r6, r0, r2);	 Catch:{ IllegalStateException -> 0x004c }
        if (r1 == 0) goto L_0x0045;
    L_0x0037:
        r1 = r7.mExitTransitionCallback;	 Catch:{ IllegalStateException -> 0x004e }
        if (r1 == 0) goto L_0x0042;
    L_0x003b:
        r1 = r7.mExitTransitionCallback;	 Catch:{ IllegalStateException -> 0x004e }
        r2 = r5.mSharedElementTargetNames;	 Catch:{ IllegalStateException -> 0x004e }
        r1.onMapSharedElements(r2, r0);	 Catch:{ IllegalStateException -> 0x004e }
    L_0x0042:
        r5.setNameOverrides(r6, r0, r4);
    L_0x0045:
        return r0;
    L_0x0046:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0048 }
    L_0x0048:
        r0 = move-exception;
        throw r0;
    L_0x004a:
        r0 = move-exception;
        throw r0;
    L_0x004c:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x004e }
    L_0x004e:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.BackStackRecord.remapSharedElements(android.support.v4.app.BackStackRecord$TransitionState, android.support.v4.app.Fragment, boolean):android.support.v4.util.ArrayMap");
    }

    private void excludeHiddenFragmentsAfterEnter(View view, TransitionState transitionState, int i, Object obj) {
        view.getViewTreeObserver().addOnPreDrawListener(new 3(this, view, transitionState, i, obj));
    }

    private void prepareSharedElementTransition(TransitionState transitionState, View view, Object obj, Fragment fragment, Fragment fragment2, boolean z, ArrayList arrayList) {
        view.getViewTreeObserver().addOnPreDrawListener(new 2(this, view, obj, arrayList, transitionState, z, fragment, fragment2));
    }

    public FragmentTransaction add(int i, Fragment fragment, String str) {
        doAddOp(i, fragment, str, 1);
        return this;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.support.v4.app.BackStackRecord.TransitionState popFromBackStack(boolean r12, android.support.v4.app.BackStackRecord.TransitionState r13, android.util.SparseArray r14, android.util.SparseArray r15) {
        /*
        r11 = this;
        r8 = android.support.v4.app.Fragment.a;
        r0 = android.support.v4.app.FragmentManagerImpl.DEBUG;
        if (r0 == 0) goto L_0x0041;
    L_0x0006:
        r0 = z;
        r1 = 54;
        r0 = r0[r1];
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r3 = 58;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r1 = r1.append(r11);
        r1 = r1.toString();
        android.util.Log.v(r0, r1);
        r0 = new android.support.v4.util.LogWriter;
        r1 = z;
        r2 = 55;
        r1 = r1[r2];
        r0.<init>(r1);
        r1 = new java.io.PrintWriter;
        r1.<init>(r0);
        r0 = z;
        r2 = 56;
        r0 = r0[r2];
        r2 = 0;
        r3 = 0;
        r11.dump(r0, r2, r1, r3);
    L_0x0041:
        r0 = SUPPORTS_TRANSITIONS;	 Catch:{ IllegalStateException -> 0x00a3 }
        if (r0 == 0) goto L_0x0177;
    L_0x0045:
        if (r13 != 0) goto L_0x005a;
    L_0x0047:
        r0 = r14.size();	 Catch:{ IllegalStateException -> 0x00a7 }
        if (r0 != 0) goto L_0x0053;
    L_0x004d:
        r0 = r15.size();	 Catch:{ IllegalStateException -> 0x00a7 }
        if (r0 == 0) goto L_0x0177;
    L_0x0053:
        r0 = 1;
        r13 = r11.beginTransition(r14, r15, r0);
        if (r8 == 0) goto L_0x0177;
    L_0x005a:
        if (r12 != 0) goto L_0x0177;
    L_0x005c:
        r0 = r11.mSharedElementTargetNames;	 Catch:{ IllegalStateException -> 0x00a9 }
        r1 = r11.mSharedElementSourceNames;	 Catch:{ IllegalStateException -> 0x00a9 }
        setNameOverrides(r13, r0, r1);	 Catch:{ IllegalStateException -> 0x00a9 }
        r6 = r13;
    L_0x0064:
        r0 = -1;
        r11.bumpBackStackNesting(r0);	 Catch:{ IllegalStateException -> 0x00ab }
        if (r6 == 0) goto L_0x00ad;
    L_0x006a:
        r0 = 0;
        r1 = r0;
    L_0x006c:
        if (r6 == 0) goto L_0x00b1;
    L_0x006e:
        r0 = 0;
        r2 = r0;
    L_0x0070:
        r0 = r11.mTail;
        r7 = r0;
    L_0x0073:
        if (r7 == 0) goto L_0x014b;
    L_0x0075:
        if (r6 == 0) goto L_0x00b5;
    L_0x0077:
        r0 = 0;
        r3 = r0;
    L_0x0079:
        if (r6 == 0) goto L_0x00b9;
    L_0x007b:
        r0 = 0;
        r4 = r0;
    L_0x007d:
        r0 = r7.cmd;
        switch(r0) {
            case 1: goto L_0x00bd;
            case 2: goto L_0x00cc;
            case 3: goto L_0x00ff;
            case 4: goto L_0x010b;
            case 5: goto L_0x011a;
            case 6: goto L_0x0129;
            case 7: goto L_0x0138;
            default: goto L_0x0082;
        };
    L_0x0082:
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalStateException -> 0x00a1 }
        r1 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x00a1 }
        r1.<init>();	 Catch:{ IllegalStateException -> 0x00a1 }
        r2 = z;	 Catch:{ IllegalStateException -> 0x00a1 }
        r3 = 57;
        r2 = r2[r3];	 Catch:{ IllegalStateException -> 0x00a1 }
        r1 = r1.append(r2);	 Catch:{ IllegalStateException -> 0x00a1 }
        r2 = r7.cmd;	 Catch:{ IllegalStateException -> 0x00a1 }
        r1 = r1.append(r2);	 Catch:{ IllegalStateException -> 0x00a1 }
        r1 = r1.toString();	 Catch:{ IllegalStateException -> 0x00a1 }
        r0.<init>(r1);	 Catch:{ IllegalStateException -> 0x00a1 }
        throw r0;	 Catch:{ IllegalStateException -> 0x00a1 }
    L_0x00a1:
        r0 = move-exception;
        throw r0;
    L_0x00a3:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00a5 }
    L_0x00a5:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00a7 }
    L_0x00a7:
        r0 = move-exception;
        throw r0;
    L_0x00a9:
        r0 = move-exception;
        throw r0;
    L_0x00ab:
        r0 = move-exception;
        throw r0;
    L_0x00ad:
        r0 = r11.mTransitionStyle;
        r1 = r0;
        goto L_0x006c;
    L_0x00b1:
        r0 = r11.mTransition;
        r2 = r0;
        goto L_0x0070;
    L_0x00b5:
        r0 = r7.popEnterAnim;
        r3 = r0;
        goto L_0x0079;
    L_0x00b9:
        r0 = r7.popExitAnim;
        r4 = r0;
        goto L_0x007d;
    L_0x00bd:
        r0 = r7.fragment;
        r0.mNextAnim = r4;
        r5 = r11.mManager;
        r9 = android.support.v4.app.FragmentManagerImpl.reverseTransit(r2);
        r5.removeFragment(r0, r9, r1);
        if (r8 == 0) goto L_0x0147;
    L_0x00cc:
        r0 = r7.fragment;
        if (r0 == 0) goto L_0x00db;
    L_0x00d0:
        r0.mNextAnim = r4;	 Catch:{ IllegalStateException -> 0x016b }
        r5 = r11.mManager;	 Catch:{ IllegalStateException -> 0x016b }
        r9 = android.support.v4.app.FragmentManagerImpl.reverseTransit(r2);	 Catch:{ IllegalStateException -> 0x016b }
        r5.removeFragment(r0, r9, r1);	 Catch:{ IllegalStateException -> 0x016b }
    L_0x00db:
        r0 = r7.removed;
        if (r0 == 0) goto L_0x00fd;
    L_0x00df:
        r0 = 0;
        r5 = r0;
    L_0x00e1:
        r0 = r7.removed;
        r0 = r0.size();
        if (r5 >= r0) goto L_0x00fd;
    L_0x00e9:
        r0 = r7.removed;
        r0 = r0.get(r5);
        r0 = (android.support.v4.app.Fragment) r0;
        r0.mNextAnim = r3;
        r9 = r11.mManager;
        r10 = 0;
        r9.addFragment(r0, r10);
        r0 = r5 + 1;
        if (r8 == 0) goto L_0x0174;
    L_0x00fd:
        if (r8 == 0) goto L_0x0147;
    L_0x00ff:
        r0 = r7.fragment;
        r0.mNextAnim = r3;
        r5 = r11.mManager;
        r9 = 0;
        r5.addFragment(r0, r9);
        if (r8 == 0) goto L_0x0147;
    L_0x010b:
        r0 = r7.fragment;
        r0.mNextAnim = r3;
        r5 = r11.mManager;
        r9 = android.support.v4.app.FragmentManagerImpl.reverseTransit(r2);
        r5.showFragment(r0, r9, r1);
        if (r8 == 0) goto L_0x0147;
    L_0x011a:
        r0 = r7.fragment;
        r0.mNextAnim = r4;
        r4 = r11.mManager;
        r5 = android.support.v4.app.FragmentManagerImpl.reverseTransit(r2);
        r4.hideFragment(r0, r5, r1);
        if (r8 == 0) goto L_0x0147;
    L_0x0129:
        r0 = r7.fragment;
        r0.mNextAnim = r3;
        r4 = r11.mManager;
        r5 = android.support.v4.app.FragmentManagerImpl.reverseTransit(r2);
        r4.attachFragment(r0, r5, r1);
        if (r8 == 0) goto L_0x0147;
    L_0x0138:
        r0 = r7.fragment;
        r0.mNextAnim = r3;	 Catch:{ IllegalStateException -> 0x00a1 }
        r3 = r11.mManager;	 Catch:{ IllegalStateException -> 0x00a1 }
        r4 = android.support.v4.app.FragmentManagerImpl.reverseTransit(r2);	 Catch:{ IllegalStateException -> 0x00a1 }
        r3.detachFragment(r0, r4, r1);	 Catch:{ IllegalStateException -> 0x00a1 }
        if (r8 != 0) goto L_0x0082;
    L_0x0147:
        r0 = r7.prev;
        if (r8 == 0) goto L_0x0171;
    L_0x014b:
        if (r12 == 0) goto L_0x016f;
    L_0x014d:
        r0 = r11.mManager;
        r3 = r11.mManager;
        r3 = r3.mCurState;
        r2 = android.support.v4.app.FragmentManagerImpl.reverseTransit(r2);
        r4 = 1;
        r0.moveToState(r3, r2, r1, r4);
        r0 = 0;
    L_0x015c:
        r1 = r11.mIndex;	 Catch:{ IllegalStateException -> 0x016d }
        if (r1 < 0) goto L_0x016a;
    L_0x0160:
        r1 = r11.mManager;	 Catch:{ IllegalStateException -> 0x016d }
        r2 = r11.mIndex;	 Catch:{ IllegalStateException -> 0x016d }
        r1.freeBackStackIndex(r2);	 Catch:{ IllegalStateException -> 0x016d }
        r1 = -1;
        r11.mIndex = r1;	 Catch:{ IllegalStateException -> 0x016d }
    L_0x016a:
        return r0;
    L_0x016b:
        r0 = move-exception;
        throw r0;
    L_0x016d:
        r0 = move-exception;
        throw r0;
    L_0x016f:
        r0 = r6;
        goto L_0x015c;
    L_0x0171:
        r7 = r0;
        goto L_0x0073;
    L_0x0174:
        r5 = r0;
        goto L_0x00e1;
    L_0x0177:
        r6 = r13;
        goto L_0x0064;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.BackStackRecord.popFromBackStack(boolean, android.support.v4.app.BackStackRecord$TransitionState, android.util.SparseArray, android.util.SparseArray):android.support.v4.app.BackStackRecord$TransitionState");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    int commitInternal(boolean r6) {
        /*
        r5 = this;
        r4 = 0;
        r0 = r5.mCommitted;	 Catch:{ IllegalStateException -> 0x0011 }
        if (r0 == 0) goto L_0x0013;
    L_0x0005:
        r0 = new java.lang.IllegalStateException;	 Catch:{ IllegalStateException -> 0x0011 }
        r1 = z;	 Catch:{ IllegalStateException -> 0x0011 }
        r2 = 10;
        r1 = r1[r2];	 Catch:{ IllegalStateException -> 0x0011 }
        r0.<init>(r1);	 Catch:{ IllegalStateException -> 0x0011 }
        throw r0;	 Catch:{ IllegalStateException -> 0x0011 }
    L_0x0011:
        r0 = move-exception;
        throw r0;
    L_0x0013:
        r0 = android.support.v4.app.FragmentManagerImpl.DEBUG;
        if (r0 == 0) goto L_0x0050;
    L_0x0017:
        r0 = z;
        r1 = 11;
        r0 = r0[r1];
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r3 = 9;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r1 = r1.append(r5);
        r1 = r1.toString();
        android.util.Log.v(r0, r1);
        r0 = new android.support.v4.util.LogWriter;
        r1 = z;
        r2 = 12;
        r1 = r1[r2];
        r0.<init>(r1);
        r1 = new java.io.PrintWriter;
        r1.<init>(r0);
        r0 = z;
        r2 = 13;
        r0 = r0[r2];
        r5.dump(r0, r4, r1, r4);
    L_0x0050:
        r0 = 1;
        r5.mCommitted = r0;	 Catch:{ IllegalStateException -> 0x006e }
        r0 = r5.mAddToBackStack;	 Catch:{ IllegalStateException -> 0x006e }
        if (r0 == 0) goto L_0x0063;
    L_0x0057:
        r0 = r5.mManager;	 Catch:{ IllegalStateException -> 0x0070 }
        r0 = r0.allocBackStackIndex(r5);	 Catch:{ IllegalStateException -> 0x0070 }
        r5.mIndex = r0;	 Catch:{ IllegalStateException -> 0x0070 }
        r0 = android.support.v4.app.Fragment.a;	 Catch:{ IllegalStateException -> 0x0070 }
        if (r0 == 0) goto L_0x0066;
    L_0x0063:
        r0 = -1;
        r5.mIndex = r0;	 Catch:{ IllegalStateException -> 0x0070 }
    L_0x0066:
        r0 = r5.mManager;
        r0.enqueueAction(r5, r6);
        r0 = r5.mIndex;
        return r0;
    L_0x006e:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0070 }
    L_0x0070:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.BackStackRecord.commitInternal(boolean):int");
    }

    private TransitionState beginTransition(SparseArray sparseArray, SparseArray sparseArray2, boolean z) {
        int i;
        int i2 = 0;
        boolean z2 = Fragment.a;
        TransitionState transitionState = new TransitionState(this);
        transitionState.nonExistentView = new View(this.mManager.mHost.getContext());
        int i3 = 0;
        int i4 = 0;
        while (i3 < sparseArray.size()) {
            if (configureTransitions(sparseArray.keyAt(i3), transitionState, z, sparseArray, sparseArray2)) {
                i = 1;
            } else {
                i = i4;
            }
            int i5 = i3 + 1;
            if (z2) {
                break;
            }
            i3 = i5;
            i4 = i;
        }
        i = i4;
        i3 = i;
        while (i2 < sparseArray2.size()) {
            i = sparseArray2.keyAt(i2);
            try {
                i = (sparseArray.get(i) == null && configureTransitions(i, transitionState, z, sparseArray, sparseArray2)) ? 1 : i3;
                i2++;
                if (z2) {
                    break;
                }
                i3 = i;
            } catch (IllegalStateException e) {
                throw e;
            }
        }
        i = i3;
        if (i == 0) {
            return null;
        }
        return transitionState;
    }

    public int commitAllowingStateLoss() {
        return commitInternal(true);
    }

    static {
        boolean z = true;
        String[] strArr = new String[71];
        String str = "*mi\u0019[\u0006}w\u001d\u0012\u0006\u007f$\u0006\u001dH";
        boolean z2 = true;
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
                        i3 = arj.Theme_editTextStyle;
                        break;
                    case at.g /*1*/:
                        i3 = 24;
                        break;
                    case at.i /*2*/:
                        i3 = 4;
                        break;
                    case at.o /*3*/:
                        i3 = arj.Theme_radioButtonStyle;
                        break;
                    default:
                        i3 = 123;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (z2) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    i = 2;
                    strArr2 = strArr3;
                    str = ".je\u000e\u0016\rvp$\u001a\u0006yc\f\t";
                    z2 = true;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    str = ".je\u000e\u0016\rvp$\u001a\u0006yc\f\t";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "HlkI";
                    z2 = true;
                    i = 4;
                    strArr2 = strArr3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "*mi\u0019[\u0006}w\u001d\u0012\u0006\u007f$\u0000\u0015H";
                    z2 = true;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = ".je\u000e\u0016\rvp$\u001a\u0006yc\f\t";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "*mi\u0019[\u0006}w\u001d\u0012\u0006\u007f$\u0006\u001dH";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "Hz}I";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "+wi\u0004\u0012\u001c\"$";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "\u000bwi\u0004\u0012\u001c8e\u0005\t\ry`\u0010[\u000byh\u0005\u001e\f";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = ".je\u000e\u0016\rvp$\u001a\u0006yc\f\t";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = ".je\u000e\u0016\rvp$\u001a\u0006yc\f\t";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "H8";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "+yjN\u000fH{l\b\u0015\u000f}$\u001d\u001a\u000f8k\u000f[\u000eje\u000e\u0016\rvpI";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "Hvk\u001e[";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "R8s\b\bH";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "+yjN\u000fH{l\b\u0015\u000f}$\n\u0014\u0006le\u0000\u0015\rj$ ?HwbI\u001d\u001ayc\u0004\u001e\u0006l$";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "R8s\b\bH";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "Hvk\u001e[";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = " Q@,";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i] = str;
                    str = ";PK>";
                    z2 = true;
                    i = 21;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    strArr2 = strArr3;
                    str = "HuG\u0006\u0016\u0005qp\u001d\u001e\f%";
                    z2 = true;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "HuA\u0011\u0012\u001cYj\u0000\u0016U;";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i] = str;
                    str = "R8";
                    z2 = true;
                    i = 24;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleTextColor /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    strArr2 = strArr3;
                    str = "\u0005Zv\f\u001a\f[v\u001c\u0016\nKl\u0006\t\u001cLm\u001d\u0017\rJa\u001aFK";
                    z2 = true;
                    break;
                case arj.Toolbar_subtitleTextColor /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "&MH%";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextAppearance /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = ":}i\u0006\r\r|>I";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextColor /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    str = ")\\@";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeStyle /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    str = "HuM\u0007\u001f\r`9";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseButtonStyle /*28*/:
                    strArr2[i] = str;
                    i = 30;
                    str = "\u0005Hk\u0019>\u0006la\u001b:\u0006qiTX";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeBackground /*29*/:
                    strArr2[i] = str;
                    i = 31;
                    str = "HuT\u0006\u000b-`m\u001d:\u0006qiTX";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSplitBackground /*30*/:
                    strArr2[i] = str;
                    i = 32;
                    str = "HuF\u001b\u001e\t|G\u001b\u000e\u0005zP\u0000\u000f\u0004}P\f\u0003\u001c%";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseDrawable /*31*/:
                    strArr2[i] = str;
                    i = 33;
                    str = "\u0018wt,\u0015\u001c}v(\u0015\u0001u9J";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCutDrawable /*32*/:
                    strArr2[i] = str;
                    i = 34;
                    str = ":}i\u0006\r\r|>";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCopyDrawable /*33*/:
                    strArr2[i] = str;
                    i = 35;
                    str = "'ha\u001b\u001a\u001cqk\u0007\bR";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePasteDrawable /*34*/:
                    strArr2[i] = str;
                    i = 36;
                    str = "HuF\u001b\u001e\t|G\u001b\u000e\u0005zW\u0001\u0014\u001alP\u0000\u000f\u0004}P\f\u0003\u001c%";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSelectAllDrawable /*35*/:
                    strArr2[i] = str;
                    i = 37;
                    str = "H8$I";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeShareDrawable /*36*/:
                    strArr2[i] = str;
                    i = 38;
                    str = ":]T%:+]";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeFindDrawable /*37*/:
                    strArr2[i] = str;
                    i = 39;
                    str = "\u0005Ve\u0004\u001eU";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeWebSearchDrawable /*38*/:
                    strArr2[i] = str;
                    i = 40;
                    str = "H8K\u0019[K";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePopupWindowStyle /*39*/:
                    strArr2[i] = str;
                    i = 41;
                    str = ":]I&--";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceLargePopupMenu /*40*/:
                    strArr2[i] = str;
                    i = 42;
                    str = "\u0005Lv\b\u0015\u001bqp\u0000\u0014\u0006%'";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSmallPopupMenu /*41*/:
                    strArr2[i] = str;
                    i = 43;
                    str = "H8'";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogTheme /*42*/:
                    strArr2[i] = str;
                    i = 44;
                    str = "HuP\u001b\u001a\u0006km\u001d\u0012\u0007vW\u001d\u0002\u0004}9J";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogPreferredPadding /*43*/:
                    strArr2[i] = str;
                    i = 45;
                    str = "\u0005Zv\f\u001a\f[v\u001c\u0016\nLm\u001d\u0017\rJa\u001aFK";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listDividerAlertDialog /*44*/:
                    strArr2[i] = str;
                    i = 46;
                    str = "\u0005]j\u001d\u001e\u001aYj\u0000\u0016U;";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionDropDownStyle /*45*/:
                    strArr2[i] = str;
                    i = 47;
                    str = "\rvp\f\t)vm\u0004FK";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dropdownListPreferredItemHeight /*46*/:
                    strArr2[i] = str;
                    i = 48;
                    str = "R8";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_spinnerDropDownItemStyle /*47*/:
                    strArr2[i] = str;
                    i = 49;
                    str = ")LP(8 ";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_homeAsUpIndicator /*48*/:
                    strArr2[i] = str;
                    i = 50;
                    str = "H}|\u0000\u000f)vm\u0004FK";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionButtonStyle /*49*/:
                    strArr2[i] = str;
                    i = 51;
                    str = "Hhk\u0019>\u0010qp(\u0015\u0001u9J";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarStyle /*50*/:
                    strArr2[i] = str;
                    i = 52;
                    str = ",]P(8 ";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarButtonStyle /*51*/:
                    strArr2[i] = str;
                    i = 53;
                    str = "\u000bu`T";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_selectableItemBackground /*52*/:
                    strArr2[i] = str;
                    i = 54;
                    str = ".je\u000e\u0016\rvp$\u001a\u0006yc\f\t";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_selectableItemBackgroundBorderless /*53*/:
                    strArr2[i] = str;
                    i = 55;
                    str = ".je\u000e\u0016\rvp$\u001a\u0006yc\f\t";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_borderlessButtonStyle /*54*/:
                    strArr2[i] = str;
                    i = 56;
                    str = "H8";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dividerVertical /*55*/:
                    strArr2[i] = str;
                    i = 57;
                    str = "=vo\u0007\u0014\u001fv$\n\u0016\f\"$";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dividerHorizontal /*56*/:
                    strArr2[i] = str;
                    i = 58;
                    str = "\u0018wt/\t\u0007uF\b\u0018\u0003Kp\b\u0018\u0003\"$";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_activityChooserViewStyle /*57*/:
                    strArr2[i] = str;
                    i = 59;
                    str = "H;";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_toolbarStyle /*58*/:
                    strArr2[i] = str;
                    i = 60;
                    str = "*yg\u0002(\u001cyg\u0002>\u0006lv\u0010\u0000";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_toolbarNavigationButtonStyle /*59*/:
                    strArr2[i] = str;
                    i = 61;
                    str = ".je\u000e\u0016\rvp$\u001a\u0006yc\f\t";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_popupMenuStyle /*60*/:
                    strArr2[i] = str;
                    i = 62;
                    str = ":mjS[";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_popupWindowStyle /*61*/:
                    strArr2[i] = str;
                    i = 63;
                    str = ".je\u000e\u0016\rvp$\u001a\u0006yc\f\t";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_editTextColor /*62*/:
                    strArr2[i] = str;
                    i = 64;
                    str = "*mi\u0019[\u0006}w\u001d\u0012\u0006\u007f$\u0006\u001dH";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_editTextBackground /*63*/:
                    strArr2[i] = str;
                    i = 65;
                    str = "=vo\u0007\u0014\u001fv$\n\u0016\f\"$";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_imageButtonStyle /*64*/:
                    strArr2[i] = str;
                    i = 66;
                    str = "'H[;>8TE*>R8e\r\u001f\u0001vcT";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSearchResultTitle /*65*/:
                    strArr2[i] = str;
                    i = 67;
                    str = "\t|`=\u0014*yg\u0002(\u001cyg\u0002SA8g\b\u0017\u0004}`I\u001a\u000ela\u001b[\u000bwi\u0004\u0012\u001c0-";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSearchResultSubtitle /*66*/:
                    strArr2[i] = str;
                    i = 68;
                    str = "Hwh\rF";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textColorSearchUrl /*67*/:
                    strArr2[i] = str;
                    i = 69;
                    str = "HlkI";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_searchViewStyle /*68*/:
                    strArr2[i] = str;
                    i = 70;
                    str = ".je\u000e\u0016\rvp$\u001a\u0006yc\f\t";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemHeight /*69*/:
                    strArr2[i] = str;
                    z = strArr3;
                    try {
                        if (VERSION.SDK_INT < 21) {
                            z = false;
                        }
                        SUPPORTS_TRANSITIONS = z;
                        return;
                    } catch (IllegalStateException e) {
                        throw e;
                    }
                default:
                    strArr2[i] = str;
                    str = "HlkI";
                    i = 1;
                    strArr2 = strArr3;
                    z2 = false;
                    break;
            }
        }
    }
}
