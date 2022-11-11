package AlgoDat;

public class Osterformel {
    public static void main(String[] args) {
        int N =0;
        int J = 37;
        int A = 0;
        int B =0;
        int M =0;
        int Q= 0;
        int W= 0;
        int P= 0;
        N= J -1900;
        A = N % 19;
        B = ((7*A+1)/19);
        M = ((11*A+4-B) % 29);
        Q=(N/4);
        W=(N+Q+31-M) % 7;
        P = 25-M-W;

        if(P>0) {
            System.out.print("Ostern ist der " + P +"te April" + " "+ J);
        }
        if(P<0) {
            System.out.print("Ostern ist der " + (P+31) +"te März" + J);
        }

    }
}
