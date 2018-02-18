package com.example.afifabdurrahim.modul2_afif_1202154147;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ListMenu extends AppCompatActivity {
    RecyclerView rv;
    mnAdapter adapter;
    List<PilihMenu> listmenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_menu);
        setTitle("Menu");

        listmenu = new ArrayList<>();
        rv = findViewById(R.id.listMenu);
        rv.setHasFixedSize(true);
        rv.setLayoutManager(new LinearLayoutManager(this));
        initdata();
    }

    private void initdata() {
        listmenu.add(new PilihMenu(R.drawable.soto_banjar, "Soto Banjar", 30000, "Daging, bihun, sayuran"));
        listmenu.add(new PilihMenu(R.drawable.soto_bogor, "Soto Bogor", 40000, "Sayuran, mie, daging, crocket"));
        listmenu.add(new PilihMenu(R.drawable.soto_lamongan, "Soto Lamongan", 30000, "Sayuran, Daging, bihun"));
        listmenu.add(new PilihMenu(R.drawable.soto_betawi, "Soto Betawi", 40000, "Daging, emping, bihun"));
        listmenu.add(new PilihMenu(R.drawable.soto_ayam, "Soto Ayam", 40000, "Ayam, bihun, mie"));
        adapter = new mnAdapter(this, listmenu);
        rv.setAdapter(adapter);
    }
}
