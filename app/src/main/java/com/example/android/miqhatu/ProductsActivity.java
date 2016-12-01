package com.example.android.miqhatu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;


public class ProductsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_products);

        final ArrayList<Producto> products = new ArrayList<Producto>();
        products.add(new Producto("Chocolike", 3.5, "Desayuno", "22/01/2017", 48, R.drawable.chocolike));
        products.add(new Producto("Chocolike", 3.5, "Desayuno", "22/01/2017", 48, R.drawable.chocolike));
        products.add(new Producto("Chocolike", 3.5, "Desayuno", "22/01/2017", 48, R.drawable.chocolike));
        products.add(new Producto("Chocolike", 3.5, "Desayuno", "22/01/2017", 48, R.drawable.chocolike));
        products.add(new Producto("Chocolike", 3.5, "Desayuno", "22/01/2017", 48, R.drawable.chocolike));
        products.add(new Producto("Chocolike", 3.5, "Desayuno", "22/01/2017", 48, R.drawable.chocolike));
        products.add(new Producto("Chocolike", 3.5, "Desayuno", "22/01/2017", 48, R.drawable.chocolike));
        products.add(new Producto("Chocolike", 3.5, "Desayuno", "22/01/2017", 48, R.drawable.chocolike));
        products.add(new Producto("Chocolike", 3.5, "Desayuno", "22/01/2017", 48, R.drawable.chocolike));


        ProductoAdapter adapter = new ProductoAdapter(this, products);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }

}
