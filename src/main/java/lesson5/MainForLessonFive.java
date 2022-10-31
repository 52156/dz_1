package lesson5;

public class MainForLessonFive {
    public static void main(String[] args) {

        staff[] persArray = new  staff[5];
        persArray[0] = new  staff("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        persArray[1] = new  staff("Petrov Alexander", "Engineer", "mail123@gmail.com", "876575321553", 50000, 41);
        persArray[2] = new  staff("Ivanova Maria", "Engineer", "mail234@gmail.com", "8921362312", 64000, 30);
        persArray[3] = new  staff("Sokolova Nadezhda", "Engineer", "mail456@gmail.com", "876584561553", 32000, 44);
        persArray[4] = new  staff("Smirnov Alexey", "Engineer", "mail567@gmail.com", "8762646321553", 30000, 45);

        persArray[0].printInfo();
        persArray[1].printInfo();
        persArray[2].printInfo();
        persArray[3].printInfo();
        persArray[4].printInfo();

        System.out.println("Employees over 40:");
        System.out.println();
        for (int i=0; i < persArray.length; i++)
            if (persArray[i].age >= 40) persArray[i].printInfo();
    }
}