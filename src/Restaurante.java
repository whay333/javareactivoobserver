public class Restaurante implements Observer{
    private String name;


    public Restaurante(String name) {
        this.name = name;
    }

    @Override
    public void update(String param) {
        System.out.println(name + ": el nuevo menu de comidas: " + param + " ha sido preparado, ya puedes ir a comer");
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Comensal{" +
                "name='" + name + '\'' +
                '}';
    }
}
