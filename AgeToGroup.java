public class AgeToGroup {
    public static void main(String[] args) {
        int age = Integer.parseInt(args[0]);

        int ageGroup = (age <= 18) ? 0 : (age < 65) ? 1 : 2;     
            
        System.out.println("Age: " + age + ", Age Group: " + ageGroup);
    }
}