
package day1;
public class DataTypes {

    static void bio(){
        int id = 1;
        String name = "Prashant Vhatkar";
        double salary = 60000;
        float height = 1.8f;
        char preffix = 'P';
        boolean isAwake = true;
        String[] hobbies = {"Reading", "Gaming"};
        

        System.out.println("ID: " + id + "Name: " + name +
                            "\nHeight: " + height + "\nSalary: " + salary+
                            "\nPrefix: " + preffix+ "\nAwake: " + isAwake);
        System.out.print("Hobbies: ");
        for (String hobbie : hobbies) {
            System.out.print(hobbie+", ");
        }

    }

    

    public static void main(String[] args) {
        bio();
        
    }
}