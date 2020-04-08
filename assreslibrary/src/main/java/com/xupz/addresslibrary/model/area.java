package com.xupz.addresslibrary.model;

import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.PrimaryKey;
import com.raizlabs.android.dbflow.annotation.Table;
import com.raizlabs.android.dbflow.structure.BaseModel;
import com.xupz.addresslibrary.global.Database;


/**
 * 三级地区 "区县"
 */
@Table(database = Database.class)
public class area extends BaseModel {
    @PrimaryKey
    public int code;
    @Column
    public String name;
    @Column
    public int cityCode;
    @Column
    public int provinceCode;
}