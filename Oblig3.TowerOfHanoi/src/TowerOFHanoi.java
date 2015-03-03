import javax.swing.JOptionPane;

public class TowerOFHanoi {
  /** Main method */
  public static void main(String[] args) {
    // Skriv inn antall skiver
    String intString = JOptionPane.showInputDialog(
      "Skriv inn antal skiver:");

    // Konverter String til int:
    int n = Integer.parseInt(intString);

    // Finn løsningen "recursively"
    System.out.println("Trekkene er:");
    moveDisks(n, 'A', 'B', 'C');

    System.out.println("Totalt antall trekk: " );
  }

  

  /** The method for finding the solution to move n disks
      from fromTower to toTower with auxTower */
  public static void moveDisks(int n, char fromTower,
      char toTower, char auxTower) {
    
    if (n == 1) // Stopping condition
      System.out.println("Flytt skive " + n + " fra " +
        fromTower + " to " + toTower);
    else {
      moveDisks(n - 1, fromTower, auxTower, toTower);
      System.out.println("Flytt skive" + n + " fra " +
        fromTower + " til " + toTower);
      moveDisks(n - 1, auxTower, toTower, fromTower);
    }
  }
}
