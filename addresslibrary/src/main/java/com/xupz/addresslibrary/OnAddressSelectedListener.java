package com.xupz.addresslibrary;


import com.xupz.addresslibrary.model.area;
import com.xupz.addresslibrary.model.city;
import com.xupz.addresslibrary.model.province;
import com.xupz.addresslibrary.model.street;

public interface OnAddressSelectedListener {
    void onAddressSelected(province province, city city, area county, street street);
}
