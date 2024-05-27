package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;
import jakarta.persistence.EntityManagerFactory;

public class UserRun {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("UserPU");
        EntityManager entityManager = emf.createEntityManager();

        // 엔티티 생성
        User user = new User();
        //user.setId(1L);
        user.setName("minjin");
        user.setEmail("mj@naver.com");

        // 영속성 컨텍스트가 관리하진 않음
        entityManager.getTransaction().begin();

        //영속성 컨텍스트에게 관리를 맡김(영속 상태)
//        entityManager.persist(user);
//        System.out.println("userID ::::::::::" + user.getId());

        User user1 = entityManager.find(User.class, 1L);
        User user2= entityManager.find(User.class, 1L);

        if(user1 == user2) {
            System.out.println("user1 == user2");
        } else {
            System.out.println("user1 != user2");
        }

        //이떄 DB에 저장
        entityManager.getTransaction().commit();

    }
}
