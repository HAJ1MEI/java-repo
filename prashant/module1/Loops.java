package prashant.module1;

public class Loops {
    
    //If-else loop
    static void age(){
        int age = 21;

        if(age>=18){
            System.out.println("Eligible for Driving License");
        }
        else if(age==0){
            System.out.println("Invalid input");
        }
        else{
            System.out.println("Not Eligible for Driving License");
        }
    }

    //Do-while loop
    static void evenNum(){
        int num = 2, i=1, result;
        
        do{
            result = num*i;
            System.out.println(result);
            i++;
        }
        while(result<=20);
    }


    //Switch-Case
    static void whichDay(int randomNum){
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        switch(randomNum){
            case 1-> System.out.println("Day: " + days[0]);
            case 2-> System.out.println("Day: " + days[1]);
            case 3-> System.out.println("Day: " + days[2]);
            case 4-> System.out.println("Day: " + days[3]);
            case 5-> System.out.println("Day: " + days[4]);
            case 6-> System.out.println("Day: " + days[5]);
            case 7-> System.out.println("Day: " + days[6]);
        }
    }

    public static void main(String[] args) {
        age();
        evenNum();

        //Generate Random Number
        int randomNum = 1 + (int)(Math.random() * 7);
        whichDay(randomNum);

    }
}
