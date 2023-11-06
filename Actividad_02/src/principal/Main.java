package principal;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static List<String> paises = new ArrayList<>();

    public static void main(String[] args) {
        //Cargo la lista de paises
        cargarLista();
        
        //Creo la logica de la interface
        Formateable convertidorMayuscula = (unPais) -> unPais.toUpperCase();
        
        //invoco al metodo convertirMayuscula y almaceno el retorno de la lista
        List<String> resultado = ConvertirMayuscula(paises, convertidorMayuscula);
        
        //Imprimo el resultado en consola
        imprimirLista(resultado);

    }

    public static List<String> ConvertirMayuscula(List<String> paises, Formateable convertidorMayuscula) {
        List<String> nuevaListaPaises = new ArrayList<>();
        
        for (String pais : paises) {
            nuevaListaPaises.add(convertidorMayuscula.convertirMayuscula(pais));
        }
        return nuevaListaPaises;
    }

    public static void cargarLista() {
        paises.add("Argentina");
        paises.add("Chile");
        paises.add("Uruguaya");
        paises.add("Brasil");
        paises.add("Bolivia");
    }

    public static void imprimirLista(List paises) {
        for (Object object : paises) {
            System.out.println(object);
        }
    }
}
