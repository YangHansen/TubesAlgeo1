import java.util.Scanner;

class matriks{
    public static final int BrsMin = 0;
    public static final int BrsMax = 100;
    public static final int KolMin = 0;
    public static final int KolMax = 100;
    


    //Atribut
    int NBrsEff, NKolEff;
    int[][] Mat = new int[BrsMax][KolMax];
    


    //Method

    matriks(){ //membuat matriks kosong
        //konstruktor
        int i,j;

        for (i=BrsMin;i<NBrsEff;i++){
            for(j=KolMin;j<NKolEff;j++){
                this.Mat[i][j] = 0;
            }
        }
    }

    void isimatriks(int N, int M){
        //mengisi elmt matriks M[i][j] dengan nilai i+j
        int i,j;
        
        for(i=BrsMin;i<N;i++){
            for(j=KolMin;j<M;j++){
                this.Mat[i][j] = i+j;
            }
        }
    }

    void tulismatriks(int N, int M){
        //tulis matriks
        int i,j;

        for (i=BrsMin;i<N;i++){
            for (j=KolMin;j<M;j++){
                System.out.print(this.Mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    void transpose(int N, int M, int Matt[][]){
        int i,j;

        for(i=BrsMin;i<N;i++){
            for(j=KolMin;j<M;j++){
                Matt[j][i] = this.Mat[i][j];
            }
        }
    }
}