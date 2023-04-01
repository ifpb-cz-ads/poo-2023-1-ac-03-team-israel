public class CBBAtividadePratica4{

    public static void main(String[] args){
    
        float ladoA = 8.3f;
        float ladoB = 15.4f;
        float altura = 3.2f;
        float metroCubico = ladoA*ladoB*altura;
        float valor = metroCubico*100.00f;
        String resultado = String.format("%.2f", valor);
        System.out.print("O valor do orçamento é de " + resultado +"R$");
        
    }

}