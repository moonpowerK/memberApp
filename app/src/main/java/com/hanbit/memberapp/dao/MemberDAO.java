package com.hanbit.memberapp.dao;

import android.content.Context;

import com.hanbit.memberapp.domain.MemberBean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hb2003 on 2016-12-17.
 */

public class MemberDAO {

    public MemberDAO(Context applicationContext) {
        //db키넣으면 끄으으으으으~
    }

    public MemberBean detail(String id){
        MemberBean member = new MemberBean();
        return member;
    }
    public List<MemberBean> find(String keyword){
        List<MemberBean> list = new ArrayList<MemberBean>();
        return list;
    }
    public void join(MemberBean param){}

    public List<MemberBean>  list(){
        List<MemberBean> list = new ArrayList<MemberBean>();
        return list;
    }
    public boolean login(MemberBean param){
        boolean flag = false;
        return flag;
    }
    public void update(MemberBean param){}
    public void delete(String id){}

    public int count(){
        int count= 0;
        return count;
    }
}
