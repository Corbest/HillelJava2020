package HM13;

public class Search_Interpolation {

    public static int search_Interpolation(int[]search,int searchKey) {
        int left = 0;
        int right = search.length-1;

        while ((left <= right) && (searchKey >= search[left]) && (searchKey <= search[right])) {
            int mid =left + (searchKey - search[left]) * (right - left) / (search[right] - search[left]);
//           int mid = left + (((right-left) / (search[right]-search[left]))* (searchKey - search[left]));
            if (search[mid] == searchKey)
                return mid;
            if (search[mid] < searchKey)
                left = mid + 1;

            else right = mid -1;
        }
        return -1;
    }
}
