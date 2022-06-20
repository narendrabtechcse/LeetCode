class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        
        for (int i = 0; i < image.length; i++) {
            reverse(image[i]);
        }

    for (int i = 0; i < image.length; i++) {
        for (int j = 0; j < image[i].length; j++) {
            if(image[i][j] == 0){
                image[i][j] = 1;
            }else {
                image[i][j] = 0;
            }
        }
    }

    return image;
}

static void reverse(int[] arr) {
    int start = 0;
    int end = arr.length-1;
    while (start<end){
        swap(arr,start,end);
        start++;
        end--;
    }
}

 static void swap(int[] arr, int i, int i1) {
    int temp = arr[i];
    arr[i] = arr[i1];
    arr[i1] = temp;
}
        
}