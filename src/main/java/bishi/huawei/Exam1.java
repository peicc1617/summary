package bishi.huawei;

import java.util.*;

public class Exam1 {
    public static void main(String[] args){
        int[][] a = {{1, 2, 3, 4, 5},
                {11, 12, 13, 14, 15},
                {21, 22, 23, 24, 25},
                {31, 32, 33, 34, 35},
                {41, 42, 43, 44, 45}};
        int[][] input = new int[10][6];
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            for (int i = 0; i < 6; i++){
                input[0][i] = sc.nextInt();
            }
            Map<Integer,Integer> map = new HashMap<>();
            for (int i = 0; i < 5; i++){
                for (int j = 0; j < 5; j++){
                    map.put(a[i][j],i);
                }
            }
            Map<Integer,Set> maps = new HashMap<>();
            for(int i = 0; i<6; i++){
                int row = map.get(input[0][i]);
                int col=0;
                for(int j = 0; j<5; j++){
                    if(a[row][j] == input[0][i])
                        col = j;
                }
                Set<Integer> set = new HashSet<>();
                if(row-1>=0)
                    set.add(a[row-1][col]);
                if(col-1>=0)
                    set.add(a[row][col-1]);
                if(row+1<5)
                    set.add(a[row+1][col]);
                if(col+1<5)
                    set.add(a[row][col+1]);
                maps.put(input[0][i],set);
            }
            int result =1;
            for(int i =0; i<5;i++){
                if(i-1<0) {
                    if (!maps.get(input[0][i]).contains(input[0][i + 1])) {
                        result = 0;
                        break;
                    }
                }else if(i+1>=6) {
                    if (!maps.get(input[0][i]).contains(input[0][i - 1])) {
                        result = 0;
                        break;
                    }
                } else {
                    if (!maps.get(input[0][i]).contains(input[0][i - 1])&&!maps.get(input[0][i]).contains(input[0][i + 1])) {
                        result = 0;
                        break;
                    }
                }
            }
            System.out.println(result);
        }

    }
}