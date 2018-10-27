package com.xiyo.selfhelp.utils;

import com.xiyo.selfhelp.MyApplication;
import com.xiyo.selfhelp.data.model.ManagerEntity;
import com.xiyo.selfhelp.greendao.gen.DaoSession;
import com.xiyo.selfhelp.greendao.gen.ManagerEntityDao;

import java.util.ArrayList;
import java.util.List;

public class SQLiteUtils {
    private static SQLiteUtils instance;
    ManagerEntityDao phoneContactsEntityDao;
    DaoSession daoSession;

    private SQLiteUtils() {
        phoneContactsEntityDao = MyApplication.getApplication().getDaoSession().getManagerEntityDao();
        daoSession = MyApplication.getApplication().getDaoSession();
    }

    public static SQLiteUtils getInstance() {
        if (instance == null) {
            synchronized (SQLiteUtils.class) {
                if (instance == null) {
                    instance = new SQLiteUtils();
                }
            }
        }
        return instance;
    }

    //增加
    public void addContacts(ManagerEntity bean) {
        phoneContactsEntityDao.insert(bean);
    }

    //删除
    public void deleteContacts(ManagerEntity bean) {
        phoneContactsEntityDao.delete(bean);
    }

    //修改
    public void updateContacts(ManagerEntity bean) {
        phoneContactsEntityDao.update(bean);
    }

    //条件查询
    public List selectAllContacts(String phone) {
        phoneContactsEntityDao.detachAll();//清除缓存
        List list1 = phoneContactsEntityDao.queryBuilder().where(ManagerEntityDao.Properties.Phone.eq(phone)).build().list();
        return list1 == null ? new ArrayList() : list1;
    }

    //条件查询
    public List selectAllContacts() {
        phoneContactsEntityDao.detachAll();//清除缓存
        List list1 = phoneContactsEntityDao.queryBuilder().build().list();
        return list1 == null ? new ArrayList() : list1;
    }

    //删除表中内容
    public void deleteAllContact() {
        phoneContactsEntityDao.deleteAll();
    }
}
