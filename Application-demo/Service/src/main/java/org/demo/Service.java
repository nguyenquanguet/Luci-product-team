package org.demo;

public class Service {

    public static class UnvalidatedCreateUserContext {
        private String name;
        private int age;

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

    public static class ValidatedCreateUserContext {
        private String name;
        private int age;

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


    private Dao userDao;


    public Service(Dao userDao) {
        this.userDao = userDao;
    }

    public static class CreateUserResult{
        private String id;

        public CreateUserResult(String id) {
            this.id = id;
        }

        public String getId() {
            return id;
        }
    }

    public CreateUserResult save(UnvalidatedCreateUserContext user) {
        if(user == null){
            return null;
        }
        try {
            return new CreateUserResult(userDao.save(validate(user)));
        }catch (Exception e){
            return new CreateUserResult(null);
        }
    }

    private ValidatedCreateUserContext validate(UnvalidatedCreateUserContext context) {
        return new ValidatedCreateUserContext();
    }
}