public class WhatsYourDOB {
    public static void main(String[] args){
        int day = Input.getInteger("day you were born: ");
        int month = Input.getInteger("month you were born: ");
        int year = Input.getInteger("year you were born: ");
        System.out.println("Your birth date is: " + day + "/" + month + "/" + year);
    }


}
