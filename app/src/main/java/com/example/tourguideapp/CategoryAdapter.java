package com.example.tourguideapp;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {

    Context mContext;

    public CategoryAdapter(Context context, FragmentManager fm){
        super(fm);
        mContext = context;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new SightsFragment();
            case 1:
                return new FoodsFragment();
            case 2:
                return new ParksFragment();
            default:
                return new HotelsFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.sights);
        } else if (position == 1) {
            return mContext.getString(R.string.foods);
        } else if (position == 2) {
            return mContext.getString(R.string.parks);
        } else {
            return mContext.getString(R.string.hotels);
        }
    }
}
