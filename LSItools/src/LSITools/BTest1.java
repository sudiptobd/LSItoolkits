/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package LSITools;

/**
 *
 * @author Kono Nam Nai
 */

import com.sun.org.apache.xalan.internal.res.XSLTErrorResources;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.lang.Object;


public class BTest1 {
    
    public static double[] Query(Set wordset) throws FileNotFoundException, IOException
    {
        /// for the query
        ///////////////////////////////////////////////////////////////////
        File f=new File("D://Query.txt");
        InputStream is = new FileInputStream(f) ; // input carrier 
        BufferedReader br = new BufferedReader( new InputStreamReader(is) ); // buffer carrier
        String s; // string input variable
        StringBuilder sb = new StringBuilder (""); // first choices of words will be stored here 
        String bad="/,@৳%&*()-=><\n\r?!।"; // this character will be removed
        int x=0; // used to remove the starting unknown character
        while( (s = br.readLine()) !=null )
        {
                 if(x==0)
                            s=s.replace( s.charAt(0), ' '); // removing very first character
                  x++;
                  for(int i=0;i<bad.length();i++)
                            s=s.replace( bad.charAt(i), ' '); // oproyojonio symbol bad jacce
                  sb.append(s);/// eta total unique words mark korar jonno used hbe
        }
        
        String[] words=sb.toString().split(" ");
        double[] query=new double[10000];
         Iterator it = wordset.iterator(); // every unique word current sentence e ace kina/ kotobar ace  check kora hobe
        int i=0;
        while(it.hasNext())
         {
                   String element = (String) it.next(); // ekta unique word holo element
                   int sum=0;
                   for(String selement:words) // current sentence er ek ekta word holo selement
                            if(element.equals(selement))sum++; // current element , koyta selement er sathe match kore ta gona hocce
                   query[i]=sum; // result data te rakha hocce 
                   sum=0;
                   i++;
         }
        ///////////////////////////////////////////////////////
        return query;
    }
    
    
    public static double[][] transpose(double[][] data,int row,int column)
    {
        double[][] temp=new double[column][row];
        for(int i=0;i<row;i++)
            for(int j=0;j<column;j++)
                temp[j][i]=data[i][j];
        return temp;
           
    }
    
    public static void printMatrix(double[][] temp,int row,int column)
    {
        for(int i=0;i<row;i++)
        {
             for(int j=0;j<column;j++)
                System.out.print(temp[i][j]+" ");
             System.out.println();
        }
    }
    
    public static double[][] multiplcation(double[][] a,double[][]b,int ar,int ac,int br,int bc)
    {
        double[][] temp=new double [ar][bc];
        for(int i=0;i<ar;i++) 
            for(int j=0;j<bc;j++)
                for(int k=0;k<br;k++)temp[i][j]+=a[i][k]*b[k][j];
        return temp;
    }
    
    public static boolean same(String a,String b)
    {
        int mx=0;
        if(a.length()>b.length())
        {
            String temp=b;
            b=a;
            a=temp;
        }
         for(int i=0;i<=(b.length()-a.length());i++)
         {
                int xi=0;
                int sum=0;
                while(xi<a.length())
                {
                    if(a.charAt(xi)==b.charAt(xi+i))sum++;
                     else break;
                    xi++;
                 }
                mx=Math.max(sum, mx);
          }
         double match=mx;
         double character=(a.length()+b.length())/2;
         double ans=(match/character)*100;
        if(ans<80.0) return false;
        else return true;
    }
            
    
    
    public void main( String str,String qr,String url) throws FileNotFoundException, IOException
    {
        //System.out.println(ajaira);
        
         ;
        
        
        String s=str; // string input variable
        StringBuilder sb = new StringBuilder ("");
        StringBuilder sn = new StringBuilder ("");
        
        
          
          sn.append(qr+'\n'+s); /// eta sentence mark korar jonno use hbe 
          
          s=s.replace('\n', ' ');
          sb.append(s);
          //System.out.println(s);/// eta total unique words mark korar jonno used hbe 
          //System.out.println(s); /// filter korar por input line ta print korce 
          //System.out.println(x+sb.toString());
        
        
        String[] words=sb.toString().split(" "); //  words spilt hocce
        Set set =new HashSet(); // every word unique word hisebe set e thakbe 
        for(String show:words) // set e kono blank words thakbena
        {
                  if(show.length()!=0)
                 {
                           //System.out.println(show);
                            set.add(show);
                 }
        }
        //System.out.println(words);
        
        /*System.out.println("---words set----");
        Iterator itx = set.iterator(); // word set browse korar jonno iterator
        while(itx.hasNext())
        {
            String element = (String) itx.next();
            System.out.println(element);
       
        }
        System.out.println("-------");*/
        
        String[] sentence=sn.toString().split("\n");  // sentence guloke split kora hoyece
        double[][] data=new double[10000][10000];          // ekhane matrix load hobe 
        double[] query=new double[10000]; // first sentence is the query
        int i=0,j=0;   // data index mark korar jonno
        int index=1; // sentence index
        for(String show:sentence)
        {
                   if(show.length()==0)continue; // formally blank sentence dur korar jonno
                   //if(index==1)System.out.println("Title : "+show);
                   //else System.out.println(index-1+". "+show);//As first sentence is query
                   index++;
                   String[] temp=show.split(" "); // protita sentence ke worde split kora hocce 
                   
                   Iterator it = set.iterator(); // every unique word current sentence e ace kina/ kotobar ace  check kora hobe
                   while(it.hasNext())
                 {
                            String element = (String) it.next(); // ekta unique word holo element
                            int sum=0;
                           for(String selement:temp) // current sentence er ek ekta word holo selement
                                if(same(element,selement))sum++; // current element , koyta selement er sathe match kore ta gona hocce
                           if(index==2) query[i]=sum;// for index++; index==2 means still title is running
                           else data[i][j]=sum; // result data te rakha hocce 
                           sum=0; 
                           i++;
                }
                   i=0;
                   if(index!=2)j++;// for index++; index==2 means still title is running
            
        }
        //System.out.println(j); // total number of sentence
        //System.out.println(set.size()); // total number of unique words
        //int query[] = Query(set); // importing query function 
        
        
        
        // matrix printing . . 
        Iterator it =set.iterator();
        for(int p=0;p<set.size();p++)
        {
            //System.out.print((String) it.next()+"\t");
            //for(int q=0;q<j;q++)
                    //System.out.print(data[p][q]+" ");
            //System.out.print("| "+query[p]);
            //System.out.println();
          }
        
        int row =set.size();
        int column=j;
        
        /*double [][] tdata=transpose(data,row,column);
        int trow=column;
        int tcolumn=row;
       
        double mdata[][]=multiplcation(data, tdata, row, column, trow, tcolumn);
        int mrow=row;
        int mcolumn=tcolumn;
        //printMatrix(mdata, mrow, mcolumn);
                */
        Matrix A=new Matrix(data,row,column);
        SingularValueDecomposition SVD=new SingularValueDecomposition(A);
        Matrix U=SVD.getU();
        Matrix S=SVD.getS();
        Matrix V=SVD.getV();
        Matrix Vt=V.transpose();
        
        //System.out.println("U");
        //U.print(3, 2);
        //System.out.println("S");
        //S.print(3, 2);
        //System.out.println("V");
        //V.print(3, 2);
        //System.out.println("Vt");
        //Vt.print(3, 2);
        
        //System.out.println("Rank of S : "+S.rank());
        
        Matrix Uk=U.resize(U.getRowDimension(),S.rank());
        //System.out.println("Uk");
        //Uk.print(3,2);
        Matrix Sk=S.resize(S.rank(),S.rank());
        //System.out.println("Sk");
        //Sk.print(3,2);
        Matrix Vk=V.resize(V.getRowDimension(),S.rank());
        //System.out.println("Vk");
        //Vk.print(3,2);
        
        Matrix Vkt=Vk.transpose();
        //System.out.println("Vkt");
        //Vkt.print(3,2);
        
        double qtemp[][]=new double[row][1];
        for( i=0;i<row;i++)qtemp[i][0]=query[i];
        Matrix q=new Matrix(qtemp,row,1);
        Matrix qt=q.transpose();
        
        Matrix Ski=Sk.inverse();
        //System.out.println("Ski");
        //Ski.print(3, 2);
        
        q=q.multiplcation(qt, Uk);
        q=q.multiplcation(q, Ski);
        //System.out.println("Step 5  q ");
        //q.print(3, 2);
        
        Matrix d=Vk;
        double[] sin=d.cosine(q, d);
        //System.out.println("Cosine Similarities ");
        //for( i=0;i<column;i++)
                   //System.out.println(sin[i]);
        int[] id=new int [column];
        for( i=0;i<column;i++)
                   id[i]=i;
            
         
        // sorting desi sort
        for( i=0;i<column;i++)
            for( j=0;j<column-1;j++)
                if(sin[j]<sin[j+1])
                {
                   double stemp=sin[j];
                    sin[j]=sin[j+1];
                    sin[j+1]=stemp;
                    
                    int itemp=id[j];
                    id[j]=id[j+1];
                    id[j+1]=itemp;
                    
                }
        //////////////////////////////////////////////////
        //System.out.println("\nRanking ");
        // for( i=0;i<column;i++)
            // System.out.println(id[i]+1+" "+sentence[id[i]+1]+"\t"+sin[i]);
        /////////////////////////////////////////////////
         int ans=0;
         if(column<=25)ans=5;
         else if(column<=50)ans=10;
         else if(column<=75)ans=15;
         else ans=20;
         if(column<ans)ans=column;
         //////////////////////////////////////////
         /// index sorting . . 
         for(i=0;i<ans;i++)
             for(j=0;j<ans-1;j++)
                 if(id[j]>id[j+1])
                 {
                     int itemp=id[j];
                    id[j]=id[j+1];
                    id[j+1]=itemp;
                 }
         //System.out.println("\nSummary on :"+sentence[0]);
        //for(i=0;i<ans;i++)
            //System.out.println(sentence[id[i]+1]);
        
        FINAL2 f2=new FINAL2();
        f2.showme(url, sentence,id,ans);
        
      
        
        
    }
}
