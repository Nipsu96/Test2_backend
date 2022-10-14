/**
 * @author      Niko Lahteinen & Iita Lakkaneva
 * @version     2020.1131                  
 * @since       1.6                        
 */
class Print {
     /**
     * Displays message.
     */
    public void Print(String text ) {
        line(text, "=");
        System.out.println(text);
        line(text, "=");
    }
}

