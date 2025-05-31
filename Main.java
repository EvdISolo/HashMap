import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


        public class Main {
                    public static void main(String[] args) {


                        MyMap<String, Integer> costPerAddress = new MyMap<>();
                        costPerAddress.put("Абакан",400);
                        costPerAddress.put("Москва",200);
                        costPerAddress.put("Красноярск",300);


                Scanner scanner = new Scanner(System.in);

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
                            String city=scanner.nextLine();

                            break;

                        case 3:
                            System.out.println("Введите вес:");
                            int weight= Integer.parseInt(scanner.nextLine());

                            System.out.println("Стоимость доставки составит"+ );
                            break;

                    }


                }


            }
        }








