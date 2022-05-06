package com.example.samadvora_androidproject1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.example.samadvora_androidproject1.databinding.ProductsBinding;

import java.util.List;

public class CarAdapter extends RecyclerView.Adapter<CarAdapter.CarViewHolder> {
    private List<Product> PDataSet;
    private OnItemClickListener mListener;

    public interface OnItemClickListener {
        void onItemClick(int position);
    }
    public void setOnItemClickListener(OnItemClickListener listener){
        mListener = listener;
    }
    public static class CarViewHolder extends RecyclerView.ViewHolder{
        private ProductsBinding binding;
        public CarViewHolder(@NonNull ProductsBinding binding, final OnItemClickListener listener) {
            super(binding.getRoot());
            this.binding = binding;

            binding.button.setOnClickListener(new Button.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int position = getAdapterPosition();
                    if (position != RecyclerView.NO_POSITION) {
                        listener.onItemClick(position);
                    }
                }
                });
            }
        }
        public CarAdapter(List<Product> ProductDataSet) {
            PDataSet = ProductDataSet;
        }
        @NonNull
        @Override
        //implementing design of layout resource file
        public CarViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            LayoutInflater inflater = LayoutInflater.from(parent.getContext());
            ProductsBinding binding = DataBindingUtil.inflate(inflater, R.layout.products, parent, false);

            return new CarViewHolder(binding, mListener);
        }
        @Override
        //Binding data from java class inside our recycle view
        public void onBindViewHolder(@NonNull CarViewHolder holder, int position) {
            holder.binding.txtproductname.setText(PDataSet.get(position).getCname());
            holder.binding.txtseller.setText(PDataSet.get(position).getCComp());
            holder.binding.txtRating.setText(PDataSet.get(position).getCRatings());
            holder.binding.txtPrice.setText(PDataSet.get(position).getCPrice());
            holder.binding.imageView5.setImageDrawable(PDataSet.get(position).getCImages());
        }
        @Override
        // Returning  List size
        public int getItemCount()
        {
            return PDataSet.size();
        }
    }


