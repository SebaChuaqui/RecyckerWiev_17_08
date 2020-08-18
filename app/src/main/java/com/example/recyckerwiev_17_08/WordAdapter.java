package com.example.recyckerwiev_17_08;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyckerwiev_17_08.databinding.WordFromLayoutBinding;

import java.util.List;

public class WordAdapter extends RecyclerView.Adapter<WordAdapter.WordViewHolder> {

    private List<String> wordList;

    public WordAdapter(List<String> wordList) {
        this.wordList = wordList;
    }

    @NonNull
    @Override
    public WordViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        WordFromLayoutBinding mBinding = WordFromLayoutBinding
                .inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new WordViewHolder(mBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull WordViewHolder holder, int position) {

        String mWord = wordList.get(position);
        holder.textView.setText(mWord);

    }

    @Override
    public int getItemCount() {
        return wordList.size();
    }


    public class WordViewHolder extends RecyclerView.ViewHolder{

        private TextView textView;

        public WordViewHolder(@NonNull WordFromLayoutBinding mBinding) {
            super(mBinding.getRoot());
            textView =mBinding.wordTv;


        }
    }
}
