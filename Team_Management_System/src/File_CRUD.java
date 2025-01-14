
import java.io.File;
import javax.swing.JOptionPane;


public class File_CRUD extends Task_Manage{
    public void directory(){
        String fileName = JOptionPane.showInputDialog(null, "Input File Name (e.g (Somera.txt))");
        
        String directory = System.getProperty("user.dir");
        String filePath = directory + File.separator + fileName;
    }
    
    
}
