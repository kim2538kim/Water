/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package water;

/**
 *
 * @author PNCOM
 */
import java.util.Scanner;

public class Water {

    public static void main(String[] args) {
    Scanner Scan = new Scanner(System.in);
    
    int Water = 0;
    double Total = 0;

      
      
    System.out.print(" ป้อนจำนวนที่ใช้น้ำ(ต่อหน่วย) :  ");
      Water = Scan.nextInt();
      
      if ( Water <= 50) {
       Total =  Water  * 4.25;
      } else if (Water <= 100) {
       Total =  Water  *  3.25;
      } else {
       Total =  Water  *  2.25;
      }
        
    System.out.println(" ======================== ");    
    System.out.println("      ค่าน้ำ: " + Total + " บาท ");
    System.out.println(" ======================== ");
  }
}