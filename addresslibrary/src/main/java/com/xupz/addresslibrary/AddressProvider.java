package com.xupz.addresslibrary;

import com.xupz.addresslibrary.model.area;
import com.xupz.addresslibrary.model.city;
import com.xupz.addresslibrary.model.province;
import com.xupz.addresslibrary.model.street;

import java.util.List;



public interface AddressProvider {
    void provideProvinces(AddressReceiver<province> addressReceiver);
    void provideCitiesWith(int provinceCode, AddressReceiver<city> addressReceiver);
    void provideCountiesWith(int cityCode, AddressReceiver<area> addressReceiver);
    void provideStreetsWith(int areaCode, AddressReceiver<street> addressReceiver);

    interface AddressReceiver<T> {
        void send(List<T> data);
    }
}