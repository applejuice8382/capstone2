package com.example.capstone2;


import android.app.ActionBar;
import android.app.Activity;
import android.graphics.drawable.GradientDrawable;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
    String myJSON;

    private static final String TAG_RESULTS = "result";
    private static final String TAG_NAME = "name";
    private static final String TAG_ADD = "address";

    JSONArray peoples = null;

    ArrayList<HashMap<String, String>> personList;

    ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        list = (ListView) findViewById(R.id.listview);
        personList = new ArrayList<HashMap<String, String>>();
        getData("http://10.20.54.211:8070/PHP_connection.php"); //수정 필요



//mypage2

//
//        ImageView imageView = (ImageView) findViewById(R.id.imageProfile);
//
//        GradientDrawable drawable=
//                (GradientDrawable) getDrawable(R.drawable.imageround);
//
//        imageView.setBackground(drawable);
//        imageView.setClipToOutline(true);
//
//        ListView listview = findViewById(R.id.listview);
//
//        ArrayList<Customer> items = new ArrayList<>();
//        items.add(new Customer("사진 1", "010-1234-5678", "남자"));
//        items.add(new Customer("사진 2", "010-4321-8765", "남자"));
//        items.add(new Customer("사진 3", "010-8765-4321", "여자"));
//        items.add(new Customer("사진 3", "010-8765-4321", "여자"));
//        items.add(new Customer("사진 3", "010-8765-4321", "여자"));
//        items.add(new Customer("사진 3", "010-8765-4321", "여자"));
//        items.add(new Customer("사진 3", "010-8765-4321", "여자"));
//        items.add(new Customer("사진 3", "010-8765-4321", "여자"));
//        items.add(new Customer("사진 1", "010-1234-5678", "남자"));
//        items.add(new Customer("사진 2", "010-4321-8765", "남자"));
//        items.add(new Customer("사진 3", "010-8765-4321", "여자"));
//        items.add(new Customer("사진 3", "010-8765-4321", "여자"));
//        items.add(new Customer("사진 3", "010-8765-4321", "여자"));
//        items.add(new Customer("사진 3", "010-8765-4321", "여자"));
//        items.add(new Customer("사진 3", "010-8765-4321", "여자"));
//        items.add(new Customer("사진 3", "010-8765-4321", "여자"));
//
//
//        MyAdapter adapter = new MyAdapter(items, getApplicationContext());
//
//        listview.setAdapter(adapter);

//        GridView gridView = (GridView) findViewById(R.id.gridView);
//
//        // 어댑터 안에 데이터 담기
//        final GridAdapter adapter = new GridAdapter();
//
//        adapter.addItem(new GridItem("소녀시대"));
//        adapter.addItem(new GridItem("소녀시대2"));
//        adapter.addItem(new GridItem("소녀시대3"));
//        adapter.addItem(new GridItem("소녀시대4"));
//        adapter.addItem(new GridItem("소녀시대5"));
//        adapter.addItem(new GridItem("소녀시대6"));
//
//        // 리스트 뷰에 어댑터 설정
//        gridView.setAdapter(adapter);
//
//        // 이벤트 처리 리스너 설정
//        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                GridItem item = (GridItem) adapter.getItem(position);
//                Toast.makeText(getApplicationContext(), "선택 :" + item.getName(), Toast.LENGTH_LONG).show();
//            }
//        });

    }

    protected void showList() {
        try {
            JSONObject jsonObj;
            jsonObj = new JSONObject(myJSON);
            peoples = jsonObj.getJSONArray(TAG_RESULTS);

            for (int i = 0; i < peoples.length(); i++) {
                JSONObject c = peoples.getJSONObject(i);
                String name = c.getString(TAG_NAME);
                String address = c.getString(TAG_ADD);

                HashMap<String, String> persons = new HashMap<String, String>();

                persons.put(TAG_NAME, name);
                persons.put(TAG_ADD, address);

                personList.add(persons);
            }

            ListAdapter adapter = new SimpleAdapter(
                    MainActivity.this, personList, R.layout.listview_custom,
                    new String[]{TAG_NAME, TAG_ADD},
                    new int[]{R.id.name, R.id.address}
            );

            list.setAdapter(adapter);

        } catch (JSONException e) {
            e.printStackTrace();
        }

    }

    public void getData(String url) {
        class GetDataJSON extends AsyncTask<String, Void, String> {

            @Override
            protected String doInBackground(String... params) {

                String uri = params[0];

                BufferedReader bufferedReader = null;
                try {
                    URL url = new URL(uri);
                    HttpURLConnection con = (HttpURLConnection) url.openConnection();
                    StringBuilder sb = new StringBuilder();

                    bufferedReader = new BufferedReader(new InputStreamReader(con.getInputStream()));

                    String json;
                    while ((json = bufferedReader.readLine()) != null) {
                        sb.append(json + "\n");
                    }

                    return sb.toString().trim();

                } catch (Exception e) {
                    return null;
                }


            }

            @Override
            protected void onPostExecute(String result) {
                myJSON = result;
                showList();
            }
        }
        GetDataJSON g = new GetDataJSON();
        g.execute(url);
    }

//    public class GridAdapter extends BaseAdapter {
//        ArrayList<GridItem> items = new ArrayList<GridItem>();
//
//
//        // Generate > implement methods
//        @Override
//        public int getCount() {
//            return items.size();
//        }
//
//        public void addItem(GridItem item) {
//            items.add(item);
//        }
//
//        @Override
//        public Object getItem(int position) {
//            return items.get(position);
//        }
//
//        @Override
//        public long getItemId(int position) {
//            return position;
//        }
//
//        @Override
//        public View getView(int position, View convertView, ViewGroup parent) {
//            GridItemView view = null;
//            if (convertView == null) {
//                view = new GridItemView(getApplicationContext());
//            } else {
//                view = (GridItemView) convertView;
//            }
//
//            GridItem item = items.get(position);
//
//            view.setName(item.getName());
//
//            return view;
//        }
//
//    }

}
