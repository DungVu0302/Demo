package edu.csc.bt_fragment;

import java.util.ArrayList;

public class Contact {
    String name;
    String phone;

    public Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }
    public static ArrayList<Contact> getMockupData()
    {
        ArrayList<Contact> arrayList=new ArrayList<>();
        String[] names={"A","B","C","D","E"};
        String[] phones={"1","2","3","4","5"};
        for (int i=0;i<names.length;i++)
        {
            Contact contact=new Contact(names[i],phones[i]);
            arrayList.add(contact);
        }
        return arrayList;
    }
}
