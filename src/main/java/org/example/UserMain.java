package org.example;

import jakarta.persistence.Persistence;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class UserMain {
    private static final Logger log = LoggerFactory.getLogger(UserMain.class);

    public static void main(String[] args) {
        UserDAO userDAO = new UserDAO();

        //findUser()
        log.info("==========findUser()==========");
        User findUser = userDAO.findUser(1L);
        //log.info("Found user : {} " , findUser.getName());

        User findUser2 = userDAO.findUser(1L);

        if(findUser == findUser2) {
            log.info("findUser == findUser2");
        } else {
            log.info("findUser!= findUser2");
        }

//        User minjinUser = new User("minjin", "minjin@naver.com");
//        userDAO.createUser(minjinUser);
//
//        log.info("Create User : " + minjinUser.getName());
//        log.info("User Eamil : " + minjinUser.getEmail());
    }
}
