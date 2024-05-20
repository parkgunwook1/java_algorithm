package project;

import java.util.Map;

public class Application {

    public static void main(String[] args) {

        AccountingModule accountingModule = new AccountingModule();

        accountingModule.addTransaction("2024-05-01", "식비", -500.000);
        accountingModule.addTransaction("2024-05-05", "월급", 3000.0);
        accountingModule.addTransaction("2024-05-10", "교통비", -30.000);

        //통계
        Map<String, Double> monthlyStatistics = accountingModule.getStatistics("월별");
        System.out.println("월별 통계 : ");
        for (Map.Entry<String, Double> entry : monthlyStatistics.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        // csv 파일로 내보내기
        accountingModule.exportToCSV("transactions.csv");
        // Excel 파일로 내보내기
        accountingModule.exportToExcel("transactions.xlsx");
    }
}
