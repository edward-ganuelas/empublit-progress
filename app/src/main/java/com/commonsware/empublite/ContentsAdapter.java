package com.commonsware.empublite;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.support.v13.app.FragmentStatePagerAdapter;

/**
 * Created by edward.ganuelas on 5/13/2015.
 */
public class ContentsAdapter extends FragmentStatePagerAdapter {

    public ContentsAdapter(Activity ctxt) {
        super(ctxt.getFragmentManager());
    }

    @Override
    public Fragment getItem(int position) {
        return null;
    }

    @Override
    public int getCount() {
        return 0;
    }
}
