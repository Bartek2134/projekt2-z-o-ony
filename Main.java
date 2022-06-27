import java.util.ArrayList;
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
   Scanner input = new Scanner(System.in);

        Klub czlowiek1 = new Klub("Kowalski Piotr");
        czlowiek1.wiek = 25;
        czlowiek1.rokCzlonkostwa = 2;
        czlowiek1.kartaPremium = "aktualna";
        Klub czlowiek2 = new Klub("Nowak Paweł");
        czlowiek2.wiek = 30;
        czlowiek2.rokCzlonkostwa = 5;
        czlowiek2.kartaPremium = "aktualna";
        Klub czlowiek3 = new Klub("Czarnecki Stanisław");
        czlowiek3.wiek = 27;
        czlowiek3.rokCzlonkostwa = 4;
        czlowiek3.kartaPremium = "nieaktualna";

        ArrayList lista = new ArrayList();
        lista.add(czlowiek1);
        lista.add(czlowiek2);
        lista.add(czlowiek3);

        int i = 1;
        System.out.println("LISTA CZŁONKÓW KLUBU");
    
        System.out.println("-----------------");
        for (Object C : lista) {
            System.out.println(i + ". " + ((Klub) C).nazwisko);
            i++;
        }
        System.out.println("-----------------");

        System.out.println("Aby wyswietlic informacje o członku klubu wybierz jego numer: ");
        int wybor = input.nextInt();

        switch (wybor) {
            case 1:
                System.out.println(czlowiek1.nazwisko + " || Wiek: " + czlowiek1.wiek + " || Rok członkostwa: " + czlowiek1.rokCzlonkostwa + " || Karta premium: " + czlowiek2.kartaPremium);
                break;
            case 2:
                System.out.println(czlowiek2.nazwisko + " || Wiek: " + czlowiek2.wiek + " || Rok członkostwa: " + czlowiek2.rokCzlonkostwa + " || Karta premium: " + czlowiek2.kartaPremium);
                break;
            case 3:
                System.out.println(czlowiek3.nazwisko + "|| Wiek: " + czlowiek3.wiek + "|| Rok członkostwa: " + czlowiek3.rokCzlonkostwa + "|| Karta premium: " + czlowiek3.kartaPremium);
                break;
        }
  }
}