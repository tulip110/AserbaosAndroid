package com.aserbao.aserbaosandroid.ui.animation.recyclerItemAnimation.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.aserbao.aserbaosandroid.R;
import com.aserbao.aserbaosandroid.commonData.ImageSource;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 功能:
 * author aserbao
 * date : On 2018/10/9
 * email: 1142803753@qq.com
 */
public class AnimationAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private Context mContext;


    public AnimationAdapter(Context mContext) {
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.recycler_animation_item, viewGroup, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        if (viewHolder instanceof MyViewHolder){
            ((MyViewHolder) viewHolder).mItemIv.setImageResource(ImageSource.getRandomImageId());
        }
    }

    @Override
    public int getItemCount() {
        return 10;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.item_iv)
        ImageView mItemIv;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }
    }
}
