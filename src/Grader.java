public class Grader {
    public String grade(int grade) {
        if (grade < 0 || grade > 100)
            throw new IllegalArgumentException("The grade must be betweeen 0 and 100");
        if (grade < 50)
            return "F1";
        else if (grade < 55)
            return "D2";
        else if (grade < 60)
            return "D1";
        else if (grade < 65)
            return "C2";
        else if (grade < 70)
            return "C1";
        else if (grade < 75)
            return "B3";
        else if (grade < 80)
            return "B2";
        else if (grade < 85)
            return "B1";
        else if (grade < 90)
            return "A3";
        else if (grade < 95)
            return "A2";
        else if (grade <= 100)
            return "A1";
        return null;
    }
}
