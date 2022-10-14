/**
 * @author      Niko Lahteinen & Iita Lakkaneva
 * @version     2020.1131                  
 * @since       1.6                        
 */
class Print {

    /**
     * Displays line of symbols.
     */
    public void Line(String msg,String symbol) {
        for (int i = 0; i < msg.length; i++) {
           System.out.println(symbol);
         }
    }

    /**
     * Displays message.
     */
    public void Print(String text ) {
        line(text, "=");
        System.out.println(text);
        line(text, "=");
    }
}

