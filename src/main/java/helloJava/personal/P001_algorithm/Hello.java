package helloJava.personal.P001_algorithm;

import java.math.BigDecimal;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

import lombok.Data;

@Data
class Zfit0241 {

    private String year;
    private String month;
    private String officeErpCode;
    private String salesAmt;
    private String yearMonth;

    public Zfit0241(String year, String month, String officeErpCode, String salesAmt, String yearMonth) {
        this.year = year;
        this.month = month;
        this.officeErpCode = officeErpCode;
        this.salesAmt = salesAmt;
        this.yearMonth = yearMonth;
    }

}

@Data
class ErpSaleAmtVo {
    /** 연도 */
    private String year;

    /** 달 */
    private String month;

    /** ERP 코드 */
    private String officeErpCode;

    /** 매출액 */
    private Long salesAmt;

    /** 연도 + 달 */
    private String yearmonth;

    /** 1년매출(만원) */
    private Long oneYearSales;

    /** 3년매출(만원) */
    private Long threeYearSales;

    private String period;

}

public class Hello {

    public static List<Zfit0241> dummyVoData() {

        List<Zfit0241> list = new ArrayList<>();

        list.add(new Zfit0241("2022", "05", "0000051390", "4000000", "202205"));
        list.add(new Zfit0241("2023", "04", "0000051390", "18182", "202304"));
        list.add(new Zfit0241("2023", "11", "0000051390", "354546", "202311"));
        list.add(new Zfit0241("2023", "12", "0000051390", "63636", "202312"));
        list.add(new Zfit0241("2024", "01", "0000051390", "63636", "202401"));
        list.add(new Zfit0241("2024", "02", "0000051390", "90910", "202402"));
        list.add(new Zfit0241("2024", "05", "0000051390", "118182", "202405"));
        list.add(new Zfit0241("2024", "06", "0000051390", "100000", "202406"));
        list.add(new Zfit0241("2024", "07", "0000051390", "27273", "202407"));
        list.add(new Zfit0241("2024", "08", "0000051390", "81818", "202408"));
        list.add(new Zfit0241("2024", "09", "0000051390", "81818", "202409"));
        list.add(new Zfit0241("2024", "10", "0000051390", "100000", "202410"));
        list.add(new Zfit0241("2024", "12", "0000051390", "109091", "202412"));
        list.add(new Zfit0241("2025", "01", "0000051390", "63636", "202501"));
        list.add(new Zfit0241("2025", "02", "0000051390", "109091", "202502"));
        list.add(new Zfit0241("2025", "03", "0000051390", "118182", "202503"));
        list.add(new Zfit0241("2025", "04", "0000051390", "190909", "202504"));
        list.add(new Zfit0241("2025", "05", "0000051390", "45455", "202505"));
        list.add(new Zfit0241("2025", "06", "0000051390", "90909", "202506"));
        list.add(new Zfit0241("2025", "07", "0000051390", "100000", "202507"));
        list.add(new Zfit0241("2025", "08", "0000051390", "109091", "202508"));
        list.add(new Zfit0241("2025", "09", "0000051390", "290909", "202509"));

        return list;

    }

    public static List<Zfit0241> dummyVoData2() {
    List<Zfit0241> list = new ArrayList<>();

    list.add(new Zfit0241("2022","01","0000009174","22440000","202201"));
    list.add(new Zfit0241("2022","02","0000009174","47380000","202202"));
    list.add(new Zfit0241("2022","03","0000009174","7480000","202203"));
    list.add(new Zfit0241("2022","04","0000009174","6820000","202204"));
    list.add(new Zfit0241("2022","05","0000009174","5720000","202205"));
    list.add(new Zfit0241("2022","06","0000009174","19270000","202206"));
    list.add(new Zfit0241("2022","07","0000009174","4500000","202207"));
    list.add(new Zfit0241("2022","08","0000009174","2620000","202208"));
    list.add(new Zfit0241("2022","09","0000009174","9050000","202209"));
    list.add(new Zfit0241("2022","10","0000009174","28184000","202210"));
    list.add(new Zfit0241("2022","11","0000009174","21790000","202211"));
    list.add(new Zfit0241("2022","12","0000009174","7050000","202212"));

    list.add(new Zfit0241("2023","01","0000009174","12580000","202301"));
    list.add(new Zfit0241("2023","02","0000009174","36350000","202302"));
    list.add(new Zfit0241("2023","03","0000009174","11797075","202303"));
    list.add(new Zfit0241("2023","04","0000009174","16420000","202304"));
    list.add(new Zfit0241("2023","05","0000009174","30030000","202305"));
    list.add(new Zfit0241("2023","06","0000009174","49010000","202306"));
    list.add(new Zfit0241("2023","07","0000009174","37420000","202307"));
    list.add(new Zfit0241("2023","08","0000009174","26300000","202308"));
    list.add(new Zfit0241("2023","09","0000009174","38560000","202309"));
    list.add(new Zfit0241("2023","10","0000009174","47190000","202310"));
    list.add(new Zfit0241("2023","11","0000009174","74440000","202311"));
    list.add(new Zfit0241("2023","12","0000009174","38668000","202312"));

    list.add(new Zfit0241("2024","01","0000009174","103730000","202401"));
    list.add(new Zfit0241("2024","02","0000009174","42951000","202402"));
    list.add(new Zfit0241("2024","03","0000009174","67032000","202403"));
    list.add(new Zfit0241("2024","04","0000009174","79515000","202404"));
    list.add(new Zfit0241("2024","05","0000009174","78961000","202405"));
    list.add(new Zfit0241("2024","06","0000009174","52219000","202406"));
    list.add(new Zfit0241("2024","07","0000009174","62790200","202407"));
    list.add(new Zfit0241("2024","08","0000009174","44358000","202408"));
    list.add(new Zfit0241("2024","09","0000009174","41775000","202409"));
    list.add(new Zfit0241("2024","10","0000009174","80458400","202410"));
    list.add(new Zfit0241("2024","11","0000009174","71525691","202411"));
    list.add(new Zfit0241("2024","12","0000009174","52390170","202412"));

    list.add(new Zfit0241("2025","01","0000009174","36617500","202501"));
    list.add(new Zfit0241("2025","02","0000009174","61389100","202502"));
    list.add(new Zfit0241("2025","03","0000009174","57224200","202503"));
    list.add(new Zfit0241("2025","04","0000009174","82378250","202504"));
    list.add(new Zfit0241("2025","05","0000009174","59121000","202505"));
    list.add(new Zfit0241("2025","06","0000009174","64325000","202506"));
    list.add(new Zfit0241("2025","07","0000009174","82251400","202507"));
    list.add(new Zfit0241("2025","08","0000009174","60861100","202508"));
    list.add(new Zfit0241("2025","09","0000009174","67637800","202509"));
    list.add(new Zfit0241("2025","10","0000009174","61269000","202510"));
    list.add(new Zfit0241("2025","11","0000009174","22930000","202511"));

    return list;
}



    public static List<Map<String, String>> dummyData() {
        Map<String, String> map1 = new HashMap<>();
        map1.put("YEAR", "2022");
        map1.put("MONTH", "05");
        map1.put("OFFICE_ERP_CODE", "0000051390");
        map1.put("SALES_AMT", "4000000");
        map1.put("YEARMONTH", "202205");

        Map<String, String> map2 = new HashMap<>();
        map2.put("YEAR", "2023");
        map2.put("MONTH", "04");
        map2.put("OFFICE_ERP_CODE", "0000051390");
        map2.put("SALES_AMT", "18182");
        map2.put("YEARMONTH", "202304");

        Map<String, String> map3 = new HashMap<>();
        map3.put("YEAR", "2023");
        map3.put("MONTH", "11");
        map3.put("OFFICE_ERP_CODE", "0000051390");
        map3.put("SALES_AMT", "354546");
        map3.put("YEARMONTH", "202311");

        Map<String, String> map4 = new HashMap<>();
        map4.put("YEAR", "2023");
        map4.put("MONTH", "12");
        map4.put("OFFICE_ERP_CODE", "0000051390");
        map4.put("SALES_AMT", "63636");
        map4.put("YEARMONTH", "202312");

        Map<String, String> map5 = new HashMap<>();
        map5.put("YEAR", "2024");
        map5.put("MONTH", "01");
        map5.put("OFFICE_ERP_CODE", "0000051390");
        map5.put("SALES_AMT", "63636");
        map5.put("YEARMONTH", "202401");

        Map<String, String> map6 = new HashMap<>();
        map6.put("YEAR", "2024");
        map6.put("MONTH", "02");
        map6.put("OFFICE_ERP_CODE", "0000051390");
        map6.put("SALES_AMT", "90910");
        map6.put("YEARMONTH", "202402");

        Map<String, String> map7 = new HashMap<>();
        map7.put("YEAR", "2024");
        map7.put("MONTH", "05");
        map7.put("OFFICE_ERP_CODE", "0000051390");
        map7.put("SALES_AMT", "118182");
        map7.put("YEARMONTH", "202405");

        Map<String, String> map8 = new HashMap<>();
        map8.put("YEAR", "2024");
        map8.put("MONTH", "06");
        map8.put("OFFICE_ERP_CODE", "0000051390");
        map8.put("SALES_AMT", "100000");
        map8.put("YEARMONTH", "202406");

        Map<String, String> map9 = new HashMap<>();
        map9.put("YEAR", "2024");
        map9.put("MONTH", "07");
        map9.put("OFFICE_ERP_CODE", "0000051390");
        map9.put("SALES_AMT", "27273");
        map9.put("YEARMONTH", "202407");

        Map<String, String> map10 = new HashMap<>();
        map10.put("YEAR", "2024");
        map10.put("MONTH", "08");
        map10.put("OFFICE_ERP_CODE", "0000051390");
        map10.put("SALES_AMT", "81818");
        map10.put("YEARMONTH", "202408");

        Map<String, String> map11 = new HashMap<>();
        map11.put("YEAR", "2024");
        map11.put("MONTH", "09");
        map11.put("OFFICE_ERP_CODE", "0000051390");
        map11.put("SALES_AMT", "81818");
        map11.put("YEARMONTH", "202409");

        Map<String, String> map12 = new HashMap<>();
        map12.put("YEAR", "2024");
        map12.put("MONTH", "10");
        map12.put("OFFICE_ERP_CODE", "0000051390");
        map12.put("SALES_AMT", "100000");
        map12.put("YEARMONTH", "202410");

        Map<String, String> map13 = new HashMap<>();
        map13.put("YEAR", "2024");
        map13.put("MONTH", "12");
        map13.put("OFFICE_ERP_CODE", "0000051390");
        map13.put("SALES_AMT", "109091");
        map13.put("YEARMONTH", "202412");

        Map<String, String> map14 = new HashMap<>();
        map14.put("YEAR", "2025");
        map14.put("MONTH", "01");
        map14.put("OFFICE_ERP_CODE", "0000051390");
        map14.put("SALES_AMT", "63636");
        map14.put("YEARMONTH", "202501");

        Map<String, String> map15 = new HashMap<>();
        map15.put("YEAR", "2025");
        map15.put("MONTH", "02");
        map15.put("OFFICE_ERP_CODE", "0000051390");
        map15.put("SALES_AMT", "109091");
        map15.put("YEARMONTH", "202502");

        Map<String, String> map16 = new HashMap<>();
        map16.put("YEAR", "2025");
        map16.put("MONTH", "03");
        map16.put("OFFICE_ERP_CODE", "0000051390");
        map16.put("SALES_AMT", "118182");
        map16.put("YEARMONTH", "202503");

        Map<String, String> map17 = new HashMap<>();
        map17.put("YEAR", "2025");
        map17.put("MONTH", "04");
        map17.put("OFFICE_ERP_CODE", "0000051390");
        map17.put("SALES_AMT", "190909");
        map17.put("YEARMONTH", "202504");

        Map<String, String> map18 = new HashMap<>();
        map18.put("YEAR", "2025");
        map18.put("MONTH", "05");
        map18.put("OFFICE_ERP_CODE", "0000051390");
        map18.put("SALES_AMT", "45455");
        map18.put("YEARMONTH", "202505");

        Map<String, String> map19 = new HashMap<>();
        map19.put("YEAR", "2025");
        map19.put("MONTH", "06");
        map19.put("OFFICE_ERP_CODE", "0000051390");
        map19.put("SALES_AMT", "90909");
        map19.put("YEARMONTH", "202506");

        Map<String, String> map20 = new HashMap<>();
        map20.put("YEAR", "2025");
        map20.put("MONTH", "07");
        map20.put("OFFICE_ERP_CODE", "0000051390");
        map20.put("SALES_AMT", "100000");
        map20.put("YEARMONTH", "202507");

        Map<String, String> map21 = new HashMap<>();
        map21.put("YEAR", "2025");
        map21.put("MONTH", "08");
        map21.put("OFFICE_ERP_CODE", "0000051390");
        map21.put("SALES_AMT", "109091");
        map21.put("YEARMONTH", "202508");

        Map<String, String> map22 = new HashMap<>();
        map22.put("YEAR", "2025");
        map22.put("MONTH", "09");
        map22.put("OFFICE_ERP_CODE", "0000051390");
        map22.put("SALES_AMT", "290909");
        map22.put("YEARMONTH", "202509");

        return Arrays.asList(
                map1, map2, map3, map4, map5, map6, map7, map8, map9, map10,
                map11, map12, map13, map14, map15, map16, map17, map18, map19, map20,
                map21, map22);

    }

    public static ErpSaleAmtVo yearFilter(int year, String erpCd, List<Zfit0241> etTab) throws Exception {

        List<Zfit0241> filteredList =etTab.stream().filter(data -> {

            String YEARMONTH = data.getYear()+data.getMonth();
            YearMonth now = YearMonth.now();
            YearMonth oneYearAgo = now.minusMonths(year);
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMM");

            String oneYearAgoYm = oneYearAgo.format(formatter);
            String currentYm = now.format(formatter);

            YearMonth ym0 = YearMonth.parse(YEARMONTH, formatter);
            YearMonth ym1 = YearMonth.parse(oneYearAgoYm, formatter);
            YearMonth ym2 = YearMonth.parse(currentYm, formatter);
            return (ym0.isAfter(ym1) || ym0.equals(ym1)) && ym0.isBefore(ym2);

        }).collect(Collectors.toList());

        Map<String, Long> sumGroupByOfficeErpCode = filteredList.stream()
        .collect(Collectors.groupingBy(
            Zfit0241::getOfficeErpCode,
            Collectors.summingLong(vo -> Long.parseLong(vo.getSalesAmt()))
        ));

        ErpSaleAmtVo erpSaleAmtVo = new ErpSaleAmtVo();
        if(year == 12){
            erpSaleAmtVo.setPeriod("1");
        }else{
            erpSaleAmtVo.setPeriod("3");
        }
        erpSaleAmtVo.setOfficeErpCode(erpCd);
        erpSaleAmtVo.setSalesAmt(sumGroupByOfficeErpCode.getOrDefault(erpCd, 0L));

        return erpSaleAmtVo; 
    }

    public static void main(String[] args) throws Exception {


        List<Zfit0241> result = dummyVoData2(); 
        ErpSaleAmtVo data1 =  yearFilter(12,"0000009174",result); 
        ErpSaleAmtVo data2 =  yearFilter(36,"0000009174",result); 

        System.out.println(data1.toString()); // salesAmt=1227273
        System.out.println(data2.toString()); // salesAmt=2327274

        // salesAmt=756990211
        // salesAmt=1858384886



        // List<Map<String, String>> result = dummyData();

        // List<Map<String, String>> filteredList = result.stream().filter(
        //         map -> {
        //             String YEARMONTH = map.get("YEAR").toString() + map.get("MONTH").toString();
        //             YearMonth now = YearMonth.now();
        //             YearMonth oneYearAgo = now.minusMonths(12);
        //             DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMM");

        //             String oneYearAgoYm = oneYearAgo.format(formatter);
        //             String currentYm = now.format(formatter);

        //             YearMonth ym0 = YearMonth.parse(YEARMONTH, formatter);
        //             YearMonth ym1 = YearMonth.parse(oneYearAgoYm, formatter);
        //             YearMonth ym2 = YearMonth.parse(currentYm, formatter);
        //             return (ym0.isAfter(ym1) || ym0.equals(ym1)) && ym0.isBefore(ym2);
        //         }).collect(Collectors.toList());

        // BigDecimal sum = BigDecimal.ZERO;
        // for (Map<String, String> map : filteredList) {
        //     BigDecimal salesAmt = new BigDecimal(map.get("SALES_AMT"));
        //     sum = sum.add(salesAmt);
        // }

        // System.out.println(sum);
    }

}
