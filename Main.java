import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


        public class Main {
            public static void main(String[] args) {

                HashMap<String, Integer> costPerAddress = new HashMap<>();
                costPerAddress.put("Абакан", 400);
                costPerAddress.put("Москва", 200);
                costPerAddress.put("Красноярск", 300);



                    Scanner scanner = new Scanner(System.in);

                    int weight = 0;
                    while (true) {

                        System.out.println(" Главное меню для заполнения  нового заказа  " + "\n" +
                                " 0.Выход из программы\n" +
                                " 1.Указать страну:\n " +
                                "2.Указать город: \n " +
                                "3.Указать вес (кг)");


                        String input = scanner.nextLine();
                        int operation = Integer.parseInt(input);


                        switch (operation) {
                            case 0:
                                System.out.println("Программа закрыта");
                                System.exit(0);

                            case 1:
                                System.out.println("Введите название страны");
                                String country = scanner.nextLine();


                                break;

                            case 2:
                                System.out.println("Введите название города :");
                                String city = scanner.nextLine();




                                break;

                            case 3:
                                System.out.println("Введите вес:");
                                weight = Integer.parseInt(scanner.nextLine());
                                for (String key : costPerAddress.keySet()) {
                                    int value = costPerAddress.get(key);
                                System.out.println("Стоимость доставки составит " + value * weight);}
                                break;
                        }



                    }




                }


                }














