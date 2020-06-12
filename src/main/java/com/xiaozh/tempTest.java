package com.xiaozh;

import java.util.*;

public class tempTest {
    public static void main(String[] args) {
        int n = 3;
        char[][] board = new char[n][n];
        // initialation
        for(char[] row: board){
            for(int j = 0; j<n; j++){
                row[j] = '.';
            }
        }

        // print
        for(int i = 0; i<n; i++){
            for (int j = 0; j<n; j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }

        char[] row = board[0];
        String str = String .valueOf(board[0]);
        System.out.println(board[0]);
        System.out.println(String.valueOf(board[0]));

        List<List<String>> res = new ArrayList<>();
        List<String> list = new ArrayList<String>();
        for(int i = 0; i < n; i++) {
            list.add(String.valueOf(board[i]));
        }
        res.add(list);
        System.out.println();
        new Stack<>();
//        List<String> list = new LinkedList<>();
//        for(int i = 0; i<n; i++){
//
//        }
//        System.out.println(list.get(0).charAt(0));
    }
}
