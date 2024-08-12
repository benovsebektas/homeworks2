package service;

import entity.User;

import java.util.List;

public interface UserService {
    void add(User user);
    void  delete(Integer id);
    List<User>getAllUser();

    List<User>getByAge(int age);
    List<User>getByNameLenght(String namelenght);
    List<User>getById(Integer id);
}
