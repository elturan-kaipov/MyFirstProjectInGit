package Arrays;

public class lineAr {
    public static void main(String[] args) {
        int[] outer={1,2,3,5};
        int[] inner={2,5};
        System.out.println(linear(outer, inner));

    }
    public static boolean linear(int[] outer, int[] inner) {
        boolean notFound;

        for(int inI = 0, outI = 0; inI < inner.length; inI++){

            notFound = true;

            for(; outI < outer.length && notFound; outI++)

            {

                if(inner[inI] == outer[outI])

                    notFound = false;

            }
            if(notFound)

                return false;

        }

        return true;

    }

}
