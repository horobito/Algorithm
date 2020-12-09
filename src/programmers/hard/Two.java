package programmers.hard;

public class Two {
    class Solution {

        public int[] solution(int[][] arr) {

            int columnLength = arr.length;
            int rowLength = arr[0].length;


            int[] answer = divideQuarter(arr, columnLength, rowLength);
            return answer;
        }

        public int[] divideQuarter(int[][] arr, int columnLength, int rowLength){

            int one = 0;
            int two = 0;

            if(columnLength>2){
                for(int j=0; j<columnLength/2; j++){
                    for(int i=1; i<rowLength/2; i++){
                        if(arr[j][i] != arr[j][i-1]){
                            int a = columnLength/2;
                            int b = rowLength/2;

                            int[][] arr1 = new int[a][b];
                            for(int x=0; x<a; x++){
                                for(int y=0; y<b; y++) {
                                    arr1[x][y] = arr[x][y];
                                }
                            }

                            divideQuarter(arr1, a, b);
                        }
                    }
                }

                if(arr[0][0]==0 ){
                    one++;
                }else{
                    two++;
                }




                for(int j=0; j<columnLength/2; j++){
                    for(int i=rowLength/2+1; i<rowLength; i++){
                        if(arr[j][i] != arr[j][i-1]){
                            int a = columnLength/2;
                            int b = rowLength/2;

                            int[][] arr1 = new int[a][b];
                            for(int x=0; x<a; x++){
                                for(int y=b; y<rowLength; y++) {
                                    arr1[x][y] = arr[x][y];
                                }
                            }

                            divideQuarter(arr1, a, b);
                        }
                    }
                }

                if(arr[0][rowLength/2]==0 ){
                    one++;
                }else{
                    two++;
                }


                for(int j=columnLength/2; j<columnLength; j++){
                    for(int i=1; i<rowLength/2; i++){
                        if(arr[j][i] != arr[j][i-1]){
                            int a = columnLength/2;
                            int b = rowLength/2;

                            int[][] arr1 = new int[a][b];
                            for(int x=0; x<a; x++){
                                for(int y=b; y<rowLength; y++) {
                                    arr1[x][y] = arr[x][y];
                                }
                            }

                            divideQuarter(arr1, a, b);
                        }
                    }
                }

                if(arr[columnLength/2][0]==0 ){
                    one++;
                }else{
                    two++;
                }



                for(int j=columnLength/2; j<columnLength; j++){
                    for(int i=rowLength/2+1; i<rowLength; i++){
                        if(arr[j][i] != arr[j][i-1]){
                            int a = columnLength/2;
                            int b = rowLength/2;

                            int[][] arr1 = new int[a][b];
                            for(int x=a; x<columnLength; x++){
                                for(int y=b; y<rowLength; y++) {
                                    arr1[x][y] = arr[x][y];
                                }
                            }

                            divideQuarter(arr1, a, b);
                        }
                    }
                }

                if(arr[columnLength/2][rowLength/2]==0 ){
                    one++;
                }else{
                    two++;
                }

            }else if(columnLength==2){

                if(arr[0][0] != arr[0][1] || arr[1][0] != arr[1][1]){
                    int a = columnLength/2;
                    int b = rowLength/2;

                    int[][] arr1 = new int[a][b];
                    for(int x=0; x<=columnLength; x++){
                        for(int y=0; y<=rowLength; y++) {
                            arr1[x][y] = arr[x][y];
                        }
                    }

                    divideQuarter(arr1, a, b);

                }
                if(arr[0][0]==0 ){
                    one++;
                }else{
                    two++;
                }

            } else{
                if(arr[0][0]==0 ){
                    one++;
                }else{
                    two++;
                }
            }

            int[] answer = {one, two};

            return answer;

        }
    }
}
