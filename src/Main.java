import java.util.Scanner;

public class Main {



    public static void main(String[] args) {


        Actividades activity = new Actividades();

        executeGame(activity);


    }

    private static void executeGame(Actividades activity) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        System.out.println("" +
                "1- Ingresar persona que va a comer\n" +
                "2- Eliminar persona que no va a comer \n" +
                "3- Publicar menu del restaurante\n" +
                "8- Salir");
        int menuOption = sc.nextInt();

        switch (menuOption){
            case 1:
                System.out.println("Escriba el nombre de la persona que va a comer");
                String nameToBeAdded = sc2.nextLine();

                Restaurante menu = new Restaurante(nameToBeAdded);
                activity.addObserver(menu);

                System.out.println("Persona Guardada correctamente.");
                executeGame(activity);
                break;

            case 2:
                activity.getObservers().forEach(System.out::println);

                System.out.println("Escriba el nombre de la persona que no va a comer");
                String nameToBeRemoved = sc2.nextLine();

                activity.removeByName(nameToBeRemoved);
                System.out.println("Persona Eliminada correctamente.");
                executeGame(activity);
                break;

            case 3:
                System.out.println("Escribir el menú del restaurante");
                String link = sc2.nextLine();
                activity.addPodcast(link);
                executeGame(activity);
                break;
            case 8:
                System.out.println("Gracias por utilizar nuestro sistema de comidas!");
                break;
            default:
                System.out.println("Opción incorrecta");
        }
        sc.close();
        sc2.close();
    }
}