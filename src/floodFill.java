import java.util.Arrays;

public class floodFill {

    public static void main(String []args){

        System.out.println("Flood Fill--->");
        int [][] image = {{1,1,1},{1,1,0},{1,0,1}};

        floodFill flood = new floodFill();
        int [][] image2 = flood.floodFillFunc(image,1,1,2);
        for (int i = 0; i < image2.length; i++) {
            System.out.println(Arrays.toString(image2[i]));
        }
    }
    public int[][] floodFillFunc(int[][] image, int sr, int sc, int newColor) {

        if (image[sr][sc] == newColor) {
            return image;
        }
        fillDFSStyle( image , sr,  sc, image[sr][sc],  newColor);
        return image;
    }

    public void fillDFSStyle(int[][] image , int i , int j , int color , int newColor) {

        if (i < 0 || i >= image.length  || j < 0 || j >= image[i].length || image[i][j] != color)
            return;

        image[i][j] = newColor;
        fillDFSStyle(image,i + 1, j, color, newColor);
        fillDFSStyle(image, i - 1, j, color, newColor);
        fillDFSStyle(image,i, j + 1, color, newColor);
        fillDFSStyle(image, i, j - 1, color, newColor);
    }

}
