package com.example.erp.service;

import com.example.erp.bean.Bills;
import com.example.erp.dao.BillsDao;
import com.example.erp.dao.StudentDao;
import com.example.erp.dao.implementation.BillsDaoimpl;
import com.example.erp.dao.implementation.StudentDaoImpl;

import java.util.List;

public class BillService {
    BillsDao billsDao = new BillsDaoimpl();
    public List<Bills> getBills() { return  billsDao.getBills(); }
}
