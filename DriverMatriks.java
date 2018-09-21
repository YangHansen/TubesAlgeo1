import java.util.Scanner;

class DriverMatriks{
    public static void main(String[] args){
        //membaca NBrsEff dan NKolEff
        Scanner inputisi = new Scanner(System.in);

        int NBrsEff, NKolEff;
        
        NBrsEff = inputisi.nextInt();
        NKolEff = inputisi.nextInt();

        //buat objek P1
        matriks M = new matriks();

        //mengisi matriks
        M.isimatriks(NBrsEff,NKolEff);

        //menulis matriks
        System.out.println("Isi matriks: ");
        M.tulismatriks(NBrsEff,NKolEff);

        //membuat transpose
        int[][] M2;
        M2 = new int[NKolEff][NBrsEff];
        M.transpose(NBrsEff,NKolEff,M2);

        //Tulis transpose
        System.out.println("Isi matriks transpose: ");
        int i,j;
        for (i=M.KolMin; i<NKolEff; i++){
            for (j=M.BrsMin; j<NBrsEff; j++){
                System.out.print(M2[i][j] + " ");
            }
            System.out.println();
        }
        inputisi.close();
    }
}