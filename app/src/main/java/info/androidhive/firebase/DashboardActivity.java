package info.androidhive.firebase;


import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DashboardActivity extends Activity {

    ListView lvTransactions;
    TextView txtUser, txtBalance;

    ArrayList<HashMap<String, String>> menuItems;
    ProgressDialog pDialog;
    // Flag for current page
    int current_page = 1;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        txtUser = (TextView) findViewById(R.id.txtUsername);
        txtUser = (TextView) findViewById(R.id.txtBalance);

        lvTransactions = (ListView) findViewById(R.id.listTransaction);

        String[] values = new String[] { "You have successfully added Rs. 200", "You have successfully added Rs. 200", "You have successfully added Rs. 300",
                "You have successfully paid Rs. 200" };

        final ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < values.length; ++i) {
            list.add(values[i]);
        }
        final StableArrayAdapter adapter = new StableArrayAdapter(this,
                android.R.layout.simple_list_item_1, list);
        lvTransactions.setAdapter(adapter);


    }
    private class StableArrayAdapter extends ArrayAdapter<String> {

        HashMap<String, Integer> mIdMap = new HashMap<String, Integer>();

        public StableArrayAdapter(Context context, int textViewResourceId,
                                  List<String> objects) {
            super(context, textViewResourceId, objects);
            for (int i = 0; i < objects.size(); ++i) {
                mIdMap.put(objects.get(i), i);
            }
        }

        @Override
        public long getItemId(int position) {
            String item = getItem(position);
            return mIdMap.get(item);
        }

        @Override
        public boolean hasStableIds() {
            return true;
        }

    }
}