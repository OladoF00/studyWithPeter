package introduction.to.java;

import javax.swing.*;

    public class MainName {

        public static void main7(String[] args) {
            String pobraneImie = JOptionPane.showInputDialog("jak masz na imię?");

            boolean imieZnalezione = false;

            if ("Piotr".equalsIgnoreCase(pobraneImie)) {
                System.out.println("Masz 27 lat");
                imieZnalezione = true;
            }

            if ("Grzegorz".equals(pobraneImie)) {
                System.out.println("Ma 2 lata");
                imieZnalezione = true;
            }

            if ("Ania".equals(pobraneImie)) {
                System.out.println(" to ma 3 miesice");
                imieZnalezione = true;
            }

            if ("Paulina".equals(pobraneImie)) {
                System.out.println("Ma 18 lat");
                imieZnalezione = true;
            }

            if (!imieZnalezione) {
                System.out.println("Nie wiem ile masz lat ");
            }

            System.out.println("no to pa");
        }


        public static void main2(String[] args) {
            String pobraneImie = JOptionPane.showInputDialog("jak masz na imię?");

            if ("Piotr".equalsIgnoreCase(pobraneImie)) {
                System.out.println("Masz 27 lat");
            } else if ("Grzegorz".equals(pobraneImie)) {
                System.out.println("Ma 2 lata");
            } else if ("Ania".equals(pobraneImie)) {
                System.out.println(" to ma 3 miesice");
            } else if ("Paulina".equals(pobraneImie)) {
                System.out.println("Ma 18 lat");
            } else {
                System.out.println("Nie wiem ile masz lat ");
            }

            System.out.println("no to pa");
        }


        public static void main(String[] args) {
            String pobraneImie = JOptionPane.showInputDialog("jak masz na imię?");

            if ("Piotr".equalsIgnoreCase(pobraneImie)) { // dupa dupa sram na to wszystko :D
                System.out.println("Masz 27 lat");
            } else {
                if ("Grzegorz".equals(pobraneImie)) {
                    System.out.println("Ma 2 lata");
                } else {
                    if ("Ania".equals(pobraneImie)) {
                        System.out.println(" to ma 3 miesice");
                    } else {
                        if ("Paulina".equals(pobraneImie)) {
                            System.out.println("Ma 18 lat");
                        } else {
                            System.out.println("Nie wiem ile masz lat ");
                        }
                    }
                }
            }

            System.out.println("no to pa");
        }
    }

//-----------------------------------------------------------------------------------------------------------------




/*
        import javax.swing.*;
import java.sql.SQLOutput;

    public class PętlaForZadanieNumer_1 {

        public static void main(String... args) {
            String liczba1String = JOptionPane.showInputDialog("Pierwsza liczba");
            int liczba1 = Integer.parseInt(liczba1String);



            String liczba2String = JOptionPane.showInputDialog("Druga liczba");
            int liczba2 = Integer.parseInt(liczba2String);

            for (int i = liczba1; i <= liczba2; ++i) {

                System.out.println(i);


            }


            System.out.println("end");
        }

    }
*/