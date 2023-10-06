class InvalidDateException extends Exception {
    InvalidDateException(String message) {
        super(message);
    }
}

class Mydate {
    int day, month, year;

    Mydate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year; 
    }

    public boolean isValidDate(int day, int month, int year) {
        if(day < 1 || month < 1 || month > 12 || year < 1) {
            return false;
        }

        int maxDays = 31;

        if(month == 4 || month == 6 || month == 9 || month == 11) {
            maxDays = 30;
        } else if(month == 2) {
            maxDays = (isLeapYear(day)) ? 29 : 28;
        }

        return day <= maxDays;
    }

    public boolean isLeapYear(int year) {
        return (year % 4 == 0 && year %  100 != 0) || (year % 400 == 0);
    }
    
    public void display() {
        System.out.println(this.day + "/" + this.month + "/" + this.year);
    }
}

public class Asg4Bc {
    public static void main(String[] args) {
        Mydate date = new Mydate(6, 10, 2023);
        try {
            if(date.isValidDate(date.day, date.month, date.year)) {
                date.display();
            } else {
                throw new InvalidDateException("Invalid date");
            } 
        } catch(InvalidDateException e) {
            System.out.println(e.getMessage());
        }
    }
}