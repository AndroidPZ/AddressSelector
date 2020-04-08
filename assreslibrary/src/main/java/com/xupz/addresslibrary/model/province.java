package com.xupz.addresslibrary.model;

import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.PrimaryKey;
import com.raizlabs.android.dbflow.annotation.Table;
import com.raizlabs.android.dbflow.structure.BaseModel;
import com.xupz.addresslibrary.global.Database;


/**
 * 一级地址 "省"
 */
@Table(database = Database.class)
public class province extends BaseModel {
    @PrimaryKey
    public int code;
    @Column
    public String name;
}