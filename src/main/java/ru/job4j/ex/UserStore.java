package ru.job4j.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User userOut = null;
        for (User el : users) {
            if (el.getUsername() == login) {
                userOut = el;
            }
        }
        if (userOut == null) {
            throw new UserNotFoundException("User is not found");
        }
        return userOut;
    }

    public static boolean validate(User user) throws UserInvalidException {
        boolean isValid;
        if (!user.isValid() || user.getUsername().length() < 3) {
            throw new UserInvalidException("User is not valid");
        } else {
            isValid = true;
        }
        return isValid;
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Petr Arsentev", true)
        };
        try {
            User user = findUser(users, "Petr Arsentev");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
            User user2 = new User("Ab", true);
            if (validate(user2)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException e) {
            e.printStackTrace();
        } catch (UserNotFoundException e) {
            e.printStackTrace();
        }
    }
}
