package org.demo;

import org.springframework.stereotype.Component;

import java.util.*;
import java.util.stream.Collectors;

@Component
public class UserIml implements Dao<User> {

    private List<User> userList = new ArrayList<>();

    @Override
    public Optional<User> get(int id) {
        return Optional.ofNullable(userList.get(id));
    }

    @Override
    public Collection<User> getAll() {
        return userList.stream()
                .filter(Objects::nonNull)
                .collect(Collectors.collectingAndThen(Collectors.toList(), Collections::unmodifiableList));
    }

    @Override
    public int save(User user) {
        userList.add(user);
        int index = userList.size() - 1;
        user.setId(index);
        return index;
    }

    @Override
    public void update(User user) {
        userList.set(user.getId(), user);
    }

    @Override
    public void delete(User todo) {
        userList.set(todo.getId(), null);
    }
}
