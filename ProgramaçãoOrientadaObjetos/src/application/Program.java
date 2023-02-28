package application;


import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.util.List;
import java.util.stream.Collectors;


import entities.*;
import util.CurrencyConverter;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /*
        Product  product = new Product();
        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        product.name = sc.nextLine();
        System.out.print("Price: ");
        product.price = sc.nextDouble();
        System.out.print("Quantity: ");
        product.quantity = sc.nextInt();
        System.out.println("Product data: "+product);

        System.out.println();
        System.out.println("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        product.addProducts(quantity);
        System.out.println("Updated data: "+product);

        System.out.println();
        System.out.println("Enter the number of products to be removed in stock: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);
        System.out.println("Updated data: "+product);
        */

        //Exercise #1
        /*
        Rectangle rectangle = new Rectangle();
        System.out.println("Enter rectangle width and height: ");
        rectangle.width = sc.nextDouble();
        rectangle.height = sc.nextDouble();
        System.out.println(rectangle);
         */

        //Exercise #2
        /*
        Employee employee = new Employee();
        System.out.print("Name: ");
        employee.name = sc.nextLine();
        System.out.print("Gross salary: ");
        employee.grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        employee.tax = sc.nextDouble();

        System.out.println(employee);

        System.out.print("Which percentage to increase salary?");
        double percentage = sc.nextDouble();
        employee.IncreaseSalary(percentage);
        */

        //Exercise #3
        /*
        Student student = new Student();
        student.name = sc.nextLine();
        student.firstQuarter = sc.nextDouble();
        student.secondQuarter = sc.nextDouble();
        student.thirdQuarter = sc.nextDouble();

        student.Verify();
        */

        //Exercise #4
        /*
        System.out.print("What is dollar price? ");
        double priceDollar = sc.nextDouble();
        System.out.print("How many dollars will be bought? ");
        double dollars = sc.nextDouble();

        CurrencyConverter.Convert(priceDollar,dollars);
        */

        //Exercise #5
        /*
        Bill bill;
        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();
        System.out.print("Enter account holder: ");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.print("Is there an initial deposit (y/n)? ");
        char isDeposit = sc.next().charAt(0);
        if(isDeposit == 'y'){
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            bill = new Bill(name,accountNumber,initialDeposit);

        }else{
            bill = new Bill(name,accountNumber);
        }
        System.out.println();
        System.out.println(bill);

        System.out.print("Enter a deposit value: ");
        double deposit = sc.nextDouble();
        bill.deposit(deposit);
        System.out.println("Update account data: ");
        System.out.println();
        System.out.println(bill);

        System.out.print("Enter a withdraw value: ");
        double withdraw = sc.nextDouble();
        bill.withdrawals(withdraw);
        System.out.println("Update account data: ");
        System.out.println();
        System.out.println(bill);

         */

        //Vectors Exercises

        //Exercise 01#
        /*
        System.out.print("How many number you will enter: ");
        int numberQuantity = sc.nextInt();
        int[] vect = new int[numberQuantity];

        for(int i=0;i<vect.length;i++){
            System.out.print("Enter a number: ");
            vect[i] = sc.nextInt();
        }
        System.out.println("Negative numbers: ");
        for(int i=0;i< vect.length;i++){
            if(vect[i]<0){
                System.out.println(vect[i]);
            }
        }

         */

        //Exercise 02#
        /*
        System.out.print("How many number you will enter: ");
        int numberQuantity = sc.nextInt();
        double[] vect = new double[numberQuantity];
        double sum =0;

        for(int i=0;i<vect.length;i++){
            System.out.print("Enter a number: ");
            vect[i] = sc.nextInt();
        }
        System.out.print("VALORES = ");
        for(int i=0;i< vect.length;i++){
            System.out.print(String.format("%.1f  ",vect[i]));
            sum += vect[i];
        }

        System.out.println();
        System.out.println("SUM = "+String.format("%.2f",sum));
        System.out.println("AVARAGE = "+String.format("%.2f",sum/ vect.length));

         */
        //Exercise 03#
        /*
        System.out.print("How many people you will enter: ");
        int peopleQuantity = sc.nextInt();
        People[] vect = new People[peopleQuantity];

        for (int i=0;i<vect.length;i++){
            System.out.println(i+1+"º People data:");
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Age: ");
            int age = sc.nextInt();
            System.out.print("Height: ");
            double height = sc.nextDouble();
            vect[i] = new People(name,height,age);
        }

        double sum = 0;
        double count = 0;
        for(int i=0;i< vect.length;i++){
            sum += vect[i].getHeight();
            if(vect[i].getAge()<16){
                count++;
            }
        }
        double percent16 = count/ vect.length*100;
        System.out.println("Avarage height: "+String.format("%.2f",sum/ vect.length));
        System.out.println("People with less of 16 years old: "+String.format("%.1f",percent16)+"%");

        for(int i=0;i< vect.length;i++){
            if(vect[i].getAge()<16){
                System.out.println(vect[i].getName());
            }
        }

         */
        //Exercise 04#
        /*
        System.out.print("How many numbers you will enter? ");
        int numberQuantity = sc.nextInt();
        int[] vect = new int[numberQuantity];

        for(int i=0;i<vect.length;i++){
            System.out.print("Enter a number: ");
            vect[i] = sc.nextInt();
        }
        System.out.println("Even numbers: ");
        for(int i=0;i< vect.length;i++){
            if(vect[i]%2==0){
                System.out.print(vect[i]+"  ");
            }
        }
         */

        //Exercise 05#
        /*
        System.out.print("How many numbers you will enter? ");
        int numberQuantity = sc.nextInt();
        double[] vect = new double[numberQuantity];

        for(int i=0;i<vect.length;i++){
            System.out.print("Enter a number: ");
            vect[i] = sc.nextDouble();
        }
        double maior = vect[0];
        int position = 0;
        for(int i=0;i< vect.length;i++){
            if(vect[i]>=maior)
            {
                position = i;
                maior = vect[i];
            }
        }
        System.out.println("HIGHER VALUE = "+String.format("%.1f",vect[position]));
        System.out.println("POSITION OF THE HIGHER VALUE = "+position);
         */

        //Exercise 06#
        /*
        System.out.print("How many elements contain each vector? ");
        int numberQuantity = sc.nextInt();
        double[] A = new double[numberQuantity];
        double[] B = new double[numberQuantity];
        double[] C = new double[numberQuantity];

        System.out.println("Enter with de values of the vector A:");
        for(int i=0;i<A.length;i++)
        {
            A[i] = sc.nextDouble();
        }

        System.out.println("Enter with de values of the vector B:");
        for(int i=0;i<B.length;i++)
        {
            B[i] = sc.nextDouble();
        }
        System.out.println("RESULT VECTOR: ");
        for(int i=0;i<A.length;i++)
        {
            C[i] = A[i]+B[i];
            System.out.println(C[i]);
        }

         */

        //Exersice 07#
        /*
        System.out.print("How many elements contain each vector? ");
        int numberQuantity = sc.nextInt();
        double[] vector = new double[numberQuantity];
        double sum =0;
        for(int i=0;i<vector.length;i++){
            System.out.print("Enter with a number: ");
            vector[i] = sc.nextDouble();
            sum +=vector[i];
        }
        System.out.println("VECTORS AVERAGE = "+String.format("%.3f",sum/ vector.length));
        System.out.println("ELEMENTS ABOVE OF THE AVERAGE");
        for(int i=0;i<vector.length;i++){
            if(vector[i]<sum/vector.length){
                System.out.println(String.format("%.1f",vector[i]));
            }
        }
         */

        //Vectors Challenge#
        /*
        System.out.print("How many tenants will host in the hostel? ");
        int numberQuantity = sc.nextInt();
        Tenant[] vector = new Tenant[10];
        for(int i=0;i<numberQuantity;i++){
            System.out.println("Rent #"+(i+1));
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int room = sc.nextInt();
            vector[room] = new Tenant(name,email);
            System.out.println();
        }

        System.out.println("Busy rooms:");
        for(int i=0;i< vector.length;i++)
        {
            if(vector[i]!=null){
                System.out.println(i+": "+vector[i]);
            }
        }
         */

        //List Exercise
        /*
        System.out.print("How many employees will be registered? ");
        int numberQuantity = sc.nextInt();
        List<Employee2> list = new ArrayList<>();
        int i =0;
        while(i<numberQuantity){
            System.out.println("Employee #"+(i+1)+":");
            System.out.print("Id: ");
            sc.nextLine();
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            list.add(new Employee2(id, name, salary));
            System.out.println();
            i++;
        }
        System.out.print("Enter the employee id that will have salary increase: ");
        int id = sc.nextInt();
        Employee2 result = list.stream().filter(x->x.getId()==id).findFirst().orElse(null);
        if(result == null){
            System.out.println("This id does not exist!");

        }else{
            System.out.print("Enter the percentage: ");
            double percentage = sc.nextDouble();
            for(Employee2 x: list){
                if(x.getId()==id){
                    x.increaseSalary(percentage);
                }
            }
        }
        System.out.println("List of employees:");
        for (Employee2 x: list){
            System.out.println(x);
        }
         */
        //Matrix Exercise
        System.out.print("Enter with the matrix lines number: ");
        int line = sc.nextInt();
        System.out.print("Enter with the matrix column number: ");
        int column = sc.nextInt();
        int[][] matrix = new int[line][column];
        for(int i=0;i<line;i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter with the number to research: ");
        int numberResearch = sc.nextInt();
        for(int i=0;i<line;i++) {
            for (int j = 0; j < column; j++) {
                if (matrix[i][j] == numberResearch) {
                    System.out.println("Position " + i + "," + j);
                    if ((j - 1) >= 0) {
                        System.out.println("Left: " + matrix[i][j - 1]);
                    }
                    if ((i - 1) >= 0) {
                        System.out.println("Up: " + matrix[i - 1][j]);
                    }
                    if ((j + 1) <= (column-1)) {
                        System.out.println("Right: " + matrix[i][j + 1]);
                    }
                    if ((i + 1) <= (line-1)) {
                        System.out.println("Down: " + matrix[i + 1][j]);
                    }
                    System.out.println();
                }
            }
        }
       sc.close();
    }
}
