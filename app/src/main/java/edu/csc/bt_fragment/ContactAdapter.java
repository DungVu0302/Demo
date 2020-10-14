package edu.csc.bt_fragment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.ContactVH> {


    interface Contactlistener{
        void ContactClick(Contact contact);
    }
    ArrayList<Contact> arrayList;
    Context context;
    Contactlistener listener;

    public ContactAdapter(ArrayList<Contact> arrayList, Contactlistener listener) {
        this.arrayList = arrayList;
        this.listener = listener;
    }

    @NonNull
    @Override
    public ContactVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View convertView= LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_contact_item,parent,false);
        ContactVH contactVH=new ContactVH(convertView);
        return contactVH;
    }

    @Override
    public void onBindViewHolder(@NonNull ContactVH holder, int position) {
        final Contact contact=arrayList.get(position);
        holder.txt1.setText(contact.name);
        holder.txt2.setText(contact.phone);
        holder.txt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.ContactClick(contact);
            }
        });
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ContactVH extends RecyclerView.ViewHolder {
        TextView txt1,txt2;
        public ContactVH(@NonNull View itemView) {
            super(itemView);
            txt1=itemView.findViewById(R.id.textView);
            txt2=itemView.findViewById(R.id.textView2);
        }
    }
}
