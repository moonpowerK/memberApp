package com.hanbit.memberapp.service;

import android.content.Context;
import android.util.Log;

import com.hanbit.memberapp.dao.MemberDAO;
import com.hanbit.memberapp.domain.MemberBean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hb2003 on 2016-12-17.
 */

public class MemberServiceImpl implements MemberService{
    MemberDAO dao;

    public MemberServiceImpl(Context applicationContext) {
        dao = new MemberDAO(applicationContext);
    }

    @Override
    public MemberBean detail(String id) {
        MemberBean member = new MemberBean();
        Log.d("서비스 detail : ", String.valueOf(member.getId()));
        member = dao.detail(id);
        return member;
    }

    @Override
    public List<MemberBean> find(String keyword) {
        List<MemberBean> list = new ArrayList<MemberBean>();
        Log.d("서비스 list : ", String.valueOf(list.size()));
        list = dao.list();
        return list;
    }

    @Override
    public void join(MemberBean param) {
        Log.d("서비스 join : ", String.valueOf(param));
        dao.join(param);
    }

    @Override
    public List<MemberBean> list() {
        List<MemberBean> list = new ArrayList<MemberBean>();
        Log.d("서비스 list : ", String.valueOf(list.size()));
        dao.list();
        return list;
    }

    @Override
    public boolean login(MemberBean param) {
        Log.d("DAO에 넘어온 ID : ", String.valueOf(param.getId()));
        boolean flag = true;
       // flag = dao.login(param);
        Log.d("서비스 login : ", String.valueOf(flag));
        return flag;
    }

    @Override
    public void update(MemberBean param) {
        Log.d("서비스 update : ", String.valueOf(param));
        dao.update(param);
    }

    @Override
    public void delete(String id) {
        Log.d("서비스 delete : ", String.valueOf(id));
        dao.delete(id);
    }

    @Override
    public int count() {
        int count = 0;
        count = dao.count();

        Log.d("서비스 count : ", String.valueOf(count));
        return count;
    }
}
