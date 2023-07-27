public class Lcm {
    public static void main(String[] args) {
        int n=2,m=3,lp,up,i;
        if(n>m){
            lp=n;
        }
        else{
            lp=m;
        }
        up=(n*m)+1;
        for(i=lp;i<=up;i++){
            if(i%n==0 && i%m==0){
                System.out.println(i);
            }
        }
    }
}
