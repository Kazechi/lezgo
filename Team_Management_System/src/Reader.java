
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class Reader extends Task_Manage{
    public void read(){
        try{
        String fileName = JOptionPane.showInputDialog(null, "Input File Name (e.g (Somera.dat))");
        
        String directory = System.getProperty("user.dir");
        String filePath = directory + File.separator + fileName;
        
        Scanner myRead = new Scanner(new File (filePath));
        while(myRead.hasNextLine()){
            String text = myRead.nextLine();
            System.out.println(text);
        }
        
        myRead.close();
        
/*
        String fileName = JOptionPane.showInputDialog(null, "Input File Name (e.g (Somera.dat))");
        
        String directory = System.getProperty("user.dir");
        String filePath = directory + File.separator + fileName;

        String fileDataInString = new String();
        FileReader fr = new FileReader(fileName);
        BufferedReader br = new BufferedReader(fr);
        
        int data;
        
        while((data = br.read()) !=-1){
            fileDataInString = fileDataInString+String.valueOf(((char)data));
        }
        br.close();
        
        
        String [] stry = fileDataInString.split(" ");
        
        Arrays.sort(stry);
        
        JOptionPane.showMessageDialog(null, stry+" ");
        
        
        FileWriter fw = new FileWriter(fileName);
        BufferedWriter bw = new BufferedWriter(fw);
        for(String str: stry){
            bw.write(str);
            bw.write(" ");
        }
        
        bw.close();
        JOptionPane.showMessageDialog(null, "File had been Sorted!");
        */
        
        }catch(Exception e){
                e.printStackTrace();
                }
    }
}
