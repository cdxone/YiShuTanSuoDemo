package com.example.yishutansuodemo.zhang_2.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;

import com.example.yishutansuodemo.IMyAidl;
import com.example.yishutansuodemo.zhang_2.bean.Person;

import java.util.ArrayList;
import java.util.List;

public class MyService extends Service {
    private ArrayList<Person> persons;

    public MyService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        persons = new ArrayList<>();
        return binder;
    }

    /**
     * 这个就相当于中间人，它暴露了两个作用（addPerson、getPersonList）
     */
    private IBinder binder =new IMyAidl.Stub(){

        @Override
        public void addPerson(Person person) throws RemoteException {
            persons.add(person);
        }

        @Override
        public List<Person> getPersonList() throws RemoteException {
            return persons;
        }
    };

}
