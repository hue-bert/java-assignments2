public class FlourPacker {

    public static boolean canPack(int bigCount, int smallCount, int goal) {

        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        } else {
            int totalCount = bigCount * 5;
            int total = totalCount + smallCount;
            if (total >= goal) {
                if (((bigCount % goal) + smallCount) == 0) {
                    return true;
                }
            }
            return false;
        }


    }

}
