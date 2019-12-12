package com.apsara.thirdassignment.ui;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.apsara.thirdassignment.BuildConfig;
import com.apsara.thirdassignment.R;

import java.util.List;

public class ContactsAdapter extends RecyclerView.Adapter<ContactsAdapter.ContactsViewHolder> {
    Context mContext;
    List<Contacts> contactsList;

    public ContactsAdapter(Context mContext, List<Contacts> contactsList){this.mContext=mContext;
        this.contactsList=contactsList;
    }
    @NonNull
    @Override
    public ContactsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View View = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.layout_contacts,parent,false);
        return new ContactsViewHolder(View);
    }

    @Override
    public void onBindViewHolder(@NonNull ContactsViewHolder holder, final int position) {
        final Contacts contacts=contactsList.get(position);

        holder.imgProfile.setImageResource(contacts.getImageId());
        holder.tvFname.setText(contacts.getFullName());
        holder.tvAge.setText(contacts.getAge());
        holder.tvAddress.setText(contacts.getAddress());
        holder.tvGender.setText(contacts.getGender());
        holder.btnDelete.setText(contacts.getButton());
        holder.imgProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext,"Hello! This is:"+contacts.getFullName(),Toast.LENGTH_SHORT).show();
            }
        });

        holder.btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contactsList.remove(position);
                notifyItemRemoved(position);
            }
        });

    }

    @Override
    public int getItemCount() {
        return contactsList.size();
    }

    public class ContactsViewHolder extends RecyclerView.ViewHolder{
        ImageView imgProfile;
        TextView tvFname,tvAge,tvAddress,tvGender;
        Button btnDelete;

        public ContactsViewHolder(@NonNull View itemView) {
            super(itemView);
            imgProfile=itemView.findViewById(R.id.imgProfile);
            tvFname=itemView.findViewById(R.id.tvFname);
            tvAge=itemView.findViewById(R.id.tvAge);
            tvAddress=itemView.findViewById(R.id.tvAd);
            tvGender=itemView.findViewById(R.id.tvG);
            btnDelete=itemView.findViewById(R.id.btnDelete);


        }


    }

}
