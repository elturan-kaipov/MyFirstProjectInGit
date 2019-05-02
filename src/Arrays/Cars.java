package Arrays;

public class Cars {
    public static void main(String[] args) {
        String [][] cars={ {"Toyota", "Honda", "Mazda", "Rembo"},
                         {"MersedesBenz", "BMW", "Porshe", "Audi"},
                         {"Lexus", "Chevrolet", "GMC", "Lincoln"},
                        {"AlfaRomeo", "Fiat", "Lamborgini", "Ferrary"}
                        };

        for(int i=0; i<cars.length; i++){
            for(int j=0; j<cars[i].length; j++){
                System.out.print(cars[i][j]+" ");
            }
            System.out.println();
        }


        System.out.println();

        for(String [] carGroup:cars) {
            for (String car : carGroup) {
                System.out.print(car+" ");
                //we can use Arrays to String instead of Second forEachLoop
                //System.out.println(Arrays.toString(carGroup));
                // or Arrays.deepToString(cars);
            }
            System.out.println();

            System.out.println();
        }
        for(int i=0; i<cars.length; i++){
            switch(i) {
                case 0:
                    System.out.print("Japanese: ");
                    break;
                case 1:
                    System.out.print("German: ");
                    break;
                case 2:
                    System.out.print("American: ");
                    break;
                case 3:
                    System.out.print("Italian: ");
                    break;
                default:
                    System.out.print("no cars in garage");
            }
            for(int j=0; j<cars[i].length; j++){
                System.out.print(cars[i][j]+" ");
               }

            System.out.println();
        }
    }
}
