package com.example.capstone2;


import android.app.Activity;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
//
//    }
//
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

    }

}
