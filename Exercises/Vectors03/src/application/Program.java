 public class Program {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

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

	sc.close();

	}
}