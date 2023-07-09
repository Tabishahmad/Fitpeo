package com.example.fitpeo.databinding;
import com.example.fitpeo.R;
import com.example.fitpeo.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentBookDetailBindingImpl extends FragmentBookDetailBinding implements com.example.fitpeo.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.textView, 2);
        sViewsWithIds.put(R.id.imageView, 3);
        sViewsWithIds.put(R.id.cardview, 4);
        sViewsWithIds.put(R.id.bottomPanel, 5);
        sViewsWithIds.put(R.id.shareButton, 6);
        sViewsWithIds.put(R.id.progressBar, 7);
    }
    // views
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentBookDetailBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private FragmentBookDetailBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.RelativeLayout) bindings[0]
            , (android.widget.LinearLayout) bindings[5]
            , (androidx.cardview.widget.CardView) bindings[4]
            , (android.widget.ImageButton) bindings[1]
            , (android.widget.ImageView) bindings[3]
            , (android.widget.ProgressBar) bindings[7]
            , (android.widget.ImageButton) bindings[6]
            , (android.widget.TextView) bindings[2]
            );
        this.albumDetailView.setTag(null);
        this.favoriteButton.setTag(null);
        setRootTag(root);
        // listeners
        mCallback2 = new com.example.fitpeo.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.album == variableId) {
            setAlbum((com.example.fitpeo.domain.model.Album) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((com.example.fitpeo.presentation.list.AlbumListViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setAlbum(@Nullable com.example.fitpeo.domain.model.Album Album) {
        this.mAlbum = Album;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.album);
        super.requestRebind();
    }
    public void setViewModel(@Nullable com.example.fitpeo.presentation.list.AlbumListViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        com.example.fitpeo.domain.model.Album album = mAlbum;
        com.example.fitpeo.presentation.list.AlbumListViewModel viewModel = mViewModel;
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.favoriteButton.setOnClickListener(mCallback2);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // album
        com.example.fitpeo.domain.model.Album album = mAlbum;
        // viewModel
        com.example.fitpeo.presentation.list.AlbumListViewModel viewModel = mViewModel;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {




            viewModel.handleFavoriteAlbum(callbackArg_0, album);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): album
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}