//8) И ещё можете попрактиковаться и нарисовать оставшиеся 2 треугольника

public class HW2_8 {
    public static void main(String[] args) {
        for (int i=0;i<11;i++)
        {
            for (int j=i;j<11;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i=0;i<11;i++) {        {
            for (int j=i;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }

     }
}



