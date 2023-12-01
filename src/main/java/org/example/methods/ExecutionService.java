package org.example.methods;

public class ExecutionService {

    public static void main(String[] args) {
        System.out.println(DataGeneratorUtils.getRandom(20,100));
        System.out.println(DataGeneratorUtils.getRandom(100,120));
        System.out.println(DataGeneratorUtils.getRandom(120,100));

        int randomInt = DataGeneratorUtils.getRandom(-50);
        System.out.println(randomInt);

        System.out.println(DataGeneratorUtils.getRandomEmail("gmail.com"));
        System.out.println(DataGeneratorUtils.getRandomEmail("gmail.com"));
        System.out.println(DataGeneratorUtils.getRandomEmail("gmail.com"));

        Custumer customer1 = new Custumer("Client1", "M", 33);

        String infoAboutCustomer1 = customer1.toString();
        System.out.println(infoAboutCustomer1);

        customer1.setAge(85);
        System.out.println(customer1.toString());


        Custumer customer2 = new Custumer("Client2", "F", 3553);

        System.out.println(customer2.toString());

        customer1.setName("Client1 + Client2");
        System.out.println(customer1.toString());

        System.out.println("varsta pentru primul client este " + customer1.getAge());
        System.out.println("familia pentru primul client este " + customer1.getName());

    }
}
