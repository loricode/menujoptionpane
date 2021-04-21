
import javax.swing.JOptionPane;


public class MenuOpciones {
    
  public static String input(String texto){
      return JOptionPane.showInputDialog(texto);
  }
  
    public static void main(String[] args) {
        
        int opcion, a, b;
        do{
           opcion = Integer.parseInt(JOptionPane.showInputDialog(
                    "Menu\n"
                   + "1. sumar\n"
                   + "2. restar\n"
                   + "3. multiplicar\n"
                   + "4. dividir\n"
                   + "5 salir"));
           
           switch(opcion){
               case 1:
                   a = Integer.parseInt(
                     input("digite el primer numero")
                   );
                   b = Integer.parseInt(
                     input("digite el segundo numero")
                   );
                   
                   JOptionPane.showMessageDialog(null, 
                           "el resultado de la suma es: "+(a + b));
                   break;
                   
                case 2:
                   a = Integer.parseInt(
                     input("digite el primer numero")
                   );
                   b = Integer.parseInt(
                     input("digite el segundo numero")
                   );
                   
                   JOptionPane.showMessageDialog(null, 
                           "el resultado de la resta es: "+(a - b));
                   break;    
                   
                case 3:
                   a = Integer.parseInt(
                     input("digite el primer numero")
                   );
                   b = Integer.parseInt(
                     JOptionPane.showInputDialog("digite el segundo numero")
                   );
                   
                   JOptionPane.showMessageDialog(null, 
                           "el resultado de la multiplicacion es: "+(a * b));
                   break; 
                   
                   
                case 4:
                   a = Integer.parseInt(
                     input("digite el primer numero")
                   );
                   b = Integer.parseInt(
                     input("digite el segundo numero")
                   );
                   
                   JOptionPane.showMessageDialog(null, 
                           "el resultado de la division es: "+(a / b));
                   break; 
                   
                case 5:
                    opcion=5;
                    JOptionPane.showMessageDialog(null, 
                           "chaoooo");
                    break;
           }
        }while(opcion != 5);
        System.exit(0);
    }
    
}
