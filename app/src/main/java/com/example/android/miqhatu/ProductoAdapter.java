package com.example.android.miqhatu;

import android.app.Activity;
import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import static android.R.attr.resource;

/**
 * Created by alan on 01-12-16.
 */

public class ProductoAdapter extends ArrayAdapter<Producto> {

    public ProductoAdapter(Activity context, ArrayList<Producto> product) {
        super(context,0,product);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.product_item, parent, false);
        }

        Producto currentProduct=getItem(position);

       // ImageView image =(ImageView) listItemView.findViewById(R.id.image);
         //   image.setImageResource(currentProduct.getImagen());


        TextView nombreTextView = (TextView) listItemView.findViewById(R.id.nombre);

        nombreTextView.setText(currentProduct.getNombre());


        TextView desTextView = (TextView) listItemView.findViewById(R.id.des);

        String des=currentProduct.getCategoria()+"\n"+currentProduct.getPrecio();
        desTextView.setText(des);

        return listItemView;
    }
}
