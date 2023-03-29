import javax.swing.*;
//import java.util.*;

public class Conversor {
    public double valor;
    public String monedalocal;
    public String msg = null;
    public double dolar = 4749.5;
    public double euro = 5105.6;
    public double libra = 5805.12;
    public double yen = 159.46;
    public double won = 1590.2;
    public char resultado;

    public String getMonedalocal() {
        return monedalocal;
    }

    public void setMonedalocal(String monedalocal) {
        this.monedalocal = monedalocal;
    }

    public char getResultado() {
        return resultado;
    }

    public void setResultado(char resultado) {
        this.resultado = resultado;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getDolar() {
        return dolar;
    }

    public void setDolar(double dolar) {
        this.dolar = dolar;
    }

    public double getEuro() {
        return euro;
    }

    public void setEuro(double euro) {
        this.euro = euro;
    }

    public double getLibra() {
        return libra;
    }

    public void setLibra(double libra) {
        this.libra = libra;
    }

    public double getYen() {
        return yen;
    }

    public void setYen(double yen) {
        this.yen = yen;
    }

    public double getWon() {
        return won;
    }

    public void setWon(double won) {
        this.won = won;
    }

    public void convertir(String monedalocal, double valor, char moneda) {
        if (monedalocal.equalsIgnoreCase("peso")) {
            switch (moneda) {
                case 'd':
                     JOptionPane.showMessageDialog(null, "Equivale a : " + Math.round(valor / getDolar()) + " (dolar)");
                    //System.out.println("Equivale a : " + Math.round(valor / getDolar()) + " (dolar)");
                    break;
                case 'e':
                    System.out.println("Equivale a : " + Math.round(valor / getEuro()) + " (euro)");
                    break;
                case 'l':
                    System.out.println("Equivale a : " + Math.round(valor / getLibra()) + " (libra)");
                    break;
                case 'y':
                    System.out.println("Equivale a : " + Math.round(valor / getYen()) + " (yen)");
                    break;
                case 'w':
                    System.out.println("Equivale a : " + Math.round(valor / getWon()) + " (won)");
                    break;
                default:
                    System.out.println("No aplica");
            }

        } else if (monedalocal.equalsIgnoreCase("dolar")) {
            System.out.println("Equivale a : " + Math.round(valor * getDolar()) + " (peso)");
        } else if (monedalocal.equalsIgnoreCase("euro")) {
            System.out.println("Equivale a : " + Math.round(valor * getEuro()) + " (peso)");
        } else if (monedalocal.equalsIgnoreCase("libra")) {
            System.out.println("Equivale a : " + Math.round(valor * getLibra()) + " (peso)");
        } else if (monedalocal.equalsIgnoreCase("yen")) {
            System.out.println("Equivale a : " + Math.round(valor * getYen()) + " (peso)");
        } else if (monedalocal.equalsIgnoreCase("won")) {
            System.out.println("Equivale a : " + Math.round(valor * getWon()) + " (peso)");
        }

    }

    public void solicitarDatos() {
        monedalocal = JOptionPane.showInputDialog("Ingrese moneda local (singular)");
        System.out.println(monedalocal);

        try {
            valor = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor a convertir: "));
            this.setValor(valor);
        } catch (NumberFormatException ex) {
            System.out.println("Exception " + msg);
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Solo se permiten números");
            valor = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor a convertir: "));
            this.setValor(valor);
        }
        this.resultado = JOptionPane.showInputDialog("Ingrese primer caracter de moneda objetivo: ").charAt(0);
    }

}
