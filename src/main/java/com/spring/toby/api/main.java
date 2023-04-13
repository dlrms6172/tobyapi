package com.spring.toby.api;

import com.spring.toby.api.dao.UserDao;
import com.spring.toby.api.vo.User;

import java.sql.SQLException;

public class main {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        UserDao dao = new UserDao();

        User user = new User();
        user.setId("whiteship");
        user.setName("박기선");
        user.setPassword("married");

        dao.add(user);

        System.out.println(user.getId()+" 등록 성공 ");

        User user2 = dao.get(user.getId());
        System.out.println("등록 유저 이름" + user2.getName());
        System.out.println("등록 유저 패스워드" + user2.getPassword());
        System.out.println(user2.getId()+" 조회 성공 ");

    }
}
