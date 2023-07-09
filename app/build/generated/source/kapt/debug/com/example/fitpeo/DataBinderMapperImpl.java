package com.example.fitpeo;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.example.fitpeo.databinding.ActivityFragmentContainerBindingImpl;
import com.example.fitpeo.databinding.ActivitySplashBindingImpl;
import com.example.fitpeo.databinding.FragmentBookDetailBindingImpl;
import com.example.fitpeo.databinding.FragmentBookFavouriteBindingImpl;
import com.example.fitpeo.databinding.FragmentBookListBindingImpl;
import com.example.fitpeo.databinding.ImageRowBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYFRAGMENTCONTAINER = 1;

  private static final int LAYOUT_ACTIVITYSPLASH = 2;

  private static final int LAYOUT_FRAGMENTBOOKDETAIL = 3;

  private static final int LAYOUT_FRAGMENTBOOKFAVOURITE = 4;

  private static final int LAYOUT_FRAGMENTBOOKLIST = 5;

  private static final int LAYOUT_IMAGEROW = 6;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(6);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.fitpeo.R.layout.activity_fragment_container, LAYOUT_ACTIVITYFRAGMENTCONTAINER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.fitpeo.R.layout.activity_splash, LAYOUT_ACTIVITYSPLASH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.fitpeo.R.layout.fragment_book_detail, LAYOUT_FRAGMENTBOOKDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.fitpeo.R.layout.fragment_book_favourite, LAYOUT_FRAGMENTBOOKFAVOURITE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.fitpeo.R.layout.fragment_book_list, LAYOUT_FRAGMENTBOOKLIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.fitpeo.R.layout.image_row, LAYOUT_IMAGEROW);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYFRAGMENTCONTAINER: {
          if ("layout/activity_fragment_container_0".equals(tag)) {
            return new ActivityFragmentContainerBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_fragment_container is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYSPLASH: {
          if ("layout/activity_splash_0".equals(tag)) {
            return new ActivitySplashBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_splash is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTBOOKDETAIL: {
          if ("layout/fragment_book_detail_0".equals(tag)) {
            return new FragmentBookDetailBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_book_detail is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTBOOKFAVOURITE: {
          if ("layout/fragment_book_favourite_0".equals(tag)) {
            return new FragmentBookFavouriteBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_book_favourite is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTBOOKLIST: {
          if ("layout/fragment_book_list_0".equals(tag)) {
            return new FragmentBookListBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_book_list is invalid. Received: " + tag);
        }
        case  LAYOUT_IMAGEROW: {
          if ("layout/image_row_0".equals(tag)) {
            return new ImageRowBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for image_row is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(3);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "album");
      sKeys.put(2, "viewModel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(6);

    static {
      sKeys.put("layout/activity_fragment_container_0", com.example.fitpeo.R.layout.activity_fragment_container);
      sKeys.put("layout/activity_splash_0", com.example.fitpeo.R.layout.activity_splash);
      sKeys.put("layout/fragment_book_detail_0", com.example.fitpeo.R.layout.fragment_book_detail);
      sKeys.put("layout/fragment_book_favourite_0", com.example.fitpeo.R.layout.fragment_book_favourite);
      sKeys.put("layout/fragment_book_list_0", com.example.fitpeo.R.layout.fragment_book_list);
      sKeys.put("layout/image_row_0", com.example.fitpeo.R.layout.image_row);
    }
  }
}
