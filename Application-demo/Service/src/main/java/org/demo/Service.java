package org.demo;

import java.util.Collection;

public class Service {

    public class UnvalidatedCreateUserContext {
        private String name;
        private int age;
        private String email;

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }

    public class ValidatedCreateUserContext {
        private int id;
        private String name;
        private int age;
        private String email;

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setId(int index) {
        }

        public int getId() {
            return id;
        }
    }

    private Dao userDao;

    private ValidatedCreateUserContext todo = new ValidatedCreateUserContext();

    public void save(ValidatedCreateUserContext context) {
        Dao.save(todo);
        todo = new ValidatedCreateUserContext();
    }

    public Collection<ValidatedCreateUserContext> getAllTodo() {
        return Dao.getAll();
    }

    public int saveTodo(ValidatedCreateUserContext todo) {
        validate(todo);
        return Dao.save(todo);
    }

    private void validate(ValidatedCreateUserContext todo) {
        // Details omitted
    }

    public ValidatedCreateUserContext getTodo() {
        return todo;
    }

}