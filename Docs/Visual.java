package visual;

public class Visual {

    public static void main(String[] args) {
        int arreglo[][] = {{-9, -9, -9, 8, 7, 1}, {0, -9, 0, 7, 8, 7}, {-9, -9, -9, 3, -3, 1}, {5, -3, 0, 2, 0, -1}, {6, 8, 2, 1, -3, 0}, {7, 3, -1, 4, 4, 3}};
        int x=0, y=0;
        int s1=0,s2=0,s3 = 0,s4,s5,s6,s7,s8,s9,s10,s11,s12,s13,s14,s15,s16;
        for(x=0;x<arreglo.length;x++){
            for(y=0;y<arreglo.length;y++){
                if(x<4 && y<4){
                    s1=arreglo[x][y]+arreglo[x][y+1]+arreglo[x][y+2];
                    System.out.println("suma 1:"+arreglo[x][y]+arreglo[x][y+1]+arreglo[x][y+2]);
                    s2=s1+arreglo[x+1][y+1];
                        System.out.println("suma 2:"+s1+arreglo[x+1][y+1]);
                    if(x<4 && y<4){
                       s3=s2+arreglo[x+2][y]+arreglo[x+2][y+1]+arreglo[x+2][y+2];
                        System.out.println("suma 3:"+s2+arreglo[x+2][y]+arreglo[x+2][y+1]+arreglo[x+2][y+2]);   
                    }
                    System.out.println("\n°°°"+s3+"\t\t\t\n");
                }
                      
                        }
        }
    }

}
