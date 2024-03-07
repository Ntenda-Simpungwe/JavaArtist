
package artistsearchoop;
import java.util.Scanner;


public class ArtistSearchOop {

   interface interface1
   {
       void salesSummary();
   }
   
  static abstract class ArtistTable implements interface1
   {
       int rowsum;
       int colsum;
       
      public ArtistTable()
       {
           rowsum = 0;
           colsum =0;
       }
      
      public void salesSummary()
      {
          int [][]artistSales = {{900000,800000,500000},
                                 {700000,500000,500000},
                                 {800000,100000,50000},
                                 {100000,200000,200000},
                                 {300000,100000,50000}};
          String [] artistNames = {"Master KG","DJ B Coffee","Bruno Mars","F Fighters","T Swift"};
          int dvdTot = 0;
          int  bluTot = 0;
          int  cdTot = 0;
          
          for (int i = 0; i <5;i++)
          {
              dvdTot += artistSales[i][0];
              bluTot += artistSales[i][1];
              cdTot += artistSales[i][2];
          }
          
          int count = 0;
          System.out.println("Artist Name\tDVD Sales\tBlu Ray Sales\tCD Sales");
          System.out.println("----------------------------------------------------------------");
          
          for (int i = 0 ; i <5 ; i++)
          {
              count = i+1;
              System.out.println(count+". "+artistNames[i]+"\t"+artistSales[i][0]+"\t"+artistSales[i][1]+"\t"+artistSales[i][2]);
          }
          
          System.out.println("----------------------------------------------------------------");
          
          System.out.println("     Total:\t"+dvdTot+"\t"+bluTot+"\t"+cdTot);
          
          
      }
   }
   
  static class ArtistFind extends ArtistTable
   {
       int index;
       
       public ArtistFind()
       {
           super();
           index = 0;
       }
       @Override
       public void salesSummary()
      {
          int [][]artistSales = {{900000,800000,500000},
                                 {700000,500000,500000},
                                 {800000,100000,50000},
                                 {100000,200000,200000},
                                 {300000,100000,50000}};
          String [] artistNames = {"Master KG","DJ B Coffee","Bruno Mars","F Fighters","T Swift"};
          int dvdTot = 0;
          int  bluTot = 0;
          int  cdTot = 0;
          
          for (int i = 0; i <5;i++)
          {
              dvdTot += artistSales[i][0];
              bluTot += artistSales[i][1];
              cdTot += artistSales[i][2];
          }
          
          int count = 0;
          System.out.println("Artist Name\tDVD Sales\tBlu Ray Sales\tCD Sales");
          System.out.println("----------------------------------------------------------------");
          
          for (int i = 0 ; i <5 ; i++)
          {
              count = i+1;
              System.out.println(count+". "+artistNames[i]+"\t"+artistSales[i][0]+"\t"+artistSales[i][1]+"\t"+artistSales[i][2]);
          }
          
          System.out.println("----------------------------------------------------------------");
          
          System.out.println("     Total:\t"+dvdTot+"\t"+bluTot+"\t"+cdTot);
          
          
      }
       //end of salesSUm
       
       public void salesSummary(int artistPosition)
       {
           if (artistPosition <0)
               System.exit(0);
           if (artistPosition <1 || artistPosition >5)
           {
               System.out.println("Invalid number, try again");
               index++;
               if (index == 6)
                   System.exit(0);
               return;
           }
           
          int [][]artistSales = {{900000,800000,500000},
                                 {700000,500000,500000},
                                 {800000,100000,50000},
                                 {100000,200000,200000},
                                 {300000,100000,50000}}; 
          String [] artistNames = {"Master KG","DJ B Coffee","Bruno Mars","F Fighters","T Swift"};
          
          int ind = 0;
          int total = 0;
          switch(artistPosition)
          {
              case 1:
                ind = 0;
                break;
               
              case 2:
                  ind = 1;
                  break;
                  
              case 3:
                  ind = 2;
                  break;
                  
              case 4:
                  ind = 3;
                  break;
                  
              default:
                  ind = 4;
          }
          
          total = artistSales[ind][0]+artistSales[ind][1]+artistSales[ind][2];
          
          System.out.println("Artist Name: "+artistNames[ind]+"\nDVD Sales: "+artistSales[ind][0]+"\nBlu Ray Sales: "+artistSales[ind][1]+"\nCD Sales: "+artistSales[ind][2]+"\nTotal: "+total);
           
       } // end of salesint
       
   }
   
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input;
        ArtistFind art = new ArtistFind();
        
        art.salesSummary();
        
        try{
            
        while (true)
        {
         System.out.println("Please Enter a value between 0 and 6"); 
         input = scan.nextInt();
         art.salesSummary(input);
        }
        
        }
        catch(Exception e)
        {
            System.out.println("Invalid input");
        }
        }
    
    }
    

