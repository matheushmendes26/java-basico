package application;


import java.io.*;
import java.net.Inet4Address;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Date;


import entities.*;
import entities.enums.OrderStatus;
import entities.enums.WorkerLevel;
import exceptions.DomainException;
import services.ContractService;
import services.PaypalService;
import util.CurrencyConverter;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter sdf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        /*
        DateTimeFormatter sdf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        System.out.println("Enter rental data");
        System.out.print("Car Model: ");
        String carModel = sc.nextLine();
        System.out.print("Pickup (dd/MM/yyyy hh:ss): ");
        LocalDateTime datepickup = LocalDateTime.parse(sc.nextLine(),sdf);
        System.out.print("Return (dd/MM/yyyy hh:ss): ");
        LocalDateTime dateReturn = LocalDateTime.parse(sc.nextLine(),sdf);
        Rent r = new Rent(carModel,datepickup,dateReturn);
        System.out.print("Enter price per hour: ");
        Double pricePerHour = sc.nextDouble();
        System.out.print("Enter price per day: ");
        Double pricePerDay = sc.nextDouble();
        r.payment(pricePerHour,pricePerDay);
        sc.close();
         */

        System.out.println("Enter with the contracts data");
        System.out.print("Number: ");
        Integer number = sc.nextInt();
        sc.nextLine();
        System.out.print("Date: (dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(sc.nextLine(),sdf);
        System.out.print("Contract value: ");
        double totalvalue = sc.nextDouble();

        Contract contract = new Contract(number, date, totalvalue);
        System.out.print("Enter with the number of installment: ");
        int numberOfInstallments = sc.nextInt();
        ContractService contractService = new ContractService(new PaypalService());

        contractService.processContract(contract,numberOfInstallments);
        System.out.println("INSTALLMENTS: ");
        for(Installment i: contract.getInstallmentList()){
            System.out.print(i);
        }


    }
}
