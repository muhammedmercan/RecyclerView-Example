package com.muhammedmercan.recyclerviewexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView bracnhesRecView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        bracnhesRecView = findViewById(R.id.contactsRecView);

        ArrayList<Branch> branches = new ArrayList<>();
        branches.add(new Branch("İSTANBUL ÜNİVERSİTESİ","495.12352","1500",R.drawable.istanbul));
        branches.add(new Branch("HALİÇ ÜNİVERSİTESİ","350.5123","45623",R.drawable.halic));
        branches.add(new Branch("NİŞANTAŞI ÜNİVERSİTESİ","230.5225","123623",R.drawable.nisantasi));
        branches.add(new Branch("İSTANBUL ÜNİVERSİTESİ","495.12352","1500",R.drawable.istanbul));
        branches.add(new Branch("HALİÇ ÜNİVERSİTESİ","350.5123","45623",R.drawable.halic));
        branches.add(new Branch("NİŞANTAŞI ÜNİVERSİTESİ","230.5225","123623",R.drawable.nisantasi));

        branches.add(new Branch("İSTANBUL ÜNİVERSİTESİ","495.12352","1500",R.drawable.istanbul));
        branches.add(new Branch("HALİÇ ÜNİVERSİTESİ","350.5123","45623",R.drawable.halic));
        branches.add(new Branch("NİŞANTAŞI ÜNİVERSİTESİ","230.5225","123623",R.drawable.nisantasi));
        branches.add(new Branch("İSTANBUL ÜNİVERSİTESİ","495.12352","1500",R.drawable.istanbul));
        branches.add(new Branch("HALİÇ ÜNİVERSİTESİ","350.5123","45623",R.drawable.halic));
        branches.add(new Branch("NİŞANTAŞI ÜNİVERSİTESİ","230.5225","123623",R.drawable.nisantasi));

        branches.add(new Branch("İSTANBUL ÜNİVERSİTESİ","495.12352","1500",R.drawable.istanbul));
        branches.add(new Branch("HALİÇ ÜNİVERSİTESİ","350.5123","45623",R.drawable.halic));
        branches.add(new Branch("NİŞANTAŞI ÜNİVERSİTESİ","230.5225","123623",R.drawable.nisantasi));
        branches.add(new Branch("İSTANBUL ÜNİVERSİTESİ","495.12352","1500",R.drawable.istanbul));
        branches.add(new Branch("HALİÇ ÜNİVERSİTESİ","350.5123","45623",R.drawable.halic));
        branches.add(new Branch("NİŞANTAŞI ÜNİVERSİTESİ","230.5225","123623",R.drawable.nisantasi));

        branches.add(new Branch("İSTANBUL ÜNİVERSİTESİ","495.12352","1500",R.drawable.istanbul));
        branches.add(new Branch("HALİÇ ÜNİVERSİTESİ","350.5123","45623",R.drawable.halic));
        branches.add(new Branch("NİŞANTAŞI ÜNİVERSİTESİ","230.5225","123623",R.drawable.nisantasi));
        branches.add(new Branch("İSTANBUL ÜNİVERSİTESİ","495.12352","1500",R.drawable.istanbul));
        branches.add(new Branch("HALİÇ ÜNİVERSİTESİ","350.5123","45623",R.drawable.halic));
        branches.add(new Branch("NİŞANTAŞI ÜNİVERSİTESİ","230.5225","123623",R.drawable.nisantasi));


        BranchRecyclerAdapter adapter = new BranchRecyclerAdapter(branches,this);
        adapter.setBranches(branches);

        bracnhesRecView.setAdapter(adapter);
        bracnhesRecView.setLayoutManager(new LinearLayoutManager(this));


    }
}