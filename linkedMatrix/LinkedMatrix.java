package linkedMatrix;

public class LinkedMatrix {

	
class Node{
	int data;
	Node right;
	Node down;
	 Node() 
     { 
         this.right = null; 
         this.down = null; 
     } 
	Node(int data){
			this.data=data;
			this.right=null;
			this.down=null;
		}
	
}
Node constructLinkedMatrix(int[][] arr, 
        int m, int n) 
{ 

// stores the head of the linked list 
Node mainHead = null; 

// stores the head of linked lists  
// of each row 
Node[] head = new Node[m]; 
Node rightTemp = new Node(), newptr; 

// Firstly, we create m linked lists 
// by setting all the right nodes of every row 
for(int i = 0; i < m; i++) 
{ 

// initially set the head of  
// ith row as NULL 
head[i] = null; 

for(int j = 0; j < n; j++) 
{ 
newptr = new Node(arr[i][j]); 

// stores the mat[0][0] node as 
// the mainhead of the linked list 
if(mainHead == null) 
mainHead = newptr; 
if(head[i] == null) 
head[i] = newptr; 
else
rightTemp.right = newptr; 

rightTemp = newptr; 
} 
}
// Then, for every ith and (i+1)th list, 
// we set the down pointers of 
// every node of ith list 
// with its corresponding 
// node of (i+1)th list 
for(int i = 0; i < m - 1; i++) 
{ 
    Node temp1 = head[i], temp2 = head[i + 1]; 

    while(temp1 != null && temp2 != null) 
    { 
        temp1.down = temp2; 
        temp1 = temp1.right; 
        temp2 = temp2.right; 
    } 
} 

// return the mainhead pointer  
// of the linked list 
return mainHead; 
}
void display(Node head) 
{ 
    Node rp, dp = head; 

    // loop until the down pointer  
    // is not NULL 
    while(dp != null) 
    { 
        rp = dp; 

        // loop until the right pointer 
        // is not NULL 
        while(rp != null) 
        { 
            System.out.print(rp.data + " "); 
            rp = rp.right; 
        } 
        System.out.println(); 
        dp = dp.down; 
    } 
} 
public static void main(String[] args) 
{ 
    LinkedMatrix Obj = new LinkedMatrix(); 
    int m = 3, n = 3; // m = rows and n = columns 

    // 2-D Matrix 
    int[][] arr = {{ 1, 2, 3 },  
                   { 4, 5, 6 }, 
                   { 7, 8, 9 }}; 

    Node head = Obj.constructLinkedMatrix(arr, m, n); 
    Obj.display(head); 
} 
}
