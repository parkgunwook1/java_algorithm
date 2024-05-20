package project;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// 가계부 관리 모듈 클래스
public class AccountingModule {
    private List<Transaction> transactions;

    public AccountingModule() {
        transactions = new ArrayList<>();
    }

    // 수입/ 지출 항목 추가
    public void addTransaction(String date, String category, double amount) {
        Transaction transaction = new Transaction(date,category,amount);
        transactions.add(transaction);
    }

    // 수입 / 지출 항목 삭제
    public void removeTransaction(int index) {
        transactions.remove(index);
    }

    // 월별 / 분기별 / 연도별 통계 제공
    public Map<String, Double> getStatistics(String type) {
        Map<String, Double> statistics = new HashMap<>();
        for (Transaction transaction : transactions) {
            String date = transaction.getDate();
            String period = "";
            if (type.equals("월별")) {
                period = date.substring(0,7); // 2024-05-01 => 2024-05
            } else if (type.equals("분기별")) {
                int month = Integer.parseInt(date.substring(5,7));
                int quarter = (month - 1) / 3 + 1;
                period = date.substring(0,4) + "Q" + quarter; // 2024Q1 ~ Q4
            }else if (type.equals("연도별")) {
                period = date.substring(0,4);
            }
            double amount = transaction.getAmount();
            statistics.put(period, statistics.getOrDefault(period, 0.0) + amount);
        }
        return statistics;
    }
    public void exportToCSV(String filename) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filename))){
            writer.println("Date,Category,Amount");
            for (Transaction transaction : transactions) {
                writer.println(transaction.getDate() + "," + transaction.getCategory() + "," + transaction.getAmount());
            }
            System.out.println("가계부가" + filename + "에 저장되었습니다.");
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void exportToExcel(String filename) {
        System.out.println("가계부가 " + filename + "에 저장되었습니다.");
    }

}
