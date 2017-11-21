package com.example.user.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by user on 2017/11/20.
 */

@Entity

public class AppInfo {

    @Id
    private String packageName;
//    private Drawable icon;
    private String name;
    private String memory;

    public Boolean getSystem() {
        return system;
    }

    public void setSystem(Boolean system) {
        this.system = system;
    }

    private Boolean system = false ;
    public boolean isLock() {
        return lock;
    }

    public void setLock(boolean lock) {
        this.lock = lock;
    }

    private boolean lock;//是否上锁

    @Generated(hash = 343680710)
    public AppInfo(String packageName, String name, String memory, Boolean system,
            boolean lock) {
        this.packageName = packageName;
        this.name = name;
        this.memory = memory;
        this.system = system;
        this.lock = lock;
    }

    @Generated(hash = 1656151854)
    public AppInfo() {
    }
    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

//    public Drawable getIcon() {
//        return icon;
//    }

//    public void setIcon(Drawable icon) {
//        this.icon = icon;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    @Override
    public boolean equals(Object o) {
        if( o == null) return false;
        if(o instanceof AppInfo){
            AppInfo appInfo = (AppInfo) o;
            return appInfo.packageName .equals(this.packageName );
        }
        return false ;
    }

    public boolean getLock() {
        return this.lock;
    }
}
