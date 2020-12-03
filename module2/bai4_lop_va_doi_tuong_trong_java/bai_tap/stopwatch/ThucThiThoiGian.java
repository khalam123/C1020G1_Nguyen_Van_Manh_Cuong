package bai4_lop_va_doi_tuong_trong_java.bai_tap.stopwatch;

public class ThucThiThoiGian {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        for (int i=0; i<100;i++){
            for (int j=0; j<100;j++){
                for (int z=0;z<100;z++){
                    System.out.println(i);
                    break;
                }
            }
        }
        stopWatch.end();
        System.out.println(stopWatch.getElapsedTime());

    }
}
