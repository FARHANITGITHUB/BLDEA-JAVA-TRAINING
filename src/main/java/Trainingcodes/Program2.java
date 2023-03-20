package Trainingcodes;
/*import java.util.Scanner;

public class Program2 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for (int j=1;j<=n;j++) {
				System.out.print("-");
				
			}
			for(int j=1;j<=n;j++) {
				System.out.print("$");
			}
			System.out.println();
		}
	}
}
*/

/*import java.util.Scanner;

public class Program2 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value of n :");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for (int j=1;j<=n;j++) {
				System.out.print("$");
				
			}
			for(int j=1;j<=n;j++) {
				System.out.print("#");
			}
			System.out.println();
		}
	}
}
*/


/*public class Program2 {
	public static void main(String[] args) {
		int count =1;
		for(int i=1;i<=5;i++){
		System.out.print(count+"  ");
			count=count+5;
				
			
		
			
			
		}
	}
}
*/
/*public class Program2 {
	public static void main(String[] args) {
		int count =25;
		for(int i=1;i<=5;i++){
		System.out.print(count+"  ");
			count=count-5;
				
			
		
			
			
		}
	}
}
*/
/*public class Program2 {e
	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1; j<=5;j++) {
		System.out.print(j+"  ");
		}
		System.out.println();
				
	}
}
}
		
			
			
		}
	}
}
*/
/*import java.util.Scanner;

public class Program2 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for (int j=1;j<=i;j++) {
				System.out.print("$");
				
			}
			
			System.out.println();
		}
	}
}
*/
/*import java.util.Scanner;

public class Program2 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for (int j=1;j<=n;j++) {
				System.out.print("$");
				
			}
			for (int j=1;j<=n;j++) {
				System.out.print("#");
			}
			System.out.println();
		}
	}
}
*/
/*import java.util.Scanner;

public class Program2 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for (int j=1;j<=n;j++) {
				System.out.print("-");
				
			}
			for (int j=1;j<=n;j++) {
				System.out.print("$");
			}
			System.out.println();
		}
	}
}
*/
 /*public class Program2 {
	 public static void main(String[] args) {
		 for(int i=1;i<=5;i++) {
			 for (int j=1;j<=5;j++) 
			 {
				 System.out.print(i+" ");
			 }
			 System.out.println();
		 }
	 }
 }
 */
/*public class Program2 {
	 public static void main(String[] args) {
		 for(int i=1;i<=5;i++) {
			 for (int j=1;j<=5;j++) 
			 {
				 System.out.print(j+" ");
			 }
			 System.out.println();
		 }
	 }
 }
*/
/*import java.util.Scanner;

public class Program2 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value of n :");
		int n=sc.nextInt();
		int count=1;
		for(int i=1;i<=n;i++)
		{
			for (int j=1;j<=n;j++) {
				System.out.print(count+" ");count++;
				
			

			}
			System.out.println();
		}
	}
}
*/
import java.util.Scanner;

/*public class Program2 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value of n :");
		int n=sc.nextInt();
		int count=1;
		for(int i=1;i<=n;i++)
		{
			for (int j=1;j<=n;j++) {
				System.out.print(count+"  ");
				count++;
				
			

			}
			System.out.println();
		}
	}
}

*/

/*public class Program2 {
	 public static void main(String[] args) {
		 int count=1;
		 for(int i=1;i<=5;i++) {
			  System.out.print(count+" ");
				 count=count+5;
			 }
			 
		 }
	 }
 }
*/

/*import java.util.Scanner;
public class Program2 {
	public static void main(String[] args) { 
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the value of n:");
	int n=sc.nextInt();
	for(int i=0;i<n;i++) {
		for (int j=0;j<n;j++) {
			if(i==0 || i==(n-1) || j==0 || j==(n-1) || i==(n/2) ||
					j==(n/2) || i==j || (i+j)==(n-1) || (i+j)==(n/2) || (j-i)==(n/2)
					|| (i-j)==(n/2) 
					|| (i+j)==(n-1)+ (n/2)) {
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
}
} 

output 
**********************
**        ***       **
* *      * * *     * *
*  *    *  *  *   *  *
*   *  *   *   * *   *
*    **    *    *    *
*    **    *   * *   *
*   *  *   *  *   *  *
*  *    *  * *     * *
* *      * **       **
**        **         *
**********************
**       * **       **
* *     *  * *     * *
*  *   *   *  *   *  *
*   * *    *   * *   *
*    *     *    *    *
*   * *    *   * *   *
*  *   *   *  *   *  *
* *     *  * *     * *
**       * **       **
**********************

*/
/*import java.util.Scanner;
public class Program2 {
	public static void main(String[] args) { 
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the value of n:");
	int n=sc.nextInt();
	for(int i=0;i<n;i++) {
		for (int j=0;j<n;j++) {
			if((j==0 && i<=(n/2) || (j==(n-1) && i<=(n/2)) 
					|| (i+j)==(n-1) + (n/2) ||(i-j) ==(n/2))){
				System.out.print("*");
			}
			else {
				System.out.print("  ");
			}
		}
		System.out.print("  ");
		for (int j=0;j<n;j++) {
			if((j==0) || (i+j) ==(n/2) || (i-j) ==(n/2))
					{
				System.out.print("*");
					}
			else {
						System.out.print("  ");
			}
	}
		System.out.println();
			
}
} 
}

output
*                                        *  *                    *                    
*                                        *  *                  *                      
*                                        *  *                *                        
*                                        *  *              *                          
*                                        *  *            *                            
*                                        *  *          *                              
*                                        *  *        *                                
*                                        *  *      *                                  
*                                        *  *    *                                    
*                                        *  *  *                                      
*                                        *  **                                        
*                                        *  *                                          
  *                                    *    **                                        
    *                                *      *  *                                      
      *                            *        *    *                                    
        *                        *          *      *                                  
          *                    *            *        *                                
            *                *              *          *                              
              *            *                *            *                            
                *        *                  *              *                          
                  *    *                    *                *                        
                    **                      *                  *   
*/





/*import java.util.Scanner;
public class Program2 {
	public static void main(String[] args) { 
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the value of n:");
	int n=sc.nextInt();
	for(int i=0;i<n;i++) {
		for (int j=0;j<n;j++) {
			if(i==0 ||i==(n/2) ||j==0 ||j==(n-1) || j==(n-1) ||(i==5)|| i==(n/2))
					{
					
				System.out.print("*");
			}
			else {
				System.out.print("   ");
			}
	
			
	}
		System.out.println();
	} 
	}
}

output
***********
*                           
*                         
*                           
*                           
***********
*                           
*                           
*                           
*                           
*  
*  
*  */
		
/*import java.util.Scanner;
public class Program2 {
	public static void main(String[] args) { 
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the value of n:");
	int n=sc.nextInt();
	for(int i=0;i<n;i++) {
		for (int j=0;j<n;j++) {
			if((j==0) || j==(n-1)  || i==0 || i==(n/2))
					{
					
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
	
			
	}
		System.out.println();
	}
	}
}

**********************
*                    *
*                    *
*                    *
*                    *
*                    *
*                    *
*                    *
*                    *
*                    *
*                    *
**********************
*                    *
*                    *
*                    *
*                    *
*                    *
*                    *
*                    *
*                    *
*                    *
*                    *

*/

/*import java.util.Scanner;
public class Program2 {
	public static void main(String[] args) { 
	Scanner  sc= new Scanner(System.in);
	System.out.println("Enter the value of n:");
	int n=sc.nextInt();
	for(int i=0;i<n;i++) {
		for (int j=0;j<n;j++) {
			if((j==0) ||i==0 ||i==(n/2)|| j==(n/2) && i<=(n/2) || (i-j)==(n/2))
					{
					
				System.out.print("*");
			}
			else {
				System.out.print("  ");
			}
	
			
	}
		System.out.println();
	}
	}
}

output;
*********************
*                  *                    
*                  *                    
*                  *                    
*                  *                    
*                  *                    
*                  *                    
*                  *                    
*                  *                    
*                  *                    
*********************
**                                      
*  *                                    
*    *                                  
*      *                                
*        *                              
*          *                            
*            *                          
*              *                        
*                *                      
*                  *  
*/

/*import java.util.Scanner;
public class Program2 {
	public static void main(String[] args) { 
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the value of n:");
	int n=sc.nextInt();
	for(int i=0;i<n;i++) {
		for (int j=0;j<n;j++) {
			if((j==0)  || j==(n/2)  || i==(n/2)) 
					{
					
				System.out.print("*");
			}
			else {
				System.out.print("  ");
			}
	
			
	}
		System.out.println();
	}
	}
}
output

*                    *                    
*                    *                    
*                    *                    
*                    *                    
*                    *                    
*                    *                    
*                    *                    
*                    *                    
*                    *                    
*                    *                    
*                    *                    
**********************
*                    *                    
*                    *                    
*                    *                    
*                    *                    
*                    *                    
*                    *                    
*                    *                    
*                    *                    
*                    *                    
*                    *   

*/

/*import java.util.Scanner;
public class Program2 {
	public static void main(String[] args) { 
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the value of n:");
	int n=sc.nextInt();
	for(int i=0;i<n;i++) {
		for (int j=0;j<n;j++) {
			if((j==0) || j==(n-1)  || i==0 || i==(n/2))
					{
					
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
	
			
	}
		System.out.println();
	}
	}
}
 OUTPUT
**********************
*                    *
*                    *
*                    *
*                    *
*                    *
*                    *
*                    *
*                    *
*                    *
*                    *
**********************
*                    *
*                    *
*                    *
*                    *
*                    *
*                    *
*                    *
*                    *
*                    *
*                    *

*/
/*import java.util.Scanner;
public class Program2 {
	public static void main(String[] args) { 
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the value of n:");
	int n=sc.nextInt();
	for(int i=0;i<n;i++) {
		for (int j=0;j<n;j++) {
			if((j==0)  || j==(n-1) || (i==j))
					{
					
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
	
			
	}
		System.out.println();
	}
	}
}
 output
 *                   *
 **                  *
 * *                 *
 *  *                *
 *   *               *
 *    *              *
 *     *             *
 *      *            *
 *       *           *
 *        *          *
 *         *         *
 *          *        *
 *           *       *
 *            *      *
 *             *     *
 *              *    *
 *               *   *
 *                *  *
 *                 * *
 *                  **
 *                   *
 
*/
import java.util.Scanner;
public class Program2 {
	public static void main(String[] args) { 
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the value of n:");
	int n=sc.nextInt();
	for(int i=0;i<n;i++) {
		for (int j=0;j<n;j++) {
			if(j==0 ||i==(n/2) || i==(n/2)|| i==0)
					{
					
				System.out.print("*");
			}
			else {
				System.out.print("  ");
			}
	
			
	}
		System.out.println();
	} 
	

for(int i=0;i<n;i++) {
	for (int j=0;j<n;j++) {
		if((j==0) || j==(n-1)  || i==0 || i==(n/2))
				{
				
			System.out.print("*");
		}
		else {
			System.out.print(" ");
		}

		
}
	System.out.println();
}
for(int i=0;i<n;i++) {
	for (int j=0;j<n;j++) {
		if((j==0) ||i==0 ||i==(n/2)|| j==(n/2) && i<=(n/2) || (i-j)==(n/2))
				{
				
			System.out.print("*");
		}
		else {
			System.out.print("  ");
		}

		
}
	System.out.println();

}
for(int i=0;i<n;i++) {
	for (int j=0;j<n;j++) {
		if((j==0)  || j==(n/2)  || i==(n/2)) 
				{
				
			System.out.print("*");
		}
		else {
			System.out.print("  ");
		}

		
}
	System.out.println();
}

for(int i=0;i<n;i++) {
	for (int j=0;j<n;j++) {
		if((j==0) || j==(n-1)  || i==0 || i==(n/2))
				{
				
			System.out.print("*");
		}
		else {
			System.out.print(" ");
		}

		
}
	System.out.println();
}

for(int i=0;i<n;i++) {
	for (int j=0;j<n;j++) {
		if((j==0)  || (j==i) || j==(n-1) )
				{
				
			System.out.print("*");
		}
		else {
			System.out.print("  ");
		}

		
}
	System.out.println();
}
}
}