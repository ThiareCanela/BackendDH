public class Cliente {

    public static void main(String[] args) {
        App listado = new App();
        for (int i = 0; i < 11; i++) {
            listado.agregarEnterosAlaLista(i);

        }

        listado.promediarLista();
    }
}
