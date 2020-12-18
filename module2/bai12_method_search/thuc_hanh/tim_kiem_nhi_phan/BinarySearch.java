package bai12_method_search.thuc_hanh.tim_kiem_nhi_phan;

public class BinarySearch {
    static int[] list = {2,4,5,7,10,14,17,20,26,31,39,51,59,65,78,79,82};
    static int binarySearch(int[]list,int key){
        int low =0;
        int high = list.length-1;
        while (high >= low){
            int mid = (low+high)/2;
            if (key<list[mid])
                high = mid - 1;
            else if (key == list[mid])
                return mid;
            else
                low = mid + 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(binarySearch(list, 2));  /* 0 */
        System.out.println(binarySearch(list, 11)); /* -1 */
        System.out.println(binarySearch(list, 79)); /*15 */
        System.out.println(binarySearch(list, 1));  /*-1 */
        System.out.println(binarySearch(list, 5));  /*2 */
        System.out.println(binarySearch(list, 80)); /*-1 */
    }
}

