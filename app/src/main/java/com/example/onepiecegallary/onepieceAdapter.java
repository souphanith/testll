package com.example.onepiecegallary;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class onepieceAdapter extends BaseAdapter {
    int myonepieceImage [];
    Context mycontext;
    LayoutInflater myIntflater;
    public onepieceAdapter(Context MyContext,int Myonepieceimg []){
        this.mycontext=MyContext;
        this.myonepieceImage = Myonepieceimg;
        myIntflater = (LayoutInflater.from(MyContext)) ;
    }
    @Override
    public int getCount() {
        return myonepieceImage.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = myIntflater.inflate(R.layout.layout_source_gallary,null);
        ImageView myImagesrc = view.findViewById(R.id.Imagesrc);
        myImagesrc.setImageResource(myonepieceImage[i]);
        return view;
    }
}
