package Aiexam;
package AI;
public class TowerOfHanoi {

    public static void toh(int n,char a,char b,char c) {
        if(n==0) {
            return;
        }
        toh(n-1,a,c,b);
        System.out.println("move from " + a + " to " + c);
        toh(n-1,b,a,c);
    }
    public static void main(String[] args) {
        char src = 'a', help = 'b',dest = 'c';
        toh(3,src,help,dest);
    }
}
