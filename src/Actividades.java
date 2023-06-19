// sujeto concreto
public class Actividades extends Subject{

    private String podcast;


    public void addPodcast(String link){

        this.podcast = link;

        System.out.println("Nuevo menu de comidas anidado");

        this.notifiy();
    }

    public String getPodcast() {
        return podcast;
    }

    @Override
    public void notifiy() {
        observers.forEach(observer -> observer.update(this.podcast));
    }

    public void removeByName(String name){
        this.removeObserver(observers.stream()
                .filter(observer -> observer instanceof Restaurante && ((Restaurante) observer).getName().equals(name))
                .findFirst()
                .get());
    }

}
