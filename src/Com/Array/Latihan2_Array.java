package Com.Array;

//Autor : Astra

public class Latihan2_Array {
    public static void main(String[] args) {
        String [] [] negara = new String[5][2];
        negara [0] [0]= "Indonesia";
        negara [0] [1]= "Jakarta";
        negara [1] [0]="Singapura";
        negara [1] [1]="Singapur";
        negara [2] [0]="Filipina";
        negara [2] [1]="Manila";
        negara [3] [0]="kamboja";
        negara [3] [1]="PnomPhen";
        negara [4] [0]="Thailand";
        negara [4] [1]="Bangkok";
        String namaNegara;
        for (int baris=0;baris<negara.length;baris++)
        {
            namaNegara =negara [baris][0];
            //if (namaNegara.charAt(0)=='I')
                System.out.println(negara[baris][0]+ " - " + negara[baris][1]);
        }
    }
}
