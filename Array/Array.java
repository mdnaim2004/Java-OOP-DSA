import java.util.Scanner;

class Array{
    public static void main(String args[]){
        int marks[] = new int[50];

        Scanner sc = new Scanner(System.in);


        marks[0] = sc.nextInt(); //phy
        marks[1] = sc.nextInt(); //chem
        marks[2] = sc.nextInt(); //math

        System.out.println("phy :"+marks[0]);
        System.out.println("chem :"+marks[1]);
        System.out.println("Math :"+marks[2]);

        marks[2] = 100;
         System.out.println("MAth :"+ marks[2]);

         int persentage = (marks[0] + marks[1] + marks[2])/3;
         System.out.println("Persentage of the="+persentage);


         System.out.println("Length of arr ="+ marks.length);
    }
}