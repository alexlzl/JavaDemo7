package com.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

/**
 * Created by liuzhouliang on 2018/6/29.
 */
public class Test {
    public static void main(String[] args)  {
        /**
         * 扫描文件线程
         */
        final Thread fileIteratorThread = new Thread() {
            public void run() {
                try {
                    listFile(new File("E:\\"));

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("扫描线程结束==================");
            }
        };

        /**
         * 监听扫描文件线程
         */
        new Thread() {
            public void run() {
                while (true) {
                    if ("quit".equalsIgnoreCase(readFromConsole())) {
                        if (fileIteratorThread.isAlive()) {
                            fileIteratorThread.interrupt();
                            return;
                        }
                    } else {
                        System.out.println("输入quit退出文件扫描");
                    }
                }
            }
        }.start();
        fileIteratorThread.start();
    }

    private static void listFile(File f) throws InterruptedException {
        if (f == null) {
            throw new IllegalArgumentException();
        }
        if (f.isFile()) {
//            System.out.println(f);
            return;
        }
        File[] allFiles = f.listFiles();
        if (Thread.interrupted()) {
//            System.out.println("抛出异常==================");
            throw new InterruptedException("文件扫描任务被中断");
        }
        if(allFiles!=null&&allFiles.length>0){
            for (File file : allFiles) {
                //还可以将中断检测放到这里
                listFile(file);
            }
        }

    }

    public static String readFromConsole() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            return reader.readLine();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }


}
