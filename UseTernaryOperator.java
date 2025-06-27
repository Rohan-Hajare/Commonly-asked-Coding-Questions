package CompanyAptitudeQuestions;

public class UseTernaryOperator {

    public static void main(String[] args) {
        int age=18;

       String result= (age<18)?"Under age":(age==18)?"Eligible for apply":"Eligible for voting";
        System.out.println(result);
    }
}
