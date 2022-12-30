public class OperadoresAritimeticos {
    public static void main(String[] args) {
        int resultado = 1+2;
        System.out.println(resultado);

        resultado = resultado -1;
        System.out.println(resultado);

        resultado = resultado * 2;
        System.out.println(resultado);

        resultado = resultado % 8;
        System.out.println(resultado);

        //String concatenada basica
        String primeiraParte= "A porta";
        String segundaParte="esta fechada";
        String resultadoFrase= primeiraParte + segundaParte;
        System.out.println(resultadoFrase);

        //Incremento
        System.out.println(resultado++);
        System.out.println(++resultado);
    }
}
