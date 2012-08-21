package ca.galvant.thingpool.client;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.NavUtils;
import android.view.MenuItem;

public class ThingListActivity extends FragmentActivity
        implements ThingListFragment.Callbacks {

    private boolean mTwoPane;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thing_list);

        if (findViewById(R.id.thing_detail_container) != null) {
            mTwoPane = true;
            ((ThingListFragment) getSupportFragmentManager()
                    .findFragmentById(R.id.thing_list))
                    .setActivateOnItemClick(true);
        }
    }

    public void onItemSelected(String id) {
        if (mTwoPane) {
            Bundle arguments = new Bundle();
            arguments.putString(ThingDetailFragment.ARG_ITEM_ID, id);
            ThingDetailFragment fragment = new ThingDetailFragment();
            fragment.setArguments(arguments);
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.thing_detail_container, fragment)
                    .commit();

        } else {
            Intent detailIntent = new Intent(this, ThingDetailActivity.class);
            detailIntent.putExtra(ThingDetailFragment.ARG_ITEM_ID, id);
            startActivity(detailIntent);
        }
    }
}
