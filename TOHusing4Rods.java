// Recursive class for solving Tower of Hanoi problem using 4 rods

public class TOHusing4Rods { 

  // *********************************** MAIN CLASS ********************************************
  public static void main(String args[]){ 
    int n = 4; // Number of disks 

    // A, B, C and D are names of rods 
    towerOfHanoi(n, 'A', 'D', 'B', 'C');  
  } 
  
  // ********************************* TOWER OF HANOI ******************************************
  static void towerOfHanoi(int n, char from_rod, char to_rod, char aux_rod1, char aux_rod2){ 

    if (n == 0) return; 
    
    if (n == 1){ 
        System.out.println("Move disk " + n + " from rod " + from_rod + " to rod " + to_rod); 
        return; 
    } 

    towerOfHanoi(n - 2, from_rod, aux_rod1, aux_rod2, to_rod); 
    System.out.println("Move disk " + (n - 1) +  " from rod " + from_rod + " to rod " + aux_rod2); 
    System.out.println("Move disk " + n + " from rod " + from_rod + " to rod " + to_rod); 
    System.out.println("Move disk " + (n - 1) + " from rod " + aux_rod2 + " to rod " + to_rod); 
    towerOfHanoi(n - 2, aux_rod1, to_rod, from_rod, aux_rod2);
    
    }
    
    // ************************************ OUTPUT *********************************************
    
    //  Move disk 1 from rod A to rod D
    //  Move disk 2 from rod A to rod B
    //  Move disk 1 from rod D to rod B
    //  Move disk 3 from rod A to rod C
    //  Move disk 4 from rod A to rod D
    //  Move disk 3 from rod C to rod D
    //  Move disk 1 from rod B to rod C
    //  Move disk 2 from rod B to rod D
    //  Move disk 1 from rod C to rod D
    
    //  Time Complexity: O(2^(N/2))
    
} 
