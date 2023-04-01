
/**
 * Escreva uma descrição da classe BMExercicio03 aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class BMExercicio03
{
    public static void main(String[] args){
        float arroz = 2.95f;
        float feijao = 3.50f;
        
        System.out.println("O item arroz custa " + arroz + " e o item feijao custa "+ feijao);
        
        float soma = arroz + feijao;
        System.out.println("A soma dos itens deu " + soma);
        
        
        final double taxaCalculada = 0.0825;
        System.out.println("taxa sobre item " + taxaCalculada*100);
        
        arroz += arroz*taxaCalculada; feijao += feijao*taxaCalculada;
        float novoCusto = arroz + feijao;
        
        boolean muitoCaro = novoCusto > 10 ? true : false;
        System.out.println((muitoCaro ? "Caro" : "Barato"));
        
    }
}
