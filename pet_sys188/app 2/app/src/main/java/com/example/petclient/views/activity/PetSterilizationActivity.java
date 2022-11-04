package com.example.petclient.views.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.widget.ListView;

import androidx.core.content.ContextCompat;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import com.example.petclient.App;
import com.example.petclient.R;
import com.example.petclient.base.BaseActivity;
import com.example.petclient.base.adapter.PetSterilizationListAdapter;
import com.example.petclient.base.entry.SysPetSterilization;
import com.example.petclient.utils.ToastUtil;
import com.example.petclient.utils.http.ApiConfig;
import com.example.petclient.utils.http.NetClient;
import com.example.petclient.utils.http.NetJsonCallBack;
import com.example.petclient.utils.http.NetRequest;
import com.example.petclient.utils.http.entry.SysPetSterilizationListData;

import java.util.ArrayList;
import java.util.List;

public class PetSterilizationActivity extends BaseActivity {

    SwipeRefreshLayout Main_srLayoutNewsList;
    ListView all_list;
    NetClient netClient;
    List<SysPetSterilization> sysPetSterilizations;
    PetSterilizationListAdapter adapter;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_sterilization;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        Long petId = intent.getLongExtra("petId",-1);
        adapter = new PetSterilizationListAdapter(this,new ArrayList<SysPetSterilization>());
        Main_srLayoutNewsList = findViewById(R.id.Main_srLayoutNewsList);
        all_list = findViewById(R.id.all_list);
        all_list.setAdapter(adapter);
        netClient = new NetClient();
        Main_srLayoutNewsList.setRefreshing(true);
        NetRequest request = new NetRequest(ApiConfig.API_PET_STERILIZATION_LIST,"get").addHeader("userId", App.getMember(this).getMemberId()+"")
                .addParam("petId",petId+"");
        netClient.Request(request).Callback(new NetJsonCallBack<SysPetSterilizationListData>(SysPetSterilizationListData.class) {
            @Override
            public void success(SysPetSterilizationListData data) {
                if(data.getState() == 0){
                    Message message = new Message();
                    message.what = 0;
                    Bundle bundle = new Bundle();
                    bundle.putString("message",data.getContent());
                    message.setData(bundle);
                    PetSterilizationActivity.this.sysPetSterilizations = data.getData();
                    this.handler.sendMessage(message);
                }else {
                    Message message = new Message();
                    message.what = 1;
                    Bundle bundle = new Bundle();
                    bundle.putString("message",data.getContent());
                    message.setData(bundle);
                    this.handler.sendMessage(message);
                }
            }

            @Override
            public void complete() {

            }

            @Override
            public void fail(int code) {
                Message message = new Message();
                message.what = 2;
                Bundle bundle = new Bundle();
                bundle.putString("message","请求失败");
                message.setData(bundle);
                this.handler.sendMessage(message);
            }


            @Override
            public void handler(Message msg) {
                Bundle bundle = msg.getData();
                if(msg.what == 0){
                    //显示
                    adapter.add(PetSterilizationActivity.this.sysPetSterilizations);
                    adapter.notifyDataSetChanged();
                }else if(msg.what == 1){
                    ToastUtil.show(PetSterilizationActivity.this,bundle.getString("message"));
                }else{
                    ToastUtil.show(PetSterilizationActivity.this,bundle.getString("message"));
                }

                Main_srLayoutNewsList.setRefreshing(false);
            }
        });

        netClient.Http();
        //SwipeRefreshLayout功能介绍
        Main_srLayoutNewsList.setColorSchemeResources(R.color.white);

        Main_srLayoutNewsList.setProgressBackgroundColorSchemeColor(ContextCompat.getColor(PetSterilizationActivity.this,R.color.colorPrimaryDark));
        Main_srLayoutNewsList.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                adapter.Clean();
                netClient.Http();
            }
        });
    }
}
