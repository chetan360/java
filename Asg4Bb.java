class Emailld {
    String username;
    String pass;

    Emailld() {
        this.username = null;
        this.pass = null;
    }

    Emailld(String username, String pass) {
        this.username = username;
        this.pass = pass;
    }

    public boolean isValidUsername(String userName) {
        int i = userName.indexOf('@');
        if(i == -1 || userName.length() < 10 || userName.length() >= 50) {
            return false;
        }

        return true;
    }

    public boolean isValidPassword(String userName) {
        if(userName.length() < 6 || userName.length() >= 15) {
            return false;
        }

        return true;
    }
}

class InvalidUsernameException extends Exception {
    InvalidUsernameException(String message) {
        super(message);
    }
}

class InvalidPasswordException extends Exception {
    InvalidPasswordException(String message) {
        super(message);
    }
}

public class Asg4Bb {
    public static void main(String args[]) {
        try {
            Emailld user = new Emailld(args[0], args[1]);
            if(user.isValidUsername(user.username)) {
                System.out.println("Username = " + user.username);
            } else {
                throw new InvalidUsernameException("Invalid User name.");
            }

            if(user.isValidPassword(user.pass)) {
                System.out.println("Password = " + user.pass);
            } else {
                throw new InvalidPasswordException("Invalid Password.");
            }
        } catch(InvalidUsernameException e1) {
            System.out.println(e1.getMessage());
        } catch(InvalidPasswordException e2) {
            System.out.println(e2.getMessage());
        }
    }
}