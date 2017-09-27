package info.androidhive.firebase;


import android.app.Activity;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Document;

import java.util.ArrayList;
import java.util.HashMap;

public class DashboardActivity extends Activity {

    ListView lv;
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

        lv = (ListView) findViewById(R.id.listTransaction);



    }
}