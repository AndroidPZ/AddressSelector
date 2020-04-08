package com.xupz.addresslibrary;

import android.content.Context;

import com.raizlabs.android.dbflow.config.FlowConfig;
import com.raizlabs.android.dbflow.config.FlowManager;
import com.raizlabs.android.dbflow.list.FlowQueryList;
import com.raizlabs.android.dbflow.sql.language.SQLite;
import com.xupz.addresslibrary.model.area;
import com.xupz.addresslibrary.model.area_Table;
import com.xupz.addresslibrary.model.city;
import com.xupz.addresslibrary.model.city_Table;
import com.xupz.addresslibrary.model.province;
import com.xupz.addresslibrary.model.street;
import com.xupz.addresslibrary.model.street_Table;

import java.util.ArrayList;


public class DefaultAddressProvider implements AddressProvider {
    public DefaultAddressProvider(Context context) {
        FlowManager.init(new FlowConfig.Builder(context.getApplicationContext()).build());
    }

    @Override
    public void provideProvinces(AddressReceiver<province> addressReceiver) {
        final FlowQueryList<province> provinceQueryList = SQLite.select()
                .from(province.class)
                .flowQueryList();
        addressReceiver.send(new ArrayList<>(provinceQueryList));
    }

    @Override
    public void provideCitiesWith(int provinceCode, AddressReceiver<city> addressReceiver) {
        final FlowQueryList<city> cityQueryList = SQLite.select()
                .from(city.class)
                .where(city_Table.provinceCode.eq(provinceCode))
                .flowQueryList();
        addressReceiver.send(new ArrayList<>(cityQueryList));
    }

    @Override
    public void provideCountiesWith(int cityCode, AddressReceiver<area> addressReceiver) {
        final FlowQueryList<area> areaQueryList = SQLite.select()
                .from(area.class)
                .where(area_Table.cityCode.eq(cityCode))
                .flowQueryList();
        addressReceiver.send(new ArrayList<>(areaQueryList));
    }

    @Override
    public void provideStreetsWith(int areaCode, AddressReceiver<street> addressReceiver) {
        final FlowQueryList<street> streetQueryList = SQLite.select()
                .from(street.class)
                .where(street_Table.areaCode.eq(areaCode))
                .flowQueryList();
        addressReceiver.send(new ArrayList<>(streetQueryList));
    }
}
