import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main(){
    public static void main(String[] args) {
        
    }

    public static int nOcorrencias(ArrayList<Integer> l, Integer el){
        int qtdOcorrencias = 0;

        l.forEach((i) -> {
            if(i.equals(el)){
                qtdOcorrencias++;
            }
        });

        return qtdOcorrencias;
    }
    
    public static boolean hasRepeat(ArrayList<Integer> l){

        if(l.size() > 1) {
            for (int i = 0; i < l.size(); i++) {
                for (int j = 0; j < l.size(); j++) {
                    if (l.contains(i) == l.contains(j)) {
                        return true;
                    }
                }
            }
        }

        return false;

    }

    public static ArrayList<Integer> listRepeat(ArrayList< Integer > l){
        ArrayList<Integer> listaAux = new ArrayList<Integer>();
        ArrayList<Integer> listaRepetidos = new ArrayList<Integer>();


        l.forEach((i) -> {
            
            if(listaAux.contains(i)){
                listaRepetidos.add(i);
            }

            listaAux.add(i);
        });

        return listaRepetidos;
    }

    int nroRepeat(ArrayList<Integer> l){
        int repetedNumbers = 0;
        int count = 0;

        l.forEach(number ->{
            count = 0;
            for(int i=0; i<l.size(); i++){
                if(l.get(i) == number){
                    count++;
                }
            }
            if (count>1){
                repetedNumbers+=count-1;
            }
        });

        return count;
    }

    public static ArrayList<Integer> union(ArrayList<Integer> l1, ArrayList<Integer> l2){
        ArrayList<Integer> listaUniao = new ArrayList<Integer>();

        l2.forEach((i) -> {
            l1.add(i)
        })

        return l1;
    }

    List<Integer> intersect(ArrayList<Integer> l1, ArrayList<Integer> l2){
        return l1.stream()
        .distinct()
        .filter(l2::contains)
        .collect(Collectors.toList());
    }
}
