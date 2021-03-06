package co.sofka.main;


public class MethodADD {

    private static final long POT_2_A_LA_32 = (long) Math.pow(2, 32);

    public static Long[] ADD(Long[] memoria, String[] parametros){
        int posicion1Memoria = getValorDesdeString(parametros[0]);
        int posicion2Memoria = getValorDesdeString(parametros[1]);
        Long operador1 = (long)memoria[posicion1Memoria];
        Long operador2 = (long)memoria[posicion2Memoria];

        memoria[posicion1Memoria] = (operador1 + operador2) % POT_2_A_LA_32;
        return memoria;
    }

    private static int getValorDesdeString(String stringConNumero) {
        int valorInt = Integer.parseInt(stringConNumero.substring(1));
        return valorInt;
    }
}
