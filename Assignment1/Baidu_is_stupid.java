import java.util.Random;
import java.util.Scanner;
import java.math.BigDecimal;
public class Baidu_is_stupid {
    public static void main(String[] args) {
        Random random1 = new Random();
        double total;
        int number_of_packets;
        Scanner input=new Scanner(System.in);
        System.out.println("please input the total number of money:");
        total=input.nextDouble();
        System.out.println("please input the number of red packets:");    
        number_of_packets=input.nextInt();
        BigDecimal b1=new BigDecimal(Double.toString(total));
        b1=b1.setScale(2,BigDecimal.ROUND_DOWN);
        //BigDecimal temp_money=new BigDecimal("0.00");
        int i;
        //int temp=(int)total;//the temp used for creating money
        for(i=0;i<number_of_packets-1;i++){
        	BigDecimal temp_money=new BigDecimal(random1.nextDouble()*total*((double)(i+5)/(i+10)));
        	temp_money=temp_money.setScale(2,BigDecimal.ROUND_DOWN);
        	b1=b1.subtract(temp_money);
        	System.out.println(temp_money);
        }
        System.out.println(b1);
        
   }
}
