package serviceImpl;

import entity.User;
import service.UserService;

import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl implements UserService {
    static List<User>userList=new ArrayList<>();
    static {
        userList.add(new User("Benovse",1,22));
        userList.add(new User("Ayxan",2,24));
        userList.add(new User("Leyla",3,23));
        userList.add(new User("Tural",4,27));
    }
    @Override
    public void add(User user) {
        userList.add(user);
    }

    @Override
    public void delete(Integer id) {
      userList.remove(id-1);
    }

    @Override
    public List<User> getAllUser() {
        return userList;
    }

    @Override
    public List<User> getByAge(int age) {
        return userList.stream().filter(user->user.getAge()<20).toList();
    }

    @Override
    public List<User> getByNameLenght(String namelenght) {
        return userList.stream().filter(user -> user.getName().length()>6).toList();
    }

    @Override
    public List<User> getById(Integer id) {
        return userList.stream().filter(user -> user.getId().equals(id)).toList();
    }
}
