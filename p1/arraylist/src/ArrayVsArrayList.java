import java.util.ArrayList;
import java.util.Arrays;

public class ArrayVsArrayList {
    public static void main(String[] args) {
        //ARRAY LISTS TÊM TAMANHO VARIÁVEL, CRESCEM OU DIMINUEM DE ACORDO C A NECESSIDADE!!
        //ARRAY LISTS SÓ SUPORTAM OBJETOS.
        
        //criar:
        String[] friendsArray = {"Joao", "Lucas", "Lorena", "Cassia", "Daniel"};
        ArrayList<String> friendsArrayList =
            new ArrayList<>(Arrays.asList("Joao", "Lucas", "Lorena", "Cassia", "Daniel"));

        //printar posição:
        System.out.println(friendsArray[1]);
        System.out.println(friendsArrayList.get(1));

        //pegar tamanho:
        System.out.println(friendsArray.length);
        System.out.println(friendsArrayList.size());

        //não pode fazer essa gracinha com arrays:
        friendsArrayList.add("Waxtu");
        System.out.println(friendsArrayList.get(5));

        //settar elemento
        friendsArray[0] = "Carlos";
        System.out.println(friendsArray[0]);

        friendsArrayList.set(0, "carlos");
        System.out.println(friendsArrayList.get(0));

        //remover elemento:
        //NÃO PODE COM ARRAY KKKKKKKKKKKK
        friendsArrayList.remove("Lucas");
        System.out.println(friendsArrayList.get(1));

        //printar
        System.out.println(friendsArray); //printa o endereço
        System.out.println(friendsArrayList); //ativa um ToString
    }
}