import javax.swing.*;

public class Main {
    public static void main(String[] args)
    {
        /*
        8.- Un cliente realiza la siguiente compra de artefactos: plancha, licuadora,
         lavadora y cocina, si la compra supera los s/.1200, recibe un descuento de 17 %,
         mostrar el precio de cada artefacto, así como el monto, el descuento y
         el pago total si le corresponde un descuento.
        * */

        float Monto=0;
        float dsto=0;
        float pagoTotal=0;

        String artefactos[] = new String[]{"Plancha","Lucuadora","Lavadora","Cocina"};
        float precios[] = new float[4];
        for(int i=0;i<4;i++){
            String texto = JOptionPane.showInputDialog("Ingresar el precio "+i);
            precios[i] = Float.valueOf(texto);

            Monto=Monto+precios[i];
        }
        if(Monto>1200){
            dsto = Monto*(17/100);
            pagoTotal=Monto-dsto;
        }
        System.out.println("Resumen de la compra: SERVICIOS ALIN JAVIER SA");
        for(int i=0;i<4;i++){
            System.out.println(i+".- "+artefactos[i] +" = s/."+precios[i]);
        }
        System.out.println("\nDescuento = s/."+dsto);
        System.out.println("Monto Bruto = s/."+Monto);
        System.out.println("Pago Total = s/."+pagoTotal);
        //FALTA RESOLVER EL DESCUENTO
    }
}